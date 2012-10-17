package shen.gen;



import com.mentics.shen.*;

public class ListToString {

public static final Symbol SYMBOL = RuntimeContext.symbol("list->string");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6962) throws Exception {
return defined(v6962);
}};
public static Object defined(final Object v6962) throws Exception {
final Lambda l7218 = new Lambda1() {
  public Object apply(final Object acc) throws Exception {
    final Lambda l7217 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    


    return ((String)acc + (String)x);
  }
};
    return l7217;
  }
};final Object f7219 = Foldl.LAMBDA.apply(l7218, "", v6962);

    return f7219;

}
}
