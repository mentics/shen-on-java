package shen.gen;



import com.mentics.shen.*;

public class MethodSig {

public static final Symbol SYMBOL = RuntimeContext.symbol("method-sig");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1159) throws Exception {
return defined(v1159);
}};
public static Object defined(final Object v1159) throws Exception {
final Lambda l1161 = new Lambda1() {
  public Object apply(final Object s1160) throws Exception {
    


    return ((String)"final Object " + (String)s1160);
  }
};final Object f1162 = Map.LAMBDA.apply(l1161, v1159);
final Object f1163 = StringJoin.LAMBDA.apply(", ", f1162);

    return f1163;

}
}
