package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIf {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-if");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v433, final Object v434, final Object v435) throws Exception {
return defined(v433, v434, v435);
}};
public static Object defined(final Object v433, final Object v434, final Object v435) throws Exception {
final Object f437 = ShenNewpv.LAMBDA.apply(v434);

final Object a436 = f437;
final Object f438 = ShenIncinfs.LAMBDA.apply();


















final Object f439 = UnifyBang.LAMBDA.apply(v433, new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a436, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a436, new Cons(RuntimeContext.symbol("-->"), new Cons(a436, Nil.NIL))), Nil.NIL))), Nil.NIL))), v434, v435);
final Object f440 = Do.LAMBDA.apply(f438, f439);


    return f440;

}
}
