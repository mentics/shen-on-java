\**
NOTE: All side effects must be done in (fst @p) and not second to ensure proper handling
of explicit throwing exceptions and such.

NOTE: It appears we have to evaluate args (at least that have any possibility of having side effects)
in fst@p in order to preserve the order of evaluation, since some things depend on left to right
evaluation of args.
 **\

\*
The first parameter is the expression.
The second parameter is information for the current context: (@p symbol [(@p Head Value)])
*\
(define kl-to-java-traverse

\* Special forms and macros *\

  [defun Name Params Body] Type Vars -> (handle-defun Name Params Body Type Vars)

  [let Var Value Body] Type Vars -> (handle-let Var Value Body Type Vars)

  [if A0 A1 A2] Type Vars -> (handle-if A0 A1 A2 Type Vars)

  [cond | Cases] Type Vars -> (kl-to-java-traverse (handle-cases Cases) Type Vars)

  [trap-error To-eval Handler] Type Vars -> (handle-trap-error To-eval Handler Type Vars)

  [lambda Var Body] Type Vars -> (handle-lambda Var Body Type Vars)

  [simple-error Message] Type Vars ->
    (let Message' (kl-to-java-traverse Message string Vars)
      (@p (make-string "~A~%throw new SimpleError((String)~A);~%" (fst Message') (second Message'))
		  ""
		  unreachable))

  [error-to-string Exception] Type Vars -> 
    (let Exception' (kl-to-java-traverse Exception exception Vars)
	  (@p (make-string "~A~%" (fst Exception'))
	      (make-string "errorToString(~A)" (second Exception'))
		  string))

  [str Arg] Type Vars -> (single-param Arg Type Vars "String.valueOf(~A)" string)

  [intern Arg] Type Vars -> (single-param Arg Type Vars "symbol((String)~A)" symbol)

  [absvector? A0] Type Vars -> (single-param A0 Type Vars "(~A instanceof Object[])" boolean)

  [get-time Arg0] Type Vars -> (single-param Arg0 Type Vars "getTime(~A)" object)

  [open Stream-type Location Direction] Type Vars -> (handle-open Stream-type Location Direction Type Vars)

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


\** Logic and arithmetic **\


\* TODO: Use [symbol | Params] and call a function, pass in arity, that will create lambda thing for anything under arity and error if too many *\

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
	  (@p (make-string "~A~%~A~%globalProperties.put((Symbol)~A, ~A);"
	                  (fst Value') (fst Name') (second Name') (second Value'))
		  (second Value')
		  (third Value')))

  [value] Type Vars -> (let Name (gensym s) (kl-to-java-traverse [lambda Name [value Name]] lambda Vars))
  [value Name] Type Vars -> (single-param Name Type Vars "globalProperties.get(~A)" object)

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
    (single-param Expression Type Vars "evalKl(~A)" object)

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
    (let Result (gensym a)
         Size' (kl-to-java-traverse Size integer Vars)
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

  [Func | Args] Type Vars -> (handle-java-call Func Args Type Vars)
    where (and (symbol? Func) (string-prefix? "shenj-dot-" (str Func)))
  [Func | Args] Type Vars -> (handle-call Func Args Type Vars)

  [] Type Vars -> (@p "" "Nil.NIL" nil)
  X Type Vars ->
    (assert (not (cons? X)) "Invalid input to kl-to-java-traverse. List found where atom expected."
      (@p ""
        (let Str (str X)
          (cond ((find-first? X Vars) (get-second X Vars))
                ((symbol? X) (make-string "symbol(c#34;~Ac#34;)" Str))
				((string? X) (@s "c#34;" (escape-java-string X) "c#34;"))
				((integer? X) (make-string "~A" X))
				((float? X) (make-string "~Ad" X))
                (true Str)))
        (type-of X))))


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
    (let Result (gensym a)
         A0-eval (kl-to-java-traverse A0 number Vars)
         A1-eval (kl-to-java-traverse A1 number Vars)
      (let A0-content (fst A0-eval) A0-expression (second A0-eval) A1-content (fst A1-eval) A1-expression (second A1-eval)
        (@p (make-string "~A~%~A~%Object ~A = Primitives.~A.apply(~A, ~A);~%"
                         A0-content A1-content Result (arithmetic-to-name Operation) A0-expression A1-expression)
            (str Result)
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

