package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfConsQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-cons?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4655, final Object v4656, final Object v4657) throws Exception {
return defined(v4655, v4656, v4657);
}};
public static Object defined(final Object v4655, final Object v4656, final Object v4657) throws Exception {
final Object f4659 = ShenNewpv.LAMBDA.apply(v4656);

final Object a4658 = f4659;
final Object f4660 = ShenIncinfs.LAMBDA.apply();






final Object f4661 = UnifyBang.LAMBDA.apply(v4655, new Cons(a4658, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v4656, v4657);
final Object f4662 = Do.LAMBDA.apply(f4660, f4661);


    return f4662;

}
}
