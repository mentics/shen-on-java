package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNumberQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-number?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v593, final Object v594, final Object v595) throws Exception {
return defined(v593, v594, v595);
}};
public static Object defined(final Object v593, final Object v594, final Object v595) throws Exception {
final Object f597 = ShenNewpv.LAMBDA.apply(v594);

final Object a596 = f597;
final Object f598 = ShenIncinfs.LAMBDA.apply();






final Object f599 = UnifyBang.LAMBDA.apply(v593, new Cons(a596, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v594, v595);
final Object f600 = Do.LAMBDA.apply(f598, f599);


    return f600;

}
}
