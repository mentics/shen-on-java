package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfWriteToFile {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-write-to-file");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5485, final Object v5486, final Object v5487) throws Exception {
return defined(v5485, v5486, v5487);
}};
public static Object defined(final Object v5485, final Object v5486, final Object v5487) throws Exception {
final Object f5489 = ShenNewpv.LAMBDA.apply(v5486);

final Object a5488 = f5489;
final Object f5490 = ShenIncinfs.LAMBDA.apply();












final Object f5491 = UnifyBang.LAMBDA.apply(v5485, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a5488, new Cons(RuntimeContext.symbol("-->"), new Cons(a5488, Nil.NIL))), Nil.NIL))), v5486, v5487);
final Object f5492 = Do.LAMBDA.apply(f5490, f5491);


    return f5492;

}
}
