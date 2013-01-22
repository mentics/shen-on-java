(assert-equals false (is-java-call <e>))
(assert-equals false (is-java-call (intern "Parse_<br$>")))

(assert-equals ">JFrame" (to-java-part "shenj.dot/>JFrame"))
(assert-equals "" (to-java-part (intern "shenj.dot/>JFrame")))

(assert-equals (@p constructor "java.awt.Font") (parse-java-call-symbol (intern "shenj.dot/>java.awt.Font")))
(assert-equals (@p instance-method "Something.setFont") (parse-java-call-symbol (intern "shenj.dot/#Something.setFont")))
(assert-equals (@p instance-field "first") (parse-java-call-symbol (intern "shenj.dot/##first")))
(assert-equals (@p static-method "java.awt.Font.class") (parse-java-call-symbol (intern "shenj.dot/%java.awt.Font.class")))
(assert-equals (@p static-field "java.awt.Font.BOLD") (parse-java-call-symbol (intern "shenj.dot/%%java.awt.Font.BOLD")))
(assert-equals (@p static-method "java.lang.Math.round") (parse-java-call-symbol (intern "shenj.dot/%java.lang.Math.round")))
(assert-equals (@p constructor "JFrame") (parse-java-call-symbol (intern "shenj.dot/>JFrame")))
(assert-equals (@p sub-class "JFrame") (parse-java-call-symbol (intern "shenj.dot/>>JFrame")))

(assert-equals (intern "shenj.dot/>JFrame") (back-to-dot-notation (@p constructor "") (intern "shenj.dot/JFrame")))

(assert-equals true (string-prefix? "java.io.PrintStream" (str shenj.dot/%%java.lang.System.out)))
(assert-equals "globalProperties" shenj.dot/%%com.mentics.shenj.inner.Context.GLOBAL_PROPERTIES_NAME)
(assert-equals 4 (shenj.dot/%java.lang.Math.pow 2 2))
(assert-equals (fail) (shenj.dot/#javax.swing.JFrame.setVisible (shenj.dot/>javax.swing.JFrame "title":java.lang.String) true))


(assert-equals (intern "shenj.dot/%%KeyEvent.UP") (back-to-dot-notation (@p static-field "") (intern "shenj.dot/KeyEvent.UP")))
