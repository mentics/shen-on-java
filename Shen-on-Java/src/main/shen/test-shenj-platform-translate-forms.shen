\*(assert-equals "" (handle-if-h false*\ 

(assert-equals false (tail-call? (@p a b) (@p 1 2)))
(assert-equals true (tail-call? (@p a b c true) (@p 1 2)))
(assert-equals true (tail-call? (@p a b c false) (@p 1 2 3 true)))

\*(assert-equals "" 
  (handle-if true 1 2 number () false))*\
(handle-if true 1 2 number () true)
(handle-if true 1 2 number () false)

(assert-equals "(+ savev1 savev2)" (prepend-all "save" ["v1" "v2"] "(+ v1 v2)"))

(assert-equals "blah" (handle-tail-call-h "blah" (@p (@p v123 "v123") "v123")))
(assert-equals (make-string "v713 = a39;v714 = a40;~%") (handle-tail-call-h "v713 = a39;" (@p (@p V714 "v714") "a40")))

(set-compile-context (@p test [(@p v1 "v1" object) (@p v2 "v2" object)]))
(assert-equals (make-string "final Object savev1 = v1;~%final Object savev2 = v2;~%v1 = 2;~%v2 = savev1;~%continue;~%")
               (handle-tail-call test [(@p "" "2" object) (@p "" "v1" object)]))
