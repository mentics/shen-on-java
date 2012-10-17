package shen.gen;



import com.mentics.shen.*;

public class ShenSpecialQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-special?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v764) throws Exception {
return defined(v764);
}};
public static Object defined(final Object v764) throws Exception {

final Object f45 = ElementQ.LAMBDA.apply(v764, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*special*")));

    return f45;

}
}
