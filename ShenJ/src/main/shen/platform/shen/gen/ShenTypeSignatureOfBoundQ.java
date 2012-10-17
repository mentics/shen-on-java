package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfBoundQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-bound?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4611, final Object v4612, final Object v4613) throws Exception {
return defined(v4611, v4612, v4613);
}};
public static Object defined(final Object v4611, final Object v4612, final Object v4613) throws Exception {
final Object f4614 = ShenIncinfs.LAMBDA.apply();






final Object f4615 = UnifyBang.LAMBDA.apply(v4611, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v4612, v4613);
final Object f4616 = Do.LAMBDA.apply(f4614, f4615);

    return f4616;

}
}
