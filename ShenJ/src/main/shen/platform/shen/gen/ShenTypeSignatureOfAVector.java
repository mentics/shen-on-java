package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAVector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-<-vector");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4815, final Object v4816, final Object v4817) throws Exception {
return defined(v4815, v4816, v4817);
}};
public static Object defined(final Object v4815, final Object v4816, final Object v4817) throws Exception {
final Object f4819 = ShenNewpv.LAMBDA.apply(v4816);

final Object a4818 = f4819;
final Object f4820 = ShenIncinfs.LAMBDA.apply();
















final Object f4821 = UnifyBang.LAMBDA.apply(v4815, new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a4818, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(a4818, Nil.NIL))), Nil.NIL))), v4816, v4817);
final Object f4822 = Do.LAMBDA.apply(f4820, f4821);


    return f4822;

}
}
