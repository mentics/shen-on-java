(define shenj.platform/parse-shen X ->  (snd (shen-<st_input> (@p (to-intlist X) ()))))
(define shenj.platform/eval-shens X -> (map (function eval) (parse-shen X)))
(define shenj.platform/eval-shen X -> (eval (hd (parse-shen X))))
(define shenj.platform/shen-to-java
  X -> (let Java (parsed-kl-to-java (hd (kl-from-shen (parse-shen X))))
    (to-java-unit (fst Java) (second Java))))

(define kl-from-shen
  X -> (let X (shen-walk (function macroexpand) X)
            X (if (shen-packaged? X)
                  (package-contents X)
                  X)
         (shen-elim-define (shen-proc-input+ X))))


(define stream->string
  Stream String -> (let Byte (trap-error (read-byte Stream) (/. E -1))
                      (if (= Byte -1) String
					    (stream->string Stream (@s String (n->string Byte))))))

(define shell
  Command -> (let Stream (shell-stream Command) (stream->string Stream "")))


(define write-string-to-file
  File Contents ->
    (let Stream (open file File out)
      (let Write (pr Contents Stream) (let Close (close Stream) File))))


(define to-intlist-iterate
  _ () -> ()
  Acc Character -> (cons (string->n Character) Acc))
(define to-intlist Code -> (reverse (foldl to-intlist-iterate [] (explode Code))))

(set *java-reserved* ["byte" "char" "int" "long" "float" "double" "switch" "case" "public" "protected" "private"])

(define ensure-not-reserved
  X -> (if (element? X (value *java-reserved*)) (cn "_" X) X))

(define name->method-name
  "" -> ""
  Name -> (ensure-not-reserved (cn (ustring-downcase (ensure-valid-char (hdstr Name))) (javify-loop (explode (tlstr Name))))))

(define name->class-name
  "" -> ""
  Name ->
    (let First (hdstr Name) Rest (tlstr Name)
      (cond ((letter? First) (@s (ustring-upcase First) (javify-loop (explode Rest))))
		    (true (@s (ensure-valid-char First) (name->method-name Rest))))))

(define javify-loop
  [] -> ""
  [X] -> (ensure-valid-char X)
  ["-" ">" Third | Rest] ->
    (@s "To" (ustring-upcase Third) (javify-loop Rest))
	where (letter? Third)
  ["<" "-" Third | Rest] ->
    (@s "From" (ustring-upcase Third) (javify-loop Rest))
	where (letter? Third)
  ["-" Second | Rest] ->
    (let Fixed
	     (ensure-valid-char Second)
         (@s (ustring-upcase Fixed) (javify-loop Rest)))
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

(define second
  (@p A (@p B C)) -> B
  (@p A B) -> B)

(define third
  (@p A (@p B (@p C D))) -> C
  (@p A (@p B C)) -> C)

(define type-of X -> (cond
  ((integer? X) integer)
  ((float? X) float)
  ((string? X) string)
  ((boolean? X) boolean)
  ((symbol? X) symbol)
  ((tuple? X) tuple)
  ((cons? X) cons)
  (true object)))

(define float? X -> (and (number? X) (not (integer? X))))

(define flip F -> (/. X (/. Y (F Y X))))
(define flip3 F -> (/. X (/. Y (/. Z (F Z Y X)))))
(define flip4 F -> (/. W (/. X (/. Y (/. Z (F Z Y X W))))))

(define assert Test Message Expression -> (if Test Expression (simple-error Message)))

(define assertEquals
  Actual Expected Message ->
    (if (= Actual Expected) Actual (simple-error Message)))

(define assert-test
  Actual Test Message ->
    (if (Test Actual) Actual (simple-error Message)))

(define string-pair?
  (@p X Y) -> (and (string? X) (string? Y))
  _ -> false)

(define string-empty? String -> (= 0 (string-length String)))

(define traverse-result-type?
  (@p X Y Z) -> (and (string? X) (string? Y) (symbol? Z))
  _ -> false)

(define list-matches
  _ [] -> false
  Predicate [X | XS] -> (if (Predicate X) true (list-matches Predicate XS)))

(define foldl
  _ Z [] -> Z
  F Z [X | XS] -> (foldl F (F Z X) XS))

(define foldr
  F Z []     -> Z
  F Z [X | XS] -> (F X (foldr F Z XS)))

(define list->string
  List -> (foldl (/. Acc X (cn Acc X)) "" List))

(define string-join
   Delimiter List -> (string-join-iterator Delimiter List ""))
   
(define string-join-iterator
   _ [] Result -> Result 
   _ [String] Result -> (@s Result String)
   Delimiter [String | Tail] Result -> (string-join-iterator Delimiter Tail (@s Result String Delimiter)))

(define write-source
  Path Contents -> (do (make-directories Path) (write-string-to-file Path Contents) Path))

(define run-without-macros
  F -> (do (set *save-macros* (value *macros*))
           (set *macros* ())
           (let Result (F)
             (do (set *macros* (value *save-macros*)) Result))))

(define numeric-type?
  number -> true
  integer -> true
  float -> true
  _ -> false)
 
(define string-index
   \* returns the 'index' of Str1 in Str2, or -1 if not a substring *\
   { string --> string --> number }
   Str1 Str2 -> (string-index-h Str1 Str2 0))

(define string-index-h
   { string --> string --> number --> number }
    Str1 Str2 N -> N  where (string-prefix? Str1 Str2)
    _ "" _ -> -1
    Str1 (@s _ Str2) N -> (string-index-h Str1 Str2 (+ N 1))
	_ _ _ -> -1)

(define string-prefix?
   \* returns true iff 1st string is a prefix of 2nd *\
   { string --> string --> boolean }
   "" _ -> true
   (@s S Str1) (@s S Str2) -> (string-prefix? Str1 Str2)
   _ _ -> false)

(define string-length
   \* returns the length of the string *\
   { string --> number }
   Str -> (string-length-h Str 0))
 
(define string-length-h
   { string --> number --> number }
   "" Len -> Len
   (@s _ Str) Len -> (string-length-h Str (+ Len 1)))

(define logic-to-java
  and -> "&&"
  or -> "||")

(define arithmetic-to-name
  + -> "plus"
  - -> "minus"
  * -> "multiply"
  / -> "divide")

(define java-primitive? X -> (or (number? X) (boolean? X)))
(define primitive-type? X -> (or (= X number) (= X boolean)))

(define find-first?
  Search [] -> false
  Search [(@p Head _) | Rest] -> (if (= Search Head) true (find-first? Search Rest))
  X Y -> (simple-error (make-string "find-first: X: ~A   Y: ~A" X Y)))

(define get-second
  Search [] -> (simple-error (make-string "Element not found in get-second for ~A" Search))
  Search [(@p Head Value) | Rest] -> (if (= Search Head) Value (get-second Search Rest))
  X Y -> (simple-error (make-string "get-second: X: ~A~%Y: ~A" X Y)))

(define to-string-list
  [] -> []
  X -> (map str X) where (cons? X)
  X -> [(str X)])

(define to-list
  [] -> []
  X -> X where (cons? X)
  X -> [X])

(define escape-java-string
  String -> (list->string (map (function escape-java-ustring) (explode String))))

(define newline-if-not-empty
  "" -> ""
  String -> (cn String (n->string 10)))
(assert-equals "" (newline-if-not-empty ""))
(assert-equals (make-string "~A~%" blue) (newline-if-not-empty (str blue)))

(define escape-java-ustring
  "c#34;" -> "c#92;c#34;"
  "c#13;" -> "c#92;r"
  "c#10;" -> "c#92;n"
  "\" -> "\\"
  X -> X)

