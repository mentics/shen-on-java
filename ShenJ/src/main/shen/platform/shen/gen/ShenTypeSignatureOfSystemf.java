package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSystemf {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-systemf");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v869, final Object v870, final Object v871) throws Exception {
return defined(v869, v870, v871);
}};
public static Object defined(final Object v869, final Object v870, final Object v871) throws Exception {
final Object f872 = ShenIncinfs.LAMBDA.apply();










final Object f873 = UnifyBang.LAMBDA.apply(v869, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v870, v871);
final Object f874 = Do.LAMBDA.apply(f872, f873);

    return f874;

}
}
