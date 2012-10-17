package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfVectorQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-vector?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5467, final Object v5468, final Object v5469) throws Exception {
return defined(v5467, v5468, v5469);
}};
public static Object defined(final Object v5467, final Object v5468, final Object v5469) throws Exception {
final Object f5471 = ShenNewpv.LAMBDA.apply(v5468);

final Object a5470 = f5471;
final Object f5472 = ShenIncinfs.LAMBDA.apply();






final Object f5473 = UnifyBang.LAMBDA.apply(v5467, new Cons(a5470, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5468, v5469);
final Object f5474 = Do.LAMBDA.apply(f5472, f5473);


    return f5474;

}
}
