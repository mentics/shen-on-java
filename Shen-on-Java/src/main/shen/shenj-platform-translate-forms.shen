\* I did performance tests on JDK 1.7 and Name.LAMBDA.apply was within 0.35% as fast as Name.function
   and since it simplifies things, we'll go with Name.LAMBDA.apply *\
(define handle-defun Symbol Params Body Type Vars ->
    (let Arity (length Params)
         Argstring (method-argstring (map (function to-var) Params))
         Vars' (map (function to-var-pair) Params)
         Blah (set-compile-context (@p Symbol Vars'))
         Result (kl-to-java-traverse Body object Vars' true)
         TailCall? (to-boolean (fourth Result))
         Signature (method-sig TailCall? (map (function to-var) Params))
         ClassContent (make-string "public static final Symbol SYMBOL = symbol(c#34;~Ac#34;);~%public static Lambda ~A = new Lambda~A() {~%public Object apply(~A) throws Exception {~%~A~A~A}~%};~%"
                        Symbol
                        (third (shenj.platform/call-info-symbol->java-call-info Symbol)) (length Params)
                        Signature
                        (if TailCall? (make-string "while (true) {~%") "")
                        (fst Result)
                        (if TailCall? (make-string "}~%") (handle-unreachable-return Result)))
      (do (set-compile-context ())
          (@p ClassContent (str Symbol) func))))

(define handle-let Var Value Body Type Vars Tail? ->
    (let Var' (to-var (gensym Var))
      (let PValue (kl-to-java-traverse Value object Vars false)
           PBody (kl-to-java-traverse Body Type (cons (@p Var Var') Vars) Tail?)
        (@p (make-string "~Afinal Object ~A = ~A; // [let ~A ~A ~A]~%~A"
                         (fst PValue) Var' (second PValue) Var (remove-newlines Value) (remove-newlines Body)
                         (newline-if-not-empty (fst PBody)))
            (second PBody)
            (third PBody)
            (to-boolean (fourth PBody))))))

(define handle-if-h
  true PX0 PX1 PX2 Result ->
    (make-string "~Aif ((boolean)(~A)) {~%~A~A} else {~%~A~A}~%"
                 (fst PX0) (second PX0)
                 (fst PX1) (special-return Result PX1 true)
                 (fst PX2) (special-return Result PX2 true))
  false PX0 PX1 PX2 Result ->
    (make-string "~Afinal Object ~A;~%if ((boolean)(~A)) {~%~A~A} else {~%~A~A}~%"
                 (fst PX0) Result (second PX0)
                 (fst PX1) (handle-unreachable-assignment Result PX1)
                 (fst PX2) (handle-unreachable-assignment Result PX2)))

                                 
(define tail-call?
  P1 P2 -> (or (to-boolean (fourth P1)) (to-boolean (fourth P2))))


(define handle-if A0 A1 A2 Type Vars Tail? ->
    (let Result (gensym if)
         PX0 (kl-to-java-traverse A0 boolean Vars false)
         PX1 (kl-to-java-traverse A1 Type Vars Tail?)
         PX2 (kl-to-java-traverse A2 Type Vars Tail?)
         TailCall? (tail-call? PX1 PX2)
      (let First (if (= unreachable (third PX0))
                     (make-string "~A" (fst PX0))
                     (handle-if-h Tail? PX0 PX1 PX2 Result))
        (@p First
            (if Tail? "" (str Result))
            (if (= unreachable (third PX0)) unreachable
              (combine-types (third PX1) (third PX2)))
            (tail-call? PX1 PX2)))))


(define handle-trap-error To-eval Handler Type Vars Tail? ->
    (let Result (gensym t)
         Temp (gensym t)
         Evaled (kl-to-java-traverse To-eval object Vars false)
         Handler' (kl-to-java-traverse Handler lambda (cons (to-var-pair t) Vars) false)
	  (@p (make-string "Object ~A;~%try {~%~A~A = ~A;~%} catch (Throwable t) {~%~A~A = ~A.apply(t);~%}~%final Object ~A = ~A;~%"
                       Temp (fst Evaled) Temp (second Evaled) (fst Handler') Temp (second Handler') Result Temp)
          (str Result)
          object)))

\*
(define replace-param-vars-h
  String Var -> 

(define replace-param-vars
  String Vars -> (foldl (shenj.platform/regex "") String (compile-context-params)))

(assert-equals "do something replaceVar1 and replaceVar2" 
*\

(define handle-lambda
  Var Body Type Vars Tail? ->
      (let Result (gensym l)
           \* TODO: this only needs to handle compile-context-params but all Vars was easier *\
           ReplaceVars (map (/. V (@p (fst V) (str (gensym replaced)))) Vars)
           Vars' (if (= () Var) ReplaceVars (cons (to-var-pair Var) ReplaceVars))
           ReplaceVarsString (foldl (function replace-vars-string) "" (zip Vars ReplaceVars))
           Body' (kl-to-java-traverse Body object Vars' false)
           \*BodyString (replace-param-vars (fst Body') Vars)*\
           Params (map (function to-var) (to-list Var))
        (@p (make-string "~Afinal Lambda ~A = new Lambda~A() {~%  public Object apply(~A) throws Exception {~%~A~A}~%};~%"
	                       ReplaceVarsString Result (length Params) (method-sig false Params) (fst Body') (handle-unreachable-return Body'))
            (str Result)
            lambda)))

(handle-lambda X [+ 2 2] lambda [(@p v1 "v1") (@p v2 "v2")] false)

(define handle-open Stream-type Location Direction Type Vars Tail? ->
    (let Result (gensym o)
         Stream-type' (kl-to-java-traverse Stream-type symbol Vars false)
         Location' (kl-to-java-traverse Location string Vars false)
         Direction' (kl-to-java-traverse Direction symbol Vars false)
      (@p (make-string "~A~A~Afinal Object ~A = open(~A, ~A, ~A);~%"
	                   (fst Stream-type') (fst Location') (fst Direction')
	                   Result (second Stream-type') (second Location') (second Direction'))
          (str Result)
          stream)))


(define is-tail-call?
  Func Args -> (and
                 (not (= () (compile-context-symbol)))
                 (= Func (compile-context-symbol))
                 (= (length Args) (length (compile-context-params)))))

(define prepend-all
  Prepend Searches String -> (foldl (/. String Search (shenj.platform/regex Search String (cn Prepend Search))) String Searches)) 

(define handle-tail-call-h
  String (@p Param Arg) ->
    (let P (second Param)
         FixedArg (prepend-all "save" (map (function second) (compile-context-params)) Arg)
      (if (= P Arg) String (cn String (make-string "~A = ~A;~%" P FixedArg)))))

(define handle-tail-call
  Name EvaledArgs -> (@s (foldl (/. String P (make-string "~Afinal Object save~A = ~A;~%" String P P)) ""
                                (map (function second) (compile-context-params)))
                         (foldl (function handle-tail-call-h)
                                ""
                                (zip (compile-context-params) (map (function second) EvaledArgs)))
                         (make-string "continue;~%")))


\* TODO: can do direct (make-string "~A.lambda.apply(~A)" (to-var name) Args-string) *\
(define handle-call Func Args Type Vars Tail? ->
    (let Result (gensym f)
         Direct? (not (cons? Func))
         Func' (if (cons? Func) (kl-to-java-traverse Func lambda Vars false) (@p "" (to-var Func) symbol))
      (let EvaledArgs (map ((flip4 kl-to-java-traverse) false Vars object) Args)
        (let Args-prep-string (string-join "" (map (function fst) EvaledArgs))
             Args-string (string-join ", " (map (function second) EvaledArgs))
             Func-prep-string (fst Func')
             Func-string (second Func')
             Unreachable? (list-matches (/. X (= unreachable (third X))) EvaledArgs)
             TailCall? (and Tail? (is-tail-call? Func EvaledArgs))
          (let Eval (cond (Unreachable? "")
                          ((find-first? Func Vars)
                            (make-string "final Object ~A = dispatch(~A).apply(~A);~%"
                                         Result Func-string Args-string))
                          (Direct? (if TailCall?
                                       (handle-tail-call Func EvaledArgs)
                                       (make-string "final Object ~A = ~A.apply(~A);~%"
                                         Result (shenj.platform/call-info-symbol->java-call-string Func) Args-string)))
                          ((= lambda (third Func'))
                            (make-string "final Object ~A = ((Lambda)~A).apply(~A);~%"
                                         Result Func-string Args-string))
                          ((= symbol (third Func'))
                            (make-string "final Object ~A = symbolDispatch((Symbol)~A).apply(~A);~%"
                                         Result Func-string Args-string))
                          (true (make-string "final Object ~A = dispatch(~A).apply(~A);~%"
                                             Result Func-string Args-string)))
	          (@p (make-string "~A~A~A // Function call: ~A  Args: ~A)~%" Func-prep-string Args-prep-string Eval Func (remove-newlines Args))
                (str Result)
		            (if Unreachable? unreachable Type)
                TailCall?))))))

(define handle-java-call
  Call Args Type Vars Tail? ->
    (let Result (gensym c)
         EvaledArgs (map ((flip4 kl-to-java-traverse) false Vars object) Args)
         CallInfo (parse-java-call-symbol Call)
         Args-prep-string (newline-if-not-empty (string-join "" (map (function fst) EvaledArgs)))
      (handle-java CallInfo Result Args-prep-string EvaledArgs)))

(define handle-java
  (@p constructor Callpart) Result Args-prep-string EvaledArgs ->
    (let Args-string (shenj.platform/constructor-arg-string Callpart (map (function second) EvaledArgs))
      (@p (make-string "~A~A ~A = new ~A(~A);~%" Args-prep-string Callpart Result Callpart Args-string)
	        (str Result)
		      object))
  (@p instance-field Callpart) Result Args-prep-string EvaledArgs ->
      (@p Args-prep-string
          (make-string "~A.~A" (second (hd EvaledArgs)) Callpart)
          object)
  (@p static-field Callpart) Result Args-prep-string EvaledArgs ->
      (@p "" Callpart object)
  (@p instance-method Callpart) Result Args-prep-string EvaledArgs ->
    (let ArgInfo (shenj.platform/instance-method-arg-info Callpart (map (function second) (tl EvaledArgs)))
         Args-string (second ArgInfo)
         Receiver-type (third ArgInfo)
         Void? (= "void" (fst ArgInfo))
         Assignment (if Void? "" (make-string "Object ~A =" Result))
      (@p (make-string "~A~A((~A)~A).~A(~A);~%" Args-prep-string Assignment Receiver-type (second (hd EvaledArgs)) Callpart Args-string)
          (if Void? "null" (str Result))
          (if Void? void object)))
  (@p static-method Callpart) Result Args-prep-string EvaledArgs ->
    (let ArgInfo (shenj.platform/static-method-arg-info Callpart (map (function second) EvaledArgs))
         Args-string (second ArgInfo)
         Void? (= void (fst ArgInfo))
         Assignment (if Void? "" (make-string "Object ~A =" Result))
      (@p (make-string "~A~A~A(~A);~%" Args-prep-string Assignment Callpart Args-string)
          (if Void? "null" (str Result))
          (if Void? void object)))
  _ _ _ _ -> (error "Unknown java call"))

