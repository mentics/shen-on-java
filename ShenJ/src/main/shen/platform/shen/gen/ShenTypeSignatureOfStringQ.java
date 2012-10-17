package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStringQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-string?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5281, final Object v5282, final Object v5283) throws Exception {
return defined(v5281, v5282, v5283);
}};
public static Object defined(final Object v5281, final Object v5282, final Object v5283) throws Exception {
final Object f5285 = ShenNewpv.LAMBDA.apply(v5282);

final Object a5284 = f5285;
final Object f5286 = ShenIncinfs.LAMBDA.apply();






final Object f5287 = UnifyBang.LAMBDA.apply(v5281, new Cons(a5284, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5282, v5283);
final Object f5288 = Do.LAMBDA.apply(f5286, f5287);


    return f5288;

}
}
