package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfDestroy {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-destroy");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v207, final Object v208, final Object v209) throws Exception {
return defined(v207, v208, v209);
}};
public static Object defined(final Object v207, final Object v208, final Object v209) throws Exception {
final Object f211 = ShenNewpv.LAMBDA.apply(v208);

final Object a210 = f211;
final Object f213 = ShenNewpv.LAMBDA.apply(v208);

final Object b212 = f213;
final Object f214 = ShenIncinfs.LAMBDA.apply();


















final Object f215 = UnifyBang.LAMBDA.apply(v207, new Cons(new Cons(a210, new Cons(RuntimeContext.symbol("-->"), new Cons(b212, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a210, new Cons(RuntimeContext.symbol("-->"), new Cons(b212, Nil.NIL))), Nil.NIL))), v208, v209);
final Object f216 = Do.LAMBDA.apply(f214, f215);



    return f216;

}
}
