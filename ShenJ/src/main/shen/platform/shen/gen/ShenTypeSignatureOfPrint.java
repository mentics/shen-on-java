package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPrint {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-print");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v657, final Object v658, final Object v659) throws Exception {
return defined(v657, v658, v659);
}};
public static Object defined(final Object v657, final Object v658, final Object v659) throws Exception {
final Object f661 = ShenNewpv.LAMBDA.apply(v658);

final Object a660 = f661;
final Object f662 = ShenIncinfs.LAMBDA.apply();






final Object f663 = UnifyBang.LAMBDA.apply(v657, new Cons(a660, new Cons(RuntimeContext.symbol("-->"), new Cons(a660, Nil.NIL))), v658, v659);
final Object f664 = Do.LAMBDA.apply(f662, f663);


    return f664;

}
}
