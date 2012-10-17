package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfProtect {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-protect");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5155, final Object v5156, final Object v5157) throws Exception {
return defined(v5155, v5156, v5157);
}};
public static Object defined(final Object v5155, final Object v5156, final Object v5157) throws Exception {
final Object f5158 = ShenIncinfs.LAMBDA.apply();






final Object f5159 = UnifyBang.LAMBDA.apply(v5155, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v5156, v5157);
final Object f5160 = Do.LAMBDA.apply(f5158, f5159);

    return f5160;

}
}
