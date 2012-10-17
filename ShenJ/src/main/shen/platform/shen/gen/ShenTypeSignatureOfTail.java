package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTail {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tail");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5335, final Object v5336, final Object v5337) throws Exception {
return defined(v5335, v5336, v5337);
}};
public static Object defined(final Object v5335, final Object v5336, final Object v5337) throws Exception {
final Object f5339 = ShenNewpv.LAMBDA.apply(v5336);

final Object a5338 = f5339;
final Object f5340 = ShenIncinfs.LAMBDA.apply();














final Object f5341 = UnifyBang.LAMBDA.apply(v5335, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5338, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5338, Nil.NIL)), Nil.NIL))), v5336, v5337);
final Object f5342 = Do.LAMBDA.apply(f5340, f5341);


    return f5342;

}
}
