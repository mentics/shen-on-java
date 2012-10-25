package shen.gen;



import com.mentics.shen.*;

public class Comparison {

public static final Symbol SYMBOL = RuntimeContext.symbol("comparison");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v2747, final Object v2748, final Object v2749) throws Exception {
return defined(v2747, v2748, v2749);
}};
public static Object defined(final Object v2747, final Object v2748, final Object v2749) throws Exception {


final Object i2751;
if ((boolean)(v2748 instanceof Cons)) {


final Object i2750;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v2748).tail)) {

i2750 = true;
} else {

i2750 = false;

}
i2751 = i2750;
} else {

i2751 = false;

}
final Object i2782;
if ((boolean)i2751) {
final Object f2753 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object var2752 = f2753;













final Object f2754 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(var2752, new Cons(new Cons(v2747, new Cons(((Cons)v2748).head, new Cons(var2752, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v2749);


i2782 = f2754;
} else {


final Object i2758;
if ((boolean)(v2748 instanceof Cons)) {



final Object i2756;
if ((boolean)(((Cons)v2748).tail instanceof Cons)) {



final Object i2755;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v2748).tail).tail)) {

i2755 = true;
} else {

i2755 = false;

}
i2756 = i2755;
} else {

i2756 = false;

}
final Object i2757;
if ((boolean)i2756) {

i2757 = true;
} else {

i2757 = false;

}
i2758 = i2757;
} else {

i2758 = false;

}
final Object i2781;
if ((boolean)i2758) {

final Object f2760 = KlToJavaTraverse.LAMBDA.apply(((Cons)v2748).head, RuntimeContext.symbol("number"), v2749);

final Object a0Eval2759 = f2760;


final Object f2762 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v2748).tail).head, RuntimeContext.symbol("number"), v2749);

final Object a1Eval2761 = f2762;
final Object f2764 = Fst.LAMBDA.apply(a0Eval2759);

final Object a0Content2763 = f2764;
final Object f2766 = Second.LAMBDA.apply(a0Eval2759);

final Object a0Expression2765 = f2766;
final Object f2768 = Fst.LAMBDA.apply(a1Eval2761);

final Object a1Content2767 = f2768;
final Object f2770 = Second.LAMBDA.apply(a1Eval2761);

final Object a1Expression2769 = f2770;
final Object f2771 = Atp.LAMBDA.apply(a1Content2767, Nil.NIL);
final Object f2772 = Atp.LAMBDA.apply(a0Content2763, f2771);
final Object f2773 = IntmakeString.LAMBDA.apply("~A~%~A~%", f2772);

final Object f2774 = Atp.LAMBDA.apply(a1Expression2769, Nil.NIL);
final Object f2775 = Atp.LAMBDA.apply(String.valueOf(v2747), f2774);
final Object f2776 = Atp.LAMBDA.apply(a0Expression2765, f2775);
final Object f2777 = IntmakeString.LAMBDA.apply("(((Number)(~A)).doubleValue() ~A ((Number)(~A)).doubleValue())", f2776);
final Object f2778 = Atp.LAMBDA.apply(f2777, RuntimeContext.symbol("boolean"));
final Object f2779 = Atp.LAMBDA.apply(f2773, f2778);







i2781 = f2779;
} else {

final Object i2780;
if ((boolean)true) {

throw new SimpleError((String)"Bad args to comparison");

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i2782 = i2781;

}
    return i2782;

}
}
