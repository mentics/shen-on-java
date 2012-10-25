package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfErrorToString {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-error-to-string");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v281, final Object v282, final Object v283) throws Exception {
return defined(v281, v282, v283);
}};
public static Object defined(final Object v281, final Object v282, final Object v283) throws Exception {
final Object f284 = ShenIncinfs.LAMBDA.apply();






final Object f285 = UnifyBang.LAMBDA.apply(v281, new Cons(RuntimeContext.symbol("exception"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v282, v283);
final Object f286 = Do.LAMBDA.apply(f284, f285);

    return f286;

}
}
