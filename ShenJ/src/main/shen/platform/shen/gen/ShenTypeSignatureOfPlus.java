package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPlus {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-+");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1087, final Object v1088, final Object v1089) throws Exception {
return defined(v1087, v1088, v1089);
}};
public static Object defined(final Object v1087, final Object v1088, final Object v1089) throws Exception {
final Object f1090 = ShenIncinfs.LAMBDA.apply();












final Object f1091 = UnifyBang.LAMBDA.apply(v1087, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v1088, v1089);
final Object f1092 = Do.LAMBDA.apply(f1090, f1091);

    return f1092;

}
}
