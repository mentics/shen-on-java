package shen.gen;



import com.mentics.shen.*;

public class Austr {

public static final Symbol SYMBOL = RuntimeContext.symbol("<ustr");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v6876, final Object v6877) throws Exception {
return defined(v6876, v6877);
}};
public static Object defined(final Object v6876, final Object v6877) throws Exception {





    return (((Number)(Integer.valueOf(((String) v6876).charAt(0)))).doubleValue() < ((Number)(Integer.valueOf(((String) v6877).charAt(0)))).doubleValue());

}
}
