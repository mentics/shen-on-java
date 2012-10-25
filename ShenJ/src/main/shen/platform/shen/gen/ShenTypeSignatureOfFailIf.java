package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfFailIf {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-fail-if");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v299, final Object v300, final Object v301) throws Exception {
return defined(v299, v300, v301);
}};
public static Object defined(final Object v299, final Object v300, final Object v301) throws Exception {
final Object f302 = ShenIncinfs.LAMBDA.apply();


















final Object f303 = UnifyBang.LAMBDA.apply(v299, new Cons(new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), Nil.NIL))), v300, v301);
final Object f304 = Do.LAMBDA.apply(f302, f303);

    return f304;

}
}
