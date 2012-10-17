package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfReadFileAsBytelist {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-read-file-as-bytelist");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5179, final Object v5180, final Object v5181) throws Exception {
return defined(v5179, v5180, v5181);
}};
public static Object defined(final Object v5179, final Object v5180, final Object v5181) throws Exception {
final Object f5182 = ShenIncinfs.LAMBDA.apply();










final Object f5183 = UnifyBang.LAMBDA.apply(v5179, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), Nil.NIL))), v5180, v5181);
final Object f5184 = Do.LAMBDA.apply(f5182, f5183);

    return f5184;

}
}
