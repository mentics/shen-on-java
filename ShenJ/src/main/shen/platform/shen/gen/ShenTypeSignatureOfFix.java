package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfFix {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-fix");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v307, final Object v308, final Object v309) throws Exception {
return defined(v307, v308, v309);
}};
public static Object defined(final Object v307, final Object v308, final Object v309) throws Exception {
final Object f311 = ShenNewpv.LAMBDA.apply(v308);

final Object a310 = f311;
final Object f312 = ShenIncinfs.LAMBDA.apply();


















final Object f313 = UnifyBang.LAMBDA.apply(v307, new Cons(new Cons(a310, new Cons(RuntimeContext.symbol("-->"), new Cons(a310, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a310, new Cons(RuntimeContext.symbol("-->"), new Cons(a310, Nil.NIL))), Nil.NIL))), v308, v309);
final Object f314 = Do.LAMBDA.apply(f312, f313);


    return f314;

}
}
