package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfVersion {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-version");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5477, final Object v5478, final Object v5479) throws Exception {
return defined(v5477, v5478, v5479);
}};
public static Object defined(final Object v5477, final Object v5478, final Object v5479) throws Exception {
final Object f5480 = ShenIncinfs.LAMBDA.apply();






final Object f5481 = UnifyBang.LAMBDA.apply(v5477, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v5478, v5479);
final Object f5482 = Do.LAMBDA.apply(f5480, f5481);

    return f5482;

}
}
