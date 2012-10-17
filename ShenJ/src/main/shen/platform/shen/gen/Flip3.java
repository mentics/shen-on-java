package shen.gen;



import com.mentics.shen.*;

public class Flip3 {

public static final Symbol SYMBOL = RuntimeContext.symbol("flip3");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6929) throws Exception {
return defined(v6929);
}};
public static Object defined(final Object v6929) throws Exception {
final Lambda l7168 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Lambda l7167 = new Lambda1() {
  public Object apply(final Object y) throws Exception {
    final Lambda l7166 = new Lambda1() {
  public Object apply(final Object z) throws Exception {
    final Object f7165 = RuntimeContext.dispatch(v6929).apply(z, y, x);

    return f7165;
  }
};
    return l7166;
  }
};
    return l7167;
  }
};
    return l7168;

}
}
