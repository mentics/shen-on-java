\* I did performance tests on JDK 1.7 and Name.LAMBDA.apply was within 0.35% as fast as Name.function
   and since it simplifies things, we'll go with Name.LAMBDA.apply *\
(define handle-defun Name Params Body Type Vars ->
    (let Arity (length Params)
         Signature (method-sig (map (function to-var) Params))
         Argstring (method-argstring (map (function to-var) Params))
      (do (put Name arity (length Params))
          (@p (let Result (kl-to-java-traverse Body object (map (function to-var-pair) Params))
\* TODO: do perf compare between Name.LAMBDA.apply(...) and Name.defined(...) *\
                   (make-string "
public static final Symbol SYMBOL = symbol(c#34;~Ac#34;);
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
		      func))))

(define handle-let Var Value Body Type Vars ->
    (let Var' (to-var (gensym Var))
      (let PValue (kl-to-java-traverse Value object Vars)
           PBody (kl-to-java-traverse Body Type (cons (@p Var Var') Vars))
        (@p (make-string "~A~%final Object ~A = ~A;~%~A~%" (fst PValue) Var' (second PValue) (fst PBody))
            (second PBody)
            (third PBody)))))

(define handle-if A0 A1 A2 Type Vars ->
    (let Result (gensym i)
         PX0 (kl-to-java-traverse A0 boolean Vars)
         PX1 (kl-to-java-traverse A1 Type Vars)
         PX2 (kl-to-java-traverse A2 Type Vars)
      (let First (if (= unreachable (third PX0))
                   (make-string "~A~%" (fst PX0))
                   (make-string "~A~%final Object ~A;~%if ((boolean)~A) {~%~A~%~A} else {~%~A~%~A~%}"
                                (fst PX0) Result (second PX0)
                                (fst PX1) (handle-unreachable-assignment Result PX1)
                                (fst PX2) (handle-unreachable-assignment Result PX2)))
        (@p First
            (str Result)
            (if (= unreachable (third PX0)) unreachable
              (combine-types (third PX1) (third PX2)))))))


(define handle-trap-error To-eval Handler Type Vars ->
    (let Result (gensym t)
         Temp (gensym t)
         Evaled (kl-to-java-traverse To-eval object Vars)
         Handler' (kl-to-java-traverse Handler lambda (cons (to-var-pair t) Vars))
	  (@p (make-string "Object ~A;~%try {~%~A~%~A = ~A;~%} catch (Throwable t) {~%~A~%~A = ~A.apply(t);~%}~%final Object ~A = ~A;~%"
                       Temp (fst Evaled) Temp (second Evaled) (fst Handler') Temp (second Handler') Result Temp)
          (str Result)
          object)))

(define handle-lambda
  Var Body Type Vars ->
      (let Result (gensym l)
           Vars' (if (= () Var) Vars (cons (to-var-pair Var) Vars)) 
           Body' (kl-to-java-traverse Body object Vars')
           Params (map (function to-var) (to-list Var))
        (@p (make-string "final Lambda ~A = new Lambda~A() {~%  public Object apply(~A) throws Exception {~%~A~%~A}~%};"
	                     Result (length Params) (method-sig Params) (fst Body') (handle-unreachable-return Body'))
	        (str Result)
            lambda)))

(define handle-open Stream-type Location Direction Type Vars ->
    (let Result (gensym o)
         Stream-type' (kl-to-java-traverse Stream-type symbol Vars)
         Location' (kl-to-java-traverse Location string Vars)
         Direction' (kl-to-java-traverse Direction symbol Vars)
      (@p (make-string "~A~%~A~%~A~%final Object ~A = open(~A, ~A, ~A);"
	                   (fst Stream-type') (fst Location') (fst Direction')
	                   Result (second Stream-type') (second Location') (second Direction'))
          (str Result)
          stream)))


\* TODO: can do direct (make-string "~A.lambda.apply(~A)" (to-var name) Args-string) *\
(define handle-call Func Args Type Vars ->
    (let Result (gensym f)
         Direct? (not (cons? Func))
         Func' (if (cons? Func) (kl-to-java-traverse Func lambda Vars) (@p "" (to-var Func) symbol))
      (let EvaledArgs (map ((flip3 kl-to-java-traverse) Vars object) Args)
        (let Args-prep-string (string-join "" (map (function fst) EvaledArgs))
             Args-string (string-join ", " (map (function second) EvaledArgs))
             Func-prep-string (fst Func')
             Func-string (second Func')
             Unreachable? (list-matches (/. X (= unreachable (third X))) EvaledArgs)
          (let Eval (cond (Unreachable? "")
                          ((and (symbol? Func) (is-java-call (str Func)))
                            (make-string "final Object ~A = javaDispatch(c#34;~Ac#34;).apply(~A);~%"
                                         Result (str Func) Args-string))
                          ((find-first? Func Vars)
                            (make-string "final Object ~A = dispatch(~A).apply(~A);~%"
                                         Result Func-string Args-string))
                          (Direct? (make-string "final Object ~A = ~A.LAMBDA.apply(~A);~%"
                                                Result (name->class-name (str Func)) Args-string))
                          ((= lambda (third Func'))
                            (make-string "final Object ~A = ((Lambda)~A).apply(~A);~%"
                                         Result Func-string Args-string))
                          ((= symbol (third Func'))
                            (make-string "final Object ~A = symbolDispatch((Symbol)~A).apply(~A);~%"
                                         Result Func-string Args-string))
                          (true (make-string "final Object ~A = dispatch(~A).apply(~A);~%"
                                             Result Func-string Args-string)))
	        (@p (make-string "~A~A~A" Func-prep-string Args-prep-string Eval)
                (str Result)
		        (if Unreachable? unreachable Type)))))))

(define handle-java-call
  [shenj-dot-new Class | Args] Type Vars ->
    (let Result (gensym c)
         EvaledArgs (map ((flip3 kl-to-java-traverse) Vars object) Args)
      (let Args-prep-string (string-join "" (map (function fst) EvaledArgs))
           Args-string (string-join ", " (map (function second) EvaledArgs))
      (@p (make-string "~A~%Object ~A = new ~A(~A);~%" Args-prep-string Result Class Args-string)
	      (str Result)
		  object)))
  Func _ _ -> (error "Unknown java call: ~A" Func))