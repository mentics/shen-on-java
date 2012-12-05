
(define single-param Arg Type Vars String Return ->
  (let Arg' (kl-to-java-traverse Arg Type Vars false)
    (@p (make-string "~A" (fst Arg'))
        (make-string String (second Arg'))
        Return)))

(define two-params Arg0 Arg1 Type Vars String Return ->
  (let Arg0' (kl-to-java-traverse Arg0 object Vars false)
       Arg1' (kl-to-java-traverse Arg1 object Vars false)
      (@p (make-string "~A~A" (fst Arg0') (fst Arg1'))
	      (make-string String (second Arg0') (second Arg1'))
	      Return)))

(define arithmetic
  Operation [A0] Vars ->
    (let Var (gensym a)
      (kl-to-java-traverse [lambda Var [Operation A0 Var]] lambda Vars false))
  Operation [A0 A1] Vars ->
    (let Result (gensym a)
         A0-eval (kl-to-java-traverse A0 number Vars false)
         A1-eval (kl-to-java-traverse A1 number Vars false)
      (let A0-content (fst A0-eval) A0-expression (second A0-eval) A1-content (fst A1-eval) A1-expression (second A1-eval)
        (@p (make-string "~A~%~A~%Object ~A = Primitives.~A.apply(~A, ~A);~%"
                         A0-content A1-content Result (arithmetic-to-name Operation) A0-expression A1-expression)
            (str Result)
            number)))
  Operation X Vars -> (simple-error "Bad args to arithmetic"))

(define comparison
  Operation [A0] Vars ->
    (let Var (gensym a)
      (kl-to-java-traverse [lambda Var [Operation A0 Var]] lambda Vars false))
  Operation [A0 A1] Vars ->
    (let A0-eval (kl-to-java-traverse A0 number Vars false)
	     A1-eval (kl-to-java-traverse A1 number Vars false)
      (let A0-content (fst A0-eval) A0-expression (second A0-eval) A1-content (fst A1-eval) A1-expression (second A1-eval)
        (@p (make-string "~A~%~A~%" A0-content A1-content)
            (make-string "(((Number)(~A)).doubleValue() ~A ((Number)(~A)).doubleValue())"
			             A0-expression (str Operation) A1-expression)
            boolean)))
  Operation X Vars -> (simple-error "Bad args to comparison"))

(define logic
  Operation [A0] Vars ->
    (let Var (gensym a)
      (kl-to-java-traverse [lambda Var [Operation A0 Var]] lambda Vars false))
  Operation [A0 A1] Vars ->
    (let A0-eval (kl-to-java-traverse A0 boolean Vars false)
	     A1-eval (kl-to-java-traverse A1 boolean Vars false)
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
  [[true Expression]] -> Expression
  [Case] -> (handle-case Case [simple-error (make-string "True condition not found: ~A" Case)])
  [Case | Rest] -> (handle-case Case (handle-cases Rest)))

(define handle-case
  [Condition Action] Else -> [if Condition Action Else])

