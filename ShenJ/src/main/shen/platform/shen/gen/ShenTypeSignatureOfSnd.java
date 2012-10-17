package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSnd {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-snd");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5225, final Object v5226, final Object v5227) throws Exception {
return defined(v5225, v5226, v5227);
}};
public static Object defined(final Object v5225, final Object v5226, final Object v5227) throws Exception {
final Object f5229 = ShenNewpv.LAMBDA.apply(v5226);

final Object a5228 = f5229;
final Object f5231 = ShenNewpv.LAMBDA.apply(v5226);

final Object b5230 = f5231;
final Object f5232 = ShenIncinfs.LAMBDA.apply();












final Object f5233 = UnifyBang.LAMBDA.apply(v5225, new Cons(new Cons(a5228, new Cons(RuntimeContext.symbol("*"), new Cons(b5230, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(b5230, Nil.NIL))), v5226, v5227);
final Object f5234 = Do.LAMBDA.apply(f5232, f5233);



    return f5234;

}
}
