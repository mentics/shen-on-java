package shen.gen;



import com.mentics.shen.*;

public class Zustr {

public static final Symbol SYMBOL = RuntimeContext.symbol(">ustr");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v6880, final Object v6881) throws Exception {
return defined(v6880, v6881);
}};
public static Object defined(final Object v6880, final Object v6881) throws Exception {





    return (((Number)(Integer.valueOf(((String) v6880).charAt(0)))).doubleValue() > ((Number)(Integer.valueOf(((String) v6881).charAt(0)))).doubleValue());

}
}
