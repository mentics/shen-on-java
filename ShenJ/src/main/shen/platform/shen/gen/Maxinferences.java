package shen.gen;



import com.mentics.shen.*;

public class Maxinferences {

public static final Symbol SYMBOL = RuntimeContext.symbol("maxinferences");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v949) throws Exception {
return defined(v949);
}};
public static Object defined(final Object v949) throws Exception {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*maxinferences*"), v949);
    return v949;

}
}
