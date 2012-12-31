(define is-java-call Symbol ->
  (not (= () (trap-error (parse-java-call-symbol Symbol) (/. E ())))))

(define to-java-part { String --> String }
  String -> (if (string? String)
                (substring (string-length "shenj.dot/") (string-length String) String)
                (error "Non-string passed to to-java-part: ~A" String)))

(define parse-java-call-symbol
  Symbol -> (let Str (to-java-part (str Symbol))
                 Length (string-length Str)
                 Last-index (- Length 1)
                 First (hdstr Str)
              (cond ((= ">" First)
                      (@p constructor (tlstr Str)))
                    ((string-prefix? "##" Str)
                      (@p instance-field (substring 2 Length Str)))
                    ((= "#" First)
                      (@p instance-method (tlstr Str)))
                    ((string-prefix? "%%" Str)
                      (@p static-field (substring 2 Length Str)))
                    ((= "%" First)
                      (@p static-method (tlstr Str)))
                    (true ()))))



(define back-to-dot-notation
  (@p Call-type Call-str) Symbol ->
    (let Java-part (intern (to-java-part (str Symbol)))
      (concat shenj.dot/
              (cond ((= Call-type constructor) (concat > Java-part))
                    ((= Call-type instance-method) (concat # Java-part))
                    ((= Call-type instance-field) (concat ## Java-part))
                    ((= Call-type static-field) (concat %% Java-part))
                    ((= Call-type static-method) (concat % Java-part))
                    (true Java-part)))))
