package shen.gen;



import com.mentics.shen.*;

public class Snd {

public static final Symbol SYMBOL = RuntimeContext.symbol("snd");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v741) throws Exception {
return defined(v741);
}};
public static Object defined(final Object v741) throws Exception {



    return ((Object[])v741)[((Number)2).intValue()];

}
}
