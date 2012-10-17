package shen.gen;



import com.mentics.shen.*;

public class ShenMeasureTOxDOreturn {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-measure&return");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1383, final Object v1384, final Object v1385) throws Exception {
return defined(v1383, v1384, v1385);
}};
public static Object defined(final Object v1383, final Object v1384, final Object v1385) throws Exception {

final Object f3754 = Atp.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*infs*")), Nil.NIL);
final Object f3755 = Intoutput.LAMBDA.apply("~A inferences~%", f3754);
final Object f3756 = ShenDeref.LAMBDA.apply(v1383, v1384);
final Object f3757 = Do.LAMBDA.apply(f3755, f3756);

    return f3757;

}
}
