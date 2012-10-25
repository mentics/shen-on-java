package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfVector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-vector");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v377, final Object v378, final Object v379) throws Exception {
return defined(v377, v378, v379);
}};
public static Object defined(final Object v377, final Object v378, final Object v379) throws Exception {
final Object f381 = ShenNewpv.LAMBDA.apply(v378);

final Object a380 = f381;
final Object f382 = ShenIncinfs.LAMBDA.apply();










final Object f383 = UnifyBang.LAMBDA.apply(v377, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a380, Nil.NIL)), Nil.NIL))), v378, v379);
final Object f384 = Do.LAMBDA.apply(f382, f383);


    return f384;

}
}
