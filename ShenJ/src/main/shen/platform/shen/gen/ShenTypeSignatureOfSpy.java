package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSpy {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-spy");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5245, final Object v5246, final Object v5247) throws Exception {
return defined(v5245, v5246, v5247);
}};
public static Object defined(final Object v5245, final Object v5246, final Object v5247) throws Exception {
final Object f5248 = ShenIncinfs.LAMBDA.apply();






final Object f5249 = UnifyBang.LAMBDA.apply(v5245, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5246, v5247);
final Object f5250 = Do.LAMBDA.apply(f5248, f5249);

    return f5250;

}
}
