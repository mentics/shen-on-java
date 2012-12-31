(define to-java-part { String --> String }
  String -> (if (string? String)
                (substring (string-length "shenj.dot/") (string-length String) String)
                (error "Non-string passed to to-java-part: ~A" String)))

(define parse-java-call-symbol
  Symbol -> (let Str (to-java-part (str Symbol))
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
  (@p Call-type Call-str) Symbol ->
    (let Java-part (intern (to-java-part (str Symbol)))
      (concat shenj.dot/
              (cond ((= Call-type constructor) (concat Java-part .))
                    ((= Call-type instance-method) (concat . Java-part))
                    ((= Call-type instance-field) (concat . (concat Java-part $)))
                    ((= Call-type static-field) (intern (to-java-part (@s (shenj.dot/com.mentics.util.StringUtil.removeLastToken "." (str Symbol)) "." Call-str "$"))))
                    ((= Call-type static-method) (intern (to-java-part (@s (shenj.dot/com.mentics.util.StringUtil.removeLastToken "." (str Symbol)) "." Call-str))))
                    (true Java-part)))))
