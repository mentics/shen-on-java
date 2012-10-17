package shen.gen;



import com.mentics.shen.*;

public class DigitQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("digit?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6866) throws Exception {
return defined(v6866);
}};
public static Object defined(final Object v6866) throws Exception {

final Object f6889 = UstringInrangeQ.LAMBDA.apply(Integer.valueOf(((String) v6866).charAt(0)), 48, 57);

    return f6889;

}
}
