package shen.gen;



import com.mentics.shen.*;

public class ShenVectorToListh {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-vector->listh");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1120, final Object v1121, final Object v1122) throws Exception {
return defined(v1120, v1121, v1122);
}};
public static Object defined(final Object v1120, final Object v1121, final Object v1122) throws Exception {
Object t1250;
try {



t1250 = ((Object[])v1120)[((Number)v1121).intValue()];
} catch (Throwable t) {
final Lambda l1249 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return RuntimeContext.symbol("shen-out-of-range");
  }
};
t1250 = l1249.apply(t);
}
final Object t1251 = t1250;

final Object y1248 = t1251;

final Object i1254;
if ((boolean)Lang.equals(y1248, RuntimeContext.symbol("shen-out-of-range"))) {
final Object f1252 = Reverse.LAMBDA.apply(v1122);

i1254 = f1252;
} else {




final Object f1253 = ShenVectorToListh.LAMBDA.apply(v1120, Primitives.plus.apply(v1121, 1), new Cons(y1248, v1122));

i1254 = f1253;

}

    return i1254;

}
}
