package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfVariableQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-variable?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5457, final Object v5458, final Object v5459) throws Exception {
return defined(v5457, v5458, v5459);
}};
public static Object defined(final Object v5457, final Object v5458, final Object v5459) throws Exception {
final Object f5461 = ShenNewpv.LAMBDA.apply(v5458);

final Object a5460 = f5461;
final Object f5462 = ShenIncinfs.LAMBDA.apply();






final Object f5463 = UnifyBang.LAMBDA.apply(v5457, new Cons(a5460, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5458, v5459);
final Object f5464 = Do.LAMBDA.apply(f5462, f5463);


    return f5464;

}
}
