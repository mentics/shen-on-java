package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNl {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-nl");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v567, final Object v568, final Object v569) throws Exception {
return defined(v567, v568, v569);
}};
public static Object defined(final Object v567, final Object v568, final Object v569) throws Exception {
final Object f570 = ShenIncinfs.LAMBDA.apply();






final Object f571 = UnifyBang.LAMBDA.apply(v567, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v568, v569);
final Object f572 = Do.LAMBDA.apply(f570, f571);

    return f572;

}
}
