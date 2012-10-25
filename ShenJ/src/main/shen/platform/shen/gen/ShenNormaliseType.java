package shen.gen;



import com.mentics.shen.*;

public class ShenNormaliseType {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-normalise-type");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1683) throws Exception {
return defined(v1683);
}};
public static Object defined(final Object v1683) throws Exception {
final Lambda l32 = new Lambda1() {
  public Object apply(final Object v1684) throws Exception {
    final Object f31 = ShenNormaliseTypeHelp.LAMBDA.apply(v1684);

    return f31;
  }
};final Object f33 = Fix.LAMBDA.apply(l32, v1683);

    return f33;

}
}
