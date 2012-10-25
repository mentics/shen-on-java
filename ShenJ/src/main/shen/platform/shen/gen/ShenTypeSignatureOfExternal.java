package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfExternal {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-external");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v261, final Object v262, final Object v263) throws Exception {
return defined(v261, v262, v263);
}};
public static Object defined(final Object v261, final Object v262, final Object v263) throws Exception {
final Object f264 = ShenIncinfs.LAMBDA.apply();










final Object f265 = UnifyBang.LAMBDA.apply(v261, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v262, v263);
final Object f266 = Do.LAMBDA.apply(f264, f265);

    return f266;

}
}
