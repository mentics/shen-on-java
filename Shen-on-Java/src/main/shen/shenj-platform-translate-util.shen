(define to-var-pair Param -> (@p Param (to-var Param)))
(define to-var Param -> (name->method-name (str Param)))

(define is-java-call Symbol -> (string-prefix? "shenj.dot/" (str Symbol)))

(define method-sig { boolean --> (list string) --> string }
  TailCall? Params -> (let Join (if TailCall? "Object " "final Object ")
                        (string-join ", " (map (cn Join) Params))))

(define method-argstring { (list string) --> string }
  Params -> (string-join ", " Params))


(define shenj.platform/call-info-symbol->-h
  (@p F N M) Value -> (@p (cons Value F) N M)
  (@p F N) Value -> (if (= "/" Value)
                      (@p () N F)
                      (@p (cons Value F) N))
  () Value -> (cons Value ())
  N Value -> (if (= "/" Value)
               (@p () N)
               (cons Value N)))

(assert-equals ["a"] (shenj.platform/call-info-symbol->-h () "a"))
(assert-equals ["b" "a"] (shenj.platform/call-info-symbol->-h ["a"] "b"))
(assert-equals (@p () ["b" "a"]) (shenj.platform/call-info-symbol->-h ["b" "a"] "/"))
(assert-equals (@p ["c"] ["b" "a"]) (shenj.platform/call-info-symbol->-h (@p () ["b" "a"]) "c"))
(assert-equals (@p () ["b" "a"] ["c"]) (shenj.platform/call-info-symbol->-h (@p ["c"] ["b" "a"]) "/"))
(assert-equals (@p ["d"] ["b" "a"] ["c"]) (shenj.platform/call-info-symbol->-h (@p () ["b" "a"] ["c"]) "d"))

(define shenj.platform/string-fix List -> (list->string (reverse List)))

(assert-equals "abcd" (shenj.platform/string-fix ["d" "c" "b" "a"]))

(define shenj.platform/call-info-fix
  (@p F N M) -> (@p (shenj.platform/string-fix F) (shenj.platform/string-fix N) (shenj.platform/string-fix M))
  (@p F N) -> (@p (shenj.platform/string-fix F) (shenj.platform/string-fix N))
  F -> (shenj.platform/string-fix F))

(assert-equals (@p "e" "ab" "cd") (shenj.platform/call-info-fix (@p ["e"] ["b" "a"] ["d" "c"])))

\*
Create the mapping between function symbol and Java class and method.
dotted.namespace/function --> dotted.module.name.Function.function()
dotted.namespace/Modulename/function --> dotted.module.name.Modulename.function()
call-info = (@p function-name namespace module-name) { function-name=symbol, namespace=dotted.namespace, module-name=Modulename }
Second two things are optional
 *\
(define shenj.platform/call-info-symbol-> \*{ symbol --> shenj.platform/call-info } *\
  Symbol -> (let Str (str Symbol)
                 Lastindex (- (string-length Str) 1)
                 Lastchar (pos Str Lastindex)
              (if (= "/" Lastchar)
                  Str
                  (shenj.platform/call-info-fix (foldl (function shenj.platform/call-info-symbol->-h) () (explode Str))))))


(assert-equals "blue" (shenj.platform/call-info-symbol-> blue))
(assert-equals "blue-friend/or-other-thing/" (shenj.platform/call-info-symbol-> blue-friend/or-other-thing/))
(assert-equals "blue-friend-/" (shenj.platform/call-info-symbol-> blue-friend-/))
(assert-equals (@p "symbol->" "shenj.platform") (shenj.platform/call-info-symbol-> shenj.platform/symbol->))
(assert-equals (@p "call-info-symbol->" "shenj.platform") (shenj.platform/call-info-symbol-> shenj.platform/call-info-symbol->))

(define shenj.platform/call-info-namespace
  (@p F N M) -> N
  (@p F N) -> N
  F -> "shenj.root")

(define shenj.platform/call-info-module-name
  (@p F N M) -> M
  (@p F N) -> ""
  F -> "")

(define shenj.platform/call-info-function-name
  (@p F N M) -> F
  (@p F N) -> F
  F -> F)

(assert-equals "shenj.platform" (shenj.platform/call-info-namespace (shenj.platform/call-info-symbol-> shenj.platform/call-info-symbol->)))
(assert-equals "" (shenj.platform/call-info-module-name (shenj.platform/call-info-symbol-> shenj.platform/call-info-symbol->)))
(assert-equals "call-info-symbol->" (shenj.platform/call-info-function-name (shenj.platform/call-info-symbol-> shenj.platform/call-info-symbol->)))
(assert-equals "" (shenj.platform/call-info-module-name (shenj.platform/call-info-symbol-> shenj.platform/symbol->)))

(assert-equals "shen-i" (shenj.platform/call-info-namespace (shenj.platform/call-info-symbol-> shen-i/o-macro)))
(assert-equals "o-macro" (shenj.platform/call-info-function-name (shenj.platform/call-info-symbol-> shen-i/o-macro)))
(assert-equals "" (shenj.platform/call-info-module-name (shenj.platform/call-info-symbol-> shen-i/o-macro)))

(define string-split-h
  _ Result () -> Result
  _ Result "" -> Result
  Delim Result C -> (if (or (= () Result) (= () (hd Result))) Result (cons "" Result))
    where (= C Delim)
  _ () C -> [C]
  Delim Result C -> (cons (cn (hd Result) C) (tl Result)))
\*  Delim Result C -> (do (output (make-string "~A : ~A~%" C Result)) (cons (cn (hd Result) C) (tl Result)))) *\

(define string-split
  Delim String -> (reverse (foldl (string-split-h ".") () (explode String))))

(assert-equals () (string-split "." ""))
(assert-equals () (string-split "." "."))
(assert-equals ["one" "two" "three"] (string-split "." "one.two.three"))

(define string-join
  _ () -> ""
  Delim [X] -> X
  Delim [X | Xs] -> (@s X Delim (string-join Delim Xs)))

(define shenj.platform/call-info-namespace->package
  Namespace -> (string-join "." (map (function name->method-name) (string-split "." Namespace))))

(assert-equals "shenShen.friendBlue" (shenj.platform/call-info-namespace->package "shen-shen.friend-blue"))


(define shenj.platform/call-info-symbol->java-call-info
  Symbol -> (let Info (shenj.platform/call-info-symbol-> Symbol)
                 Modulename (shenj.platform/call-info-module-name Info)
                 Functionname (shenj.platform/call-info-function-name Info)
                 Classname (if (= "" Modulename) (name->class-name Functionname) (name->class-name Modulename))
                 Methodname (if (= "" Modulename) "LAMBDA" (name->method-name Functionname))
              (@p (shenj.platform/call-info-namespace->package (shenj.platform/call-info-namespace Info)) Classname Methodname)))

(assert-equals (@p "shenj.root" "DoSomethingSlash" "LAMBDA") (shenj.platform/call-info-symbol->java-call-info do-something-/))
(assert-equals (@p "shenj.platform" "OrOther" "LAMBDA") (shenj.platform/call-info-symbol->java-call-info shenj.platform/or-other))

(define shenj.platform/call-info-symbol->java-call-string
  Symbol -> (let Info (shenj.platform/call-info-symbol->java-call-info Symbol)
              (@s (fst Info) "." (second Info) "." (third Info))))

(assert-equals "shenj.platform.DoSomething.orOther" (shenj.platform/call-info-symbol->java-call-string shenj.platform/DoSomething/or-other))
(assert-equals "shenj.platform.OrOther.LAMBDA" (shenj.platform/call-info-symbol->java-call-string shenj.platform/or-other))
(assert-equals "shenj.root.ACall.LAMBDA" (shenj.platform/call-info-symbol->java-call-string a-call))
(assert-equals "shenI.OMacro.LAMBDA" (shenj.platform/call-info-symbol->java-call-string shen-i/o-macro))

(assert-equals "shenShen.friendFriend.ClassInfo.orOther" (shenj.platform/call-info-symbol->java-call-string shen-shen.friend-friend/class-info/or-other))


