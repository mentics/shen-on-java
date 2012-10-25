package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTail {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tail");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v877, final Object v878, final Object v879) throws Exception {
return defined(v877, v878, v879);
}};
public static Object defined(final Object v877, final Object v878, final Object v879) throws Exception {
final Object f881 = ShenNewpv.LAMBDA.apply(v878);

final Object a880 = f881;
final Object f882 = ShenIncinfs.LAMBDA.apply();














final Object f883 = UnifyBang.LAMBDA.apply(v877, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a880, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a880, Nil.NIL)), Nil.NIL))), v878, v879);
final Object f884 = Do.LAMBDA.apply(f882, f883);


    return f884;

}
}
