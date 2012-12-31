(let Struct (@p v1 v2 v3 [] ())
  (assert-equals (@p newalias v2 v3 [] ()) (namespace/struct-with Struct alias:newalias)))

(assert-equals [ns.2. ns.1.] (fourth (namespace/process-imports [ns.1. alias:n1. ns.2.] (namespace/default-struct))))

(let Result (namespace/process-imports [test.import. alias:t. for:[a b c]
                                        test2.import2. alias:t2. hiding:[x y z]]
                                       (namespace/default-struct))
  (do (assert-equals [t. t2.] (get-keys (fst Result)))
      (assert-equals [a b c] (get-keys (second Result)))
      (assert-equals [test2.import2.x test2.import2.y test2.import2.z] (get-keys (third Result)))
      (assert-equals [test2.import2. test.import.] (fourth Result))))


(let Struct (namespace/process-imports [n.s.1. n.s.2. alias:ns2. n.s.3. for:[sym0 sym2]] (namespace/default-struct))
  (assert-equals [ns2.] (namespace/aliases Struct)))

(let Struct (namespace/process-imports [test2.import2. alias:t2. hiding:[x y z]] (namespace/default-struct))
     _ (assert-equals true (namespace/is-in-hiding Struct test2.import2.y))
     _ (assert-equals false (namespace/is-in-hiding Struct nothing))
  true)

(assert-equals shenj.reflect/lookup-function (namespace/symbol-defined? (namespace/default-struct) shenj.reflect/lookup-function))
(assert-equals javax.swing.JFrame (namespace/symbol-defined? (namespace/default-struct) javax.swing.#JFrame))
(assert-equals () (namespace/symbol-defined? (namespace/default-struct) shenj.reflect/lookup-funn))
(assert-equals define (namespace/symbol-defined? (namespace/default-struct) define))

(assert-equals a.b.c (namespace/look-in-imports (namespace/default-struct) a.b.c))
(let Struct (namespace/process-imports [n.s.1. shenj.reflect/] (namespace/default-struct))
  (assert-equals shenj.reflect/lookup-function (namespace/look-in-imports Struct lookup-function)))

(let Struct (namespace/process-imports [javax.swing. shenj.platform/ hiding:[delete-class]  n.s.2. alias:ns2. n.s.3. for:[sym0 sym2]] (namespace/default-struct))
     _ (assert-equals (intern "shenj.dot/javax.swing.JFrame.") (namespace/process-symbol Struct (intern "shenj.dot/#JFrame.")))
     _ (assert-equals a (namespace/process-symbol Struct a))
     _ (assert-equals n.s.2.a (namespace/process-symbol Struct ns2.a))
     _ (assert-equals n.s.3.sym2 (namespace/process-symbol Struct sym2))
     _ (assert-equals shenj.platform/delete-function (namespace/process-symbol Struct delete-function))
     _ (assert-equals shenj.platform/delete-class (namespace/process-symbol Struct delete-class))
     _ (assert-equals javax.swing.JFrame (namespace/process-symbol Struct #JFrame))
  true)

(let Struct (namespace/process-imports [shenj.dot/ javax.swing.] (namespace/default-struct))
     _ (assert-equals (intern "shenj.dot/javax.swing.JFrame.") (namespace/process-symbol Struct (intern "#JFrame.")))
  true)


(assert-equals [+ 1 2] (namespace/macro-h (namespace/default-struct) () [+ 1 2]))
(let Struct (namespace/process-imports [n.s.1. n.s.2. alias:ns2. n.s.3. for:[sym0 sym2]] (namespace/default-struct))
  (assert-equals [define n.s.3.sym0 X Y -> [n.s.2.sym1 n.s.3.sym2 X Y]]
                 (namespace/macro-h Struct () [define sym0 X Y -> [ns2.sym1 sym2 X Y]])))


(namespace foo [] [shenj.dot/] (shenj.platform/eval-shen "2"))

TODO: make into real test case since this won't execute (can't cast nil to textarea)
(namespace test.gui [] [shenj.dot/ javafx.scene.control.] (let Area () (.setEditable Area:#TextArea false)))
