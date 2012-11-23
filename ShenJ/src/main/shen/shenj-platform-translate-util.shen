

(define to-var-pair Param -> (@p Param (to-var Param)))
(define to-var Param -> (name->method-name (str Param)))


(define is-java-call String -> false)
\*
  String -> (let Dot-index (string-index "." String)
                 Dollar-index (string-index "$" String)
              (and (or (not (= Dot-index -1)) (not (= Dollar-index -1))) (not (= (string-length String) 1)))))
*\


(define method-sig { (list string) --> string }
  Params -> (string-join ", " (map (cn "final Object ") Params)))

(define method-argstring { (list string) --> string }
  Params -> (string-join ", " Params))