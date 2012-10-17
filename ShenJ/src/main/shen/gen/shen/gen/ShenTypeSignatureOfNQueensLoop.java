package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNQueensLoop {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-n-queens-loop");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1040, final Object v1041, final Object v1042) throws Exception {
return defined(v1040, v1041, v1042);
}};
public static Object defined(final Object v1040, final Object v1041, final Object v1042) throws Exception {
final Object f1043 = ShenIncinfs.LAMBDA.apply();
























final Object f1044 = UnifyBang.LAMBDA.apply(v1040, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), Nil.NIL)), Nil.NIL))), Nil.NIL))), v1041, v1042);
final Object f1045 = Do.LAMBDA.apply(f1043, f1044);

    return f1045;

}
}
