package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfUnspecialise {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-unspecialise");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v991, final Object v992, final Object v993) throws Exception {
return defined(v991, v992, v993);
}};
public static Object defined(final Object v991, final Object v992, final Object v993) throws Exception {
final Object f994 = ShenIncinfs.LAMBDA.apply();






final Object f995 = UnifyBang.LAMBDA.apply(v991, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v992, v993);
final Object f996 = Do.LAMBDA.apply(f994, f995);

    return f996;

}
}
