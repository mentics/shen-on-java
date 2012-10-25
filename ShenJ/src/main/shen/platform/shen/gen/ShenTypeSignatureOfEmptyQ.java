package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfEmptyQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-empty?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v251, final Object v252, final Object v253) throws Exception {
return defined(v251, v252, v253);
}};
public static Object defined(final Object v251, final Object v252, final Object v253) throws Exception {
final Object f255 = ShenNewpv.LAMBDA.apply(v252);

final Object a254 = f255;
final Object f256 = ShenIncinfs.LAMBDA.apply();






final Object f257 = UnifyBang.LAMBDA.apply(v251, new Cons(a254, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v252, v253);
final Object f258 = Do.LAMBDA.apply(f256, f257);


    return f258;

}
}
