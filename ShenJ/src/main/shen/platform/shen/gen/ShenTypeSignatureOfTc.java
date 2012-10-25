package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTc {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tc");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v905, final Object v906, final Object v907) throws Exception {
return defined(v905, v906, v907);
}};
public static Object defined(final Object v905, final Object v906, final Object v907) throws Exception {
final Object f908 = ShenIncinfs.LAMBDA.apply();






final Object f909 = UnifyBang.LAMBDA.apply(v905, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v906, v907);
final Object f910 = Do.LAMBDA.apply(f908, f909);

    return f910;

}
}
