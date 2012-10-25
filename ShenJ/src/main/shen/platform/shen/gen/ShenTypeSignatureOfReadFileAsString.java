package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfReadFileAsString {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-read-file-as-string");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v729, final Object v730, final Object v731) throws Exception {
return defined(v729, v730, v731);
}};
public static Object defined(final Object v729, final Object v730, final Object v731) throws Exception {
final Object f732 = ShenIncinfs.LAMBDA.apply();






final Object f733 = UnifyBang.LAMBDA.apply(v729, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v730, v731);
final Object f734 = Do.LAMBDA.apply(f732, f733);

    return f734;

}
}
