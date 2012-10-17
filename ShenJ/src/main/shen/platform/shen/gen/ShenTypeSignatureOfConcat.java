package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfConcat {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-concat");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4647, final Object v4648, final Object v4649) throws Exception {
return defined(v4647, v4648, v4649);
}};
public static Object defined(final Object v4647, final Object v4648, final Object v4649) throws Exception {
final Object f4650 = ShenIncinfs.LAMBDA.apply();












final Object f4651 = UnifyBang.LAMBDA.apply(v4647, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), Nil.NIL))), v4648, v4649);
final Object f4652 = Do.LAMBDA.apply(f4650, f4651);

    return f4652;

}
}
