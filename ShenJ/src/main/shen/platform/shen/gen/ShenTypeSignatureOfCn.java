package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfCn {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-cn");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4639, final Object v4640, final Object v4641) throws Exception {
return defined(v4639, v4640, v4641);
}};
public static Object defined(final Object v4639, final Object v4640, final Object v4641) throws Exception {
final Object f4642 = ShenIncinfs.LAMBDA.apply();












final Object f4643 = UnifyBang.LAMBDA.apply(v4639, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), v4640, v4641);
final Object f4644 = Do.LAMBDA.apply(f4642, f4643);

    return f4644;

}
}
