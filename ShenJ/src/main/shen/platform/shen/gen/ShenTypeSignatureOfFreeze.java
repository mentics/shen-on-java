package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfFreeze {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-freeze");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v327, final Object v328, final Object v329) throws Exception {
return defined(v327, v328, v329);
}};
public static Object defined(final Object v327, final Object v328, final Object v329) throws Exception {
final Object f331 = ShenNewpv.LAMBDA.apply(v328);

final Object a330 = f331;
final Object f332 = ShenIncinfs.LAMBDA.apply();










final Object f333 = UnifyBang.LAMBDA.apply(v327, new Cons(a330, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("lazy"), new Cons(a330, Nil.NIL)), Nil.NIL))), v328, v329);
final Object f334 = Do.LAMBDA.apply(f332, f333);


    return f334;

}
}
