package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPlus {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-+");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5545, final Object v5546, final Object v5547) throws Exception {
return defined(v5545, v5546, v5547);
}};
public static Object defined(final Object v5545, final Object v5546, final Object v5547) throws Exception {
final Object f5548 = ShenIncinfs.LAMBDA.apply();












final Object f5549 = UnifyBang.LAMBDA.apply(v5545, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v5546, v5547);
final Object f5550 = Do.LAMBDA.apply(f5548, f5549);

    return f5550;

}
}
