package shen.gen;



import com.mentics.shen.*;

public class ToVarPair {

public static final Symbol SYMBOL = RuntimeContext.symbol("to-var-pair");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1176) throws Exception {
return defined(v1176);
}};
public static Object defined(final Object v1176) throws Exception {
final Object f1177 = ToVar.LAMBDA.apply(v1176);
final Object f1178 = Atp.LAMBDA.apply(v1176, f1177);

    return f1178;

}
}
