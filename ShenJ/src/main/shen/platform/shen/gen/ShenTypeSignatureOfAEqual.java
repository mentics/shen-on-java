package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAEqual {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-<=");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1069, final Object v1070, final Object v1071) throws Exception {
return defined(v1069, v1070, v1071);
}};
public static Object defined(final Object v1069, final Object v1070, final Object v1071) throws Exception {
final Object f1072 = ShenIncinfs.LAMBDA.apply();












final Object f1073 = UnifyBang.LAMBDA.apply(v1069, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v1070, v1071);
final Object f1074 = Do.LAMBDA.apply(f1072, f1073);

    return f1074;

}
}
