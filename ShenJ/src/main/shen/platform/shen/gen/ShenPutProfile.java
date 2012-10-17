package shen.gen;



import com.mentics.shen.*;

public class ShenPutProfile {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-put-profile");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1166, final Object v1167) throws Exception {
return defined(v1166, v1167);
}};
public static Object defined(final Object v1166, final Object v1167) throws Exception {

final Object f6858 = Put.LAMBDA.apply(v1166, RuntimeContext.symbol("profile"), v1167, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));

    return f6858;

}
}
