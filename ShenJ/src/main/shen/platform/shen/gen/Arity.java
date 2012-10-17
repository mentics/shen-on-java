package shen.gen;



import com.mentics.shen.*;

public class Arity {

public static final Symbol SYMBOL = RuntimeContext.symbol("arity");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1542) throws Exception {
return defined(v1542);
}};
public static Object defined(final Object v1542) throws Exception {
Object t4179;
try {

final Object f4177 = Get.LAMBDA.apply(v1542, RuntimeContext.symbol("arity"), RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));

t4179 = f4177;
} catch (Throwable t) {
final Lambda l4178 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return -1;
  }
};
t4179 = l4178.apply(t);
}
final Object t4180 = t4179;

    return t4180;

}
}
