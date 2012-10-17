package shen.gen;



import com.mentics.shen.*;

public class Hdstr {

public static final Symbol SYMBOL = RuntimeContext.symbol("hdstr");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v855) throws Exception {
return defined(v855);
}};
public static Object defined(final Object v855) throws Exception {



    return ((String)v855).substring(((Number)0).intValue(), ((Number)0).intValue()+1);

}
}
