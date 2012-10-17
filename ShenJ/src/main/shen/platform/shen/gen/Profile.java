package shen.gen;



import com.mentics.shen.*;

public class Profile {

public static final Symbol SYMBOL = RuntimeContext.symbol("profile");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1154) throws Exception {
return defined(v1154);
}};
public static Object defined(final Object v1154) throws Exception {
final Object f6823 = Ps.LAMBDA.apply(v1154);
final Object f6824 = ShenProfileHelp.LAMBDA.apply(f6823);

    return f6824;

}
}
