package shen.gen;



import com.mentics.shen.*;

public class TupleQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("tuple?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v742) throws Exception {
return defined(v742);
}};
public static Object defined(final Object v742) throws Exception {
Object t822;
try {


final Object i820;
if ((boolean)(v742 instanceof Object[])) {



final Object i819;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-tuple"), ((Object[])v742)[((Number)0).intValue()])) {

i819 = true;
} else {

i819 = false;

}
i820 = i819;
} else {

i820 = false;

}
t822 = i820;
} catch (Throwable t) {
final Lambda l821 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return false;
  }
};
t822 = l821.apply(t);
}
final Object t823 = t822;

    return t823;

}
}
