package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSystemf {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-systemf");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5327, final Object v5328, final Object v5329) throws Exception {
return defined(v5327, v5328, v5329);
}};
public static Object defined(final Object v5327, final Object v5328, final Object v5329) throws Exception {
final Object f5330 = ShenIncinfs.LAMBDA.apply();










final Object f5331 = UnifyBang.LAMBDA.apply(v5327, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v5328, v5329);
final Object f5332 = Do.LAMBDA.apply(f5330, f5331);

    return f5332;

}
}
