package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStinput {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-stinput");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5261, final Object v5262, final Object v5263) throws Exception {
return defined(v5261, v5262, v5263);
}};
public static Object defined(final Object v5261, final Object v5262, final Object v5263) throws Exception {
final Object f5265 = ShenNewpv.LAMBDA.apply(v5262);

final Object a5264 = f5265;
final Object f5266 = ShenIncinfs.LAMBDA.apply();










final Object f5267 = UnifyBang.LAMBDA.apply(v5261, new Cons(a5264, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(RuntimeContext.symbol("in"), Nil.NIL)), Nil.NIL))), v5262, v5263);
final Object f5268 = Do.LAMBDA.apply(f5266, f5267);


    return f5268;

}
}
