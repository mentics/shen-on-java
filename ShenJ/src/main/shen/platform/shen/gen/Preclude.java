package shen.gen;



import com.mentics.shen.*;

public class Preclude {

public static final Symbol SYMBOL = RuntimeContext.symbol("preclude");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1640) throws Exception {
return defined(v1640);
}};
public static Object defined(final Object v1640) throws Exception {

final Object f6407 = Difference.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*datatypes*")), v1640);


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*datatypes*"), f6407);
final Object filterDatatypes6406 = f6407;



    return RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*datatypes*"));

}
}
