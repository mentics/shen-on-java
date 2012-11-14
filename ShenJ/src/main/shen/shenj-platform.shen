
(define kl-to-java-string
  String -> (parsed-kl-to-java (parse-single-kl String)))
  
(define kl-to-java String ->
  (java-eval (parse-single-kl String)))

(define kl-file-to-java
  File -> (run-without-macros (freeze (map (/. Parsed (output (make-string "~A~%" (java-eval Parsed))))
                                           (read-file File)))))

(define java-eval
  Parsed ->
    (let Result (parsed-kl-to-java Parsed)
      (let Unit (to-java-unit (fst Result) (second Result))
        (let Class-name (fst Unit) Class-unit-content (second Unit)
          (let File
            (write-source (@s Class-name ".java") Class-unit-content)
            (java-compile-and-run Class-name File))))))

(define parsed-kl-to-java
  Parsed ->
    (do (output (make-string "~%~%~%Evaluating: ~A~%~%" Parsed))
      (let Result (kl-to-java-traverse Parsed object ())
        (if (and (cons? Parsed) (= defun (hd Parsed)))
		  (assert-test Result traverse-result-type?
		          (make-string "Expected string triple from defun, was: ~A~%" (fst Result)))
	      (let Code (assert-test (fst Result) string?
		                    (make-string "Expected string result body, but Result was: ~A~%" "TODO"))
		       Expression (assert-test (second Result) string? "Expected string result expression.")
            (@p (make-string "  public static Object run() throws Exception {~%~A;~%~A  }"
			                 Code (handle-unreachable-return Result))
                ""))))))

(define to-java-unit { string -> string -> (@p string string) \* class-name, contents *\ }
  Function-content Result-expression ->
    (let Class-name (if (= Result-expression "") "ToEval" (name->class-name Result-expression))
      (@p Class-name (java-class-file Class-name "shen.gen" Function-content))))

(define java-compile-and-run Class-name File ->
  (shell (@s "C:\dev\java\jdk1.7.0_06\bin\javaw -Xss32m -cp C:\dev\java\libraries\kryo-2.20\bin;C:\dev\java\libraries\kryo-2.20\jars\debug\onejar\kryo-debug-2.20-all.jar;C:\dev\git-local\shenj\ShenJ\target\classes com.mentics.shen.UpdateImage shen-test.image "
             (@s "shen.gen." Class-name) " C:/dev/git-local/shenj/ShenJ/src/main/shen/" File " C:\dev\git-local\shenj\ShenJ\target\classes")))
\*  (shell (@s "C:\dev\java\jdk1.7.0_06\bin\javac -cp C:\dev\workspace\ShenJ\target\classes -d C:\dev\workspace\ShenJ\target\classes " (@s (value *home-directory*) File)))) *\
\*  (shell (@s "C:\dev\java\jdk1.7.0_06\bin\javaw -Xss32m -cp C:\dev\java\libraries\kryo-2.20\jars\debug\onejar\kryo-debug-2.20-all.jar;C:\dev\workspace\ShenJ\target\classes com.mentics.shen.UpdateImage shen-test.image " *\


(define java-class-file { string -> string -> string -> string }
  Name Package Contents ->
    (make-string "~A~%~%import com.mentics.shen.*;~%~%public class ~A {~%~A~%}~%"
      (if (= Package "") "" (make-string "package ~A;~%~%" Package)) Name Contents))


(define parse-kl
  String -> (run-without-macros (freeze (snd (shen-<st_input> (@p (to-intlist String) ()))))))

(define parse-single-kl
  String -> (hd (parse-kl String)))
