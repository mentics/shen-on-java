package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStep {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-step");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5253, final Object v5254, final Object v5255) throws Exception {
return defined(v5253, v5254, v5255);
}};
public static Object defined(final Object v5253, final Object v5254, final Object v5255) throws Exception {
final Object f5256 = ShenIncinfs.LAMBDA.apply();






final Object f5257 = UnifyBang.LAMBDA.apply(v5253, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5254, v5255);
final Object f5258 = Do.LAMBDA.apply(f5256, f5257);

    return f5258;

}
}
