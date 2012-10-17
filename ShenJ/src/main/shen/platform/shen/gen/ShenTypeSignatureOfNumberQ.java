package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNumberQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-number?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5051, final Object v5052, final Object v5053) throws Exception {
return defined(v5051, v5052, v5053);
}};
public static Object defined(final Object v5051, final Object v5052, final Object v5053) throws Exception {
final Object f5055 = ShenNewpv.LAMBDA.apply(v5052);

final Object a5054 = f5055;
final Object f5056 = ShenIncinfs.LAMBDA.apply();






final Object f5057 = UnifyBang.LAMBDA.apply(v5051, new Cons(a5054, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v5052, v5053);
final Object f5058 = Do.LAMBDA.apply(f5056, f5057);


    return f5058;

}
}
