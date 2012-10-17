package shen.gen;



import com.mentics.shen.*;

public class PrecludeAllBut {

public static final Symbol SYMBOL = RuntimeContext.symbol("preclude-all-but");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1642) throws Exception {
return defined(v1642);
}};
public static Object defined(final Object v1642) throws Exception {

final Object f6412 = Difference.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*alldatatypes*")), v1642);
final Object f6413 = Preclude.LAMBDA.apply(f6412);

    return f6413;

}
}
