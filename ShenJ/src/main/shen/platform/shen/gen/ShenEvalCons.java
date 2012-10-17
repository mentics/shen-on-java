package shen.gen;



import com.mentics.shen.*;

public class ShenEvalCons {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-eval-cons");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1190) throws Exception {
return defined(v1190);
}};
public static Object defined(final Object v1190) throws Exception {


final Object i2689;
if ((boolean)(v1190 instanceof Cons)) {


final Object i2687;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v1190).head)) {



final Object i2685;
if ((boolean)(((Cons)v1190).tail instanceof Cons)) {




final Object i2683;
if ((boolean)(((Cons)((Cons)v1190).tail).tail instanceof Cons)) {




final Object i2682;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1190).tail).tail).tail)) {

i2682 = true;
} else {

i2682 = false;

}
i2683 = i2682;
} else {

i2683 = false;

}
final Object i2684;
if ((boolean)i2683) {

i2684 = true;
} else {

i2684 = false;

}
i2685 = i2684;
} else {

i2685 = false;

}
final Object i2686;
if ((boolean)i2685) {

i2686 = true;
} else {

i2686 = false;

}
i2687 = i2686;
} else {

i2687 = false;

}
final Object i2688;
if ((boolean)i2687) {

i2688 = true;
} else {

i2688 = false;

}
i2689 = i2688;
} else {

i2689 = false;

}
final Object i2703;
if ((boolean)i2689) {


final Object f2690 = ShenEvalCons.LAMBDA.apply(((Cons)((Cons)v1190).tail).head);




final Object f2691 = ShenEvalCons.LAMBDA.apply(((Cons)((Cons)((Cons)v1190).tail).tail).head);


i2703 = new Cons(f2690, f2691);
} else {


final Object i2699;
if ((boolean)(v1190 instanceof Cons)) {


final Object i2697;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1190).head)) {



final Object i2695;
if ((boolean)(((Cons)v1190).tail instanceof Cons)) {




final Object i2693;
if ((boolean)(((Cons)((Cons)v1190).tail).tail instanceof Cons)) {




final Object i2692;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1190).tail).tail).tail)) {

i2692 = true;
} else {

i2692 = false;

}
i2693 = i2692;
} else {

i2693 = false;

}
final Object i2694;
if ((boolean)i2693) {

i2694 = true;
} else {

i2694 = false;

}
i2695 = i2694;
} else {

i2695 = false;

}
final Object i2696;
if ((boolean)i2695) {

i2696 = true;
} else {

i2696 = false;

}
i2697 = i2696;
} else {

i2697 = false;

}
final Object i2698;
if ((boolean)i2697) {

i2698 = true;
} else {

i2698 = false;

}
i2699 = i2698;
} else {

i2699 = false;

}
final Object i2702;
if ((boolean)i2699) {



final Object f2700 = ShenEvalCons.LAMBDA.apply(((Cons)((Cons)v1190).tail).head);






i2702 = new Cons(RuntimeContext.symbol("mode"), new Cons(f2700, ((Cons)((Cons)v1190).tail).tail));
} else {

final Object i2701;
if ((boolean)true) {

i2701 = v1190;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2702 = i2701;

}
i2703 = i2702;

}
    return i2703;

}
}
