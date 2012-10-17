package shen.gen;



import com.mentics.shen.*;

public class Limit {

public static final Symbol SYMBOL = RuntimeContext.symbol("limit");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v725) throws Exception {
return defined(v725);
}};
public static Object defined(final Object v725) throws Exception {



    return ((Object[])v725)[((Number)0).intValue()];

}
}
