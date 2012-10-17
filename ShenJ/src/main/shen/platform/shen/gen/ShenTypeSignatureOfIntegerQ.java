package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIntegerQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-integer?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4927, final Object v4928, final Object v4929) throws Exception {
return defined(v4927, v4928, v4929);
}};
public static Object defined(final Object v4927, final Object v4928, final Object v4929) throws Exception {
final Object f4931 = ShenNewpv.LAMBDA.apply(v4928);

final Object a4930 = f4931;
final Object f4932 = ShenIncinfs.LAMBDA.apply();






final Object f4933 = UnifyBang.LAMBDA.apply(v4927, new Cons(a4930, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v4928, v4929);
final Object f4934 = Do.LAMBDA.apply(f4932, f4933);


    return f4934;

}
}
