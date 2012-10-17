package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTupleQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tuple?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5409, final Object v5410, final Object v5411) throws Exception {
return defined(v5409, v5410, v5411);
}};
public static Object defined(final Object v5409, final Object v5410, final Object v5411) throws Exception {
final Object f5413 = ShenNewpv.LAMBDA.apply(v5410);

final Object a5412 = f5413;
final Object f5414 = ShenIncinfs.LAMBDA.apply();






final Object f5415 = UnifyBang.LAMBDA.apply(v5409, new Cons(a5412, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5410, v5411);
final Object f5416 = Do.LAMBDA.apply(f5414, f5415);


    return f5416;

}
}
