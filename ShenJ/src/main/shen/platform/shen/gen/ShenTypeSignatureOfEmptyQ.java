package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfEmptyQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-empty?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4709, final Object v4710, final Object v4711) throws Exception {
return defined(v4709, v4710, v4711);
}};
public static Object defined(final Object v4709, final Object v4710, final Object v4711) throws Exception {
final Object f4713 = ShenNewpv.LAMBDA.apply(v4710);

final Object a4712 = f4713;
final Object f4714 = ShenIncinfs.LAMBDA.apply();






final Object f4715 = UnifyBang.LAMBDA.apply(v4709, new Cons(a4712, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v4710, v4711);
final Object f4716 = Do.LAMBDA.apply(f4714, f4715);


    return f4716;

}
}
