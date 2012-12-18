(assert-equals (make-string "start: final Object v2 = v1;~%") (replace-vars-string "start: " (@p (@p v1 "v1") (@p v2 "v2"))))

(assert-equals ["a"] (shenj.platform/call-info-symbol->-h () "a"))
(assert-equals ["b" "a"] (shenj.platform/call-info-symbol->-h ["a"] "b"))
(assert-equals (@p () ["b" "a"]) (shenj.platform/call-info-symbol->-h ["b" "a"] "/"))
(assert-equals (@p ["c"] ["b" "a"]) (shenj.platform/call-info-symbol->-h (@p () ["b" "a"]) "c"))
(assert-equals (@p () ["b" "a"] ["c"]) (shenj.platform/call-info-symbol->-h (@p ["c"] ["b" "a"]) "/"))
(assert-equals (@p ["d"] ["b" "a"] ["c"]) (shenj.platform/call-info-symbol->-h (@p () ["b" "a"] ["c"]) "d"))

(assert-equals "abcd" (shenj.platform/string-fix ["d" "c" "b" "a"]))

(assert-equals (@p "e" "ab" "cd") (shenj.platform/call-info-fix (@p ["e"] ["b" "a"] ["d" "c"])))

(assert-equals "blue" (shenj.platform/call-info-symbol-> blue))
(assert-equals "blue-friend/or-other-thing/" (shenj.platform/call-info-symbol-> blue-friend/or-other-thing/))
(assert-equals "blue-friend-/" (shenj.platform/call-info-symbol-> blue-friend-/))
(assert-equals (@p "symbol->" "shenj.platform") (shenj.platform/call-info-symbol-> shenj.platform/symbol->))
(assert-equals (@p "call-info-symbol->" "shenj.platform") (shenj.platform/call-info-symbol-> shenj.platform/call-info-symbol->))

(assert-equals "shenj.platform" (shenj.platform/call-info-namespace (shenj.platform/call-info-symbol-> shenj.platform/call-info-symbol->)))
(assert-equals "" (shenj.platform/call-info-module-name (shenj.platform/call-info-symbol-> shenj.platform/call-info-symbol->)))
(assert-equals "call-info-symbol->" (shenj.platform/call-info-function-name (shenj.platform/call-info-symbol-> shenj.platform/call-info-symbol->)))
(assert-equals "" (shenj.platform/call-info-module-name (shenj.platform/call-info-symbol-> shenj.platform/symbol->)))

(assert-equals "shen-i" (shenj.platform/call-info-namespace (shenj.platform/call-info-symbol-> shen-i/o-macro)))
(assert-equals "o-macro" (shenj.platform/call-info-function-name (shenj.platform/call-info-symbol-> shen-i/o-macro)))
(assert-equals "" (shenj.platform/call-info-module-name (shenj.platform/call-info-symbol-> shen-i/o-macro)))

(assert-equals () (string-split "." ""))
(assert-equals () (string-split "." "."))
(assert-equals ["one" "two" "three"] (string-split "." "one.two.three"))

(assert-equals "shenShen.friendBlue" (shenj.platform/call-info-namespace->package "shen-shen.friend-blue"))

(assert-equals (@p "shenj.root" "DoSomethingSlash" "LAMBDA") (shenj.platform/call-info-symbol->java-call-info do-something-/))
(assert-equals (@p "shenj.platform" "OrOther" "LAMBDA") (shenj.platform/call-info-symbol->java-call-info shenj.platform/or-other))

(assert-equals "shenj.platform.DoSomething.orOther" (shenj.platform/call-info-symbol->java-call-string shenj.platform/DoSomething/or-other))
(assert-equals "shenj.platform.OrOther.LAMBDA" (shenj.platform/call-info-symbol->java-call-string shenj.platform/or-other))
(assert-equals "shenj.root.ACall.LAMBDA" (shenj.platform/call-info-symbol->java-call-string a-call))
(assert-equals "shenI.OMacro.LAMBDA" (shenj.platform/call-info-symbol->java-call-string shen-i/o-macro))

(assert-equals "shenShen.friendFriend.ClassInfo.orOther" (shenj.platform/call-info-symbol->java-call-string shen-shen.friend-friend/class-info/or-other))

