package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfThaw {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-thaw");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5381, final Object v5382, final Object v5383) throws Exception {
return defined(v5381, v5382, v5383);
}};
public static Object defined(final Object v5381, final Object v5382, final Object v5383) throws Exception {
final Object f5385 = ShenNewpv.LAMBDA.apply(v5382);

final Object a5384 = f5385;
final Object f5386 = ShenIncinfs.LAMBDA.apply();










final Object f5387 = UnifyBang.LAMBDA.apply(v5381, new Cons(new Cons(RuntimeContext.symbol("lazy"), new Cons(a5384, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(a5384, Nil.NIL))), v5382, v5383);
final Object f5388 = Do.LAMBDA.apply(f5386, f5387);


    return f5388;

}
}
