package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfFst {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-fst");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4795, final Object v4796, final Object v4797) throws Exception {
return defined(v4795, v4796, v4797);
}};
public static Object defined(final Object v4795, final Object v4796, final Object v4797) throws Exception {
final Object f4799 = ShenNewpv.LAMBDA.apply(v4796);

final Object b4798 = f4799;
final Object f4801 = ShenNewpv.LAMBDA.apply(v4796);

final Object a4800 = f4801;
final Object f4802 = ShenIncinfs.LAMBDA.apply();












final Object f4803 = UnifyBang.LAMBDA.apply(v4795, new Cons(new Cons(a4800, new Cons(RuntimeContext.symbol("*"), new Cons(b4798, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(a4800, Nil.NIL))), v4796, v4797);
final Object f4804 = Do.LAMBDA.apply(f4802, f4803);



    return f4804;

}
}
