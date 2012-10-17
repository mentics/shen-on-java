package shen.gen;



import com.mentics.shen.*;

public class UstringUppercaseQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("ustring-uppercase?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6868) throws Exception {
return defined(v6868);
}};
public static Object defined(final Object v6868) throws Exception {

final Object f6894 = UstringInrangeQ.LAMBDA.apply(Integer.valueOf(((String) v6868).charAt(0)), 65, 90);

    return f6894;

}
}
