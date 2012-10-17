package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfDo {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-do");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4687, final Object v4688, final Object v4689) throws Exception {
return defined(v4687, v4688, v4689);
}};
public static Object defined(final Object v4687, final Object v4688, final Object v4689) throws Exception {
final Object f4691 = ShenNewpv.LAMBDA.apply(v4688);

final Object a4690 = f4691;
final Object f4693 = ShenNewpv.LAMBDA.apply(v4688);

final Object b4692 = f4693;
final Object f4694 = ShenIncinfs.LAMBDA.apply();












final Object f4695 = UnifyBang.LAMBDA.apply(v4687, new Cons(a4690, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(b4692, new Cons(RuntimeContext.symbol("-->"), new Cons(b4692, Nil.NIL))), Nil.NIL))), v4688, v4689);
final Object f4696 = Do.LAMBDA.apply(f4694, f4695);



    return f4696;

}
}
