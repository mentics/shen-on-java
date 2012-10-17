package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfUntrack {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-untrack");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5441, final Object v5442, final Object v5443) throws Exception {
return defined(v5441, v5442, v5443);
}};
public static Object defined(final Object v5441, final Object v5442, final Object v5443) throws Exception {
final Object f5444 = ShenIncinfs.LAMBDA.apply();






final Object f5445 = UnifyBang.LAMBDA.apply(v5441, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v5442, v5443);
final Object f5446 = Do.LAMBDA.apply(f5444, f5445);

    return f5446;

}
}
