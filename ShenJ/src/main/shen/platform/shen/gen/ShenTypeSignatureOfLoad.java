package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfLoad {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-load");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4967, final Object v4968, final Object v4969) throws Exception {
return defined(v4967, v4968, v4969);
}};
public static Object defined(final Object v4967, final Object v4968, final Object v4969) throws Exception {
final Object f4970 = ShenIncinfs.LAMBDA.apply();






final Object f4971 = UnifyBang.LAMBDA.apply(v4967, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v4968, v4969);
final Object f4972 = Do.LAMBDA.apply(f4970, f4971);

    return f4972;

}
}
