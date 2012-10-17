package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfInitialise {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-initialise");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1033, final Object v1034, final Object v1035) throws Exception {
return defined(v1033, v1034, v1035);
}};
public static Object defined(final Object v1033, final Object v1034, final Object v1035) throws Exception {
final Object f1036 = ShenIncinfs.LAMBDA.apply();










final Object f1037 = UnifyBang.LAMBDA.apply(v1033, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), Nil.NIL))), v1034, v1035);
final Object f1038 = Do.LAMBDA.apply(f1036, f1037);

    return f1038;

}
}
