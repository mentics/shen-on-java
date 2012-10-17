package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTlstr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tlstr");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5345, final Object v5346, final Object v5347) throws Exception {
return defined(v5345, v5346, v5347);
}};
public static Object defined(final Object v5345, final Object v5346, final Object v5347) throws Exception {
final Object f5348 = ShenIncinfs.LAMBDA.apply();






final Object f5349 = UnifyBang.LAMBDA.apply(v5345, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v5346, v5347);
final Object f5350 = Do.LAMBDA.apply(f5348, f5349);

    return f5350;

}
}
