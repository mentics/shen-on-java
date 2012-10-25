package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSpecialise {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-specialise");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v779, final Object v780, final Object v781) throws Exception {
return defined(v779, v780, v781);
}};
public static Object defined(final Object v779, final Object v780, final Object v781) throws Exception {
final Object f782 = ShenIncinfs.LAMBDA.apply();






final Object f783 = UnifyBang.LAMBDA.apply(v779, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v780, v781);
final Object f784 = Do.LAMBDA.apply(f782, f783);

    return f784;

}
}
