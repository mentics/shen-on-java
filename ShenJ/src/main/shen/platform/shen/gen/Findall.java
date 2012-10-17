package shen.gen;



import com.mentics.shen.*;

public class Findall {

public static final Symbol SYMBOL = RuntimeContext.symbol("findall");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v923, final Object v924, final Object v925, final Object v926, final Object v927) throws Exception {
return defined(v923, v924, v925, v926, v927);
}};
public static Object defined(final Object v923, final Object v924, final Object v925, final Object v926, final Object v927) throws Exception {
final Object f3301 = ShenNewpv.LAMBDA.apply(v926);

final Object b3300 = f3301;
final Object f3303 = ShenNewpv.LAMBDA.apply(v926);

final Object a3302 = f3303;
final Object f3304 = ShenIncinfs.LAMBDA.apply();
final Object f3305 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));
final Lambda l3310 = new Lambda0() {
  public Object apply() throws Exception {
    
final Object f3306 = ShenLazyderef.LAMBDA.apply(a3302, v926);

RuntimeContext.globalProperties.put((Symbol)f3306, Nil.NIL);final Lambda l3308 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3307 = ShenFindallhelp.LAMBDA.apply(v923, v924, v925, a3302, v926, v927);

    return f3307;
  }
};final Object f3309 = Bind.LAMBDA.apply(b3300, Nil.NIL, v926, l3308);

    return f3309;
  }
};final Object f3311 = Bind.LAMBDA.apply(a3302, f3305, v926, l3310);
final Object f3312 = Do.LAMBDA.apply(f3304, f3311);



    return f3312;

}
}
