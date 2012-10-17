package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSpecialise {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-specialise");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5237, final Object v5238, final Object v5239) throws Exception {
return defined(v5237, v5238, v5239);
}};
public static Object defined(final Object v5237, final Object v5238, final Object v5239) throws Exception {
final Object f5240 = ShenIncinfs.LAMBDA.apply();






final Object f5241 = UnifyBang.LAMBDA.apply(v5237, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v5238, v5239);
final Object f5242 = Do.LAMBDA.apply(f5240, f5241);

    return f5242;

}
}
