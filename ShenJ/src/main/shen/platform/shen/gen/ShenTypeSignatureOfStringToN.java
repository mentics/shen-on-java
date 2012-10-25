package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStringToN {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-string->n");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v851, final Object v852, final Object v853) throws Exception {
return defined(v851, v852, v853);
}};
public static Object defined(final Object v851, final Object v852, final Object v853) throws Exception {
final Object f854 = ShenIncinfs.LAMBDA.apply();






final Object f855 = UnifyBang.LAMBDA.apply(v851, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v852, v853);
final Object f856 = Do.LAMBDA.apply(f854, f855);

    return f856;

}
}
