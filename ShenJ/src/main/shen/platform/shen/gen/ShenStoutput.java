package shen.gen;



import com.mentics.shen.*;

public class ShenStoutput {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-stoutput");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v965) throws Exception {
return defined(v965);
}};
public static Object defined(final Object v965) throws Exception {


    return RuntimeContext.globalProperties.get(RuntimeContext.symbol("*stoutput*"));

}
}
