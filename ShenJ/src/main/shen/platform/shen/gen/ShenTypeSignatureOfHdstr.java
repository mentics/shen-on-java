package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfHdstr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-hdstr");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v425, final Object v426, final Object v427) throws Exception {
return defined(v425, v426, v427);
}};
public static Object defined(final Object v425, final Object v426, final Object v427) throws Exception {
final Object f428 = ShenIncinfs.LAMBDA.apply();






final Object f429 = UnifyBang.LAMBDA.apply(v425, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v426, v427);
final Object f430 = Do.LAMBDA.apply(f428, f429);

    return f430;

}
}
