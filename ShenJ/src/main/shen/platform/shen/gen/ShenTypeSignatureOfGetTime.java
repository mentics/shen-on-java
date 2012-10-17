package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfGetTime {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-get-time");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4845, final Object v4846, final Object v4847) throws Exception {
return defined(v4845, v4846, v4847);
}};
public static Object defined(final Object v4845, final Object v4846, final Object v4847) throws Exception {
final Object f4848 = ShenIncinfs.LAMBDA.apply();






final Object f4849 = UnifyBang.LAMBDA.apply(v4845, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v4846, v4847);
final Object f4850 = Do.LAMBDA.apply(f4848, f4849);

    return f4850;

}
}
