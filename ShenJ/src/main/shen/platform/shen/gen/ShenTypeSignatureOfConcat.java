package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfConcat {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-concat");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v189, final Object v190, final Object v191) throws Exception {
return defined(v189, v190, v191);
}};
public static Object defined(final Object v189, final Object v190, final Object v191) throws Exception {
final Object f192 = ShenIncinfs.LAMBDA.apply();












final Object f193 = UnifyBang.LAMBDA.apply(v189, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), Nil.NIL))), v190, v191);
final Object f194 = Do.LAMBDA.apply(f192, f193);

    return f194;

}
}
