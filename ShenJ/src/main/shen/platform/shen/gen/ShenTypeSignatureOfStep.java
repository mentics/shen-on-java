package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStep {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-step");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v795, final Object v796, final Object v797) throws Exception {
return defined(v795, v796, v797);
}};
public static Object defined(final Object v795, final Object v796, final Object v797) throws Exception {
final Object f798 = ShenIncinfs.LAMBDA.apply();






final Object f799 = UnifyBang.LAMBDA.apply(v795, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v796, v797);
final Object f800 = Do.LAMBDA.apply(f798, f799);

    return f800;

}
}
