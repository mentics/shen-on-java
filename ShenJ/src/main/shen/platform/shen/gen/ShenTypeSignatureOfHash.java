package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfHash {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-hash");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v395, final Object v396, final Object v397) throws Exception {
return defined(v395, v396, v397);
}};
public static Object defined(final Object v395, final Object v396, final Object v397) throws Exception {
final Object f399 = ShenNewpv.LAMBDA.apply(v396);

final Object a398 = f399;
final Object f400 = ShenIncinfs.LAMBDA.apply();












final Object f401 = UnifyBang.LAMBDA.apply(v395, new Cons(a398, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v396, v397);
final Object f402 = Do.LAMBDA.apply(f400, f401);


    return f402;

}
}
