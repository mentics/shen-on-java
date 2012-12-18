(assert-equals (make-string "V = 2;~%") (special-return V (@p "" "2" number) false)) 
(assert-equals (make-string "") (special-return V (@p "" "2" unreachable) false)) 
(assert-equals (make-string "") (special-return V (@p "" "2" unreachable true) false)) 
(assert-equals (make-string "return 2;~%") (special-return V (@p "" "2" number) true)) 
(assert-equals (make-string "") (special-return V (@p "" "2" number true) true)) 

