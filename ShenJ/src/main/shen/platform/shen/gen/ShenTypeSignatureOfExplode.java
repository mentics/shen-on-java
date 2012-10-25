package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfExplode {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-explode");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v289, final Object v290, final Object v291) throws Exception {
return defined(v289, v290, v291);
}};
public static Object defined(final Object v289, final Object v290, final Object v291) throws Exception {
final Object f293 = ShenNewpv.LAMBDA.apply(v290);

final Object a292 = f293;
final Object f294 = ShenIncinfs.LAMBDA.apply();










final Object f295 = UnifyBang.LAMBDA.apply(v289, new Cons(a292, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("string"), Nil.NIL)), Nil.NIL))), v290, v291);
final Object f296 = Do.LAMBDA.apply(f294, f295);


    return f296;

}
}
