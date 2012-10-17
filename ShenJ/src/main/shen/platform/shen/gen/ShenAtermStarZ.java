package shen.gen;



import com.mentics.shen.*;

public class ShenAtermStarZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<term*>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1184) throws Exception {
return defined(v1184);
}};
public static Object defined(final Object v1184) throws Exception {
final Object f2627 = Fst.LAMBDA.apply(v1184);


final Object i2641;
if ((boolean)(f2627 instanceof Cons)) {
final Object f2628 = Fst.LAMBDA.apply(v1184);

final Object f2629 = Snd.LAMBDA.apply(v1184);
final Object f2630 = ShenReassemble.LAMBDA.apply(((Cons)f2628).tail, f2629);
final Object f2631 = Fst.LAMBDA.apply(f2630);
final Object f2632 = Fst.LAMBDA.apply(v1184);



final Object i2636;
if ((boolean)!((boolean)Lang.equals(RuntimeContext.symbol("<--"), ((Cons)f2632).head))) {
final Object f2633 = Fst.LAMBDA.apply(v1184);

final Object f2634 = ShenLegitimateTermQ.LAMBDA.apply(((Cons)f2633).head);

final Object i2635;
if ((boolean)f2634) {

i2635 = true;
} else {

i2635 = false;

}
i2636 = i2635;
} else {

i2636 = false;

}
final Object i2639;
if ((boolean)i2636) {
final Object f2637 = Fst.LAMBDA.apply(v1184);

final Object f2638 = ShenEvalCons.LAMBDA.apply(((Cons)f2637).head);

i2639 = f2638;
} else {

i2639 = null;

}final Object f2640 = ShenReassemble.LAMBDA.apply(f2631, i2639);

i2641 = f2640;
} else {

i2641 = null;

}
final Object result2626 = i2641;

final Object i2642;
if ((boolean)Lang.equals(result2626, null)) {

i2642 = null;
} else {

i2642 = result2626;

}

    return i2642;

}
}
