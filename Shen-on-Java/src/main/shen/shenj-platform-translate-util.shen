(define to-var-pair Param -> (@p Param (to-var Param)))
(define to-var Param -> (name->method-name (str Param)))

(define method-sig { boolean --> (list string) --> string }
  TailCall? Params -> (let Join (if TailCall? "Object " "final Object ")
                        (string-join ", " (map (cn Join) Params))))

(define method-argstring { (list string) --> string }
  Params -> (string-join ", " Params))

(define replace-vars-string
  String (@p (@p _ FromVar) (@p _ ToVar)) -> (cn String (make-string "final Object ~A = ~A;~%" ToVar FromVar)))

(define shenj.platform/call-info-symbol->-h
  (@p F N M) Value -> (@p (cons Value F) N M)
  (@p F N) Value -> (if (= "/" Value)
                      (@p () N F)
                      (@p (cons Value F) N))
  () Value -> (cons Value ())
  N Value -> (if (= "/" Value)
               (@p () N)
               (cons Value N)))

(define shenj.platform/string-fix List -> (list->string (reverse List)))

(define shenj.platform/call-info-fix
  (@p F N M) -> (@p (shenj.platform/string-fix F) (shenj.platform/string-fix N) (shenj.platform/string-fix M))
  (@p F N) -> (@p (shenj.platform/string-fix F) (shenj.platform/string-fix N))
  F -> (shenj.platform/string-fix F))

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

(define string-join
  _ () -> ""
  Delim [X] -> X
  Delim [X | Xs] -> (@s X Delim (string-join Delim Xs)))

(define name->method-name
  "" -> ""
  Name -> (ensure-not-reserved (cn (ustring.downcase (ensure-valid-char (hdstr Name))) (javify-loop (explode (tlstr Name))))))

(define name->class-name
  "" -> ""
  Name ->
    (let First (hdstr Name) Rest (tlstr Name)
      (cond ((letter? First) (@s (ustring.upcase First) (javify-loop (explode Rest))))
		    (true (@s (ensure-valid-char First) (name->method-name Rest))))))

(define javify-loop
  [] -> ""
  [X] -> (ensure-valid-char X)
  ["-" ">" Third | Rest] ->
    (@s "To" (ustring.upcase Third) (javify-loop Rest))
	where (letter? Third)
  ["<" "-" Third | Rest] ->
    (@s "From" (ustring.upcase Third) (javify-loop Rest))
	where (letter? Third)
  ["-" Second | Rest] ->
    (let Fixed
	     (ensure-valid-char Second)
         (@s (ustring.upcase Fixed) (javify-loop Rest)))
  [First | Rest] -> (@s (ensure-valid-char First) (javify-loop Rest))
  X -> (simple-error "List expected. Call explode before calling javify-loop."))

(define ensure-valid-char
  "*" -> "Star"
  "/" -> "Slash"
  "?" -> "Q"
  "+" -> "Plus"
  "_" -> "_"
  "@" -> "At"
  "<" -> "A"
  ">" -> "Z"
  "-" -> "Hyphen"
  "=" -> "Equal"
  "!" -> "Bang"
  "~" -> "Tilde"
  "." -> "Dot"
  X -> (if (or (digit? X) (letter? X)) X "TOxDO"))

(define shenj.platform/call-info-namespace->package
  Namespace -> (string-join "." (map (function name->method-name) (string-split "." Namespace))))


(define shenj.platform/call-info-symbol->java-call-info
  Symbol -> (let Info (shenj.platform/call-info-symbol-> Symbol)
                 Modulename (shenj.platform/call-info-module-name Info)
                 Functionname (shenj.platform/call-info-function-name Info)
                 Classname (if (= "" Modulename) (name->class-name Functionname) (name->class-name Modulename))
                 Methodname (if (= "" Modulename) "LAMBDA" (name->method-name Functionname))
              (@p (shenj.platform/call-info-namespace->package (shenj.platform/call-info-namespace Info)) Classname Methodname)))

(define shenj.platform/call-info-symbol->java-call-string
  Symbol -> (let Info (shenj.platform/call-info-symbol->java-call-info Symbol)
              (@s (fst Info) "." (second Info) "." (third Info))))


