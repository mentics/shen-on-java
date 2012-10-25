package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIntmakeString {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-intmake-string");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v517, final Object v518, final Object v519) throws Exception {
return defined(v517, v518, v519);
}};
public static Object defined(final Object v517, final Object v518, final Object v519) throws Exception {
final Object f521 = ShenNewpv.LAMBDA.apply(v518);

final Object a520 = f521;
final Object f522 = ShenIncinfs.LAMBDA.apply();












final Object f523 = UnifyBang.LAMBDA.apply(v517, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a520, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), v518, v519);
final Object f524 = Do.LAMBDA.apply(f522, f523);


    return f524;

}
}
