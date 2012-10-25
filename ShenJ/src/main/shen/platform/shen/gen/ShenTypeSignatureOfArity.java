package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfArity {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-arity");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v123, final Object v124, final Object v125) throws Exception {
return defined(v123, v124, v125);
}};
public static Object defined(final Object v123, final Object v124, final Object v125) throws Exception {
final Object f127 = ShenNewpv.LAMBDA.apply(v124);

final Object a126 = f127;
final Object f128 = ShenIncinfs.LAMBDA.apply();






final Object f129 = UnifyBang.LAMBDA.apply(v123, new Cons(a126, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v124, v125);
final Object f130 = Do.LAMBDA.apply(f128, f129);


    return f130;

}
}
