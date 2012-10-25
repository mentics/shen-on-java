package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfHdv {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-hdv");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v415, final Object v416, final Object v417) throws Exception {
return defined(v415, v416, v417);
}};
public static Object defined(final Object v415, final Object v416, final Object v417) throws Exception {
final Object f419 = ShenNewpv.LAMBDA.apply(v416);

final Object a418 = f419;
final Object f420 = ShenIncinfs.LAMBDA.apply();










final Object f421 = UnifyBang.LAMBDA.apply(v415, new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a418, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(a418, Nil.NIL))), v416, v417);
final Object f422 = Do.LAMBDA.apply(f420, f421);


    return f422;

}
}
