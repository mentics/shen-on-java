package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIntoutput {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-intoutput");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v631, final Object v632, final Object v633) throws Exception {
return defined(v631, v632, v633);
}};
public static Object defined(final Object v631, final Object v632, final Object v633) throws Exception {
final Object f635 = ShenNewpv.LAMBDA.apply(v632);

final Object a634 = f635;
final Object f636 = ShenIncinfs.LAMBDA.apply();












final Object f637 = UnifyBang.LAMBDA.apply(v631, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a634, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), v632, v633);
final Object f638 = Do.LAMBDA.apply(f636, f637);


    return f638;

}
}
