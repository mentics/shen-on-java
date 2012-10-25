package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTrapError {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-trap-error");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v941, final Object v942, final Object v943) throws Exception {
return defined(v941, v942, v943);
}};
public static Object defined(final Object v941, final Object v942, final Object v943) throws Exception {
final Object f945 = ShenNewpv.LAMBDA.apply(v942);

final Object a944 = f945;
final Object f946 = ShenIncinfs.LAMBDA.apply();


















final Object f947 = UnifyBang.LAMBDA.apply(v941, new Cons(a944, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("exception"), new Cons(RuntimeContext.symbol("-->"), new Cons(a944, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(a944, Nil.NIL))), Nil.NIL))), v942, v943);
final Object f948 = Do.LAMBDA.apply(f946, f947);


    return f948;

}
}
