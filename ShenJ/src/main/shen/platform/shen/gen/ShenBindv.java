package shen.gen;



import com.mentics.shen.*;

public class ShenBindv {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-bindv");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1361, final Object v1362, final Object v1363) throws Exception {
return defined(v1361, v1362, v1363);
}};
public static Object defined(final Object v1361, final Object v1362, final Object v1363) throws Exception {




final Object vector3729 = ((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*prologvectors*")))[((Number)v1363).intValue()];





((Object[])vector3729)[((Number)((Object[])v1361)[((Number)1).intValue()]).intValue()] = v1362;

    return vector3729;

}
}
