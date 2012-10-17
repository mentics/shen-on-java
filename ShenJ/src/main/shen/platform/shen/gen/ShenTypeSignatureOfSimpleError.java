package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSimpleError {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-simple-error");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5215, final Object v5216, final Object v5217) throws Exception {
return defined(v5215, v5216, v5217);
}};
public static Object defined(final Object v5215, final Object v5216, final Object v5217) throws Exception {
final Object f5219 = ShenNewpv.LAMBDA.apply(v5216);

final Object a5218 = f5219;
final Object f5220 = ShenIncinfs.LAMBDA.apply();






final Object f5221 = UnifyBang.LAMBDA.apply(v5215, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(a5218, Nil.NIL))), v5216, v5217);
final Object f5222 = Do.LAMBDA.apply(f5220, f5221);


    return f5222;

}
}
