package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAnd {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-and");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v105, final Object v106, final Object v107) throws Exception {
return defined(v105, v106, v107);
}};
public static Object defined(final Object v105, final Object v106, final Object v107) throws Exception {
final Object f108 = ShenIncinfs.LAMBDA.apply();












final Object f109 = UnifyBang.LAMBDA.apply(v105, new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v106, v107);
final Object f110 = Do.LAMBDA.apply(f108, f109);

    return f110;

}
}
