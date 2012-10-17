package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAEqual {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-<=");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5527, final Object v5528, final Object v5529) throws Exception {
return defined(v5527, v5528, v5529);
}};
public static Object defined(final Object v5527, final Object v5528, final Object v5529) throws Exception {
final Object f5530 = ShenIncinfs.LAMBDA.apply();












final Object f5531 = UnifyBang.LAMBDA.apply(v5527, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v5528, v5529);
final Object f5532 = Do.LAMBDA.apply(f5530, f5531);

    return f5532;

}
}
