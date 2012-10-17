package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIntersection {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-intersection");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4937, final Object v4938, final Object v4939) throws Exception {
return defined(v4937, v4938, v4939);
}};
public static Object defined(final Object v4937, final Object v4938, final Object v4939) throws Exception {
final Object f4941 = ShenNewpv.LAMBDA.apply(v4938);

final Object a4940 = f4941;
final Object f4942 = ShenIncinfs.LAMBDA.apply();
























final Object f4943 = UnifyBang.LAMBDA.apply(v4937, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4940, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4940, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4940, Nil.NIL)), Nil.NIL))), Nil.NIL))), v4938, v4939);
final Object f4944 = Do.LAMBDA.apply(f4942, f4943);


    return f4944;

}
}
