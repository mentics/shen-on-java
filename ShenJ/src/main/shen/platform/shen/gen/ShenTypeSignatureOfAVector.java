package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAVector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-<-vector");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v357, final Object v358, final Object v359) throws Exception {
return defined(v357, v358, v359);
}};
public static Object defined(final Object v357, final Object v358, final Object v359) throws Exception {
final Object f361 = ShenNewpv.LAMBDA.apply(v358);

final Object a360 = f361;
final Object f362 = ShenIncinfs.LAMBDA.apply();
















final Object f363 = UnifyBang.LAMBDA.apply(v357, new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a360, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(a360, Nil.NIL))), Nil.NIL))), v358, v359);
final Object f364 = Do.LAMBDA.apply(f362, f363);


    return f364;

}
}
