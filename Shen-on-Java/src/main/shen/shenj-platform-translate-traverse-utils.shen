
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
        (@p (make-string "~A~AObject ~A = (Double)(~A) ~A (Double)(~A);~%"
                         A0-content A1-content Result A0-expression Operation A1-expression)
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
        (@p (make-string "~A~A" A0-content A1-content)
            (make-string "(Double)(~A) ~A (Double)(~A)"
			             A0-expression Operation A1-expression)
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
        (@p (make-string "~A~A" A0-content A1-content)
            (make-string "((boolean)~A ~A (boolean)~A)" A0-expression (logic-to-java Operation) A1-expression)
            boolean)))
  Operation X Vars -> (simple-error "Bad args to logic"))

(define combine-types
  unreachable Type2 -> Type2
  Type1 unreachable -> Type1
  Type1 Type2 -> (if (not (= object Type1)) Type1 Type2))

(define handle-unreachable-return Result ->
  (cond ((= unreachable (third Result)) "")
        ((= "" (second Result)) "")
        (true (make-string "return ~A;~%" (second Result)))))

(define handle-unreachable-assignment Var Result ->
  (let Second (second Result)
    (if (= unreachable (third Result))
        ""
        (make-string "~A = ~A;~%" Var Second))))

(define special-return Var EvaledArg Tail? ->
  (let Expression (second EvaledArg)
       Type (third EvaledArg)
       TailCall? (to-boolean (fourth EvaledArg))
    (cond ((= unreachable Type) "")
          ((= "" Expression) "")
          (TailCall? "")
          (Tail? (make-string "return ~A;~%" Expression))
          (true (make-string "~A = ~A;~%" Var Expression)))))

(define handle-cases
  [[true Expression]] -> Expression
  [Case] -> (handle-case Case [simple-error (make-string "True condition not found: ~A" Case)])
  [Case | Rest] -> (handle-case Case (handle-cases Rest))
  X -> (error "Invalid argument to handle-cases: ~A" X))

(define handle-case
  [Condition Action] Else -> [if Condition Action Else]
  X _ -> (error "Invalid argument to handle-case: ~A" X))

\* TODO: bad hacks here *\
\* (@p FuncSymbol FuncParams) where FuncParams are param pairs *\
(define set-compile-context Context -> (set shenj.platform/*compile-context* Context))
(define get-compile-context -> (let X (value shenj.platform/*compile-context*)
                                 (if (tuple? X) X (@p () ()))))
(define compile-context-symbol -> (fst (get-compile-context)))
(define compile-context-params -> (second (get-compile-context)))

