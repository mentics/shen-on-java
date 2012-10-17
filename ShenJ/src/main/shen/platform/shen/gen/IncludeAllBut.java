package shen.gen;



import com.mentics.shen.*;

public class IncludeAllBut {

public static final Symbol SYMBOL = RuntimeContext.symbol("include-all-but");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1643) throws Exception {
return defined(v1643);
}};
public static Object defined(final Object v1643) throws Exception {

final Object f6414 = Difference.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*alldatatypes*")), v1643);
final Object f6415 = Include.LAMBDA.apply(f6414);

    return f6415;

}
}
