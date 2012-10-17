package shen.gen;



import com.mentics.shen.*;

public class Untrack {

public static final Symbol SYMBOL = RuntimeContext.symbol("untrack");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1153) throws Exception {
return defined(v1153);
}};
public static Object defined(final Object v1153) throws Exception {
final Object f6821 = Ps.LAMBDA.apply(v1153);
final Object f6822 = Eval.LAMBDA.apply(f6821);

    return f6822;

}
}
