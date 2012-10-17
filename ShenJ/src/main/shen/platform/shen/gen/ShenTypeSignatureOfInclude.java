package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfInclude {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-include");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4901, final Object v4902, final Object v4903) throws Exception {
return defined(v4901, v4902, v4903);
}};
public static Object defined(final Object v4901, final Object v4902, final Object v4903) throws Exception {
final Object f4904 = ShenIncinfs.LAMBDA.apply();














final Object f4905 = UnifyBang.LAMBDA.apply(v4901, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v4902, v4903);
final Object f4906 = Do.LAMBDA.apply(f4904, f4905);

    return f4906;

}
}
