package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTrapError {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-trap-error");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5399, final Object v5400, final Object v5401) throws Exception {
return defined(v5399, v5400, v5401);
}};
public static Object defined(final Object v5399, final Object v5400, final Object v5401) throws Exception {
final Object f5403 = ShenNewpv.LAMBDA.apply(v5400);

final Object a5402 = f5403;
final Object f5404 = ShenIncinfs.LAMBDA.apply();


















final Object f5405 = UnifyBang.LAMBDA.apply(v5399, new Cons(a5402, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("exception"), new Cons(RuntimeContext.symbol("-->"), new Cons(a5402, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(a5402, Nil.NIL))), Nil.NIL))), v5400, v5401);
final Object f5406 = Do.LAMBDA.apply(f5404, f5405);


    return f5406;

}
}
