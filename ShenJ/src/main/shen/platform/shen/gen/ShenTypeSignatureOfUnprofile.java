package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfUnprofile {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-unprofile");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v971, final Object v972, final Object v973) throws Exception {
return defined(v971, v972, v973);
}};
public static Object defined(final Object v971, final Object v972, final Object v973) throws Exception {
final Object f975 = ShenNewpv.LAMBDA.apply(v972);

final Object a974 = f975;
final Object f977 = ShenNewpv.LAMBDA.apply(v972);

final Object b976 = f977;
final Object f978 = ShenIncinfs.LAMBDA.apply();


















final Object f979 = UnifyBang.LAMBDA.apply(v971, new Cons(new Cons(a974, new Cons(RuntimeContext.symbol("-->"), new Cons(b976, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a974, new Cons(RuntimeContext.symbol("-->"), new Cons(b976, Nil.NIL))), Nil.NIL))), v972, v973);
final Object f980 = Do.LAMBDA.apply(f978, f979);



    return f980;

}
}
