package shen.gen;



import com.mentics.shen.*;

public class Ps {

public static final Symbol SYMBOL = RuntimeContext.symbol("ps");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v703) throws Exception {
return defined(v703);
}};
public static Object defined(final Object v703) throws Exception {
Object t719;
try {

final Object f715 = Get.LAMBDA.apply(v703, RuntimeContext.symbol("shen-source"), RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));

t719 = f715;
} catch (Throwable t) {
final Lambda l718 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    final Object f716 = Atp.LAMBDA.apply(v703, Nil.NIL);
final Object f717 = Interror.LAMBDA.apply("~A not found.~%", f716);

    return f717;
  }
};
t719 = l718.apply(t);
}
final Object t720 = t719;

    return t720;

}
}
