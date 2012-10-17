package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfReadFileAsString {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-read-file-as-string");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5187, final Object v5188, final Object v5189) throws Exception {
return defined(v5187, v5188, v5189);
}};
public static Object defined(final Object v5187, final Object v5188, final Object v5189) throws Exception {
final Object f5190 = ShenIncinfs.LAMBDA.apply();






final Object f5191 = UnifyBang.LAMBDA.apply(v5187, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v5188, v5189);
final Object f5192 = Do.LAMBDA.apply(f5190, f5191);

    return f5192;

}
}
