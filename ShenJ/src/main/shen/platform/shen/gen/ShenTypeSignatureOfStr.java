package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-str");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5299, final Object v5300, final Object v5301) throws Exception {
return defined(v5299, v5300, v5301);
}};
public static Object defined(final Object v5299, final Object v5300, final Object v5301) throws Exception {
final Object f5303 = ShenNewpv.LAMBDA.apply(v5300);

final Object a5302 = f5303;
final Object f5304 = ShenIncinfs.LAMBDA.apply();






final Object f5305 = UnifyBang.LAMBDA.apply(v5299, new Cons(a5302, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v5300, v5301);
final Object f5306 = Do.LAMBDA.apply(f5304, f5305);


    return f5306;

}
}
