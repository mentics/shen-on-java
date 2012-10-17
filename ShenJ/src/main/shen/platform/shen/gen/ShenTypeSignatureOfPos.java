package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPos {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-pos");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5099, final Object v5100, final Object v5101) throws Exception {
return defined(v5099, v5100, v5101);
}};
public static Object defined(final Object v5099, final Object v5100, final Object v5101) throws Exception {
final Object f5102 = ShenIncinfs.LAMBDA.apply();












final Object f5103 = UnifyBang.LAMBDA.apply(v5099, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), v5100, v5101);
final Object f5104 = Do.LAMBDA.apply(f5102, f5103);

    return f5104;

}
}
