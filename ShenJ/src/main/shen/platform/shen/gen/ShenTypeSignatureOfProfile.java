package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfProfile {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-profile");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v667, final Object v668, final Object v669) throws Exception {
return defined(v667, v668, v669);
}};
public static Object defined(final Object v667, final Object v668, final Object v669) throws Exception {
final Object f671 = ShenNewpv.LAMBDA.apply(v668);

final Object a670 = f671;
final Object f673 = ShenNewpv.LAMBDA.apply(v668);

final Object b672 = f673;
final Object f674 = ShenIncinfs.LAMBDA.apply();


















final Object f675 = UnifyBang.LAMBDA.apply(v667, new Cons(new Cons(a670, new Cons(RuntimeContext.symbol("-->"), new Cons(b672, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a670, new Cons(RuntimeContext.symbol("-->"), new Cons(b672, Nil.NIL))), Nil.NIL))), v668, v669);
final Object f676 = Do.LAMBDA.apply(f674, f675);



    return f676;

}
}
