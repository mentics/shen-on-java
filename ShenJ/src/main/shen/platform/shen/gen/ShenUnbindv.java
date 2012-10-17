package shen.gen;



import com.mentics.shen.*;

public class ShenUnbindv {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-unbindv");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1364, final Object v1365) throws Exception {
return defined(v1364, v1365);
}};
public static Object defined(final Object v1364, final Object v1365) throws Exception {




final Object vector3730 = ((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*prologvectors*")))[((Number)v1365).intValue()];





((Object[])vector3730)[((Number)((Object[])v1364)[((Number)1).intValue()]).intValue()] = RuntimeContext.symbol("shen--null-");

    return vector3730;

}
}
