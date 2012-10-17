package shen.gen;



import com.mentics.shen.*;

public class ShenSysfuncQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-sysfunc?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v387) throws Exception {
return defined(v387);
}};
public static Object defined(final Object v387) throws Exception {

final Object f1313 = ElementQ.LAMBDA.apply(v387, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*system*")));

    return f1313;

}
}
