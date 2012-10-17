package shen.gen;



import com.mentics.shen.*;

public class Return {

public static final Symbol SYMBOL = RuntimeContext.symbol("return");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1376, final Object v1377, final Object v1378) throws Exception {
return defined(v1376, v1377, v1378);
}};
public static Object defined(final Object v1376, final Object v1377, final Object v1378) throws Exception {
final Object f3753 = ShenDeref.LAMBDA.apply(v1376, v1377);

    return f3753;

}
}
