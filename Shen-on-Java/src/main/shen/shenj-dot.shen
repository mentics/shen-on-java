(define to-java-part
  Symbol -> (if (symbol? Symbol)
                (let String (str Symbol)
                  (substring (string-length "shenj.dot/") (string-length String) String))
                (error "Non-symbol passed to to-java-part: ~A" Symbol)))

(define parse-java-call-symbol
  Symbol -> (let Str (to-java-part Symbol)
                 Length (string-length Str)
                 Last-index (- Length 1)
                 Last-char (pos Str Last-index)
              (cond ((= "." Last-char)
                      (@p constructor (substring 0 Last-index Str)))
                    ((= "." (hdstr Str))
                      (if (= "$" Last-char)
                        (@p instance-field (substring 1 Last-index Str))
                        (@p instance-method (substring 1 Length Str))))
                    ((and (> (string-length Str) 6) (= ".class" (substring (- Length 6) Length Str)))
                      (@p class Str))
                    ((= "$" Last-char)
                      (@p static-field (substring 0 Last-index Str)))
                    ((substring? "." Str)
                      (@p static-method Str))
                    (true ()))))



(define back-to-dot-notation
  Call-type Symbol ->
    (let Java-part (intern (to-java-part Symbol))
      (concat shenj.dot/
              (cond ((= Call-type constructor) (concat Java-part .))
                    ((= Call-type instance-method) (concat . Java-part))
                    ((= Call-type instance-field) (concat . (concat Java-part $)))
                    (true Java-part)))))

