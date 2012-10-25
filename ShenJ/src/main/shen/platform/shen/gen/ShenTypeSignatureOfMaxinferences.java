package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfMaxinferences {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-maxinferences");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v551, final Object v552, final Object v553) throws Exception {
return defined(v551, v552, v553);
}};
public static Object defined(final Object v551, final Object v552, final Object v553) throws Exception {
final Object f554 = ShenIncinfs.LAMBDA.apply();






final Object f555 = UnifyBang.LAMBDA.apply(v551, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v552, v553);
final Object f556 = Do.LAMBDA.apply(f554, f555);

    return f556;

}
}
