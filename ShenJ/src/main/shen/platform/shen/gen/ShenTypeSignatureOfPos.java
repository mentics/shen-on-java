package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPos {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-pos");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v641, final Object v642, final Object v643) throws Exception {
return defined(v641, v642, v643);
}};
public static Object defined(final Object v641, final Object v642, final Object v643) throws Exception {
final Object f644 = ShenIncinfs.LAMBDA.apply();












final Object f645 = UnifyBang.LAMBDA.apply(v641, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), v642, v643);
final Object f646 = Do.LAMBDA.apply(f644, f645);

    return f646;

}
}
