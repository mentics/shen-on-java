package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfThaw {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-thaw");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v923, final Object v924, final Object v925) throws Exception {
return defined(v923, v924, v925);
}};
public static Object defined(final Object v923, final Object v924, final Object v925) throws Exception {
final Object f927 = ShenNewpv.LAMBDA.apply(v924);

final Object a926 = f927;
final Object f928 = ShenIncinfs.LAMBDA.apply();










final Object f929 = UnifyBang.LAMBDA.apply(v923, new Cons(new Cons(RuntimeContext.symbol("lazy"), new Cons(a926, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(a926, Nil.NIL))), v924, v925);
final Object f930 = Do.LAMBDA.apply(f928, f929);


    return f930;

}
}
