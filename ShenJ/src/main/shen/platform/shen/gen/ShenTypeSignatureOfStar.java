package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStar {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-*");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5569, final Object v5570, final Object v5571) throws Exception {
return defined(v5569, v5570, v5571);
}};
public static Object defined(final Object v5569, final Object v5570, final Object v5571) throws Exception {
final Object f5572 = ShenIncinfs.LAMBDA.apply();












final Object f5573 = UnifyBang.LAMBDA.apply(v5569, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v5570, v5571);
final Object f5574 = Do.LAMBDA.apply(f5572, f5573);

    return f5574;

}
}
