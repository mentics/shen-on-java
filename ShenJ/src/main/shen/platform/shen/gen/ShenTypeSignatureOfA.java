package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfA {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-<");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1053, final Object v1054, final Object v1055) throws Exception {
return defined(v1053, v1054, v1055);
}};
public static Object defined(final Object v1053, final Object v1054, final Object v1055) throws Exception {
final Object f1056 = ShenIncinfs.LAMBDA.apply();












final Object f1057 = UnifyBang.LAMBDA.apply(v1053, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v1054, v1055);
final Object f1058 = Do.LAMBDA.apply(f1056, f1057);

    return f1058;

}
}
