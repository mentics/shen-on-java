package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfA {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-<");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5511, final Object v5512, final Object v5513) throws Exception {
return defined(v5511, v5512, v5513);
}};
public static Object defined(final Object v5511, final Object v5512, final Object v5513) throws Exception {
final Object f5514 = ShenIncinfs.LAMBDA.apply();












final Object f5515 = UnifyBang.LAMBDA.apply(v5511, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v5512, v5513);
final Object f5516 = Do.LAMBDA.apply(f5514, f5515);

    return f5516;

}
}
