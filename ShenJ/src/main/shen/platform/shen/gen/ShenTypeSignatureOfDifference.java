package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfDifference {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-difference");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v219, final Object v220, final Object v221) throws Exception {
return defined(v219, v220, v221);
}};
public static Object defined(final Object v219, final Object v220, final Object v221) throws Exception {
final Object f223 = ShenNewpv.LAMBDA.apply(v220);

final Object a222 = f223;
final Object f224 = ShenIncinfs.LAMBDA.apply();
























final Object f225 = UnifyBang.LAMBDA.apply(v219, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a222, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a222, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a222, Nil.NIL)), Nil.NIL))), Nil.NIL))), v220, v221);
final Object f226 = Do.LAMBDA.apply(f224, f225);


    return f226;

}
}
