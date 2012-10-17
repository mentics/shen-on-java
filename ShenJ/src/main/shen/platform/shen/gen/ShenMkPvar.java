package shen.gen;



import com.mentics.shen.*;

public class ShenMkPvar {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-mk-pvar");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1359) throws Exception {
return defined(v1359);
}};
public static Object defined(final Object v1359) throws Exception {

final Object[] a3726 = new Object[((Number)2).intValue()];



((Object[])a3726)[((Number)0).intValue()] = RuntimeContext.symbol("shen-pvar");


((Object[])a3726)[((Number)1).intValue()] = v1359;
    return a3726;

}
}
