package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAbsvectorQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-absvector?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v85, final Object v86, final Object v87) throws Exception {
return defined(v85, v86, v87);
}};
public static Object defined(final Object v85, final Object v86, final Object v87) throws Exception {
final Object f89 = ShenNewpv.LAMBDA.apply(v86);

final Object a88 = f89;
final Object f90 = ShenIncinfs.LAMBDA.apply();






final Object f91 = UnifyBang.LAMBDA.apply(v85, new Cons(a88, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v86, v87);
final Object f92 = Do.LAMBDA.apply(f90, f91);


    return f92;

}
}
