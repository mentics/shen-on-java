package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfUnprofile {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-unprofile");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5429, final Object v5430, final Object v5431) throws Exception {
return defined(v5429, v5430, v5431);
}};
public static Object defined(final Object v5429, final Object v5430, final Object v5431) throws Exception {
final Object f5433 = ShenNewpv.LAMBDA.apply(v5430);

final Object a5432 = f5433;
final Object f5435 = ShenNewpv.LAMBDA.apply(v5430);

final Object b5434 = f5435;
final Object f5436 = ShenIncinfs.LAMBDA.apply();


















final Object f5437 = UnifyBang.LAMBDA.apply(v5429, new Cons(new Cons(a5432, new Cons(RuntimeContext.symbol("-->"), new Cons(b5434, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a5432, new Cons(RuntimeContext.symbol("-->"), new Cons(b5434, Nil.NIL))), Nil.NIL))), v5430, v5431);
final Object f5438 = Do.LAMBDA.apply(f5436, f5437);



    return f5438;

}
}
