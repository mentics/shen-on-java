package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStringQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-string?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v823, final Object v824, final Object v825) throws Exception {
return defined(v823, v824, v825);
}};
public static Object defined(final Object v823, final Object v824, final Object v825) throws Exception {
final Object f827 = ShenNewpv.LAMBDA.apply(v824);

final Object a826 = f827;
final Object f828 = ShenIncinfs.LAMBDA.apply();






final Object f829 = UnifyBang.LAMBDA.apply(v823, new Cons(a826, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v824, v825);
final Object f830 = Do.LAMBDA.apply(f828, f829);


    return f830;

}
}
