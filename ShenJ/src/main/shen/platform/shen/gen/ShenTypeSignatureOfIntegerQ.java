package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIntegerQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-integer?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v469, final Object v470, final Object v471) throws Exception {
return defined(v469, v470, v471);
}};
public static Object defined(final Object v469, final Object v470, final Object v471) throws Exception {
final Object f473 = ShenNewpv.LAMBDA.apply(v470);

final Object a472 = f473;
final Object f474 = ShenIncinfs.LAMBDA.apply();






final Object f475 = UnifyBang.LAMBDA.apply(v469, new Cons(a472, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v470, v471);
final Object f476 = Do.LAMBDA.apply(f474, f475);


    return f476;

}
}
