package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfHyphen {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of--");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5561, final Object v5562, final Object v5563) throws Exception {
return defined(v5561, v5562, v5563);
}};
public static Object defined(final Object v5561, final Object v5562, final Object v5563) throws Exception {
final Object f5564 = ShenIncinfs.LAMBDA.apply();












final Object f5565 = UnifyBang.LAMBDA.apply(v5561, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v5562, v5563);
final Object f5566 = Do.LAMBDA.apply(f5564, f5565);

    return f5566;

}
}
