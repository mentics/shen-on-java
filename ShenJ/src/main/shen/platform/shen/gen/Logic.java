package shen.gen;



import com.mentics.shen.*;

public class Logic {

public static final Symbol SYMBOL = RuntimeContext.symbol("logic");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v2783, final Object v2784, final Object v2785) throws Exception {
return defined(v2783, v2784, v2785);
}};
public static Object defined(final Object v2783, final Object v2784, final Object v2785) throws Exception {


final Object i2787;
if ((boolean)(v2784 instanceof Cons)) {


final Object i2786;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v2784).tail)) {

i2786 = true;
} else {

i2786 = false;

}
i2787 = i2786;
} else {

i2787 = false;

}
final Object i2819;
if ((boolean)i2787) {
final Object f2789 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object var2788 = f2789;













final Object f2790 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(var2788, new Cons(new Cons(v2783, new Cons(((Cons)v2784).head, new Cons(var2788, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v2785);


i2819 = f2790;
} else {


final Object i2794;
if ((boolean)(v2784 instanceof Cons)) {



final Object i2792;
if ((boolean)(((Cons)v2784).tail instanceof Cons)) {



final Object i2791;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v2784).tail).tail)) {

i2791 = true;
} else {

i2791 = false;

}
i2792 = i2791;
} else {

i2792 = false;

}
final Object i2793;
if ((boolean)i2792) {

i2793 = true;
} else {

i2793 = false;

}
i2794 = i2793;
} else {

i2794 = false;

}
final Object i2818;
if ((boolean)i2794) {

final Object f2796 = KlToJavaTraverse.LAMBDA.apply(((Cons)v2784).head, RuntimeContext.symbol("boolean"), v2785);

final Object a0Eval2795 = f2796;


final Object f2798 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v2784).tail).head, RuntimeContext.symbol("boolean"), v2785);

final Object a1Eval2797 = f2798;
final Object f2800 = Fst.LAMBDA.apply(a0Eval2795);

final Object a0Content2799 = f2800;
final Object f2802 = Second.LAMBDA.apply(a0Eval2795);

final Object a0Expression2801 = f2802;
final Object f2804 = Fst.LAMBDA.apply(a1Eval2797);

final Object a1Content2803 = f2804;
final Object f2806 = Second.LAMBDA.apply(a1Eval2797);

final Object a1Expression2805 = f2806;
final Object f2807 = Atp.LAMBDA.apply(a1Content2803, Nil.NIL);
final Object f2808 = Atp.LAMBDA.apply(a0Content2799, f2807);
final Object f2809 = IntmakeString.LAMBDA.apply("~A~%~A~%", f2808);
final Object f2810 = LogicToJava.LAMBDA.apply(v2783);
final Object f2811 = Atp.LAMBDA.apply(a1Expression2805, Nil.NIL);
final Object f2812 = Atp.LAMBDA.apply(f2810, f2811);
final Object f2813 = Atp.LAMBDA.apply(a0Expression2801, f2812);
final Object f2814 = IntmakeString.LAMBDA.apply("((boolean)~A ~A (boolean)~A)", f2813);
final Object f2815 = Atp.LAMBDA.apply(f2814, RuntimeContext.symbol("boolean"));
final Object f2816 = Atp.LAMBDA.apply(f2809, f2815);







i2818 = f2816;
} else {

final Object i2817;
if ((boolean)true) {

throw new SimpleError((String)"Bad args to logic");

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i2819 = i2818;

}
    return i2819;

}
}
