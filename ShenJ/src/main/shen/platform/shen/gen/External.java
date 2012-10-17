package shen.gen;



import com.mentics.shen.*;

public class External {

public static final Symbol SYMBOL = RuntimeContext.symbol("external");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v666) throws Exception {
return defined(v666);
}};
public static Object defined(final Object v666) throws Exception {
Object t659;
try {

final Object f656 = Get.LAMBDA.apply(v666, RuntimeContext.symbol("shen-external-symbols"), RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));

t659 = f656;
} catch (Throwable t) {
final Lambda l658 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    final Object f657 = Interror.LAMBDA.apply("package ~A has not been used.~", Nil.NIL);

    return f657;
  }
};
t659 = l658.apply(t);
}
final Object t660 = t659;

    return t660;

}
}
