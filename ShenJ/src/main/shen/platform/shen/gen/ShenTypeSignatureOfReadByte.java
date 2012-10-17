package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfReadByte {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-read-byte");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5171, final Object v5172, final Object v5173) throws Exception {
return defined(v5171, v5172, v5173);
}};
public static Object defined(final Object v5171, final Object v5172, final Object v5173) throws Exception {
final Object f5174 = ShenIncinfs.LAMBDA.apply();










final Object f5175 = UnifyBang.LAMBDA.apply(v5171, new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(RuntimeContext.symbol("in"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v5172, v5173);
final Object f5176 = Do.LAMBDA.apply(f5174, f5175);

    return f5176;

}
}
