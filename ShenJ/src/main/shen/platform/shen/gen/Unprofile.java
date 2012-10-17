package shen.gen;



import com.mentics.shen.*;

public class Unprofile {

public static final Symbol SYMBOL = RuntimeContext.symbol("unprofile");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1160) throws Exception {
return defined(v1160);
}};
public static Object defined(final Object v1160) throws Exception {
final Object f6848 = Untrack.LAMBDA.apply(v1160);

    return f6848;

}
}
