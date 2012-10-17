package shen.gen;



import com.mentics.shen.*;

public class Zeustr {

public static final Symbol SYMBOL = RuntimeContext.symbol(">=ustr");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v6882, final Object v6883) throws Exception {
return defined(v6882, v6883);
}};
public static Object defined(final Object v6882, final Object v6883) throws Exception {





    return (((Number)(Integer.valueOf(((String) v6882).charAt(0)))).doubleValue() >= ((Number)(Integer.valueOf(((String) v6883).charAt(0)))).doubleValue());

}
}
