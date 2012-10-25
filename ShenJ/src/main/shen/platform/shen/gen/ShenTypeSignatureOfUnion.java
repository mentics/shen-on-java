package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfUnion {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-union");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v961, final Object v962, final Object v963) throws Exception {
return defined(v961, v962, v963);
}};
public static Object defined(final Object v961, final Object v962, final Object v963) throws Exception {
final Object f965 = ShenNewpv.LAMBDA.apply(v962);

final Object a964 = f965;
final Object f966 = ShenIncinfs.LAMBDA.apply();
























final Object f967 = UnifyBang.LAMBDA.apply(v961, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a964, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a964, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a964, Nil.NIL)), Nil.NIL))), Nil.NIL))), v962, v963);
final Object f968 = Do.LAMBDA.apply(f966, f967);


    return f968;

}
}
