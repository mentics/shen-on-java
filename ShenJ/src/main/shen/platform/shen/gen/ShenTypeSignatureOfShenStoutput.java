package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfShenStoutput {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-shen-stoutput");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5271, final Object v5272, final Object v5273) throws Exception {
return defined(v5271, v5272, v5273);
}};
public static Object defined(final Object v5271, final Object v5272, final Object v5273) throws Exception {
final Object f5275 = ShenNewpv.LAMBDA.apply(v5272);

final Object a5274 = f5275;
final Object f5276 = ShenIncinfs.LAMBDA.apply();










final Object f5277 = UnifyBang.LAMBDA.apply(v5271, new Cons(a5274, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(RuntimeContext.symbol("out"), Nil.NIL)), Nil.NIL))), v5272, v5273);
final Object f5278 = Do.LAMBDA.apply(f5276, f5277);


    return f5278;

}
}
