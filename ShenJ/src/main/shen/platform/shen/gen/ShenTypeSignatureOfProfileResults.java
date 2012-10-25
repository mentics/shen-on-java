package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfProfileResults {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-profile-results");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v687, final Object v688, final Object v689) throws Exception {
return defined(v687, v688, v689);
}};
public static Object defined(final Object v687, final Object v688, final Object v689) throws Exception {
final Object f691 = ShenNewpv.LAMBDA.apply(v688);

final Object a690 = f691;
final Object f692 = ShenIncinfs.LAMBDA.apply();






final Object f693 = UnifyBang.LAMBDA.apply(v687, new Cons(a690, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v688, v689);
final Object f694 = Do.LAMBDA.apply(f692, f693);


    return f694;

}
}
