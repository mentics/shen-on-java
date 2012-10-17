package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfYOrNQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-y-or-n?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5495, final Object v5496, final Object v5497) throws Exception {
return defined(v5495, v5496, v5497);
}};
public static Object defined(final Object v5495, final Object v5496, final Object v5497) throws Exception {
final Object f5498 = ShenIncinfs.LAMBDA.apply();






final Object f5499 = UnifyBang.LAMBDA.apply(v5495, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5496, v5497);
final Object f5500 = Do.LAMBDA.apply(f5498, f5499);

    return f5500;

}
}
