package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSpy {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-spy");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v787, final Object v788, final Object v789) throws Exception {
return defined(v787, v788, v789);
}};
public static Object defined(final Object v787, final Object v788, final Object v789) throws Exception {
final Object f790 = ShenIncinfs.LAMBDA.apply();






final Object f791 = UnifyBang.LAMBDA.apply(v787, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v788, v789);
final Object f792 = Do.LAMBDA.apply(f790, f791);

    return f792;

}
}
