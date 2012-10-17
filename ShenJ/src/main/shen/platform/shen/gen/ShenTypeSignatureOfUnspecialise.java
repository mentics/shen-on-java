package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfUnspecialise {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-unspecialise");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5449, final Object v5450, final Object v5451) throws Exception {
return defined(v5449, v5450, v5451);
}};
public static Object defined(final Object v5449, final Object v5450, final Object v5451) throws Exception {
final Object f5452 = ShenIncinfs.LAMBDA.apply();






final Object f5453 = UnifyBang.LAMBDA.apply(v5449, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v5450, v5451);
final Object f5454 = Do.LAMBDA.apply(f5452, f5453);

    return f5454;

}
}
