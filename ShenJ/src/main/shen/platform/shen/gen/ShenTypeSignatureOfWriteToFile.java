package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfWriteToFile {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-write-to-file");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1027, final Object v1028, final Object v1029) throws Exception {
return defined(v1027, v1028, v1029);
}};
public static Object defined(final Object v1027, final Object v1028, final Object v1029) throws Exception {
final Object f1031 = ShenNewpv.LAMBDA.apply(v1028);

final Object a1030 = f1031;
final Object f1032 = ShenIncinfs.LAMBDA.apply();












final Object f1033 = UnifyBang.LAMBDA.apply(v1027, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a1030, new Cons(RuntimeContext.symbol("-->"), new Cons(a1030, Nil.NIL))), Nil.NIL))), v1028, v1029);
final Object f1034 = Do.LAMBDA.apply(f1032, f1033);


    return f1034;

}
}
