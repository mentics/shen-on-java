package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of->");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1045, final Object v1046, final Object v1047) throws Exception {
return defined(v1045, v1046, v1047);
}};
public static Object defined(final Object v1045, final Object v1046, final Object v1047) throws Exception {
final Object f1048 = ShenIncinfs.LAMBDA.apply();












final Object f1049 = UnifyBang.LAMBDA.apply(v1045, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v1046, v1047);
final Object f1050 = Do.LAMBDA.apply(f1048, f1049);

    return f1050;

}
}
