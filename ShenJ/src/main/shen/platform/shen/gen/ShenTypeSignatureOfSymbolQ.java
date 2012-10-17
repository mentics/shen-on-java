package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSymbolQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-symbol?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5317, final Object v5318, final Object v5319) throws Exception {
return defined(v5317, v5318, v5319);
}};
public static Object defined(final Object v5317, final Object v5318, final Object v5319) throws Exception {
final Object f5321 = ShenNewpv.LAMBDA.apply(v5318);

final Object a5320 = f5321;
final Object f5322 = ShenIncinfs.LAMBDA.apply();






final Object f5323 = UnifyBang.LAMBDA.apply(v5317, new Cons(a5320, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5318, v5319);
final Object f5324 = Do.LAMBDA.apply(f5322, f5323);


    return f5324;

}
}
