\*(load "util.shen")*\

\**
NOTE: All side effects must be done in (fst @p) and not second to ensure proper handling
of explicit throwing exceptions and such.

NOTE: It appears we have to evaluate args (at least that have any possibility of having side effects)
in fst@p in order to preserve the order of evaluation, since some things depend on left to right
evaluation of args.
 **\

(define write-source
  Name Contents -> (let File (@s "gen/shen/gen/" Name) (do (write-string-to-file File Contents) File)))

(define parse-kl
  String -> (run-without-macros (freeze (snd (shen-<st_input> (@p (to-intlist String) ()))))))

(define parse-single-kl
  String -> (hd (parse-kl String)))

(define method-sig { (list string) --> string }
  Params -> (string-join ", " (map (cn "final Object ") Params)))

(define method-argstring { (list string) --> string }
  Params -> (string-join ", " Params))

(define java-class-file { string -> string -> string -> string }
  Name Package Contents ->
    (make-string "~A~%~%import com.mentics.shen.*;~%~%public class ~A {~%~A~%}~%"
      (if (= Package "") "" (make-string "package ~A;~%~%" Package)) Name Contents))

(define to-var-pair Param -> (@p Param (to-var Param)))
(define to-var Param -> (name->method-name (str Param)))

(define kl-to-java-traverse
  [defun Name Params Body] Type Vars ->
    (let Arity (length Params)
         Signature (method-sig (map (to-var) Params))
         Argstring (method-argstring (map (to-var) Params))
      (do (put Name arity (length Params))
          (@p (let Result (kl-to-java-traverse Body object (map (to-var-pair) Params))
\* TODO: do perf compare between Name.LAMBDA.apply(...) and Name.defined(...) *\
                   (make-string "
public static final Symbol SYMBOL = RuntimeContext.symbol(c#34;~Ac#34;);
public static final Lambda LAMBDA = new Lambda~A() {
public Object apply(~A) throws Exception {
return defined(~A);
}};
public static Object defined(~A) throws Exception {~%~A~%~A~%}"
                      Name (length Params) Signature Argstring
                      Signature
                      (fst Result)
                      (handle-unreachable-return Result)))
		      (str Name)
		      func)))

  [let Var Value Body] Type Vars ->
    (let Var' (to-var (gensym Var))
      (let PValue (kl-to-java-traverse Value object Vars)
           PBody (kl-to-java-traverse Body Type (cons (@p Var Var') Vars))
        (@p (make-string "~A~%final Object ~A = ~A;~%~A~%" (fst PValue) Var' (second PValue) (fst PBody))
            (second PBody)
            (third PBody))))

  [if A0 A1 A2] Type Vars ->
    (let PX0 (kl-to-java-traverse A0 boolean Vars)
	     PX1 (kl-to-java-traverse A1 Type Vars)
		 PX2 (kl-to-java-traverse A2 Type Vars)
         Var (gensym i)
      (let First
          (if (= unreachable (third PX0))
            (make-string "~A~%" (fst PX0))
            (make-string "~A~%final Object ~A;~%if ((boolean)~A) {~%~A~%~A} else {~%~A~%~A~%}"
                         (fst PX0) Var (second PX0)
                         (fst PX1) (handle-unreachable-assignment Var PX1)
	                     (fst PX2) (handle-unreachable-assignment Var PX2)))
        (@p First
	        (str Var)
		    (if (= unreachable (third PX0)) unreachable
              (combine-types (third PX1) (third PX2))))))

  [cond | Cases] Type Vars -> (kl-to-java-traverse (handle-cases Cases) Type Vars)

  [trap-error To-eval Handler] Type Vars ->
    (let Evaled (kl-to-java-traverse To-eval object Vars)
         Handler' (kl-to-java-traverse Handler lambda (cons (to-var-pair t) Vars))
         Temp (gensym t)
		 Result (gensym t)
	  (@p (make-string "Object ~A;~%try {~%~A~%~A = ~A;~%} catch (Throwable t) {~%~A~%~A = ~A.apply(t);~%}~%final Object ~A = ~A;~%"
                       Temp (fst Evaled) Temp (second Evaled) (fst Handler') Temp (second Handler') Result Temp)
          (str Result)
          object))

  [lambda [] Body] Type Vars ->
    (let Body' (kl-to-java-traverse Body object Vars)
         Result (gensym l)
      (@p (make-string "final Lambda ~A = new Lambda0() {~%  public Object apply() throws Exception {~%    ~A~%~A  }~%};"
	                   Result (fst Body') (handle-unreachable-return Body'))
	      (str Result)
          lambda))
  [lambda Var Body] Type Vars ->
    (let Var' (to-var Var)
      (let Body' (kl-to-java-traverse Body object (cons (to-var-pair Var) Vars))
           Result (gensym l)
        (@p (make-string "final Lambda ~A = new Lambda1() {~%  public Object apply(final Object ~A) throws Exception {~%    ~A~%~A  }~%};"
	                     Result Var' (fst Body') (handle-unreachable-return Body'))
	        (str Result)
            lambda)))

  [simple-error Message] Type Vars ->
    (let Message' (kl-to-java-traverse Message string Vars)
      (@p (make-string "~A~%throw new SimpleError((String)~A);~%" (fst Message') (second Message'))
	      \*(make-string "throw new SimpleError((String)~A)~%" (second Message'))*\
		  ""
		  unreachable))

  [error-to-string Exception] Type Vars -> 
    (let Exception' (kl-to-java-traverse Exception exception Vars)
	  (@p (make-string "~A~%" (fst Exception'))
	      (make-string "Lang.errorToString(~A)" (second Exception'))
		  string))

  [str Arg] Type Vars -> (single-param Arg Type Vars "String.valueOf(~A)" string)

  [intern Arg] Type Vars -> (single-param Arg Type Vars "RuntimeContext.symbol((String)~A)" symbol)

  [absvector? A0] Type Vars -> (single-param A0 Type Vars "(~A instanceof Object[])" boolean)

  [get-time Arg0] Type Vars -> (single-param Arg0 Type Vars "Lang.getTime(~A)" object)

  [open Stream-type Location Direction] Type Vars ->
    (let Stream-type' (kl-to-java-traverse Stream-type symbol Vars)
         Location' (kl-to-java-traverse Location string Vars)
         Direction' (kl-to-java-traverse Direction symbol Vars)
		 Var (gensym o)
      (@p (make-string "~A~%~A~%~A~%final Object ~A = Lang.open(~A, ~A, ~A);"
	                   (fst Stream-type') (fst Location') (fst Direction')
	                   Var (second Stream-type') (second Location') (second Direction'))
          (str Var)
          stream))

  [close Stream] Type Vars ->
    (let Stream' (kl-to-java-traverse Stream stream Vars)
      (@p (make-string "~A~%((java.io.Closeable)~A).close();~%"
	                   (fst Stream') (second Stream'))
          "Nil.NIL"
          list))

  [pr String Stream] Type Vars ->
    (let String' (kl-to-java-traverse String string Vars)
         Stream' (kl-to-java-traverse Stream stream Vars)
      (@p (make-string "~A~%~A~%((java.io.OutputStream)~A).write(((String)~A).getBytes());"
	                   (fst String') (fst Stream') (second Stream') (second String'))
          (second String')
		  string))

  [read-byte] Type Vars -> (single-param "" Type Vars "System.in.read()" number)
  [read-byte Stream] Type Vars -> (single-param Stream Type Vars "((java.io.InputStream)~A).read()" number)

  \* End: Special forms and macros *\

  [not] Type Vars ->
    (let Expression (gensym n)
      (kl-to-java-traverse [lambda Expression [not Expression]] lambda Vars))
  [not Expression] Type Vars ->
    (assert (or (= boolean Type) (= object Type)) "Expected boolean or object for not operation."
      (let Expression' (kl-to-java-traverse Expression boolean Vars)
        (@p (make-string "~A~%" (fst Expression'))
            (make-string "!((boolean)~A)" (second Expression'))
            boolean)))

  [and] Type Vars ->
    (let Arg0 (gensym a) Arg1 (gensym a)
      (kl-to-java-traverse [lambda Arg0 [lambda Arg1 [and Arg0 Arg1]]] lambda Vars))
  [and Arg0] Type Vars ->
    (let Arg1 (gensym a)
      (kl-to-java-traverse [lambda Arg1 [and Arg0 Arg1]] lambda Vars))
  [and Arg0 Arg1] Type Vars ->
    (kl-to-java-traverse [if Arg0 [if Arg1 true false] false] boolean Vars)

  [or] Type Vars ->
    (let Arg0 (gensym a) Arg1 (gensym a)
      (kl-to-java-traverse [lambda Arg0 [lambda Arg1 [and Arg0 Arg1]]] lambda Vars))
  [or Arg0] Type Vars ->
    (let Arg1 (gensym a)
      (kl-to-java-traverse [lambda Arg1 [and Arg0 Arg1]] lambda Vars))
  [or Arg0 Arg1] Type Vars ->
    (kl-to-java-traverse [if Arg0 true [if Arg1 true false]] boolean Vars)

  [set] Type Vars ->
    (let Name (gensym s) Value (gensym s)
      (kl-to-java-traverse [lambda Name [lambda Value [set Name Value]]] lambda Vars))
  [set Name] Type Vars ->
    (let Value (gensym s)
      (kl-to-java-traverse [lambda Value [set Name Value]] lambda Vars))
  [set Name Value] Type Vars ->
    (let Name' (kl-to-java-traverse Name Type Vars)
         Value' (kl-to-java-traverse Value Type Vars)
	  (@p (make-string "~A~%~A~%RuntimeContext.globalProperties.put((Symbol)~A, ~A);"
	                  (fst Value') (fst Name') (second Name') (second Value'))
		  (second Value')
		  (third Value')))

  [value] Type Vars -> (let Name (gensym s) (kl-to-java-traverse [lambda Name [value Name]] lambda Vars))
  [value Name] Type Vars -> (single-param Name Type Vars "RuntimeContext.globalProperties.get(~A)" object)

  [cons?] Type Vars ->
    (let A0 (gensym s)
      (kl-to-java-traverse [lambda A0 [value A0]] lambda Vars))
  [cons? Arg] Type Vars -> (single-param Arg Type Vars "(~A instanceof Cons)" boolean)

  [cons] Type Vars ->
    (let A0 (gensym s) A1 (gensym s)
      (kl-to-java-traverse [lambda A0 [lambda A1 [cons A0 A1]]] lambda Vars))
  [cons A0] Type Vars ->
    (let A1 (gensym s)
      (kl-to-java-traverse [lambda A1 [cons A0 A1]] lambda Vars))
  [cons Arg0 Arg1] Type Vars -> (two-params Arg0 Arg1 Type Vars "new Cons(~A, ~A)" cons)

  [hd] Type Vars -> (let A0 (gensym s) (kl-to-java-traverse [lambda A0 [hd A0]] lambda Vars))
  [hd A0] Type Vars -> (single-param A0 Type Vars "((Cons)~A).head" object)

  [tl] Type Vars -> (let A0 (gensym s) (kl-to-java-traverse [lambda A0 [tl A0]] lambda Vars))
  [tl A0] Type Vars ->(single-param A0 Type Vars "((Cons)~A).tail" object)

  [freeze] Type Vars ->
    (let Expression (gensym s)
      (kl-to-java-traverse [lambda Expression [freeze Expression]] lambda Vars))
  [freeze Expression] Type Vars ->
    (kl-to-java-traverse [lambda [] Expression] lambda Vars)

  [eval-kl] Type Vars ->
    (let Expression (gensym s)
      (kl-to-java-traverse [lambda Expression [eval-kl Expression]] lambda Vars))
  [eval-kl Expression] Type Vars ->
    (single-param Expression Type Vars "RuntimeContext.evalKl(~A)" object)
  
  [number?] Type Vars -> (let A0 (gensym s) (kl-to-java-traverse [lambda A0 [number? A0]] lambda Vars))
  [number? A0] Type Vars ->
    (let A0' (kl-to-java-traverse A0 object Vars)
      (@p (make-string "~A~%" (fst A0'))
	      (cond ((and (= symbol (third A0')) (not (find-first? A0 Vars))) "false")
                ((= string (third A0')) "false")
		        ((numeric-type? (third A0')) "true")
				(true (make-string "(~A instanceof Number)" (second A0'))))
		  boolean))

  [Operation | Args] Type Vars -> (arithmetic Operation Args Vars)
    where (element? Operation [+ - * /])

  [Operation | Args] Type Vars -> (comparison Operation Args Vars)
    where (element? Operation [< > <= >=])

  [=] Type Vars ->
    (let A0 (gensym s) A1 (gensym s)
      (kl-to-java-traverse [lambda A0 [lambda A1 [= A0 A1]]] lambda Vars))
  [= A0] Type Vars ->
    (let A1 (gensym s)
      (kl-to-java-traverse [lambda A1 [= A0 A1]] lambda Vars))
  [= A0 A1] Type Vars ->
    (if (or (= Type boolean) (= Type object))
      (let PX0 (kl-to-java-traverse A0 object Vars)
	       PX1 (kl-to-java-traverse A1 object Vars)
        (@p (@s (fst PX0) (fst PX1))
		    (if (primitive-type? (third PX0))
                \*(make-string "(~A == ~A)" (second PX0) (second PX1))*\
                (make-string "Lang.equals(~A, ~A)" (second PX0) (second PX1))
                (make-string "Lang.equals(~A, ~A)" (second PX0) (second PX1)))
            boolean))
      (simple-error (make-string "Expected boolean type assertion for = operator, but was ~A" Type)))

  [string?] Type Vars ->
    (let A0 (gensym s)
      (kl-to-java-traverse [lambda A0 [string? A0]] lambda Vars))
  [string? A0] Type Vars ->
    (let A0' (kl-to-java-traverse A0 string Vars)
      (@p (make-string "~A~%" (fst A0'))
	      (make-string "(~A instanceof String)" (second A0'))
		  boolean))

  [tlstr] Type Vars ->
    (let String (gensym s)
      (kl-to-java-traverse [tlstr String] string Vars))
  [tlstr String] Type Vars ->
    (let String' (kl-to-java-traverse String string Vars)
      (@p (make-string "~A~%" (fst String'))
	      (make-string "((String)~A).substring(1)" (second String'))
		  string))

  [pos] Type Vars ->
    (let String (gensym s) Position (gensym s)
      (kl-to-java-traverse [pos String Position] boolean Vars))
  [pos String] Type Vars ->
    (let Position (gensym s)
      (kl-to-java-traverse [pos String Position] boolean Vars))
  [pos String Position] Type Vars ->
    (let String' (kl-to-java-traverse String string Vars)
         Position' (kl-to-java-traverse Position number Vars)
      (@p (make-string "~A~%~A~%" (fst String') (fst Position'))
	      (make-string "((String)~A).substring(((Number)~A).intValue(), ((Number)~A).intValue()+1)"
                       (second String') (second Position') (second Position'))
		  string))

  [cn] Type Vars ->
    (let String0 (gensym s) String1 (gensym s)
      (kl-to-java-traverse [lambda String0 [lambda String1 [cn String0 String1]]] lambda Vars))
  [cn String0] Type Vars ->
    (let String1 (gensym s)
      (kl-to-java-traverse [lambda String1 [cn String0 String1]] lambda Vars))
  [cn String0 String1] Type Vars -> (two-params String0 String1 Type Vars "((String)~A + (String)~A)" string)

  [n->string] Type Vars ->
    (let Number (gensym s)
      (kl-to-java-traverse [lambda Number [n->string Number]] lambda Vars))
  [n->string Number] Type Vars ->
    (let Number' (kl-to-java-traverse Number number Vars)
      (let Template (if (= number (third Number'))
                        "new String(Character.toChars(((Number) (~A)).intValue()))"
                        "new String(Character.toChars(((Number) (~A)).intValue()))")
        (@p (make-string "~A~%" (fst Number'))
            (make-string Template (second Number'))
            string)))

  [string->n] Type Vars ->
    (let String (gensym s)
      (kl-to-java-traverse [lambda String [string->n String]] lambda Vars))
  [string->n String] Type Vars -> (single-param String Type Vars "Integer.valueOf(((String) ~A).charAt(0))" number)

  [absvector] Type Vars -> (let Arg (gensym s) (kl-to-java-traverse [lambda Arg [absvector Arg]] lambda Vars))
  [absvector Size] Type Vars ->
    (let Size' (kl-to-java-traverse Size integer Vars)
         Result (gensym a)
      (@p (make-string "~A~%final Object[] ~A = new Object[((Number)~A).intValue()];~%"
                       (fst Size') Result (second Size'))
          (str Result)
		  vector))

  [address-> Vector Index Value] Type Vars ->
    (let Vector' (kl-to-java-traverse Vector vector Vars)
         Index' (kl-to-java-traverse Index number Vars)
         Value' (kl-to-java-traverse Value object Vars)
      (@p (make-string "~A~%~A~%~A~%((Object[])~A)[((Number)~A).intValue()] = ~A;"
                       (fst Vector') (fst Index') (fst Value')
                       (second Vector') (second Index') (second Value'))
          (second Vector')
		  vector))
  
  [<-address] Type Vars ->
    (let Vector (gensym s) Index (gensym s)
      (kl-to-java-traverse [lambda [<-address Vector Index]] lambda Vars))
  [<-address Vector] Type Vars ->
    (let Index (gensym s)
      (kl-to-java-traverse [lambda [<-address Vector Index]] lambda Vars))
  [<-address Vector Index] Type Vars ->
    (two-params Vector Index Type Vars "((Object[])~A)[((Number)~A).intValue()]" object)

  [fail] Type Vars -> (@p "" "null" object)

  [Func | Args] Type Vars ->
    (let Direct? (not (cons? Func))
         Func' (if (cons? Func) (kl-to-java-traverse Func lambda Vars) (@p "" (to-var Func) symbol))
      (let EvaledArgs (map ((flip3 kl-to-java-traverse) Vars object) Args)
        (let Args-prep-string (string-join "" (map (fst) EvaledArgs))
	         Args-string (string-join ", " (map (second) EvaledArgs))
		     Func-prep-string (fst Func')
		     Func-string (second Func')
			 Unreachable? (list-matches (/. X (= unreachable (third X))) EvaledArgs)
             Result (gensym f)
          (let Eval (cond (Unreachable? "")
                          ((and (symbol? Func) (is-java-call (str Func)))
                            (make-string "final Object ~A = RuntimeContext.javaDispatch(c#34;~Ac#34;).apply(~A);~%"
                                         Result (str Func) Args-string))
                          ((find-first? Func Vars)
                            (make-string "final Object ~A = RuntimeContext.dispatch(~A).apply(~A);~%"
                                         Result Func-string Args-string))
                          (Direct? (make-string "final Object ~A = ~A.LAMBDA.apply(~A);~%"
                          \*(Direct? (make-string "final Object ~A = ~A.defined(~A);~%"*\
                                                Result (name->class-name (str Func)) Args-string))
                          ((= lambda (third Func'))
                            (make-string "final Object ~A = ((Lambda)~A).apply(~A);~%"
                                         Result Func-string Args-string))
                          ((= symbol (third Func'))
\* TODO: can do direct (make-string "~A.lambda.apply(~A)" (to-var name) Args-string) *\
                            (make-string "final Object ~A = RuntimeContext.symbolDispatch((Symbol)~A).apply(~A);~%"
                                         Result Func-string Args-string))
                          (true (make-string "final Object ~A = RuntimeContext.dispatch(~A).apply(~A);~%"
                                             Result Func-string Args-string)))
	        \*(@p (make-string "~A~A~A" (clean-whitespace Func-prep-string) (clean-whitespace Args-prep-string) Eval)*\
	        (@p (make-string "~A~A~A" Func-prep-string Args-prep-string Eval)
                (str Result)
		        (if Unreachable? unreachable Type))))))

  [] Type Vars -> (@p "" "Nil.NIL" nil)
  X Type Vars ->
    (assert (not (cons? X)) "Invalid input to kl-to-java-traverse. List found where atom expected."
      (@p ""
        (let Str (str X)
          (cond ((find-first? X Vars) (get-second X Vars))
                ((symbol? X) (make-string "RuntimeContext.symbol(c#34;~Ac#34;)" Str))
				((string? X) (@s "c#34;" (escape-java-string X) "c#34;"))
				((integer? X) (make-string "~A" X))
				((float? X) (make-string "~Ad" X))
                (true Str)))
        (type-of X))))

(define is-java-call
  String -> (let Dot-index (string-index "." String)
                 Dollar-index (string-index "$" String)
              (and (or (not (= Dot-index -1)) (not (= Dollar-index -1))) (not (= (string-length String) 1)))))

\*(define clean-whitespace
  "" -> ""
  String -> (make-string "~A~%" (string-trim (whitespace?) String)))*\

(define find-first?
  Search [] -> false
  Search [(@p Head _) | Rest] -> (if (= Search Head) true (find-first? Search Rest))
  X Y -> (simple-error (make-string "find-first: X: ~A~%Y: ~A" X Y)))

(define get-second
  Search [] -> (simple-error (make-string "Element not found in get-second for ~A" Search))
  Search [(@p Head Value) | Rest] -> (if (= Search Head) Value (get-second Search Rest))
  X Y -> (simple-error (make-string "get-second: X: ~A~%Y: ~A" X Y)))

(define parsed-kl-to-java
  Parsed ->
    (do (output (make-string "~%~%~%Evaluating: ~A~%~%" Parsed))
      (let Result (kl-to-java-traverse Parsed object ())
        (if (and (cons? Parsed) (= defun (hd Parsed)))
		  (assert-test Result traverse-result-type?
		          (make-string "Expected string triple from defun, was: ~A~%" (fst Result)))
	      (let Code (assert-test (fst Result) string?
		                    (make-string "Expected string result body, but Result was: ~A~%" "TODO"))
		       Expression (assert-test (second Result) string? "Expected string result expression.")
            (@p (make-string "  public static Object run() throws Exception {~%~A;~%~A  }"
			                 Code (handle-unreachable-return Result))
                ""))))))

(define to-java-unit { string -> string -> (@p string string) \* class-name, contents *\ }
  Function-content Result-expression ->
    (let Class-name (if (= Result-expression "") "ToEval" (name->class-name Result-expression))
      (@p Class-name (java-class-file Class-name "shen.gen" Function-content))))

(define java-compile-and-run Class-name File ->
  (shell (@s "C:\dev\java\jdk1.7.0_06\bin\javaw -Xss32m -cp C:\dev\java\libraries\kryo-2.20\bin;C:\dev\java\libraries\kryo-2.20\jars\debug\onejar\kryo-debug-2.20-all.jar;C:\dev\git-local\shenj\ShenJ\target\classes com.mentics.shen.UpdateImage shen-test.image "
             (@s "shen.gen." Class-name) " C:/dev/git-local/shenj/ShenJ/src/main/shen/" File " C:\dev\git-local\shenj\ShenJ\target\classes")))
\*  (shell (@s "C:\dev\java\jdk1.7.0_06\bin\javac -cp C:\dev\workspace\ShenJ\target\classes -d C:\dev\workspace\ShenJ\target\classes " (@s (value *home-directory*) File)))) *\
\*  (shell (@s "C:\dev\java\jdk1.7.0_06\bin\javaw -Xss32m -cp C:\dev\java\libraries\kryo-2.20\jars\debug\onejar\kryo-debug-2.20-all.jar;C:\dev\workspace\ShenJ\target\classes com.mentics.shen.UpdateImage shen-test.image " *\

(define java-eval
  Parsed ->
    (let Result (parsed-kl-to-java Parsed)
      (let Unit (to-java-unit (fst Result) (second Result))
        (let Class-name (fst Unit) Class-unit-content (second Unit)
          (let File
            (write-source (@s Class-name ".java") Class-unit-content)
            (java-compile-and-run Class-name File))))))


(define java-primitive? X -> (or (number? X) (boolean? X)))
(define primitive-type? X -> (or (= X number) (= X boolean)))

(define single-param Arg Type Vars String Return ->
  (let Arg' (kl-to-java-traverse Arg Type Vars)
    (@p (make-string "~A~%" (fst Arg'))
        (make-string String (second Arg'))
        Return)))

(define two-params Arg0 Arg1 Type Vars String Return ->
  (let Arg0' (kl-to-java-traverse Arg0 object Vars)
       Arg1' (kl-to-java-traverse Arg1 object Vars)
      (@p (make-string "~A~%~A~%" (fst Arg0') (fst Arg1'))
	      (make-string String (second Arg0') (second Arg1'))
	      Return)))

(define arithmetic
  Operation [A0] Vars ->
    (let Var (gensym a)
      (kl-to-java-traverse [lambda Var [Operation A0 Var]] lambda Vars))
  Operation [A0 A1] Vars ->
    (let A0-eval (kl-to-java-traverse A0 number Vars)
	     A1-eval (kl-to-java-traverse A1 number Vars)
      (let A0-content (fst A0-eval) A0-expression (second A0-eval) A1-content (fst A1-eval) A1-expression (second A1-eval)
        (@p (make-string "~A~%~A~%" A0-content A1-content)
            (make-string "Primitives.~A.apply(~A, ~A)"
			             (arithmetic-to-name Operation) A0-expression A1-expression)
            number)))
  Operation X Vars -> (simple-error "Bad args to arithmetic"))

(define comparison
  Operation [A0] Vars ->
    (let Var (gensym a)
      (kl-to-java-traverse [lambda Var [Operation A0 Var]] lambda Vars))
  Operation [A0 A1] Vars ->
    (let A0-eval (kl-to-java-traverse A0 number Vars)
	     A1-eval (kl-to-java-traverse A1 number Vars)
      (let A0-content (fst A0-eval) A0-expression (second A0-eval) A1-content (fst A1-eval) A1-expression (second A1-eval)
        (@p (make-string "~A~%~A~%" A0-content A1-content)
            (make-string "(((Number)(~A)).doubleValue() ~A ((Number)(~A)).doubleValue())"
			             A0-expression (str Operation) A1-expression)
            boolean)))
  Operation X Vars -> (simple-error "Bad args to comparison"))

(define logic
  Operation [A0] Vars ->
    (let Var (gensym a)
      (kl-to-java-traverse [lambda Var [Operation A0 Var]] lambda Vars))
  Operation [A0 A1] Vars ->
    (let A0-eval (kl-to-java-traverse A0 boolean Vars)
	     A1-eval (kl-to-java-traverse A1 boolean Vars)
      (let A0-content (fst A0-eval) A0-expression (second A0-eval) A1-content (fst A1-eval) A1-expression (second A1-eval)
        (@p (make-string "~A~%~A~%" A0-content A1-content)
            (make-string "((boolean)~A ~A (boolean)~A)" A0-expression (logic-to-java Operation) A1-expression)
            boolean)))
  Operation X Vars -> (simple-error "Bad args to logic"))

(define logic-to-java
  and -> "&&"
  or -> "||")

(define arithmetic-to-name
  + -> "plus"
  - -> "minus"
  * -> "multiply"
  / -> "divide")


(define combine-types
  unreachable Type2 -> Type2
  Type1 unreachable -> Type1
  Type1 Type2 -> (if (not (= object Type1)) Type1 Type2))

(define handle-unreachable-return Result ->
  (if (= unreachable (third Result))
      ""
      \*(make-string "~A;" (second Result))*\
      (make-string "    return ~A;~%" (second Result))))

(define handle-unreachable-assignment Var Result ->
  (let Second (second Result)
    (if (= unreachable (third Result))
        ""
        \*(if (string-empty? Second) "" (make-string "~A;~%" Second))*\
        (make-string "~A = ~A;~%" Var Second))))

(define handle-cases
  [true | Expression] -> Expression
  [Case] -> (handle-case Case [simple-error "True condition not found."])
  [Case | Rest] -> (handle-case Case (handle-cases Rest)))

(define handle-case
  [Condition Action] Else -> [if Condition Action Else])

(define kl-to-java-string
  String -> (parsed-kl-to-java (parse-single-kl String)))
  
(define kl-to-java String ->
  (java-eval (parse-single-kl String)))

(define kl-file-to-java
  File -> (run-without-macros (freeze (map (/. Parsed (output (make-string "~A~%" (java-eval Parsed))))
                                           (read-file File)))))

(define run-without-macros
  F -> (do (set *save-macros* (value *macros*))
           (set *macros* ())
           (let Result (F)
             (do (set *macros* (value *save-macros*)) Result))))

(define numeric-type?
  number -> true
  integer -> true
  float -> true
  _ -> false)
 
(define string-index
   \* returns the 'index' of Str1 in Str2, or -1 if not a substring *\
   { string --> string --> number }
   Str1 Str2 -> (string-index-h Str1 Str2 0))

(define string-index-h
   { string --> string --> number --> number }
    Str1 Str2 N -> N  where (string-prefix? Str1 Str2)
    _ "" _ -> -1
    Str1 (@s _ Str2) N -> (string-index-h Str1 Str2 (+ N 1))
	_ _ _ -> -1)

(define string-prefix?
   \* returns true iff 1st string is a prefix of 2nd *\
   { string --> string --> boolean }
   "" _ -> true
   (@s S Str1) (@s S Str2) -> (string-prefix? Str1 Str2)
   _ _ -> false)

(define string-length
   \* returns the length of the string *\
   { string --> number }
   Str -> (string-length-h Str 0))
 
(define string-length-h
   { string --> number --> number }
   "" Len -> Len
   (@s _ Str) Len -> (string-length-h Str (+ Len 1)))
