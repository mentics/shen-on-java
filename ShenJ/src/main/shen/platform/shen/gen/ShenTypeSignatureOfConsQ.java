package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfConsQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-cons?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v197, final Object v198, final Object v199) throws Exception {
return defined(v197, v198, v199);
}};
public static Object defined(final Object v197, final Object v198, final Object v199) throws Exception {
final Object f201 = ShenNewpv.LAMBDA.apply(v198);

final Object a200 = f201;
final Object f202 = ShenIncinfs.LAMBDA.apply();






final Object f203 = UnifyBang.LAMBDA.apply(v197, new Cons(a200, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v198, v199);
final Object f204 = Do.LAMBDA.apply(f202, f203);


    return f204;

}
}
