(define kl-to-java-string
  String -> (parsed-kl-to-java (parse-single-kl String)))
  
(define kl-to-java String ->
  (java-eval (parse-single-kl String)))

(define kl-file-to-java
  File -> (run-without-macros (freeze
                                (map (/. Parsed (output (make-string "~A~%" (java-eval Parsed))))
                                     (read-file File)))))

(define java-eval
  Parsed ->
    (let Result (parsed-kl-to-java Parsed)
      (let Unit (to-java-unit (fst Result) (second Result))
        (let Classname (fst Unit)
             Class-unit-content (second Unit)
             File (write-source (@s (value *src-dir*) (string-replace "." "/" Classname) ".java") Class-unit-content)
          (java-compile-and-run Classname File)))))

(define to-java-unit { string -> string -> (@p string string) \* class-name, contents *\ }
  Function-content Result-expression ->
    (let Info (if (= Result-expression "")
                  (@p "shenj.generated" "ToEval" "run")
                  \* We shouldn't need to convert to symbol here, I think *\
                  (shenj.platform/call-info-symbol->java-call-info (intern Result-expression)))
         Classsimplename (second Info)
         Packagename (fst Info)
      (@p (@s Packagename "." Classsimplename) (java-class-file Classsimplename Packagename Function-content))))

(define java-compile-and-run Classname File ->
  (shell (@s "C:\dev\java\jdk1.7.0_06\bin\java -Xss32m -cp C:/dev/java/libraries/kryo-2.20/bin;C:\dev\java\libraries\kryo-2.20\jars\debug\onejar\kryo-debug-2.20-all.jar;C:\dev\git-local\shenj\ShenJ\target\classes "
             "com.mentics.shenj.UpdateImage C:\dev\git-local\shenj\ShenJ\shen-test.image " Classname " " File " C:\dev\git-local\shenj\ShenJ\target\classes")))

(define java-class-file { string -> string -> string -> string }
  Classsimplename Package Contents ->
    (make-string "~A~%~%import static com.mentics.shenj.Lang.*;~%import static com.mentics.shenj.ShenjRuntime.*;~%import static com.mentics.shenj.inner.Context.*;~%import static com.mentics.shenj.inner.Primitives.*;~%import com.mentics.shenj.*;~%import com.mentics.shenj.inner.*;~%import shenj.root.*;~%~%public class ~A {~%~A~%}"
      (if (= Package "") "" (make-string "package ~A;~%~%" Package)) Classsimplename Contents))


(define parse-kl
  String -> (run-without-macros (freeze (snd (shen-<st_input> (@p (to-intlist String) ()))))))

(define parse-single-kl
  String -> (hd (parse-kl String)))

(define parsed-kl-to-java
  Parsed ->
      (let Result (kl-to-java-traverse Parsed object () true)
        (if (and (cons? Parsed) (= defun (hd Parsed)))
            (assert-test Result traverse-result-type? (make-string "Expected string triple from defun, was: ~A~%" (fst Result)))
            (let Code (assert-test (fst Result) string? (make-string "Expected string result body, but Result was: ~A~%" "TODO"))
                 Expression (assert-test (second Result) string? "Expected string result expression.")
              (@p (make-string "  public static Object run = new Lambda0() { public Object apply() throws Exception {~%~A;~%~A  } };"
			                         Code (handle-unreachable-return Result))
                  ""
                  runnable)))))
