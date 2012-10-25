package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfCn {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-cn");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v181, final Object v182, final Object v183) throws Exception {
return defined(v181, v182, v183);
}};
public static Object defined(final Object v181, final Object v182, final Object v183) throws Exception {
final Object f184 = ShenIncinfs.LAMBDA.apply();












final Object f185 = UnifyBang.LAMBDA.apply(v181, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), v182, v183);
final Object f186 = Do.LAMBDA.apply(f184, f185);

    return f186;

}
}
