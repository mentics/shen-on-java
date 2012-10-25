package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNot {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-not");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v575, final Object v576, final Object v577) throws Exception {
return defined(v575, v576, v577);
}};
public static Object defined(final Object v575, final Object v576, final Object v577) throws Exception {
final Object f578 = ShenIncinfs.LAMBDA.apply();






final Object f579 = UnifyBang.LAMBDA.apply(v575, new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v576, v577);
final Object f580 = Do.LAMBDA.apply(f578, f579);

    return f580;

}
}
