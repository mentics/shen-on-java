package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAll_NsQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-all_Ns?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1047, final Object v1048, final Object v1049) throws Exception {
return defined(v1047, v1048, v1049);
}};
public static Object defined(final Object v1047, final Object v1048, final Object v1049) throws Exception {
final Object f1050 = ShenIncinfs.LAMBDA.apply();
















final Object f1051 = UnifyBang.LAMBDA.apply(v1047, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v1048, v1049);
final Object f1052 = Do.LAMBDA.apply(f1050, f1051);

    return f1052;

}
}
