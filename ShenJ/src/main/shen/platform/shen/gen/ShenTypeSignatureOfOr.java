package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfOr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-or");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5081, final Object v5082, final Object v5083) throws Exception {
return defined(v5081, v5082, v5083);
}};
public static Object defined(final Object v5081, final Object v5082, final Object v5083) throws Exception {
final Object f5084 = ShenIncinfs.LAMBDA.apply();












final Object f5085 = UnifyBang.LAMBDA.apply(v5081, new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v5082, v5083);
final Object f5086 = Do.LAMBDA.apply(f5084, f5085);

    return f5086;

}
}
