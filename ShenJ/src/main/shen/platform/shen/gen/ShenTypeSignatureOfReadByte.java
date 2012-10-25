package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfReadByte {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-read-byte");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v713, final Object v714, final Object v715) throws Exception {
return defined(v713, v714, v715);
}};
public static Object defined(final Object v713, final Object v714, final Object v715) throws Exception {
final Object f716 = ShenIncinfs.LAMBDA.apply();










final Object f717 = UnifyBang.LAMBDA.apply(v713, new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(RuntimeContext.symbol("in"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v714, v715);
final Object f718 = Do.LAMBDA.apply(f716, f717);

    return f718;

}
}
