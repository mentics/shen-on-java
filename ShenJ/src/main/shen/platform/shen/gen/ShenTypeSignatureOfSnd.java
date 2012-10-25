package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSnd {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-snd");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v767, final Object v768, final Object v769) throws Exception {
return defined(v767, v768, v769);
}};
public static Object defined(final Object v767, final Object v768, final Object v769) throws Exception {
final Object f771 = ShenNewpv.LAMBDA.apply(v768);

final Object a770 = f771;
final Object f773 = ShenNewpv.LAMBDA.apply(v768);

final Object b772 = f773;
final Object f774 = ShenIncinfs.LAMBDA.apply();












final Object f775 = UnifyBang.LAMBDA.apply(v767, new Cons(new Cons(a770, new Cons(RuntimeContext.symbol("*"), new Cons(b772, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(b772, Nil.NIL))), v768, v769);
final Object f776 = Do.LAMBDA.apply(f774, f775);



    return f776;

}
}
