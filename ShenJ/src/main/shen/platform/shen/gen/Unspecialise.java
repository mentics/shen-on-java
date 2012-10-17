package shen.gen;



import com.mentics.shen.*;

public class Unspecialise {

public static final Symbol SYMBOL = RuntimeContext.symbol("unspecialise");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1548) throws Exception {
return defined(v1548);
}};
public static Object defined(final Object v1548) throws Exception {

final Object f4189 = Remove.LAMBDA.apply(v1548, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*special*")));


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*special*"), f4189);final Object f4190 = Do.LAMBDA.apply(f4189, v1548);

    return f4190;

}
}
