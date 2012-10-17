package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAnd {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-and");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4563, final Object v4564, final Object v4565) throws Exception {
return defined(v4563, v4564, v4565);
}};
public static Object defined(final Object v4563, final Object v4564, final Object v4565) throws Exception {
final Object f4566 = ShenIncinfs.LAMBDA.apply();












final Object f4567 = UnifyBang.LAMBDA.apply(v4563, new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v4564, v4565);
final Object f4568 = Do.LAMBDA.apply(f4566, f4567);

    return f4568;

}
}
