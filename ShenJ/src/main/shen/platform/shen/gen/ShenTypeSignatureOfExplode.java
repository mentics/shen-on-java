package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfExplode {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-explode");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4747, final Object v4748, final Object v4749) throws Exception {
return defined(v4747, v4748, v4749);
}};
public static Object defined(final Object v4747, final Object v4748, final Object v4749) throws Exception {
final Object f4751 = ShenNewpv.LAMBDA.apply(v4748);

final Object a4750 = f4751;
final Object f4752 = ShenIncinfs.LAMBDA.apply();










final Object f4753 = UnifyBang.LAMBDA.apply(v4747, new Cons(a4750, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("string"), Nil.NIL)), Nil.NIL))), v4748, v4749);
final Object f4754 = Do.LAMBDA.apply(f4752, f4753);


    return f4754;

}
}
