\* Sub context basic test *\

(set-context (new-sub-context))
(value *stoutput*)

(set-context (new-sub-context))
(value blue)
(set blue "green")
(value blue)
(set-context (new-sub-context))
(value blue)


\* Possible problem with anon inner classes for new redefine mechanism (setting lambda field) *\

(define test X -> (lambda Y (+ X Y)))
((test 1) 1)

(define test X -> (lambda Y (* X Y)))
((test 2) 2)


\* Simple redef *\

(define test -> 0)
(test)
(define test -> 1)
(test)



\* Nested redef *\

(define test X -> 1)
(test 1)
(do (eval [define test X -> 2])
    (test 1))
(test 1)


(define test -> 1)
(do (eval [define test -> 2])
    (test))
(test)


\* Test making prolog vector stuff *\

(defun shen-mk-pvar (V1359)
 (address-> (address-> (absvector 2) 0 shen-pvar) 1 V1359))



\* Test fail fast *\
(kl-to-java "(or true (simple-error (str failed)))")
(kl-to-java "(and false (simple-error (str failed)))")

(kl-to-java "
(declare and
 (cons boolean
  (cons --> (cons (cons boolean (cons --> (cons boolean ()))) ()))))
")

(kl-to-java "
(defun shen-f_error (V1123)
 (do (intoutput c#34;partial function ~A;~%c#34; (@p V1123 ()))
  (do
   (if
    (and (not (shen-tracked? V1123))
     (y-or-n? (intmake-string c#34;track ~A? c#34; (@p V1123 ()))))
    (shen-track-function (ps V1123)) shen-ok)
   (simple-error c#34;abortedc#34;))))
")

TODO: test with throw in both clauses of if statement


(to-intlist "
(defun shen-th* (V786 V787 V788 V789 V790)
(let Throwcontrol (shen-catchpoint)
(shen-cutpoint Throwcontrol
(let Case
(do (shen-incinfs)
(shen-show (cons V786 (cons : (cons V787 ()))) V788 V789
(freeze (fwhen false V789 V790))))
(if (= Case false)
(let Case
(let F (shen-newpv V789)
(do (shen-incinfs)
(fwhen (shen-typedf? (shen-lazyderef V786 V789)) V789
(freeze
(bind F (shen-sigf (shen-lazyderef V786 V789)) V789
(freeze (call (cons F (cons V787 ())) V789 V790)))))))
(if (= Case false)
(let Case (do (shen-incinfs) (shen-base V786 V787 V789 V790))
(if (= Case false)
(let Case
(do (shen-incinfs) (shen-by_hypothesis V786 V787 V788 V789 V790))
(if (= Case false)
(let Case
(let V678 (shen-lazyderef V786 V789)
(if (cons? V678)
(let F (hd V678)
(let V679 (shen-lazyderef (tl V678) V789)
(if (cons? V679)
(let X (hd V679)
(let V680 (shen-lazyderef (tl V679) V789)
(if (= () V680)
(let B (shen-newpv V789)
(do (shen-incinfs)
(shen-th* F (cons B (cons --> (cons V787 ()))) V788 V789
(freeze (shen-th* X B V788 V789 V790)))))
false)))
false)))
false))
(if (= Case false)
(let Case
(let V681 (shen-lazyderef V786 V789)
(if (cons? V681)
(let V682 (shen-lazyderef (hd V681) V789)
(if (= cons V682)
(let V683 (shen-lazyderef (tl V681) V789)
(if (cons? V683)
(let X (hd V683)
(let V684 (shen-lazyderef (tl V683) V789)
(if (cons? V684)
(let Y (hd V684)
(let V685 (shen-lazyderef (tl V684) V789)
(if (= () V685)
(let V686 (shen-lazyderef V787 V789)
(if (cons? V686)
(let V687 (shen-lazyderef (hd V686) V789)
(if (= list V687)
(let V688 (shen-lazyderef (tl V686) V789)
(if (cons? V688)
(let A (hd V688)
(let V689 (shen-lazyderef (tl V688) V789)
(if (= () V689)
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y (cons list (cons A ())) V788
V789 V790))))
(if (shen-pvar? V689)
(do (shen-bindv V689 () V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y (cons list (cons A ()))
V788 V789 V790))))
(do (shen-unbindv V689 V789) Result)))
false))))
(if (shen-pvar? V688)
(let A (shen-newpv V789)
(do (shen-bindv V688 (cons A ()) V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y (cons list (cons A ()))
V788 V789 V790))))
(do (shen-unbindv V688 V789) Result))))
false)))
(if (shen-pvar? V687)
(do (shen-bindv V687 list V789)
(let Result
(let V690 (shen-lazyderef (tl V686) V789)
(if (cons? V690)
(let A (hd V690)
(let V691 (shen-lazyderef (tl V690) V789)
(if (= () V691)
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y (cons list (cons A ()))
V788 V789 V790))))
(if (shen-pvar? V691)
(do (shen-bindv V691 () V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y
(cons list (cons A ())) V788 V789
V790))))
(do (shen-unbindv V691 V789) Result)))
false))))
(if (shen-pvar? V690)
(let A (shen-newpv V789)
(do (shen-bindv V690 (cons A ()) V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y (cons list (cons A ()))
V788 V789 V790))))
(do (shen-unbindv V690 V789) Result))))
false)))
(do (shen-unbindv V687 V789) Result)))
false)))
(if (shen-pvar? V686)
(let A (shen-newpv V789)
(do
(shen-bindv V686 (cons list (cons A ())) V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y (cons list (cons A ())) V788
V789 V790))))
(do (shen-unbindv V686 V789) Result))))
false)))
false)))
false)))
false))
false))
false))
(if (= Case false)
(let Case
(let V692 (shen-lazyderef V786 V789)
(if (cons? V692)
(let V693 (shen-lazyderef (hd V692) V789)
(if (= @p V693)
(let V694 (shen-lazyderef (tl V692) V789)
(if (cons? V694)
(let X (hd V694)
(let V695 (shen-lazyderef (tl V694) V789)
(if (cons? V695)
(let Y (hd V695)
(let V696 (shen-lazyderef (tl V695) V789)
(if (= () V696)
(let V697 (shen-lazyderef V787 V789)
(if (cons? V697)
(let A (hd V697)
(let V698 (shen-lazyderef (tl V697) V789)
(if (cons? V698)
(let V699 (shen-lazyderef (hd V698) V789)
(if (= * V699)
(let V700 (shen-lazyderef (tl V698) V789)
(if (cons? V700)
(let B (hd V700)
(let V701 (shen-lazyderef (tl V700) V789)
(if (= () V701)
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y B V788 V789 V790))))
(if (shen-pvar? V701)
(do (shen-bindv V701 () V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y B V788 V789 V790))))
(do (shen-unbindv V701 V789)
Result)))
false))))
(if (shen-pvar? V700)
(let B (shen-newpv V789)
(do (shen-bindv V700 (cons B ()) V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y B V788 V789 V790))))
(do (shen-unbindv V700 V789)
Result))))
false)))
(if (shen-pvar? V699)
(do (shen-bindv V699 * V789)
(let Result
(let V702 (shen-lazyderef (tl V698) V789)
(if (cons? V702)
(let B (hd V702)
(let V703
(shen-lazyderef (tl V702) V789)
(if (= () V703)
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y B V788 V789 V790))))
(if (shen-pvar? V703)
(do (shen-bindv V703 () V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y B V788 V789
V790))))
(do (shen-unbindv V703 V789)
Result)))
false))))
(if (shen-pvar? V702)
(let B (shen-newpv V789)
(do
(shen-bindv V702 (cons B ()) V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y B V788 V789 V790))))
(do (shen-unbindv V702 V789)
Result))))
false)))
(do (shen-unbindv V699 V789) Result)))
false)))
(if (shen-pvar? V698)
(let B (shen-newpv V789)
(do
(shen-bindv V698 (cons * (cons B ()))
V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze (shen-th* Y B V788 V789 V790))))
(do (shen-unbindv V698 V789) Result))))
false))))
(if (shen-pvar? V697)
(let A (shen-newpv V789)
(let B (shen-newpv V789)
(do
(shen-bindv V697
(cons A (cons * (cons B ()))) V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze (shen-th* Y B V788 V789 V790))))
(do (shen-unbindv V697 V789) Result)))))
false)))
false)))
false)))
false))
false))
false))
(if (= Case false)
(let Case
(let V704 (shen-lazyderef V786 V789)
(if (cons? V704)
(let V705 (shen-lazyderef (hd V704) V789)
(if (= @v V705)
(let V706 (shen-lazyderef (tl V704) V789)
(if (cons? V706)
(let X (hd V706)
(let V707 (shen-lazyderef (tl V706) V789)
(if (cons? V707)
(let Y (hd V707)
(let V708 (shen-lazyderef (tl V707) V789)
(if (= () V708)
(let V709 (shen-lazyderef V787 V789)
(if (cons? V709)
(let V710 (shen-lazyderef (hd V709) V789)
(if (= vector V710)
(let V711 (shen-lazyderef (tl V709) V789)
(if (cons? V711)
(let A (hd V711)
(let V712 (shen-lazyderef (tl V711) V789)
(if (= () V712)
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y
(cons vector (cons A ())) V788 V789
V790))))
(if (shen-pvar? V712)
(do (shen-bindv V712 () V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y
(cons vector (cons A ())) V788
V789 V790))))
(do (shen-unbindv V712 V789)
Result)))
false))))
(if (shen-pvar? V711)
(let A (shen-newpv V789)
(do (shen-bindv V711 (cons A ()) V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y
(cons vector (cons A ())) V788
V789 V790))))
(do (shen-unbindv V711 V789) Result))))
false)))
(if (shen-pvar? V710)
(do (shen-bindv V710 vector V789)
(let Result
(let V713 (shen-lazyderef (tl V709) V789)
(if (cons? V713)
(let A (hd V713)
(let V714
(shen-lazyderef (tl V713) V789)
(if (= () V714)
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y
(cons vector (cons A ())) V788
V789 V790))))
(if (shen-pvar? V714)
(do (shen-bindv V714 () V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y
(cons vector (cons A ()))
V788 V789 V790))))
(do (shen-unbindv V714 V789)
Result)))
false))))
(if (shen-pvar? V713)
(let A (shen-newpv V789)
(do
(shen-bindv V713 (cons A ()) V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y
(cons vector (cons A ())) V788
V789 V790))))
(do (shen-unbindv V713 V789)
Result))))
false)))
(do (shen-unbindv V710 V789) Result)))
false)))
(if (shen-pvar? V709)
(let A (shen-newpv V789)
(do
(shen-bindv V709 (cons vector (cons A ()))
V789)
(let Result
(do (shen-incinfs)
(shen-th* X A V788 V789
(freeze
(shen-th* Y (cons vector (cons A ()))
V788 V789 V790))))
(do (shen-unbindv V709 V789) Result))))
false)))
false)))
false)))
false))
false))
false))
(if (= Case false)
(let Case
(let V715 (shen-lazyderef V786 V789)
(if (cons? V715)
(let V716 (shen-lazyderef (hd V715) V789)
(if (= @s V716)
(let V717 (shen-lazyderef (tl V715) V789)
(if (cons? V717)
(let X (hd V717)
(let V718 (shen-lazyderef (tl V717) V789)
(if (cons? V718)
(let Y (hd V718)
(let V719 (shen-lazyderef (tl V718) V789)
(if (= () V719)
(let V720 (shen-lazyderef V787 V789)
(if (= string V720)
(do (shen-incinfs)
(shen-th* X string V788 V789
(freeze
(shen-th* Y string V788 V789 V790))))
(if (shen-pvar? V720)
(do (shen-bindv V720 string V789)
(let Result
(do (shen-incinfs)
(shen-th* X string V788 V789
(freeze
(shen-th* Y string V788 V789 V790))))
(do (shen-unbindv V720 V789) Result)))
false)))
false)))
false)))
false))
false))
false))
(if (= Case false)
(let Case
(let V721 (shen-lazyderef V786 V789)
(if (cons? V721)
(let V722 (shen-lazyderef (hd V721) V789)
(if (= lambda V722)
(let V723 (shen-lazyderef (tl V721) V789)
(if (cons? V723)
(let X (hd V723)
(let V724 (shen-lazyderef (tl V723) V789)
(if (cons? V724)
(let Y (hd V724)
(let V725 (shen-lazyderef (tl V724) V789)
(if (= () V725)
(let V726 (shen-lazyderef V787 V789)
(if (cons? V726)
(let A (hd V726)
(let V727 (shen-lazyderef (tl V726) V789)
(if (cons? V727)
(let V728
(shen-lazyderef (hd V727) V789)
(if (= --> V728)
(let V729
(shen-lazyderef (tl V727) V789)
(if (cons? V729)
(let B (hd V729)
(let V730
(shen-lazyderef (tl V729) V789)
(if (= () V730)
(let Z (shen-newpv V789)
(let X&& (shen-newpv V789)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(bind X&& (shen-placeholder)
V789
(freeze
(bind Z
(shen-ebr
(shen-lazyderef X&&
V789)
(shen-lazyderef X V789)
(shen-lazyderef Y V789))
V789
(freeze
(shen-th* Z B
(cons
(cons X&&
(cons :
(cons A ())))
V788)
V789 V790))))))))))
(if (shen-pvar? V730)
(do (shen-bindv V730 () V789)
(let Result
(let Z (shen-newpv V789)
(let X&& (shen-newpv V789)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(bind X&&
(shen-placeholder) V789
(freeze
(bind Z
(shen-ebr
(shen-lazyderef X&&
V789)
(shen-lazyderef X
V789)
(shen-lazyderef Y
V789))
V789
(freeze
(shen-th* Z B
(cons
(cons X&&
(cons :
(cons A ())))
V788)
V789 V790))))))))))
(do (shen-unbindv V730 V789)
Result)))
false))))
(if (shen-pvar? V729)
(let B (shen-newpv V789)
(do
(shen-bindv V729 (cons B ())
V789)
(let Result
(let Z (shen-newpv V789)
(let X&& (shen-newpv V789)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(bind X&&
(shen-placeholder) V789
(freeze
(bind Z
(shen-ebr
(shen-lazyderef X&&
V789)
(shen-lazyderef X V789)
(shen-lazyderef Y
V789))
V789
(freeze
(shen-th* Z B
(cons
(cons X&&
(cons :
(cons A ())))
V788)
V789 V790))))))))))
(do (shen-unbindv V729 V789)
Result))))
false)))
(if (shen-pvar? V728)
(do (shen-bindv V728 --> V789)
(let Result
(let V731
(shen-lazyderef (tl V727) V789)
(if (cons? V731)
(let B (hd V731)
(let V732
(shen-lazyderef (tl V731) V789)
(if (= () V732)
(let Z (shen-newpv V789)
(let X&& (shen-newpv V789)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(bind X&&
(shen-placeholder) V789
(freeze
(bind Z
(shen-ebr
(shen-lazyderef X&&
V789)
(shen-lazyderef X
V789)
(shen-lazyderef Y
V789))
V789
(freeze
(shen-th* Z B
(cons
(cons X&&
(cons :
(cons A ())))
V788)
V789 V790))))))))))
(if (shen-pvar? V732)
(do
(shen-bindv V732 () V789)
(let Result
(let Z (shen-newpv V789)
(let X&& (shen-newpv V789)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(bind X&&
(shen-placeholder)
V789
(freeze
(bind Z
(shen-ebr
(shen-lazyderef
X&& V789)
(shen-lazyderef X
V789)
(shen-lazyderef Y
V789))
V789
(freeze
(shen-th* Z B
(cons
(cons X&&
(cons :
(cons A ())))
V788)
V789
V790))))))))))
(do
(shen-unbindv V732 V789)
Result)))
false))))
(if (shen-pvar? V731)
(let B (shen-newpv V789)
(do
(shen-bindv V731 (cons B ())
V789)
(let Result
(let Z (shen-newpv V789)
(let X&& (shen-newpv V789)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(bind X&&
(shen-placeholder) V789
(freeze
(bind Z
(shen-ebr
(shen-lazyderef X&&
V789)
(shen-lazyderef X
V789)
(shen-lazyderef Y
V789))
V789
(freeze
(shen-th* Z B
(cons
(cons X&&
(cons :
(cons A ())))
V788)
V789 V790))))))))))
(do (shen-unbindv V731 V789)
Result))))
false)))
(do (shen-unbindv V728 V789)
Result)))
false)))
(if (shen-pvar? V727)
(let B (shen-newpv V789)
(do
(shen-bindv V727
(cons --> (cons B ())) V789)
(let Result
(let Z (shen-newpv V789)
(let X&& (shen-newpv V789)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(bind X&& (shen-placeholder)
V789
(freeze
(bind Z
(shen-ebr
(shen-lazyderef X&& V789)
(shen-lazyderef X V789)
(shen-lazyderef Y V789))
V789
(freeze
(shen-th* Z B
(cons
(cons X&&
(cons : (cons A ())))
V788)
V789 V790))))))))))
(do (shen-unbindv V727 V789)
Result))))
false))))
(if (shen-pvar? V726)
(let A (shen-newpv V789)
(let B (shen-newpv V789)
(do
(shen-bindv V726
(cons A (cons --> (cons B ()))) V789)
(let Result
(let Z (shen-newpv V789)
(let X&& (shen-newpv V789)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(bind X&& (shen-placeholder) V789
(freeze
(bind Z
(shen-ebr
(shen-lazyderef X&& V789)
(shen-lazyderef X V789)
(shen-lazyderef Y V789))
V789
(freeze
(shen-th* Z B
(cons
(cons X&&
(cons : (cons A ())))
V788)
V789 V790))))))))))
(do (shen-unbindv V726 V789)
Result)))))
false)))
false)))
false)))
false))
false))
false))
(if (= Case false)
(let Case
(let V733 (shen-lazyderef V786 V789)
(if (cons? V733)
(let V734 (shen-lazyderef (hd V733) V789)
(if (= let V734)
(let V735 (shen-lazyderef (tl V733) V789)
(if (cons? V735)
(let X (hd V735)
(let V736 (shen-lazyderef (tl V735) V789)
(if (cons? V736)
(let Y (hd V736)
(let V737 (shen-lazyderef (tl V736) V789)
(if (cons? V737)
(let Z (hd V737)
(let V738 (shen-lazyderef (tl V737) V789)
(if (= () V738)
(let W (shen-newpv V789)
(let X&& (shen-newpv V789)
(let B (shen-newpv V789)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(shen-th* Y B V788 V789
(freeze
(bind X&& (shen-placeholder)
V789
(freeze
(bind W
(shen-ebr
(shen-lazyderef X&& V789)
(shen-lazyderef X V789)
(shen-lazyderef Z V789))
V789
(freeze
(shen-th* W V787
(cons
(cons X&&
(cons : (cons B ())))
V788)
V789 V790)))))))))))))
false)))
false)))
false)))
false))
false))
false))
(if (= Case false)
(let Case
(let V739 (shen-lazyderef V786 V789)
(if (cons? V739)
(let V740 (shen-lazyderef (hd V739) V789)
(if (= open V740)
(let V741 (shen-lazyderef (tl V739) V789)
(if (cons? V741)
(let V742 (shen-lazyderef (hd V741) V789)
(if (= file V742)
(let V743 (shen-lazyderef (tl V741) V789)
(if (cons? V743)
(let FileName (hd V743)
(let V744 (shen-lazyderef (tl V743) V789)
(if (cons? V744)
(let Direction674 (hd V744)
(let V745
(shen-lazyderef (tl V744) V789)
(if (= () V745)
(let V746 (shen-lazyderef V787 V789)
(if (cons? V746)
(let V747
(shen-lazyderef (hd V746) V789)
(if (= stream V747)
(let V748
(shen-lazyderef (tl V746) V789)
(if (cons? V748)
(let Direction (hd V748)
(let V749
(shen-lazyderef (tl V748)
V789)
(if (= () V749)
(do (shen-incinfs)
(unify! Direction
Direction674 V789
(freeze
(cut Throwcontrol V789
(freeze
(shen-th* FileName
string V788 V789
V790))))))
(if (shen-pvar? V749)
(do
(shen-bindv V749 () V789)
(let Result
(do (shen-incinfs)
(unify! Direction
Direction674 V789
(freeze
(cut Throwcontrol V789
(freeze
(shen-th* FileName
string V788 V789
V790))))))
(do
(shen-unbindv V749 V789)
Result)))
false))))
(if (shen-pvar? V748)
(let Direction
(shen-newpv V789)
(do
(shen-bindv V748
(cons Direction ()) V789)
(let Result
(do (shen-incinfs)
(unify! Direction
Direction674 V789
(freeze
(cut Throwcontrol V789
(freeze
(shen-th* FileName
string V788 V789
V790))))))
(do
(shen-unbindv V748 V789)
Result))))
false)))
(if (shen-pvar? V747)
(do
(shen-bindv V747 stream V789)
(let Result
(let V750
(shen-lazyderef (tl V746)
V789)
(if (cons? V750)
(let Direction (hd V750)
(let V751
(shen-lazyderef (tl V750)
V789)
(if (= () V751)
(do (shen-incinfs)
(unify! Direction
Direction674 V789
(freeze
(cut Throwcontrol V789
(freeze
(shen-th* FileName
string V788 V789
V790))))))
(if (shen-pvar? V751)
(do
(shen-bindv V751 ()
V789)
(let Result
(do (shen-incinfs)
(unify! Direction
Direction674 V789
(freeze
(cut Throwcontrol
V789
(freeze
(shen-th*
FileName string
V788 V789
V790))))))
(do
(shen-unbindv V751
V789)
Result)))
false))))
(if (shen-pvar? V750)
(let Direction
(shen-newpv V789)
(do
(shen-bindv V750
(cons Direction ())
V789)
(let Result
(do (shen-incinfs)
(unify! Direction
Direction674 V789
(freeze
(cut Throwcontrol
V789
(freeze
(shen-th* FileName
string V788 V789
V790))))))
(do
(shen-unbindv V750
V789)
Result))))
false)))
(do (shen-unbindv V747 V789)
Result)))
false)))
(if (shen-pvar? V746)
(let Direction (shen-newpv V789)
(do
(shen-bindv V746
(cons stream
(cons Direction ()))
V789)
(let Result
(do (shen-incinfs)
(unify! Direction Direction674
V789
(freeze
(cut Throwcontrol V789
(freeze
(shen-th* FileName string
V788 V789 V790))))))
(do (shen-unbindv V746 V789)
Result))))
false)))
false)))
false)))
false))
false))
false))
false))
false))
(if (= Case false)
(let Case
(let V752 (shen-lazyderef V786 V789)
(if (cons? V752)
(let V753 (shen-lazyderef (hd V752) V789)
(if (= type V753)
(let V754 (shen-lazyderef (tl V752) V789)
(if (cons? V754)
(let X (hd V754)
(let V755 (shen-lazyderef (tl V754) V789)
(if (cons? V755)
(let A (hd V755)
(let V756 (shen-lazyderef (tl V755) V789)
(if (= () V756)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(unify A V787 V789
(freeze
(shen-th* X A V788 V789 V790))))))
false)))
false)))
false))
false))
false))
(if (= Case false)
(let Case
(let V757 (shen-lazyderef V786 V789)
(if (cons? V757)
(let V758 (shen-lazyderef (hd V757) V789)
(if (= input+ V758)
(let V759 (shen-lazyderef (tl V757) V789)
(if (cons? V759)
(let V760 (shen-lazyderef (hd V759) V789)
(if (= : V760)
(let V761 (shen-lazyderef (tl V759) V789)
(if (cons? V761)
(let A (hd V761)
(let V762
(shen-lazyderef (tl V761) V789)
(if (= () V762)
(let C (shen-newpv V789)
(do (shen-incinfs)
(bind C
(shen-normalise-type
(shen-lazyderef A V789))
V789
(freeze
(unify V787 C V789 V790)))))
false)))
false))
false))
false))
false))
false))
(if (= Case false)
(let Case
(let V763 (shen-lazyderef V786 V789)
(if (cons? V763)
(let V764 (shen-lazyderef (hd V763) V789)
(if (= where V764)
(let V765 (shen-lazyderef (tl V763) V789)
(if (cons? V765)
(let P (hd V765)
(let V766
(shen-lazyderef (tl V765) V789)
(if (cons? V766)
(let X (hd V766)
(let V767
(shen-lazyderef (tl V766) V789)
(if (= () V767)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(shen-th* P boolean V788 V789
(freeze
(cut Throwcontrol V789
(freeze
(shen-th* X V787
(cons
(cons P
(cons :
(cons verified ())))
V788)
V789 V790))))))))
false)))
false)))
false))
false))
false))
(if (= Case false)
(let Case
(let V768 (shen-lazyderef V786 V789)
(if (cons? V768)
(let V769 (shen-lazyderef (hd V768) V789)
(if (= set V769)
(let V770 (shen-lazyderef (tl V768) V789)
(if (cons? V770)
(let Var (hd V770)
(let V771
(shen-lazyderef (tl V770) V789)
(if (cons? V771)
(let Val (hd V771)
(let V772
(shen-lazyderef (tl V771) V789)
(if (= () V772)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(shen-th*
(cons value (cons Var ()))
V787 V788 V789
(freeze
(shen-th* Val V787 V788 V789
V790))))))
false)))
false)))
false))
false))
false))
(if (= Case false)
(let Case
(let V773 (shen-lazyderef V786 V789)
(if (cons? V773)
(let V774 (shen-lazyderef (hd V773) V789)
(if (= fail V774)
(let V775
(shen-lazyderef (tl V773) V789)
(if (= () V775)
(let V776 (shen-lazyderef V787 V789)
(if (= symbol V776)
(do (shen-incinfs) (thaw V790))
(if (shen-pvar? V776)
(do (shen-bindv V776 symbol V789)
(let Result
(do (shen-incinfs) (thaw V790))
(do (shen-unbindv V776 V789)
Result)))
false)))
false))
false))
false))
(if (= Case false)
(let Case
(let NewHyp (shen-newpv V789)
(do (shen-incinfs)
(shen-t*-hyps V788 NewHyp V789
(freeze
(shen-th* V786 V787 NewHyp V789
V790)))))
(if (= Case false)
(let Case
(let V777 (shen-lazyderef V786 V789)
(if (cons? V777)
(let V778
(shen-lazyderef (hd V777) V789)
(if (= define V778)
(let V779
(shen-lazyderef (tl V777) V789)
(if (cons? V779)
(let F (hd V779)
(let X (tl V779)
(do (shen-incinfs)
(cut Throwcontrol V789
(freeze
(shen-t*-def
(cons define (cons F X))
V787 V788 V789 V790))))))
false))
false))
false))
(if (= Case false)
(let Case
(let V780 (shen-lazyderef V786 V789)
(if (cons? V780)
(let V781
(shen-lazyderef (hd V780) V789)
(if (= shen-process-datatype V781)
(let V782
(shen-lazyderef V787 V789)
(if (= symbol V782)
(do (shen-incinfs) (thaw V790))
(if (shen-pvar? V782)
(do
(shen-bindv V782 symbol V789)
(let Result
(do (shen-incinfs)
(thaw V790))
(do (shen-unbindv V782 V789)
Result)))
false)))
false))
false))
(if (= Case false)
(let Case
(let V783
(shen-lazyderef V786 V789)
(if (cons? V783)
(let V784
(shen-lazyderef (hd V783) V789)
(if (= shen-synonyms-help V784)
(let V785
(shen-lazyderef V787 V789)
(if (= symbol V785)
(do (shen-incinfs)
(thaw V790))
(if (shen-pvar? V785)
(do
(shen-bindv V785 symbol
V789)
(let Result
(do (shen-incinfs)
(thaw V790))
(do
(shen-unbindv V785 V789)
Result)))
false)))
false))
false))
(if (= Case false)
(let Datatypes (shen-newpv V789)
(do (shen-incinfs)
(bind Datatypes
(value shen-*datatypes*) V789
(freeze
(shen-udefs*
(cons V786
(cons : (cons V787 ())))
V788 Datatypes V789 V790)))))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case))
Case)))))
")



(hd (parse-shen (to-intlist "(defun fail () shen-fail!)")))


(kl-to-java "(set shen-*property-vector* (vector 20000))")


(kl-to-java "(defun fail () hen-fail!)")
(kl-to-java "(defun <!> (V379)
 (cond ((tuple? V379) (@p () (fst V379))) (true (shen-sys-error <!>))))")


(kl-to-java "(defun shen-control-chars (V994)
 (cond ((= () V994) c#34;c#34;)
  ((and (cons? V994)
    (and (= c#34;cc#34; (hd V994))
     (and (cons? (tl V994)) (= c#34;#c#34; (hd (tl V994))))))
   (let CodePoint (shen-code-point (tl (tl V994)))
    (let AfterCodePoint (shen-after-codepoint (tl (tl V994)))
     (@s (n->string (shen-decimalise CodePoint))
      (shen-control-chars AfterCodePoint)))))
  ((cons? V994) (@s (hd V994) (shen-control-chars (tl V994))))
  (true (shen-sys-error shen-control-chars))))")






(kl-to-java "(set shen-*symbolcodes* (vector 128))")
(kl-to-java "(address-> (value shen-*symbolcodes*) 126 c#34;~c#34;)")

(kl-to-java "(defun shen-unwind-types (V1675 V1676)
 (cond ((= () V1676) (simple-error (error-to-string V1675)))
  ((and (cons? V1676) (cons? (hd V1676)))
   (do (shen-remtype (hd (hd V1676))) (shen-unwind-types V1675 (tl V1676))))
  (true (shen-sys-error shen-unwind-types))))")


(kl-to-java "((intern c#34;+c#34;) 2)")

(kl-to-java "(defun test (X) X)")
(kl-to-java "((test +) 1 2)")

(kl-to-java "(defun test (X) test2)")
(kl-to-java "(defun test2 (X) (+ X))")
(kl-to-java "(((test 1) 2) 3)")

(kl-to-java "(cond ((= 2 2) c#34;Fredc#34;) (true c#34;Georgec#34;))")

(kl-to-java "(and (not false) true)")

(kl-to-java "(set *testing* test)")
(kl-to-java "(value *testing*)")

(kl-to-java "(defun shen-explode-string (V705)
 (cond ((= c#34;c#34; V705) ())
  (true
   (let S (pos V705 0)
    (let Ss (tlstr V705)
     (if (= Ss shen-eos) () (cons S (shen-explode-string Ss))))))))")

	 
(hd (parse-shen (to-intlist "(defun shen-explode-string (V705)
 (cond ((= c#34;c#34; V705) ())
  (true
   (let S (pos V705 0)
    (let Ss (tlstr V705)
     (if (= Ss shen-eos) () (cons S (shen-explode-string Ss))))))))")))


(kl-to-java-traverse (hd (parse-shen (to-intlist "(defun shen-explode-string (X) (+ 2 X))"))) object ())




(defun f1 (X Y) (+ X Y))
(defun f2 (X) (f1 X))
(f2 1 2)


(define f1 [X Y] (+ X Y))
(define f2 [X] (f1 X))
(f2 1 2)


\* Test this failed trying to compilekl stuff. It's in writer.kl *\
(kl-to-java "
(defun shen-ob->str (V1098 V1099)
 (cond ((= V1099 (fail)) c#34;...c#34;)
  ((= () V1099) (if (= V1098 c#34;Rc#34;) c#34;()c#34; c#34;[]c#34;))
  ((= V1099 (vector 0)) c#34;<>c#34;)
  ((cons? V1099)
   (shen-cn-all
    (append (if (= V1098 c#34;Rc#34;) (cons c#34;(c#34; ()) (cons c#34;[c#34; ()))
     (append (cons (shen-ob->str V1098 (hd V1099)) ())
      (append
       (shen-xmapcan (value *maximum-print-sequence-size*)
        (lambda Z (cons c#34; c#34; (cons (shen-ob->str V1098 Z) ()))) (tl V1099))
       (if (= V1098 c#34;Rc#34;) (cons c#34;)c#34; ()) (cons c#34;]c#34; ())))))))
  ((vector? V1099)
   (let L (shen-vector->list V1099 1)
    (let E
     (tlstr
      (shen-cn-all
       (shen-xmapcan (- (value *maximum-print-sequence-size*) 1)
        (lambda Z
         (cons c#34; c#34; (cons (shen-ob->str V1098 Z) ())))
        L)))
     (let V (cn c#34;<c#34; (cn E c#34;>c#34;)) V))))
  ((and (not (string? V1099)) (absvector? V1099))
   (trap-error (shen-ob->str c#34;Ac#34; ((<-address V1099 0) V1099))
    (lambda Ignore
     (let L (shen-vector->list V1099 0)
      (let E
       (tlstr
        (shen-cn-all
         (shen-xmapcan (- (value *maximum-print-sequence-size*) 1)
          (lambda Z (cons c#34; c#34; (cons (shen-ob->str V1098 Z) ()))) L)))
       (let V (cn c#34;<c#34; (cn E c#34;>c#34;)) V))))))
  (true (if (and (= V1098 c#34;Ac#34;) (string? V1099)) V1099 (str V1099)))))
")

(kl-to-java "(lambda () 2)")
