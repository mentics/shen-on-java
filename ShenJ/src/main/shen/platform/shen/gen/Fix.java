package shen.gen;



import com.mentics.shen.*;

public class Fix {

public static final Symbol SYMBOL = RuntimeContext.symbol("fix");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v802, final Object v803) throws Exception {
return defined(v802, v803);
}};
public static Object defined(final Object v802, final Object v803) throws Exception {
final Object f904 = RuntimeContext.dispatch(v802).apply(v803);
final Object f905 = ShenFixHelp.LAMBDA.apply(v802, v803, f904);

    return f905;

}
}
