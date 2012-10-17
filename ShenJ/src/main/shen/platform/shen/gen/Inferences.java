package shen.gen;



import com.mentics.shen.*;

public class Inferences {

public static final Symbol SYMBOL = RuntimeContext.symbol("inferences");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v954) throws Exception {
return defined(v954);
}};
public static Object defined(final Object v954) throws Exception {


    return RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*infs*"));

}
}
