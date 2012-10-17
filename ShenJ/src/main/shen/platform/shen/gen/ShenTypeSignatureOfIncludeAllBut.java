package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIncludeAllBut {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-include-all-but");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4909, final Object v4910, final Object v4911) throws Exception {
return defined(v4909, v4910, v4911);
}};
public static Object defined(final Object v4909, final Object v4910, final Object v4911) throws Exception {
final Object f4912 = ShenIncinfs.LAMBDA.apply();














final Object f4913 = UnifyBang.LAMBDA.apply(v4909, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v4910, v4911);
final Object f4914 = Do.LAMBDA.apply(f4912, f4913);

    return f4914;

}
}
