package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNQueens {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-n-queens");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1026, final Object v1027, final Object v1028) throws Exception {
return defined(v1026, v1027, v1028);
}};
public static Object defined(final Object v1026, final Object v1027, final Object v1028) throws Exception {
final Object f1029 = ShenIncinfs.LAMBDA.apply();






final Object f1030 = UnifyBang.LAMBDA.apply(v1026, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v1027, v1028);
final Object f1031 = Do.LAMBDA.apply(f1029, f1030);

    return f1031;

}
}
