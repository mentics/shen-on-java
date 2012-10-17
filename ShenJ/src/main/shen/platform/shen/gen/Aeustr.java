package shen.gen;



import com.mentics.shen.*;

public class Aeustr {

public static final Symbol SYMBOL = RuntimeContext.symbol("<=ustr");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v6878, final Object v6879) throws Exception {
return defined(v6878, v6879);
}};
public static Object defined(final Object v6878, final Object v6879) throws Exception {





    return (((Number)(Integer.valueOf(((String) v6878).charAt(0)))).doubleValue() <= ((Number)(Integer.valueOf(((String) v6879).charAt(0)))).doubleValue());

}
}
