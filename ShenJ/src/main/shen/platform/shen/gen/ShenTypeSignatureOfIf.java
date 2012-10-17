package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIf {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-if");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4891, final Object v4892, final Object v4893) throws Exception {
return defined(v4891, v4892, v4893);
}};
public static Object defined(final Object v4891, final Object v4892, final Object v4893) throws Exception {
final Object f4895 = ShenNewpv.LAMBDA.apply(v4892);

final Object a4894 = f4895;
final Object f4896 = ShenIncinfs.LAMBDA.apply();


















final Object f4897 = UnifyBang.LAMBDA.apply(v4891, new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a4894, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a4894, new Cons(RuntimeContext.symbol("-->"), new Cons(a4894, Nil.NIL))), Nil.NIL))), Nil.NIL))), v4892, v4893);
final Object f4898 = Do.LAMBDA.apply(f4896, f4897);


    return f4898;

}
}
