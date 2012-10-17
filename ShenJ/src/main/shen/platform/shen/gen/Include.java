package shen.gen;



import com.mentics.shen.*;

public class Include {

public static final Symbol SYMBOL = RuntimeContext.symbol("include");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1641) throws Exception {
return defined(v1641);
}};
public static Object defined(final Object v1641) throws Exception {

final Object f6409 = Intersection.LAMBDA.apply(v1641, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*alldatatypes*")));

final Object validTypes6408 = f6409;

final Object f6411 = Union.LAMBDA.apply(validTypes6408, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*datatypes*")));


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*datatypes*"), f6411);
final Object newDatatypes6410 = f6411;




    return RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*datatypes*"));

}
}
