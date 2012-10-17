package shen.gen;



import com.mentics.shen.*;

public class ShenTypedfQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-typedf?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v817) throws Exception {
return defined(v817);
}};
public static Object defined(final Object v817) throws Exception {

final Object f2375 = ElementQ.LAMBDA.apply(v817, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*signedfuncs*")));

    return f2375;

}
}
