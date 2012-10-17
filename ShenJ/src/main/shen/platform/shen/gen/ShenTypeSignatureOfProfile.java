package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfProfile {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-profile");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5125, final Object v5126, final Object v5127) throws Exception {
return defined(v5125, v5126, v5127);
}};
public static Object defined(final Object v5125, final Object v5126, final Object v5127) throws Exception {
final Object f5129 = ShenNewpv.LAMBDA.apply(v5126);

final Object a5128 = f5129;
final Object f5131 = ShenNewpv.LAMBDA.apply(v5126);

final Object b5130 = f5131;
final Object f5132 = ShenIncinfs.LAMBDA.apply();


















final Object f5133 = UnifyBang.LAMBDA.apply(v5125, new Cons(new Cons(a5128, new Cons(RuntimeContext.symbol("-->"), new Cons(b5130, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a5128, new Cons(RuntimeContext.symbol("-->"), new Cons(b5130, Nil.NIL))), Nil.NIL))), v5126, v5127);
final Object f5134 = Do.LAMBDA.apply(f5132, f5133);



    return f5134;

}
}
