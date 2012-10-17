package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfHead {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-head");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4863, final Object v4864, final Object v4865) throws Exception {
return defined(v4863, v4864, v4865);
}};
public static Object defined(final Object v4863, final Object v4864, final Object v4865) throws Exception {
final Object f4867 = ShenNewpv.LAMBDA.apply(v4864);

final Object a4866 = f4867;
final Object f4868 = ShenIncinfs.LAMBDA.apply();










final Object f4869 = UnifyBang.LAMBDA.apply(v4863, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4866, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(a4866, Nil.NIL))), v4864, v4865);
final Object f4870 = Do.LAMBDA.apply(f4868, f4869);


    return f4870;

}
}
