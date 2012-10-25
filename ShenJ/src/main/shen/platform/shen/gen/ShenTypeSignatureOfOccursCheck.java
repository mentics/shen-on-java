package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfOccursCheck {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-occurs-check");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v615, final Object v616, final Object v617) throws Exception {
return defined(v615, v616, v617);
}};
public static Object defined(final Object v615, final Object v616, final Object v617) throws Exception {
final Object f618 = ShenIncinfs.LAMBDA.apply();






final Object f619 = UnifyBang.LAMBDA.apply(v615, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v616, v617);
final Object f620 = Do.LAMBDA.apply(f618, f619);

    return f620;

}
}
