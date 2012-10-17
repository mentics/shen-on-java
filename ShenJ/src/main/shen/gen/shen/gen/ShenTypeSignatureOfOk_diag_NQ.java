package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfOk_diag_NQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-ok_diag_N?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1075, final Object v1076, final Object v1077) throws Exception {
return defined(v1075, v1076, v1077);
}};
public static Object defined(final Object v1075, final Object v1076, final Object v1077) throws Exception {
final Object f1078 = ShenIncinfs.LAMBDA.apply();






















final Object f1079 = UnifyBang.LAMBDA.apply(v1075, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), Nil.NIL))), v1076, v1077);
final Object f1080 = Do.LAMBDA.apply(f1078, f1079);

    return f1080;

}
}
