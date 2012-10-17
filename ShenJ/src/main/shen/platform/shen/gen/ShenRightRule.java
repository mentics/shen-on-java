package shen.gen;



import com.mentics.shen.*;

public class ShenRightRule {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-right-rule");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1583) throws Exception {
return defined(v1583);
}};
public static Object defined(final Object v1583) throws Exception {
final Object f6238 = Atp.LAMBDA.apply(RuntimeContext.symbol("shen-single"), v1583);

    return f6238;

}
}
