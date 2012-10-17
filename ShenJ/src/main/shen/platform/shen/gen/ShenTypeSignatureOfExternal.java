package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfExternal {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-external");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4719, final Object v4720, final Object v4721) throws Exception {
return defined(v4719, v4720, v4721);
}};
public static Object defined(final Object v4719, final Object v4720, final Object v4721) throws Exception {
final Object f4722 = ShenIncinfs.LAMBDA.apply();










final Object f4723 = UnifyBang.LAMBDA.apply(v4719, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v4720, v4721);
final Object f4724 = Do.LAMBDA.apply(f4722, f4723);

    return f4724;

}
}
