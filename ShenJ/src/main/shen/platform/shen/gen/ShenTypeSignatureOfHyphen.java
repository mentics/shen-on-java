package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfHyphen {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of--");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1103, final Object v1104, final Object v1105) throws Exception {
return defined(v1103, v1104, v1105);
}};
public static Object defined(final Object v1103, final Object v1104, final Object v1105) throws Exception {
final Object f1106 = ShenIncinfs.LAMBDA.apply();












final Object f1107 = UnifyBang.LAMBDA.apply(v1103, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v1104, v1105);
final Object f1108 = Do.LAMBDA.apply(f1106, f1107);

    return f1108;

}
}
