package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfReverse {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-reverse");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5205, final Object v5206, final Object v5207) throws Exception {
return defined(v5205, v5206, v5207);
}};
public static Object defined(final Object v5205, final Object v5206, final Object v5207) throws Exception {
final Object f5209 = ShenNewpv.LAMBDA.apply(v5206);

final Object a5208 = f5209;
final Object f5210 = ShenIncinfs.LAMBDA.apply();














final Object f5211 = UnifyBang.LAMBDA.apply(v5205, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5208, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5208, Nil.NIL)), Nil.NIL))), v5206, v5207);
final Object f5212 = Do.LAMBDA.apply(f5210, f5211);


    return f5212;

}
}
