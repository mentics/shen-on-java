package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfGensym {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-gensym");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v349, final Object v350, final Object v351) throws Exception {
return defined(v349, v350, v351);
}};
public static Object defined(final Object v349, final Object v350, final Object v351) throws Exception {
final Object f352 = ShenIncinfs.LAMBDA.apply();






final Object f353 = UnifyBang.LAMBDA.apply(v349, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v350, v351);
final Object f354 = Do.LAMBDA.apply(f352, f353);

    return f354;

}
}
