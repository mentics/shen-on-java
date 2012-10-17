package shen.gen;



import com.mentics.shen.*;

public class ShenRecordExceptions {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-record-exceptions");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1068, final Object v1069) throws Exception {
return defined(v1068, v1069);
}};
public static Object defined(final Object v1068, final Object v1069) throws Exception {
Object t5766;
try {

final Object f5764 = Get.LAMBDA.apply(v1069, RuntimeContext.symbol("shen-external-symbols"), RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));

t5766 = f5764;
} catch (Throwable t) {
final Lambda l5765 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return Nil.NIL;
  }
};
t5766 = l5765.apply(t);
}
final Object t5767 = t5766;

final Object currExceptions5763 = t5767;
final Object f5769 = Union.LAMBDA.apply(v1068, currExceptions5763);

final Object allExceptions5768 = f5769;

final Object f5770 = Put.LAMBDA.apply(v1069, RuntimeContext.symbol("shen-external-symbols"), allExceptions5768, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));



    return f5770;

}
}
