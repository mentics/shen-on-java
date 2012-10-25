package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfProtect {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-protect");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v697, final Object v698, final Object v699) throws Exception {
return defined(v697, v698, v699);
}};
public static Object defined(final Object v697, final Object v698, final Object v699) throws Exception {
final Object f700 = ShenIncinfs.LAMBDA.apply();






final Object f701 = UnifyBang.LAMBDA.apply(v697, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v698, v699);
final Object f702 = Do.LAMBDA.apply(f700, f701);

    return f702;

}
}
