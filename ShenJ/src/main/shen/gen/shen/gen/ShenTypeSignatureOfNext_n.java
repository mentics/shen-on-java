package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNext_n {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-next_n");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1054, final Object v1055, final Object v1056) throws Exception {
return defined(v1054, v1055, v1056);
}};
public static Object defined(final Object v1054, final Object v1055, final Object v1056) throws Exception {
final Object f1057 = ShenIncinfs.LAMBDA.apply();




















final Object f1058 = UnifyBang.LAMBDA.apply(v1054, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), Nil.NIL))), Nil.NIL))), v1055, v1056);
final Object f1059 = Do.LAMBDA.apply(f1057, f1058);

    return f1059;

}
}
