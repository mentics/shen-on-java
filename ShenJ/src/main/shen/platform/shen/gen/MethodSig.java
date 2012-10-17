package shen.gen;



import com.mentics.shen.*;

public class MethodSig {

public static final Symbol SYMBOL = RuntimeContext.symbol("method-sig");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7236) throws Exception {
return defined(v7236);
}};
public static Object defined(final Object v7236) throws Exception {
final Lambda l7323 = new Lambda1() {
  public Object apply(final Object s7322) throws Exception {
    


    return ((String)"final Object " + (String)s7322);
  }
};final Object f7324 = Map.LAMBDA.apply(l7323, v7236);
final Object f7325 = StringJoin.LAMBDA.apply(", ", f7324);

    return f7325;

}
}
