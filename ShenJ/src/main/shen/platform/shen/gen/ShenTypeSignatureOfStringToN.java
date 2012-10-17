package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStringToN {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-string->n");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5309, final Object v5310, final Object v5311) throws Exception {
return defined(v5309, v5310, v5311);
}};
public static Object defined(final Object v5309, final Object v5310, final Object v5311) throws Exception {
final Object f5312 = ShenIncinfs.LAMBDA.apply();






final Object f5313 = UnifyBang.LAMBDA.apply(v5309, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v5310, v5311);
final Object f5314 = Do.LAMBDA.apply(f5312, f5313);

    return f5314;

}
}
