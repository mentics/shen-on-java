package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfFormat {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-format");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4775, final Object v4776, final Object v4777) throws Exception {
return defined(v4775, v4776, v4777);
}};
public static Object defined(final Object v4775, final Object v4776, final Object v4777) throws Exception {
final Object f4779 = ShenNewpv.LAMBDA.apply(v4776);

final Object a4778 = f4779;
final Object f4780 = ShenIncinfs.LAMBDA.apply();






















final Object f4781 = UnifyBang.LAMBDA.apply(v4775, new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(RuntimeContext.symbol("out"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a4778, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), Nil.NIL))), v4776, v4777);
final Object f4782 = Do.LAMBDA.apply(f4780, f4781);


    return f4782;

}
}
