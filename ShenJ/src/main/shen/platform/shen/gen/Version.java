package shen.gen;



import com.mentics.shen.*;

public class Version {

public static final Symbol SYMBOL = RuntimeContext.symbol("version");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v568) throws Exception {
return defined(v568);
}};
public static Object defined(final Object v568) throws Exception {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("*version*"), v568);
    return v568;

}
}
