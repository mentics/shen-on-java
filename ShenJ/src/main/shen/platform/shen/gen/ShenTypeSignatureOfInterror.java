package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfInterror {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-interror");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v269, final Object v270, final Object v271) throws Exception {
return defined(v269, v270, v271);
}};
public static Object defined(final Object v269, final Object v270, final Object v271) throws Exception {
final Object f273 = ShenNewpv.LAMBDA.apply(v270);

final Object a272 = f273;
final Object f275 = ShenNewpv.LAMBDA.apply(v270);

final Object b274 = f275;
final Object f276 = ShenIncinfs.LAMBDA.apply();












final Object f277 = UnifyBang.LAMBDA.apply(v269, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a272, new Cons(RuntimeContext.symbol("-->"), new Cons(b274, Nil.NIL))), Nil.NIL))), v270, v271);
final Object f278 = Do.LAMBDA.apply(f276, f277);



    return f278;

}
}
