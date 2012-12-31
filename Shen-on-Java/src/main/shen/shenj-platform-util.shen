(define assert-equals Expected Actual -> (if (= Expected Actual) true (error "Assertion failed, expected=~A, actual=~A" Expected Actual)))

(define != X Y -> (not (= X Y)))

(define putv Symbol Link Value Vector -> (do (put Symbol Link Value Vector) Vector))

(define putv-all Symbols Link Value Vector ->
  (do (map (/. Symbol (putv Symbol Link Value Vector)) Symbols) Vector))

(define loop
  _ From To -> [] where (> From To)
  Function From To -> (cons (Function From) (loop Function (+ From 1) To)))

(define id X -> X)
(define mapv
  Function Vector -> (loop (/. Index (Function (trap-error (<-vector Vector Index) (/. E ())))) 1 (limit Vector)))

(define flatten-list List -> (foldl (function append) () List))

(define get-keys-h
  List -> (map (/. V (hd (hd V))) List))

\* Gets all the keys in a property vector *\
(define get-keys
  Vector -> (flatten-list (mapv (function get-keys-h) Vector)))

(define find
  _ [] -> ()
  Predicate [X | Rest] -> (if (Predicate X) X (find Predicate Rest)))


(define shenj.platform/parse-shen X ->  (snd (shen-<st_input> (@p (to-intlist X) ()))))
(define shenj.platform/eval-shens X -> (map (function eval) (shenj.platform/parse-shen X)))
(define shenj.platform/eval-shen X -> (eval (hd (shenj.platform/parse-shen X))))
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

(set *java-reserved* (map (function str)
[abstract	assert	boolean	break	byte	case
catch	char	class	const*	continue	default
double	do	else	enum	extends	false
final	finally	float	for	goto*	if
implements	import	instanceof	int	interface	long
native	new	null	package	private	protected
public	return	short	static	strictfp	super
switch	synchronized	this	throw	throws	transient
true	try	void	volatile	while]))

(define ensure-not-reserved
  X -> (if (element? X (value *java-reserved*)) (cn "_" X) X))

(define second
  (@p _ B _) -> B
  (@p _ B) -> B)

(define third
  (@p _ _ C _) -> C
  (@p _ _ C) -> C
  _ -> ())

(define fourth
  (@p _ _ _ D _) -> D
  (@p _ _ _ D) -> D
  _ -> ())

(define fifth
  (@p _ _ _ _ E _) -> E
  (@p _ _ _ _ E) -> E
  _ -> ())

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

(define zip
  [] [] -> []
  [X] [Y] -> [(@p X Y)]
  [X | RestX] [Y | RestY] -> (cons (@p X Y) (zip RestX RestY)))


(define to-boolean
  X -> X where (boolean? X)
  _ -> false)

(define string-replace
  From To String -> (list->string (map (/. Value (if (= From Value) To Value)) (explode String))))

(define remove-newlines String -> (string-replace "c#10;" "\n" (string-replace "c#13;" "\r" String)))


(define ensure-prefix
  Prefix Symbol -> (if (string-prefix? (str Prefix) (str Symbol))
                     Symbol
                     (concat Prefix Symbol)))


(define escape-java-ustring
  "c#34;" -> "c#92;c#34;"
  "c#13;" -> "c#92;r"
  "c#10;" -> "c#92;n"
  "\" -> "\\"
  X -> X)

