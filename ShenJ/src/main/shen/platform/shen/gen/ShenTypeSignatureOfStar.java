package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStar {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-*");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1111, final Object v1112, final Object v1113) throws Exception {
return defined(v1111, v1112, v1113);
}};
public static Object defined(final Object v1111, final Object v1112, final Object v1113) throws Exception {
final Object f1114 = ShenIncinfs.LAMBDA.apply();












final Object f1115 = UnifyBang.LAMBDA.apply(v1111, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v1112, v1113);
final Object f1116 = Do.LAMBDA.apply(f1114, f1115);

    return f1116;

}
}
