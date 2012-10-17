package shen.gen;



import com.mentics.shen.*;

public class ShenExtraspecialQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-extraspecial?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v765) throws Exception {
return defined(v765);
}};
public static Object defined(final Object v765) throws Exception {

final Object f46 = ElementQ.LAMBDA.apply(v765, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*extraspecial*")));

    return f46;

}
}
