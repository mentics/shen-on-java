package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfOk_diagQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-ok_diag?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1068, final Object v1069, final Object v1070) throws Exception {
return defined(v1068, v1069, v1070);
}};
public static Object defined(final Object v1068, final Object v1069, final Object v1070) throws Exception {
final Object f1071 = ShenIncinfs.LAMBDA.apply();










final Object f1072 = UnifyBang.LAMBDA.apply(v1068, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v1069, v1070);
final Object f1073 = Do.LAMBDA.apply(f1071, f1072);

    return f1073;

}
}
