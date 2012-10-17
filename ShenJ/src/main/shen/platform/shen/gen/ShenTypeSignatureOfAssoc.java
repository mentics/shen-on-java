package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAssoc {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-assoc");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4591, final Object v4592, final Object v4593) throws Exception {
return defined(v4591, v4592, v4593);
}};
public static Object defined(final Object v4591, final Object v4592, final Object v4593) throws Exception {
final Object f4595 = ShenNewpv.LAMBDA.apply(v4592);

final Object a4594 = f4595;
final Object f4596 = ShenIncinfs.LAMBDA.apply();
























final Object f4597 = UnifyBang.LAMBDA.apply(v4591, new Cons(a4594, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4594, Nil.NIL)), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4594, Nil.NIL)), Nil.NIL))), Nil.NIL))), v4592, v4593);
final Object f4598 = Do.LAMBDA.apply(f4596, f4597);


    return f4598;

}
}
