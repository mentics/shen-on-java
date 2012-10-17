package shen.gen;



import com.mentics.shen.*;

public class ShenVariancyTest {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-variancy-test");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1688, final Object v1689) throws Exception {
return defined(v1688, v1689);
}};
public static Object defined(final Object v1688, final Object v1689) throws Exception {
final Object f4504 = ShenTypecheck.LAMBDA.apply(v1688, RuntimeContext.symbol("B"));

final Object typeF4503 = f4504;

final Object i4510;
if ((boolean)Lang.equals(RuntimeContext.symbol("symbol"), typeF4503)) {

i4510 = RuntimeContext.symbol("shen-skip");
} else {
final Object f4506 = ShenVariantQ.LAMBDA.apply(typeF4503, v1689);

final Object i4509;
if ((boolean)f4506) {

i4509 = RuntimeContext.symbol("shen-skip");
} else {
final Object f4507 = Atp.LAMBDA.apply(v1688, Nil.NIL);
final Object f4508 = Intoutput.LAMBDA.apply("warning: changing the type of ~A may create errors~%", f4507);

i4509 = f4508;

}
i4510 = i4509;

}
final Object check4505 = i4510;



    return RuntimeContext.symbol("shen-skip");

}
}
