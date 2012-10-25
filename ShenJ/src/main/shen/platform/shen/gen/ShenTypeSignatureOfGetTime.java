package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfGetTime {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-get-time");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v387, final Object v388, final Object v389) throws Exception {
return defined(v387, v388, v389);
}};
public static Object defined(final Object v387, final Object v388, final Object v389) throws Exception {
final Object f390 = ShenIncinfs.LAMBDA.apply();






final Object f391 = UnifyBang.LAMBDA.apply(v387, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v388, v389);
final Object f392 = Do.LAMBDA.apply(f390, f391);

    return f392;

}
}
