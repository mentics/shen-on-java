package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNth {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-nth");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5041, final Object v5042, final Object v5043) throws Exception {
return defined(v5041, v5042, v5043);
}};
public static Object defined(final Object v5041, final Object v5042, final Object v5043) throws Exception {
final Object f5045 = ShenNewpv.LAMBDA.apply(v5042);

final Object a5044 = f5045;
final Object f5046 = ShenIncinfs.LAMBDA.apply();
















final Object f5047 = UnifyBang.LAMBDA.apply(v5041, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5044, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(a5044, Nil.NIL))), Nil.NIL))), v5042, v5043);
final Object f5048 = Do.LAMBDA.apply(f5046, f5047);


    return f5048;

}
}
