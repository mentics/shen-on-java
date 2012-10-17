package shen.gen;



import com.mentics.shen.*;

public class UstringLowercaseQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("ustring-lowercase?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6869) throws Exception {
return defined(v6869);
}};
public static Object defined(final Object v6869) throws Exception {

final Object f6895 = UstringInrangeQ.LAMBDA.apply(Integer.valueOf(((String) v6869).charAt(0)), 97, 122);

    return f6895;

}
}
