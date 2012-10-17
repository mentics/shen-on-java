package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfBooleanQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-boolean?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4601, final Object v4602, final Object v4603) throws Exception {
return defined(v4601, v4602, v4603);
}};
public static Object defined(final Object v4601, final Object v4602, final Object v4603) throws Exception {
final Object f4605 = ShenNewpv.LAMBDA.apply(v4602);

final Object a4604 = f4605;
final Object f4606 = ShenIncinfs.LAMBDA.apply();






final Object f4607 = UnifyBang.LAMBDA.apply(v4601, new Cons(a4604, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v4602, v4603);
final Object f4608 = Do.LAMBDA.apply(f4606, f4607);


    return f4608;

}
}
