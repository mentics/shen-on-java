(define putv Symbol Link Value Vector -> (do (put Symbol Link Value Vector) Vector))
(assert-equals value1
  (let V (putv test link value1 (vector 10)) (get test link V))) 

(define putv-all Symbols Link Value Vector ->
  (do (map (/. Symbol (putv Symbol Link Value Vector)) Symbols) Vector))
(assert-equals [value1 value1 value1]
  (let V (putv-all [test1 test2 test3] link value1 (vector 10)) [(get test1 link V) (get test2 link V) (get test3 link V)])) 

(define loop
  _ From To -> [] where (> From To)
  Function From To -> (cons (Function From) (loop Function (+ From 1) To)))

(assert-equals [1 2 3 4] (loop (/. X X) 1 4))

(define id X -> X)
(define mapv
  Function Vector -> (loop (/. Index (Function (trap-error (<-vector Vector Index) (/. E ())))) 1 (limit Vector)))
(assert-equals [a b c d e] (mapv id (@v a b c d e <>)))

(define flatten-list List -> (foldl (function append) () List))
(assert-equals [1 2 3 4 5] (flatten-list [[1 2] [3 4] [5]]))

(define get-keys-h
  List -> (map (/. V (hd (hd V))) List))

\* Gets all the keys in a property vector *\
(define get-keys
  Vector -> (flatten-list (mapv (function get-keys-h) Vector)))
(assert-equals [a b c d e] (get-keys (putv-all [a b c d e] link value (vector 2))))

(define namespace-struct-with
  (@p _ Suffix Hiding Imports) alias:Alias     -> (@p Alias Suffix Hiding Imports)
  (@p Alias _ Hiding Imports)  suffixes:Suffix -> (@p Alias Suffix Hiding Imports)
  (@p Alias Suffix _ Imports)  hiding:Hiding   -> (@p Alias Suffix Hiding Imports)
  (@p Alias Suffix Hiding _)   imports:Imports -> (@p Alias Suffix Hiding Imports))
(let Struct (@p v1 v2 v3 [])
  (assert-equals (@p newalias v2 v3 []) (namespace-struct-with Struct alias:newalias)))

(define namespace-process-imports { list symbol --> vector * vector * vector * list symbol --> vector * vector * vector * list symbol }
  [] Acc -> Acc
  [alias:Alias | Rest] Acc    ->
    (let New-alias (putv Alias alias (hd (fourth Acc)) (fst Acc))
         New-acc (namespace-struct-with Acc alias:New-alias)
      (namespace-process-imports Rest New-acc))
  [for:Suffixes | Rest] Acc   ->
    (let New-suffixes (putv-all Suffixes suffix (hd (fourth Acc)) (second Acc))
         New-acc (namespace-struct-with Acc suffixes:New-suffixes)
      (namespace-process-imports Rest New-acc))
  [hiding:Hidings | Rest] Acc ->
    (let Prefixed-hidings (map (concat (hd (fourth Acc))) Hidings)
         New-hidings (putv-all Prefixed-hidings hiding true (third Acc))
         New-acc (namespace-struct-with Acc hiding:New-hidings)
      (namespace-process-imports Rest New-acc))
  [Import | Rest] Acc           ->
    (let New-acc (namespace-struct-with Acc imports:(cons Import (fourth Acc))) 
      (namespace-process-imports Rest New-acc)))
\* TODO: should we reverse the result back (since foldl reverses things) *\

(let Result (namespace-process-imports [test.import. alias:t. for:[a b c]
                                        test2.import2. alias:t2. hiding:[x y z]]
                                       (default-struct))
  (do (assert-equals [t. t2.] (get-keys (fst Result)))
      (assert-equals [a b c] (get-keys (second Result)))
      (assert-equals [test2.import2.x test2.import2.y test2.import2.z] (get-keys (third Result)))
      (assert-equals [test2.import2. test.import.] (fourth Result))))

(define default-struct -> (@p (vector 5) (vector 5) (vector 5) []))

(define aliases Struct -> (get-keys (fst Struct)))
(let Struct (namespace-process-imports [n.s.1. n.s.2. alias:ns2. n.s.3. for:[sym0 sym2]] (default-struct))
  (assert-equals [ns2.] (aliases Struct)))

(define is-in-hiding Struct Symbol -> (trap-error (get Symbol hiding (third Struct)) (/. E false)))
(let Struct (namespace-process-imports [test2.import2. alias:t2. hiding:[x y z]] (default-struct))
     _ (assert-equals true (is-in-hiding Struct test2.import2.y))
     _ (assert-equals false (is-in-hiding Struct nothing))
  true)

(define find
  _ [] -> ()
  Predicate [X | Rest] -> (if (Predicate X) X (find Predicate Rest)))
(assert-equals 2 (find (/. X (= X 2)) [1 2 3]))


(define alias Struct Alias -> (get Alias alias (fst Struct)))

(define process-symbol
  Struct Symbol ->
    (let Alias (find (/. Alias (string-prefix? (str Alias) (str Symbol))) (aliases Struct))
      (if (= () Alias) 
          Symbol
          (let New-symbol (concat (alias Struct Alias) Symbol)
            (if (is-in-hiding Struct New-symbol)
                New-symbol
                Symbol)))))
(let Struct (namespace-process-imports [n.s.1. n.s.2. alias:ns2. n.s.3. for:[sym0 sym2]] (default-struct))
     _ (assert-equals a (process-symbol Struct a))
     _ (assert-equals n.s.2.a (process-symbol Struct ns2.a))
  true)

(define namespace-macro-h
  _ Acc [] -> Acc
  Struct Acc [Expression | Rest] ->
    (let New-expression (cond ((cons? Expression) (foldl (namespace-macro-h Struct) () Expression))
                              ((symbol? Expression) (process-symbol Struct Expression))
                              (true Expression))
        (cons New-expression (namespace-macro-h Struct Acc Rest))))

(assert-equals [+ 1 2] (namespace-macro-h (default-struct) () [+ 1 2]))
(let Struct (namespace-process-imports [n.s.1. n.s.2. alias:ns2. n.s.3. for:[sym0 sym2]])
  (assert-equals [define n.s.3.sym0 X Y -> [n.s.2.sym1 n.s.3.sym2 X Y]]
                 (namespace-macro-h Struct () [define sym0 X Y -> [ns2.sym1 sym2 X Y]]))
  
(defmacro namespace-macro
  [namespace Namespace Export-symbols Imports Expressions] ->
    (let _ (map (/. Symbol (put (concat Namespace Symbol) exported true)) Export-symbols)
         Struct (namespace-process-imports Imports (default-struct))
      (namespace-macro-h Struct) () Expressions)
      

