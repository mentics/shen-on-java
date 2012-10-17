package shen.gen;



import com.mentics.shen.*;

public class ShenGetProfile {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-get-profile");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1165) throws Exception {
return defined(v1165);
}};
public static Object defined(final Object v1165) throws Exception {
Object t6856;
try {

final Object f6854 = Get.LAMBDA.apply(v1165, RuntimeContext.symbol("profile"), RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));

t6856 = f6854;
} catch (Throwable t) {
final Lambda l6855 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return 0;
  }
};
t6856 = l6855.apply(t);
}
final Object t6857 = t6856;

    return t6857;

}
}
