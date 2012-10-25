package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfZEqual {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of->=");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1061, final Object v1062, final Object v1063) throws Exception {
return defined(v1061, v1062, v1063);
}};
public static Object defined(final Object v1061, final Object v1062, final Object v1063) throws Exception {
final Object f1064 = ShenIncinfs.LAMBDA.apply();












final Object f1065 = UnifyBang.LAMBDA.apply(v1061, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v1062, v1063);
final Object f1066 = Do.LAMBDA.apply(f1064, f1065);

    return f1066;

}
}
