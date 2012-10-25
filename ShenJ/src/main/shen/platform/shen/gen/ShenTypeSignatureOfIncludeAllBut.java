package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIncludeAllBut {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-include-all-but");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v451, final Object v452, final Object v453) throws Exception {
return defined(v451, v452, v453);
}};
public static Object defined(final Object v451, final Object v452, final Object v453) throws Exception {
final Object f454 = ShenIncinfs.LAMBDA.apply();














final Object f455 = UnifyBang.LAMBDA.apply(v451, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v452, v453);
final Object f456 = Do.LAMBDA.apply(f454, f455);

    return f456;

}
}
