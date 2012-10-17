package shen.gen;



import com.mentics.shen.*;

public class Bind {

public static final Symbol SYMBOL = RuntimeContext.symbol("bind");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1479, final Object v1480, final Object v1481, final Object v1482) throws Exception {
return defined(v1479, v1480, v1481, v1482);
}};
public static Object defined(final Object v1479, final Object v1480, final Object v1481, final Object v1482) throws Exception {
final Object f3849 = ShenBindv.LAMBDA.apply(v1479, v1480, v1481);
final Object f3851 = Thaw.LAMBDA.apply(v1482);

final Object result3850 = f3851;
final Object f3852 = ShenUnbindv.LAMBDA.apply(v1479, v1481);
final Object f3853 = Do.LAMBDA.apply(f3852, result3850);

final Object f3854 = Do.LAMBDA.apply(f3849, f3853);

    return f3854;

}
}
