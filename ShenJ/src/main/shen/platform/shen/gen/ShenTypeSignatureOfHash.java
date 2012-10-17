package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfHash {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-hash");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4853, final Object v4854, final Object v4855) throws Exception {
return defined(v4853, v4854, v4855);
}};
public static Object defined(final Object v4853, final Object v4854, final Object v4855) throws Exception {
final Object f4857 = ShenNewpv.LAMBDA.apply(v4854);

final Object a4856 = f4857;
final Object f4858 = ShenIncinfs.LAMBDA.apply();












final Object f4859 = UnifyBang.LAMBDA.apply(v4853, new Cons(a4856, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v4854, v4855);
final Object f4860 = Do.LAMBDA.apply(f4858, f4859);


    return f4860;

}
}
