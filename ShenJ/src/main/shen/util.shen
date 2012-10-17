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
  X -> (if (or (digit? X) (letter? X)) X "TOxDO"))

(define escape-java-ustring
  "c#34;" -> "c#92;c#34;"
  "c#13;" -> "c#92;r"
  "c#10;" -> "c#92;n"
  "\" -> "\\"
  X -> X)

(define escape-java-string
  String -> (list->string (map (escape-java-ustring) (explode String))))

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
