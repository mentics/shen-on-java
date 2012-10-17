package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPrint {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-print");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5115, final Object v5116, final Object v5117) throws Exception {
return defined(v5115, v5116, v5117);
}};
public static Object defined(final Object v5115, final Object v5116, final Object v5117) throws Exception {
final Object f5119 = ShenNewpv.LAMBDA.apply(v5116);

final Object a5118 = f5119;
final Object f5120 = ShenIncinfs.LAMBDA.apply();






final Object f5121 = UnifyBang.LAMBDA.apply(v5115, new Cons(a5118, new Cons(RuntimeContext.symbol("-->"), new Cons(a5118, Nil.NIL))), v5116, v5117);
final Object f5122 = Do.LAMBDA.apply(f5120, f5121);


    return f5122;

}
}
