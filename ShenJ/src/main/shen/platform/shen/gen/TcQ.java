package shen.gen;



import com.mentics.shen.*;

public class TcQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("tc?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v702) throws Exception {
return defined(v702);
}};
public static Object defined(final Object v702) throws Exception {


    return RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*tc*"));

}
}
