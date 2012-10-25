package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNToString {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-n->string");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v559, final Object v560, final Object v561) throws Exception {
return defined(v559, v560, v561);
}};
public static Object defined(final Object v559, final Object v560, final Object v561) throws Exception {
final Object f562 = ShenIncinfs.LAMBDA.apply();






final Object f563 = UnifyBang.LAMBDA.apply(v559, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v560, v561);
final Object f564 = Do.LAMBDA.apply(f562, f563);

    return f564;

}
}
