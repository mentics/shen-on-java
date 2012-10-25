package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSlash {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-/");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1095, final Object v1096, final Object v1097) throws Exception {
return defined(v1095, v1096, v1097);
}};
public static Object defined(final Object v1095, final Object v1096, final Object v1097) throws Exception {
final Object f1098 = ShenIncinfs.LAMBDA.apply();












final Object f1099 = UnifyBang.LAMBDA.apply(v1095, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v1096, v1097);
final Object f1100 = Do.LAMBDA.apply(f1098, f1099);

    return f1100;

}
}
