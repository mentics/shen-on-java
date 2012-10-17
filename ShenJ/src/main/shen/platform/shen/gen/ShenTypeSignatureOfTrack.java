package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTrack {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-track");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5391, final Object v5392, final Object v5393) throws Exception {
return defined(v5391, v5392, v5393);
}};
public static Object defined(final Object v5391, final Object v5392, final Object v5393) throws Exception {
final Object f5394 = ShenIncinfs.LAMBDA.apply();






final Object f5395 = UnifyBang.LAMBDA.apply(v5391, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v5392, v5393);
final Object f5396 = Do.LAMBDA.apply(f5394, f5395);

    return f5396;

}
}
