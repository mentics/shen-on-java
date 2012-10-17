package shen.gen;



import com.mentics.shen.*;

public class VectorQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("vector?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v718) throws Exception {
return defined(v718);
}};
public static Object defined(final Object v718) throws Exception {


final Object i747;
if ((boolean)(v718 instanceof Object[])) {
Object t744;
try {





t744 = (((Number)(((Object[])v718)[((Number)0).intValue()])).doubleValue() >= ((Number)(0)).doubleValue());
} catch (Throwable t) {
final Lambda l743 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return false;
  }
};
t744 = l743.apply(t);
}
final Object t745 = t744;

final Object i746;
if ((boolean)t745) {

i746 = true;
} else {

i746 = false;

}
i747 = i746;
} else {

i747 = false;

}
    return i747;

}
}
