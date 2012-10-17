package shen.gen;



import com.mentics.shen.*;

public class Stinput {

public static final Symbol SYMBOL = RuntimeContext.symbol("stinput");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v710) throws Exception {
return defined(v710);
}};
public static Object defined(final Object v710) throws Exception {


    return RuntimeContext.globalProperties.get(RuntimeContext.symbol("*stinput*"));

}
}
