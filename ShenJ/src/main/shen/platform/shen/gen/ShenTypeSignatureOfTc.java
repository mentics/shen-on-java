package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTc {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tc");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5363, final Object v5364, final Object v5365) throws Exception {
return defined(v5363, v5364, v5365);
}};
public static Object defined(final Object v5363, final Object v5364, final Object v5365) throws Exception {
final Object f5366 = ShenIncinfs.LAMBDA.apply();






final Object f5367 = UnifyBang.LAMBDA.apply(v5363, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5364, v5365);
final Object f5368 = Do.LAMBDA.apply(f5366, f5367);

    return f5368;

}
}
