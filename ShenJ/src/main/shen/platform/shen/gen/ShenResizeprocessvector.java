package shen.gen;



import com.mentics.shen.*;

public class ShenResizeprocessvector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-resizeprocessvector");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1335, final Object v1336) throws Exception {
return defined(v1335, v1336);
}};
public static Object defined(final Object v1335, final Object v1336) throws Exception {




final Object vector3711 = ((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*prologvectors*")))[((Number)v1335).intValue()];


final Object f3713 = ShenResizeVector.LAMBDA.apply(vector3711, Primitives.plus.apply(v1336, v1336), RuntimeContext.symbol("shen--null-"));

final Object bigVector3712 = f3713;




((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*prologvectors*")))[((Number)v1335).intValue()] = bigVector3712;


    return RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*prologvectors*"));

}
}
