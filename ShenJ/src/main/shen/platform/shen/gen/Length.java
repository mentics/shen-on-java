package shen.gen;



import com.mentics.shen.*;

public class Length {

public static final Symbol SYMBOL = RuntimeContext.symbol("length");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v887) throws Exception {
return defined(v887);
}};
public static Object defined(final Object v887) throws Exception {
final Object f1044 = ShenLengthH.LAMBDA.apply(v887, 0);

    return f1044;

}
}
