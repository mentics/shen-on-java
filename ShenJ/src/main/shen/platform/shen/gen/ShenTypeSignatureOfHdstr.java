package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfHdstr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-hdstr");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4883, final Object v4884, final Object v4885) throws Exception {
return defined(v4883, v4884, v4885);
}};
public static Object defined(final Object v4883, final Object v4884, final Object v4885) throws Exception {
final Object f4886 = ShenIncinfs.LAMBDA.apply();






final Object f4887 = UnifyBang.LAMBDA.apply(v4883, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v4884, v4885);
final Object f4888 = Do.LAMBDA.apply(f4886, f4887);

    return f4888;

}
}
