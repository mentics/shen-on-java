package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfUntrack {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-untrack");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v983, final Object v984, final Object v985) throws Exception {
return defined(v983, v984, v985);
}};
public static Object defined(final Object v983, final Object v984, final Object v985) throws Exception {
final Object f986 = ShenIncinfs.LAMBDA.apply();






final Object f987 = UnifyBang.LAMBDA.apply(v983, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v984, v985);
final Object f988 = Do.LAMBDA.apply(f986, f987);

    return f988;

}
}
