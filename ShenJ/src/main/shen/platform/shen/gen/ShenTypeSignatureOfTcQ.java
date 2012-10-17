package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTcQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tc?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5371, final Object v5372, final Object v5373) throws Exception {
return defined(v5371, v5372, v5373);
}};
public static Object defined(final Object v5371, final Object v5372, final Object v5373) throws Exception {
final Object f5375 = ShenNewpv.LAMBDA.apply(v5372);

final Object a5374 = f5375;
final Object f5376 = ShenIncinfs.LAMBDA.apply();






final Object f5377 = UnifyBang.LAMBDA.apply(v5371, new Cons(a5374, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5372, v5373);
final Object f5378 = Do.LAMBDA.apply(f5376, f5377);


    return f5378;

}
}
