package shen.gen;



import com.mentics.shen.*;

public class ShenVariancyTest {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-variancy-test");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1688, final Object v1689) throws Exception {
return defined(v1688, v1689);
}};
public static Object defined(final Object v1688, final Object v1689) throws Exception {
final Object f46 = ShenTypecheck.LAMBDA.apply(v1688, RuntimeContext.symbol("B"));

final Object typeF45 = f46;

final Object i52;
if ((boolean)Lang.equals(RuntimeContext.symbol("symbol"), typeF45)) {

i52 = RuntimeContext.symbol("shen-skip");
} else {
final Object f48 = ShenVariantQ.LAMBDA.apply(typeF45, v1689);

final Object i51;
if ((boolean)f48) {

i51 = RuntimeContext.symbol("shen-skip");
} else {
final Object f49 = Atp.LAMBDA.apply(v1688, Nil.NIL);
final Object f50 = Intoutput.LAMBDA.apply("warning: changing the type of ~A may create errors~%", f49);

i51 = f50;

}
i52 = i51;

}
final Object check47 = i52;



    return RuntimeContext.symbol("shen-skip");

}
}
