(define namespace/default-struct -> (@p (vector 5) (vector 5) (vector 5) [] (intern "")))

(define namespace/struct-with
  (@p _ Suffix Hiding Imports NS) alias:Alias     -> (@p Alias Suffix Hiding Imports NS)
  (@p Alias _ Hiding Imports NS)  suffixes:Suffix -> (@p Alias Suffix Hiding Imports NS)
  (@p Alias Suffix _ Imports NS)  hiding:Hiding   -> (@p Alias Suffix Hiding Imports NS)
  (@p Alias Suffix Hiding _ NS)   imports:Imports -> (@p Alias Suffix Hiding Imports NS)
  (@p Alias Suffix Hiding Imports _) ns:NS -> (@p Alias Suffix Hiding Imports NS))

(define namespace/process-imports { list symbol --> vector * vector * vector * list symbol --> vector * vector * vector * list symbol }
  [] Acc -> Acc
  [alias:Alias | Rest] Acc    ->
    (let New-alias (putv Alias alias (hd (fourth Acc)) (fst Acc))
         New-acc (namespace/struct-with Acc alias:New-alias)
      (namespace/process-imports Rest New-acc))
  [for:Suffixes | Rest] Acc   ->
    (let New-suffixes (putv-all Suffixes suffix (hd (fourth Acc)) (second Acc))
         New-acc (namespace/struct-with Acc suffixes:New-suffixes)
      (namespace/process-imports Rest New-acc))
  [hiding:Hidings | Rest] Acc ->
    (let Prefixed-hidings (map (concat (hd (fourth Acc))) Hidings)
         New-hidings (putv-all Prefixed-hidings hiding true (third Acc))
         New-acc (namespace/struct-with Acc hiding:New-hidings)
      (namespace/process-imports Rest New-acc))
  [Import | Rest] Acc           ->
    (let New-acc (namespace/struct-with Acc imports:(cons Import (fourth Acc))) 
      (namespace/process-imports Rest New-acc)))
\* TODO: should we reverse the result back (since foldl reverses things) *\

(define namespace/aliases Struct -> (get-keys (fst Struct)))

(define namespace/is-in-hiding Struct Symbol -> (trap-error (get Symbol hiding (third Struct)) (/. E false)))

(define namespace/alias Struct Alias -> (get Alias alias (fst Struct)))








(define namespace/process-alias
  Struct Symbol ->
    (let Alias (find (/. Alias (string-prefix? (str Alias) (str Symbol))) (namespace/aliases Struct))
      (if (= () Alias) 
          Symbol
          (let String-symbol (str Symbol)
               String-alias (str Alias)
               New-symbol (intern (cn (str (namespace/alias Struct Alias)) (substring (string-length String-alias) (string-length String-symbol) String-symbol)))
            (if (namespace/is-in-hiding Struct New-symbol) Symbol New-symbol)))))

(define namespace/process-suffixes
  Struct Symbol ->
    (trap-error (let Suffix-ns (get Symbol suffix (second Struct))
                  (concat Suffix-ns Symbol))
                (/. E Symbol)))

(define namespace/symbol-defined?
  Struct Symbol -> (if (element? Symbol (systemf ()))
                       Symbol
                       (shenj.reflect/lookup-function Symbol)))

(define namespace/look-in-imports
  Struct Symbol ->
    (let Imports (fourth Struct)
         Result (find (/. Import (!= (namespace/symbol-defined? Struct (concat Import Symbol)) ())) Imports)
      (if (= Result ()) () (namespace/symbol-defined? Struct (concat Result Symbol)))))

(define namespace/process-symbol
  Struct Symbol ->
    (if (variable? Symbol) Symbol
		    (let Aliased (namespace/process-alias Struct Symbol)
		      (if (= Aliased Symbol)
		          (let Suffixed (namespace/process-suffixes Struct Symbol)
		            (if (= Suffixed Symbol)
                    (let Check-java (intern (string-replace "#" "" (if (element? shenj.dot/ (fourth Struct))
                                                                       (ensure-prefix shenj.dot/ Symbol)
                                                                       Symbol)))
                         Java-call (if (is-java-call Check-java)
                                       (let Call-info (parse-java-call-symbol Check-java)
                                         (if (= Call-info ())
                                              ()
                                              (let Search (if (or (= static-method (fst Call-info)) (= static-field (fst Call-info)))
                                                                      (shenj.dot/com.mentics.util.StringUtil.removeLastToken "." (second Call-info))
                                                                      (second Call-info))
                                                   Result (namespace/look-in-imports Struct (intern Search))
                                                (if (= Result ()) Check-java (back-to-dot-notation Call-info (concat shenj.dot/ Result))))))
                                       ())
                      (if (= () Java-call)
                          (let Imported (namespace/look-in-imports Struct Symbol)
                            (if (= Imported ())
                                (let New-symbol (namespace/symbol-defined? Struct Symbol)
                                  (if (= New-symbol ()) (concat (fifth Struct) Symbol) New-symbol))
		                            Imported))
                          Java-call))
		                Suffixed))
		          Aliased))))




(define namespace/macro-h
  _ Acc [] -> Acc
  Struct Acc [Expression | Rest] ->
    (let New-expression (cond ((cons? Expression) (namespace/macro-h Struct () Expression))
                              ((symbol? Expression) (namespace/process-symbol Struct Expression))
                              (true Expression))
        (cons New-expression (namespace/macro-h Struct Acc Rest))))

  
(defmacro namespace/macro
  [namespace Namespace Export-symbols Imports | Expressions] ->
    (cons package (cons null (cons []
                                   (let _ (map (/. Symbol (put (concat Namespace Symbol) exported true)) Export-symbols)
                                          Struct (namespace/process-imports (eval Imports) (namespace/struct-with (namespace/default-struct) ns:Namespace))
                                     (namespace/macro-h Struct () Expressions))))))
