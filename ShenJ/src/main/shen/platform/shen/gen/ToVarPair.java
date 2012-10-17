package shen.gen;



import com.mentics.shen.*;

public class ToVarPair {

public static final Symbol SYMBOL = RuntimeContext.symbol("to-var-pair");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7241) throws Exception {
return defined(v7241);
}};
public static Object defined(final Object v7241) throws Exception {
final Object f7334 = ToVar.LAMBDA.apply(v7241);
final Object f7335 = Atp.LAMBDA.apply(v7241, f7334);

    return f7335;

}
}
