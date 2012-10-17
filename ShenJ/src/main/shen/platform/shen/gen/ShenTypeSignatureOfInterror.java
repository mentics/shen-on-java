package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfInterror {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-interror");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4727, final Object v4728, final Object v4729) throws Exception {
return defined(v4727, v4728, v4729);
}};
public static Object defined(final Object v4727, final Object v4728, final Object v4729) throws Exception {
final Object f4731 = ShenNewpv.LAMBDA.apply(v4728);

final Object a4730 = f4731;
final Object f4733 = ShenNewpv.LAMBDA.apply(v4728);

final Object b4732 = f4733;
final Object f4734 = ShenIncinfs.LAMBDA.apply();












final Object f4735 = UnifyBang.LAMBDA.apply(v4727, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a4730, new Cons(RuntimeContext.symbol("-->"), new Cons(b4732, Nil.NIL))), Nil.NIL))), v4728, v4729);
final Object f4736 = Do.LAMBDA.apply(f4734, f4735);



    return f4736;

}
}
