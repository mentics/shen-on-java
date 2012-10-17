package shen.gen;



import com.mentics.shen.*;

public class Normal_form {

public static final Symbol SYMBOL = RuntimeContext.symbol("normal_form");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v86) throws Exception {
return defined(v86);
}};
public static Object defined(final Object v86) throws Exception {
final Object f87 = Fix.LAMBDA.apply(RuntimeContext.symbol("==>"), v86);

    return f87;

}
}
