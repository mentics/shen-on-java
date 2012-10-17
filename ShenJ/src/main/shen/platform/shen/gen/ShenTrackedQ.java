package shen.gen;



import com.mentics.shen.*;

public class ShenTrackedQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-tracked?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1124) throws Exception {
return defined(v1124);
}};
public static Object defined(final Object v1124) throws Exception {

final Object f6752 = ElementQ.LAMBDA.apply(v1124, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*tracking*")));

    return f6752;

}
}
