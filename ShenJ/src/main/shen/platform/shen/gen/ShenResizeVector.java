package shen.gen;



import com.mentics.shen.*;

public class ShenResizeVector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-resize-vector");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1337, final Object v1338, final Object v1339) throws Exception {
return defined(v1337, v1338, v1339);
}};
public static Object defined(final Object v1337, final Object v1338, final Object v1339) throws Exception {



final Object[] a3715 = new Object[((Number)Primitives.plus.apply(1, v1338)).intValue()];



((Object[])a3715)[((Number)0).intValue()] = v1338;
final Object bigVector3714 = a3715;
final Object f3716 = Limit.LAMBDA.apply(v1337);
final Object f3717 = ShenCopyVector.LAMBDA.apply(v1337, bigVector3714, f3716, v1338, v1339);


    return f3717;

}
}
