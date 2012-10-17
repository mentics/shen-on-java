package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTlv {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tlv");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5353, final Object v5354, final Object v5355) throws Exception {
return defined(v5353, v5354, v5355);
}};
public static Object defined(final Object v5353, final Object v5354, final Object v5355) throws Exception {
final Object f5357 = ShenNewpv.LAMBDA.apply(v5354);

final Object a5356 = f5357;
final Object f5358 = ShenIncinfs.LAMBDA.apply();














final Object f5359 = UnifyBang.LAMBDA.apply(v5353, new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a5356, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a5356, Nil.NIL)), Nil.NIL))), v5354, v5355);
final Object f5360 = Do.LAMBDA.apply(f5358, f5359);


    return f5360;

}
}
