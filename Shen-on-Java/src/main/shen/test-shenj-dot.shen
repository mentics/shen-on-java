(assert-equals "JFrame." (to-java-part (intern "shenj.dot/JFrame.")))
(assert-equals "error" (trap-error (to-java-part "shenj.dot/JFrame.") (/. E "error")))

(assert-equals (@p constructor "java.awt.Font") (parse-java-call-symbol (intern "shenj.dot/java.awt.Font.")))
(assert-equals (@p instance-method "setFont") (parse-java-call-symbol (intern "shenj.dot/.setFont")))
(assert-equals (@p instance-field "first") (parse-java-call-symbol (intern "shenj.dot/.first$")))
(assert-equals (@p class "java.awt.Font.class") (parse-java-call-symbol (intern "shenj.dot/java.awt.Font.class")))
(assert-equals (@p static-field "java.awt.Font.BOLD") (parse-java-call-symbol (intern "shenj.dot/java.awt.Font.BOLD$")))
(assert-equals (@p static-method "java.lang.Math.round") (parse-java-call-symbol (intern "shenj.dot/java.lang.Math.round")))
(assert-equals (@p constructor "JFrame") (parse-java-call-symbol (intern "shenj.dot/JFrame.")))

(assert-equals (intern "shenj.dot/JFrame.") (back-to-dot-notation constructor (intern "shenj.dot/JFrame")))

