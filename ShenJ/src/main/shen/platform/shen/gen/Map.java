package shen.gen;



import com.mentics.shen.*;

public class Map {

public static final Symbol SYMBOL = RuntimeContext.symbol("map");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v880, final Object v881) throws Exception {
return defined(v880, v881);
}};
public static Object defined(final Object v880, final Object v881) throws Exception {
final Object f1036 = ShenMapH.LAMBDA.apply(v880, v881, Nil.NIL);

    return f1036;

}
}
