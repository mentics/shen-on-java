package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSlash {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-/");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5553, final Object v5554, final Object v5555) throws Exception {
return defined(v5553, v5554, v5555);
}};
public static Object defined(final Object v5553, final Object v5554, final Object v5555) throws Exception {
final Object f5556 = ShenIncinfs.LAMBDA.apply();












final Object f5557 = UnifyBang.LAMBDA.apply(v5553, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v5554, v5555);
final Object f5558 = Do.LAMBDA.apply(f5556, f5557);

    return f5558;

}
}
