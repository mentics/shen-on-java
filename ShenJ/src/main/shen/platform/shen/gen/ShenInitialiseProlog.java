package shen.gen;



import com.mentics.shen.*;

public class ShenInitialiseProlog {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-initialise-prolog");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1540) throws Exception {
return defined(v1540);
}};
public static Object defined(final Object v1540) throws Exception {



final Object f3938 = Vector.LAMBDA.apply(10);
final Object f3939 = ShenFillvector.LAMBDA.apply(f3938, 1, 10, RuntimeContext.symbol("shen--null-"));

((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*prologvectors*")))[((Number)v1540).intValue()] = f3939;
final Object vector3937 = RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*prologvectors*"));




((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*varcounter*")))[((Number)v1540).intValue()] = 1;
final Object counter3940 = RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*varcounter*"));



    return v1540;

}
}
