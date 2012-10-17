package shen.gen;



import com.mentics.shen.*;

public class Flip {

public static final Symbol SYMBOL = RuntimeContext.symbol("flip");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6928) throws Exception {
return defined(v6928);
}};
public static Object defined(final Object v6928) throws Exception {
final Lambda l7164 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Lambda l7163 = new Lambda1() {
  public Object apply(final Object y) throws Exception {
    final Object f7162 = RuntimeContext.dispatch(v6928).apply(y, x);

    return f7162;
  }
};
    return l7163;
  }
};
    return l7164;

}
}
