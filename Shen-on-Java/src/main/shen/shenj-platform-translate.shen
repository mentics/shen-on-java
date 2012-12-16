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
  [number-equal A0 A1] Type Vars Tail? ->
    (let A0' (kl-to-java-traverse A0 number Vars false)
         A1' (kl-to-java-traverse A1 number Vars false)
      (@p (make-string "~A~A" (fst A0') (fst A1'))
          (make-string "(double)~A == (double)~A" (second A0') (second A1'))
          number))

  [int-modulus A0 A1] Type Vars Tail? ->
    (let A0' (kl-to-java-traverse A0 number Vars false)
         A1' (kl-to-java-traverse A1 number Vars false)
      (@p (make-string "~A~A" (fst A0') (fst A1'))
          (make-string " (double) ((int) (double) ~A % (int) (double) ~A)" (second A0') (second A1'))
          number))

  [defun Name Params Body] Type Vars Tail? -> (handle-defun Name Params Body Type Vars)

  [let Var Value Body] Type Vars Tail? -> (handle-let Var Value Body Type Vars Tail?)

  [if A0 A1 A2] Type Vars Tail? -> (handle-if A0 A1 A2 Type Vars Tail?)

  [cond | Cases] Type Vars Tail? -> (kl-to-java-traverse (handle-cases Cases) Type Vars Tail?)

  [trap-error To-eval Handler] Type Vars Tail? -> (handle-trap-error To-eval Handler Type Vars Tail?)

  [lambda Var Body] Type Vars Tail? -> (handle-lambda Var Body Type Vars Tail?)

  [simple-error Message] Type Vars Tail? ->
    (let Message' (kl-to-java-traverse Message string Vars false)
      (@p (make-string "~A~%throw new SimpleError((String)~A);~%" (fst Message') (second Message'))
          ""
          unreachable))

  [error-to-string Exception] Type Vars Tail? -> 
    (let Exception' (kl-to-java-traverse Exception exception Vars false)
	  (@p (make-string "~A~%" (fst Exception'))
	      (make-string "errorToString(~A)" (second Exception'))
        string))

  [str] Type Vars Tail? -> (@p "" "str" lambda)
  [str Arg] Type Vars Tail? -> (single-param Arg Type Vars "str.apply(~A)" string)

  [intern Arg] Type Vars Tail? -> (single-param Arg Type Vars "symbol((String)~A)" symbol)

  [absvector? A0] Type Vars Tail? -> (single-param A0 Type Vars "(~A instanceof Object[])" boolean)

  [get-time Arg0] Type Vars Tail? -> (single-param Arg0 Type Vars "getTime(~A)" object)

  [open Stream-type Location Direction] Type Vars Tail? -> (handle-open Stream-type Location Direction Type Vars Tail?)

  [close Stream] Type Vars Tail? ->
    (let Stream' (kl-to-java-traverse Stream stream Vars false)
      (@p (make-string "~A~%((java.io.Closeable)~A).close();~%"
	                   (fst Stream') (second Stream'))
          "Nil.NIL"
          list))

  [pr String Stream] Type Vars Tail? ->
    (let String' (kl-to-java-traverse String string Vars false)
         Stream' (kl-to-java-traverse Stream stream Vars false)
      (@p (make-string "~A~%~A~%((java.io.OutputStream)~A).write(((String)~A).getBytes());"
	                   (fst String') (fst Stream') (second Stream') (second String'))
          (second String')
          string))

  [read-byte] Type Vars Tail? -> (single-param "" Type Vars "System.in.read()" number)
  [read-byte Stream] Type Vars Tail? -> (single-param Stream Type Vars "(double)((java.io.InputStream)~A).read()" number)


\** Logic and arithmetic **\


\* TODO: Use [symbol | Params] and call a function, pass in arity, that will create lambda thing for anything under arity and error if too many *\

  [not] Type Vars Tail? ->
    (let Expression (gensym n)
      (kl-to-java-traverse [lambda Expression [not Expression]] lambda Vars false))
  [not Expression] Type Vars Tail? ->
    (assert (or (= boolean Type) (= object Type)) "Expected boolean or object for not operation."
      (let Expression' (kl-to-java-traverse Expression boolean Vars false)
        (@p (make-string "~A~%" (fst Expression'))
            (make-string "!((boolean)(~A))" (second Expression'))
            boolean)))

  [and] Type Vars Tail? ->
    (let Arg0 (gensym a) Arg1 (gensym a)
      (kl-to-java-traverse [lambda Arg0 [lambda Arg1 [and Arg0 Arg1]]] lambda Vars Tail?))
  [and Arg0] Type Vars Tail? ->
    (let Arg1 (gensym a)
      (kl-to-java-traverse [lambda Arg1 [and Arg0 Arg1]] lambda Vars Tail?))
  [and Arg0 Arg1] Type Vars Tail? ->
    (kl-to-java-traverse [if Arg0 Arg1 false] boolean Vars Tail?)

  [or] Type Vars Tail? ->
    (let Arg0 (gensym a) Arg1 (gensym a)
      (kl-to-java-traverse [lambda Arg0 [lambda Arg1 [and Arg0 Arg1]]] lambda Vars))
  [or Arg0] Type Vars Tail? ->
    (let Arg1 (gensym a)
      (kl-to-java-traverse [lambda Arg1 [and Arg0 Arg1]] lambda Vars))
  [or Arg0 Arg1] Type Vars Tail? ->
    (kl-to-java-traverse [if Arg0 true Arg1] boolean Vars Tail?)

  [set] Type Vars Tail? ->
    (let Name (gensym s) Value (gensym s)
      (kl-to-java-traverse [lambda Name [lambda Value [set Name Value]]] lambda Vars Tail?))
  [set Name] Type Vars Tail? ->
    (let Value (gensym s)
      (kl-to-java-traverse [lambda Value [set Name Value]] lambda Vars Tail?))
  [set Name Value] Type Vars Tail? ->
    (let Name' (kl-to-java-traverse Name Type Vars false)
         Value' (kl-to-java-traverse Value Type Vars false)
	  (@p (make-string "~A~%~A~%globalProperties.put((Symbol)~A, ~A);"
	                  (fst Value') (fst Name') (second Name') (second Value'))
        (second Value')
        (third Value')))

  [value] Type Vars Tail? -> (let Name (gensym s) (kl-to-java-traverse [lambda Name [value Name]] lambda Vars Tail?))
  [value Name] Type Vars Tail? -> (single-param Name Type Vars "globalProperties.get(~A)" object)

  [cons?] Type Vars Tail? ->
    (let A0 (gensym s)
      (kl-to-java-traverse [lambda A0 [value A0]] lambda Vars Tail?))
  [cons? Arg] Type Vars Tail? -> (single-param Arg Type Vars "(~A instanceof Cons)" boolean)

  [cons] Type Vars Tail? ->
    (let A0 (gensym s) A1 (gensym s)
      (kl-to-java-traverse [lambda A0 [lambda A1 [cons A0 A1]]] lambda Vars Tail?))
  [cons A0] Type Vars Tail? ->
    (let A1 (gensym s)
      (kl-to-java-traverse [lambda A1 [cons A0 A1]] lambda Vars Tail?))
  [cons Arg0 Arg1] Type Vars Tail? ->
    (let Arg0' (kl-to-java-traverse Arg0 object Vars false)
         Arg1' (kl-to-java-traverse Arg1 object Vars false)
         Sym (gensym cons)
      (@p (make-string "~A~Afinal Object ~A = new Cons(~A, ~A);~%" (fst Arg0') (fst Arg1') Sym (second Arg0') (second Arg1'))
	        (str Sym)
	        cons))
  [cons | Args] Type Vars Tail? -> (error "Too many arguments to cons: ~A" Args)
\*  (two-params Arg0 Arg1 Type Vars "new Cons(~A, ~A)" cons)*\

  [hd] Type Vars Tail? -> (let A0 (gensym s) (kl-to-java-traverse [lambda A0 [hd A0]] lambda Vars Tail?))
  [hd A0] Type Vars Tail? -> (single-param A0 Type Vars "((Cons)~A).head" object)

  [tl] Type Vars Tail? -> (let A0 (gensym s) (kl-to-java-traverse [lambda A0 [tl A0]] lambda Vars))
  [tl A0] Type Vars Tail? ->(single-param A0 Type Vars "((Cons)~A).tail" object)

  [freeze] Type Vars Tail? ->
    (let Expression (gensym s)
      (kl-to-java-traverse [lambda Expression [freeze Expression]] lambda Vars Tail?))
  [freeze Expression] Type Vars Tail? ->
    (kl-to-java-traverse [lambda [] Expression] lambda Vars false)

  [eval-kl] Type Vars Tail? ->
    (let Expression (gensym s)
      (kl-to-java-traverse [lambda Expression [eval-kl Expression]] lambda Vars Tail?))
  [eval-kl Expression] Type Vars Tail? ->
    (single-param Expression Type Vars "evalKl(~A)" object)

  [number?] Type Vars Tail? -> (let A0 (gensym s) (kl-to-java-traverse [lambda A0 [number? A0]] lambda Vars Tail?))
  [number? A0] Type Vars Tail? ->
    (let A0' (kl-to-java-traverse A0 object Vars false)
      (@p (make-string "~A~%" (fst A0'))
          (cond ((and (= symbol (third A0')) (not (find-first? A0 Vars))) "false")
                ((= string (third A0')) "false")
                ((numeric-type? (third A0')) "true")
                (true (make-string "(~A instanceof Number)" (second A0'))))
          boolean))

\*
  [- Var 1] Type Vars Tail? ->
    (let V (get-second Var Vars)
         V' (gensym dec)
      (@p (make-string "final Object ~A = (Integer)~A - 1;~%" V' V) (str V') number))
    where (find-first? Var Vars)
 *\
    
  [Operation | Args] Type Vars Tail? -> (arithmetic Operation Args Vars)
    where (element? Operation [+ - * /])

  [Operation | Args] Type Vars Tail? -> (comparison Operation Args Vars)
    where (element? Operation [< > <= >=])

  [=] Type Vars Tail? ->
    (let A0 (gensym s) A1 (gensym s)
      (kl-to-java-traverse [lambda A0 [lambda A1 [= A0 A1]]] lambda Vars Tail?))
  [= A0] Type Vars Tail? ->
    (let A1 (gensym s)
      (kl-to-java-traverse [lambda A1 [= A0 A1]] lambda Vars Tail?))
  [= A0 A1] Type Vars Tail? ->
    (if (or (= Type boolean) (= Type object))
      (let PX0 (kl-to-java-traverse A0 object Vars false)
           PX1 (kl-to-java-traverse A1 object Vars false)
        (@p (@s (fst PX0) (fst PX1))
            (if (primitive-type? (third PX0))
                \*(make-string "(~A == ~A)" (second PX0) (second PX1))*\
                (make-string "Lang.equals(~A, ~A)" (second PX0) (second PX1))
                (make-string "Lang.equals(~A, ~A)" (second PX0) (second PX1)))
            boolean))
      (simple-error (make-string "Expected boolean type assertion for = operator, but was ~A" Type)))

  [string?] Type Vars Tail? ->
    (let A0 (gensym s)
      (kl-to-java-traverse [lambda A0 [string? A0]] lambda Vars Tail?))
  [string? A0] Type Vars Tail? ->
    (let A0' (kl-to-java-traverse A0 string Vars false)
      (@p (make-string "~A~%" (fst A0'))
          (make-string "(~A instanceof String)" (second A0'))
          boolean))

  [tlstr] Type Vars Tail? ->
    (let String (gensym s)
      (kl-to-java-traverse [tlstr String] string Vars Tail?))
  [tlstr String] Type Vars Tail? ->
    (let String' (kl-to-java-traverse String string Vars false)
      (@p (make-string "~A~%" (fst String'))
          (make-string "((String)~A).substring(1)" (second String'))
          string))

  [pos] Type Vars Tail? ->
    (let String (gensym s) Position (gensym s)
      (kl-to-java-traverse [pos String Position] boolean Vars Tail?))
  [pos String] Type Vars Tail? ->
    (let Position (gensym s)
      (kl-to-java-traverse [pos String Position] boolean Vars Tail?))
  [pos String Position] Type Vars Tail? ->
    (let String' (kl-to-java-traverse String string Vars false)
         Position' (kl-to-java-traverse Position number Vars false)
      (@p (make-string "~A~%~A~%" (fst String') (fst Position'))
          (make-string "((String)~A).substring((int)(double)~A, (int)(double)~A + 1)"
                       (second String') (second Position') (second Position'))
          string))

  [cn] Type Vars Tail? ->
    (let String0 (gensym s) String1 (gensym s)
      (kl-to-java-traverse [lambda String0 [lambda String1 [cn String0 String1]]] lambda Vars Tail?))
  [cn String0] Type Vars Tail? ->
    (let String1 (gensym s)
      (kl-to-java-traverse [lambda String1 [cn String0 String1]] lambda Vars Tail?))
  [cn String0 String1] Type Vars Tail? -> (two-params String0 String1 Type Vars "((String)~A + (String)~A)" string)

  [n->string] Type Vars Tail? ->
    (let Number (gensym s)
      (kl-to-java-traverse [lambda Number [n->string Number]] lambda Vars false))
  [n->string Number] Type Vars Tail? ->
    (let Number' (kl-to-java-traverse Number number Vars false)
      (let Template (if (= number (third Number'))
                        "new String(Character.toChars((int)(double)~A))"
                        "new String(Character.toChars((int)(double)~A))")
        (@p (make-string "~A~%" (fst Number'))
            (make-string Template (second Number'))
            string)))

  [string->n] Type Vars Tail? ->
    (let String (gensym s)
      (kl-to-java-traverse [lambda String [string->n String]] lambda Vars Tail?))
  [string->n String] Type Vars Tail? -> (single-param String Type Vars "Double.valueOf(((String) ~A).charAt(0))" number)

  [absvector] Type Vars Tail? -> (let Arg (gensym s) (kl-to-java-traverse [lambda Arg [absvector Arg]] lambda Vars Tail?))
  [absvector Size] Type Vars Tail? ->
    (let Result (gensym a)
         Size' (kl-to-java-traverse Size integer Vars false)
      (@p (make-string "~A~%final Object[] ~A = new Object[(int)(double)~A];~%"
                       (fst Size') Result (second Size'))
          (str Result)
          vector))

  [address-> Vector Index Value] Type Vars Tail? ->
    (let Vector' (kl-to-java-traverse Vector vector Vars false)
         Index' (kl-to-java-traverse Index number Vars false)
         Value' (kl-to-java-traverse Value object Vars false)
      (@p (make-string "~A~%~A~%~A~%((Object[])~A)[(int)(double)~A] = ~A;~%"
                       (fst Vector') (fst Index') (fst Value')
                       (second Vector') (second Index') (second Value'))
          (second Vector')
          vector))
  
  [<-address] Type Vars Tail? ->
    (let Vector (gensym s) Index (gensym s)
      (kl-to-java-traverse [lambda [<-address Vector Index]] lambda Vars Tail?))
  [<-address Vector] Type Vars Tail? ->
    (let Index (gensym s)
      (kl-to-java-traverse [lambda [<-address Vector Index]] lambda Vars Tail?))
  [<-address Vector Index] Type Vars Tail? ->
    (two-params Vector Index Type Vars "((Object[])~A)[(int)(double)~A]" object)

  [fail] Type Vars Tail? -> (@p "" "null" object)

  [Func | Args] Type Vars Tail? -> (handle-java-call Func Args Type Vars Tail?)
    where (and (symbol? Func) (is-java-call Func))
  [Func | Args] Type Vars Tail? -> (handle-call Func Args Type Vars Tail?)

  [] Type Vars Tail? -> (@p "" "Nil.NIL" nil)
  X Type Vars Tail? -> (handle-java-call X () Type Vars Tail?)
    where (and (symbol? X) (is-java-call X))
  X Type Vars Tail? ->
    (assert (not (cons? X)) "Invalid input to kl-to-java-traverse. List found where atom expected."
      (@p ""
          (cond ((find-first? X Vars) (get-second X Vars))
                ((symbol? X) (make-string "symbol(c#34;~Ac#34;)" X))
                ((string? X) (@s "c#34;" (escape-java-string X) "c#34;"))
				        ((integer? X) (make-string "~Ad" X))
				        ((float? X) (make-string "~Ad" X))
                ((boolean? X) (str X))
                (true (error "Unsupported type in kl-to-java-traverse: ~A" X)))
          (type-of X))))
