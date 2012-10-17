package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfGensym {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-gensym");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4807, final Object v4808, final Object v4809) throws Exception {
return defined(v4807, v4808, v4809);
}};
public static Object defined(final Object v4807, final Object v4808, final Object v4809) throws Exception {
final Object f4810 = ShenIncinfs.LAMBDA.apply();






final Object f4811 = UnifyBang.LAMBDA.apply(v4807, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v4808, v4809);
final Object f4812 = Do.LAMBDA.apply(f4810, f4811);

    return f4812;

}
}
