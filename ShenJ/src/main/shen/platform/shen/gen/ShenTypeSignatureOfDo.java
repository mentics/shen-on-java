package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfDo {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-do");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v229, final Object v230, final Object v231) throws Exception {
return defined(v229, v230, v231);
}};
public static Object defined(final Object v229, final Object v230, final Object v231) throws Exception {
final Object f233 = ShenNewpv.LAMBDA.apply(v230);

final Object a232 = f233;
final Object f235 = ShenNewpv.LAMBDA.apply(v230);

final Object b234 = f235;
final Object f236 = ShenIncinfs.LAMBDA.apply();












final Object f237 = UnifyBang.LAMBDA.apply(v229, new Cons(a232, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(b234, new Cons(RuntimeContext.symbol("-->"), new Cons(b234, Nil.NIL))), Nil.NIL))), v230, v231);
final Object f238 = Do.LAMBDA.apply(f236, f237);



    return f238;

}
}
