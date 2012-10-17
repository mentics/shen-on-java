package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfOccursCheck {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-occurs-check");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5073, final Object v5074, final Object v5075) throws Exception {
return defined(v5073, v5074, v5075);
}};
public static Object defined(final Object v5073, final Object v5074, final Object v5075) throws Exception {
final Object f5076 = ShenIncinfs.LAMBDA.apply();






final Object f5077 = UnifyBang.LAMBDA.apply(v5073, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5074, v5075);
final Object f5078 = Do.LAMBDA.apply(f5076, f5077);

    return f5078;

}
}
