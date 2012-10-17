package shen.gen;



import com.mentics.shen.*;

public class ShenSymbolByteToString {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-symbol-byte->string");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1019) throws Exception {
return defined(v1019);
}};
public static Object defined(final Object v1019) throws Exception {




    return ((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*symbolcodes*")))[((Number)v1019).intValue()];

}
}
