package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfBoundQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-bound?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v153, final Object v154, final Object v155) throws Exception {
return defined(v153, v154, v155);
}};
public static Object defined(final Object v153, final Object v154, final Object v155) throws Exception {
final Object f156 = ShenIncinfs.LAMBDA.apply();






final Object f157 = UnifyBang.LAMBDA.apply(v153, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v154, v155);
final Object f158 = Do.LAMBDA.apply(f156, f157);

    return f158;

}
}
