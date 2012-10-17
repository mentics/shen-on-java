package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfFreeze {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-freeze");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4785, final Object v4786, final Object v4787) throws Exception {
return defined(v4785, v4786, v4787);
}};
public static Object defined(final Object v4785, final Object v4786, final Object v4787) throws Exception {
final Object f4789 = ShenNewpv.LAMBDA.apply(v4786);

final Object a4788 = f4789;
final Object f4790 = ShenIncinfs.LAMBDA.apply();










final Object f4791 = UnifyBang.LAMBDA.apply(v4785, new Cons(a4788, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("lazy"), new Cons(a4788, Nil.NIL)), Nil.NIL))), v4786, v4787);
final Object f4792 = Do.LAMBDA.apply(f4790, f4791);


    return f4792;

}
}
