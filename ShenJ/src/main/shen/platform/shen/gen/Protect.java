package shen.gen;



import com.mentics.shen.*;

public class Protect {

public static final Symbol SYMBOL = RuntimeContext.symbol("protect");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v960) throws Exception {
return defined(v960);
}};
public static Object defined(final Object v960) throws Exception {

    return v960;

}
}
