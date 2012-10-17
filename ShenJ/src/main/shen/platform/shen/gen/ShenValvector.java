package shen.gen;



import com.mentics.shen.*;

public class ShenValvector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-valvector");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1415, final Object v1416) throws Exception {
return defined(v1415, v1416);
}};
public static Object defined(final Object v1415, final Object v1416) throws Exception {








    return ((Object[])((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*prologvectors*")))[((Number)v1416).intValue()])[((Number)((Object[])v1415)[((Number)1).intValue()]).intValue()];

}
}
