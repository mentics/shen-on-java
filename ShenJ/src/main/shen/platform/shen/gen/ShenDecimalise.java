package shen.gen;



import com.mentics.shen.*;

public class ShenDecimalise {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-decimalise");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1003) throws Exception {
return defined(v1003);
}};
public static Object defined(final Object v1003) throws Exception {
final Object f5140 = ShenDigitsToIntegers.LAMBDA.apply(v1003);
final Object f5141 = Reverse.LAMBDA.apply(f5140);
final Object f5142 = ShenPre.LAMBDA.apply(f5141, 0);

    return f5142;

}
}
