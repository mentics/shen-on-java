(assert-equals value1
  (let V (putv test link value1 (vector 10)) (get test link V))) 

(assert-equals [value1 value1 value1]
  (let V (putv-all [test1 test2 test3] link value1 (vector 10)) [(get test1 link V) (get test2 link V) (get test3 link V)])) 

(assert-equals [1 2 3 4] (loop (/. X X) 1 4))

(assert-equals [a b c d e] (mapv id (@v a b c d e <>)))

(assert-equals [1 2 3 4 5] (flatten-list [[1 2] [3 4] [5]]))

(assert-equals [a b c d e] (get-keys (putv-all [a b c d e] link value (vector 2))))

(assert-equals 2 (find (/. X (= X 2)) [1 2 3]))

(assert-equals "" (newline-if-not-empty ""))
(assert-equals (make-string "~A~%" blue) (newline-if-not-empty (str blue)))

(assert-equals [(@p 1 a) (@p 2 b) (@p 3 c)] (zip [1 2 3] [a b c]))

(assert-equals prefix-test (ensure-prefix prefix- test))
(assert-equals prefix-test (ensure-prefix prefix- prefix-test))

