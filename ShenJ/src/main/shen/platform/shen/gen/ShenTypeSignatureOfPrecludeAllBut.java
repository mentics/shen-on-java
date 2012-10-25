package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPrecludeAllBut {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-preclude-all-but");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v705, final Object v706, final Object v707) throws Exception {
return defined(v705, v706, v707);
}};
public static Object defined(final Object v705, final Object v706, final Object v707) throws Exception {
final Object f708 = ShenIncinfs.LAMBDA.apply();














final Object f709 = UnifyBang.LAMBDA.apply(v705, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v706, v707);
final Object f710 = Do.LAMBDA.apply(f708, f709);

    return f710;

}
}
