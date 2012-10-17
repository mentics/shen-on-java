package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNot {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-not");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5033, final Object v5034, final Object v5035) throws Exception {
return defined(v5033, v5034, v5035);
}};
public static Object defined(final Object v5033, final Object v5034, final Object v5035) throws Exception {
final Object f5036 = ShenIncinfs.LAMBDA.apply();






final Object f5037 = UnifyBang.LAMBDA.apply(v5033, new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5034, v5035);
final Object f5038 = Do.LAMBDA.apply(f5036, f5037);

    return f5038;

}
}
