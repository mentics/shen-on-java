package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfErrorToString {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-error-to-string");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4739, final Object v4740, final Object v4741) throws Exception {
return defined(v4739, v4740, v4741);
}};
public static Object defined(final Object v4739, final Object v4740, final Object v4741) throws Exception {
final Object f4742 = ShenIncinfs.LAMBDA.apply();






final Object f4743 = UnifyBang.LAMBDA.apply(v4739, new Cons(RuntimeContext.symbol("exception"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v4740, v4741);
final Object f4744 = Do.LAMBDA.apply(f4742, f4743);

    return f4744;

}
}
