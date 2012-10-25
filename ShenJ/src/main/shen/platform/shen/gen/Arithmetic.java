package shen.gen;



import com.mentics.shen.*;

public class Arithmetic {

public static final Symbol SYMBOL = RuntimeContext.symbol("arithmetic");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v2710, final Object v2711, final Object v2712) throws Exception {
return defined(v2710, v2711, v2712);
}};
public static Object defined(final Object v2710, final Object v2711, final Object v2712) throws Exception {


final Object i2714;
if ((boolean)(v2711 instanceof Cons)) {


final Object i2713;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v2711).tail)) {

i2713 = true;
} else {

i2713 = false;

}
i2714 = i2713;
} else {

i2714 = false;

}
final Object i2746;
if ((boolean)i2714) {
final Object f2716 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object var2715 = f2716;













final Object f2717 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(var2715, new Cons(new Cons(v2710, new Cons(((Cons)v2711).head, new Cons(var2715, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v2712);


i2746 = f2717;
} else {


final Object i2721;
if ((boolean)(v2711 instanceof Cons)) {



final Object i2719;
if ((boolean)(((Cons)v2711).tail instanceof Cons)) {



final Object i2718;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v2711).tail).tail)) {

i2718 = true;
} else {

i2718 = false;

}
i2719 = i2718;
} else {

i2719 = false;

}
final Object i2720;
if ((boolean)i2719) {

i2720 = true;
} else {

i2720 = false;

}
i2721 = i2720;
} else {

i2721 = false;

}
final Object i2745;
if ((boolean)i2721) {

final Object f2723 = KlToJavaTraverse.LAMBDA.apply(((Cons)v2711).head, RuntimeContext.symbol("number"), v2712);

final Object a0Eval2722 = f2723;


final Object f2725 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v2711).tail).head, RuntimeContext.symbol("number"), v2712);

final Object a1Eval2724 = f2725;
final Object f2727 = Fst.LAMBDA.apply(a0Eval2722);

final Object a0Content2726 = f2727;
final Object f2729 = Second.LAMBDA.apply(a0Eval2722);

final Object a0Expression2728 = f2729;
final Object f2731 = Fst.LAMBDA.apply(a1Eval2724);

final Object a1Content2730 = f2731;
final Object f2733 = Second.LAMBDA.apply(a1Eval2724);

final Object a1Expression2732 = f2733;
final Object f2734 = Atp.LAMBDA.apply(a1Content2730, Nil.NIL);
final Object f2735 = Atp.LAMBDA.apply(a0Content2726, f2734);
final Object f2736 = IntmakeString.LAMBDA.apply("~A~%~A~%", f2735);
final Object f2737 = ArithmeticToName.LAMBDA.apply(v2710);
final Object f2738 = Atp.LAMBDA.apply(a1Expression2732, Nil.NIL);
final Object f2739 = Atp.LAMBDA.apply(a0Expression2728, f2738);
final Object f2740 = Atp.LAMBDA.apply(f2737, f2739);
final Object f2741 = IntmakeString.LAMBDA.apply("Primitives.~A.apply(~A, ~A)", f2740);
final Object f2742 = Atp.LAMBDA.apply(f2741, RuntimeContext.symbol("number"));
final Object f2743 = Atp.LAMBDA.apply(f2736, f2742);







i2745 = f2743;
} else {

final Object i2744;
if ((boolean)true) {

throw new SimpleError((String)"Bad args to arithmetic");

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i2746 = i2745;

}
    return i2746;

}
}
