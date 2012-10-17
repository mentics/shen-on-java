package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfFailIf {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-fail-if");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4757, final Object v4758, final Object v4759) throws Exception {
return defined(v4757, v4758, v4759);
}};
public static Object defined(final Object v4757, final Object v4758, final Object v4759) throws Exception {
final Object f4760 = ShenIncinfs.LAMBDA.apply();


















final Object f4761 = UnifyBang.LAMBDA.apply(v4757, new Cons(new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), Nil.NIL))), v4758, v4759);
final Object f4762 = Do.LAMBDA.apply(f4760, f4761);

    return f4762;

}
}
