package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSum {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-sum");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v833, final Object v834, final Object v835) throws Exception {
return defined(v833, v834, v835);
}};
public static Object defined(final Object v833, final Object v834, final Object v835) throws Exception {
final Object f836 = ShenIncinfs.LAMBDA.apply();










final Object f837 = UnifyBang.LAMBDA.apply(v833, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v834, v835);
final Object f838 = Do.LAMBDA.apply(f836, f837);

    return f838;

}
}
