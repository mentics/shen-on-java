package shen.gen;



import com.mentics.shen.*;

public class PrimitiveTypeQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("primitive-type?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2670) throws Exception {
return defined(v2670);
}};
public static Object defined(final Object v2670) throws Exception {

final Object i2672;
if ((boolean)Lang.equals(v2670, RuntimeContext.symbol("number"))) {

i2672 = true;
} else {

final Object i2671;
if ((boolean)Lang.equals(v2670, RuntimeContext.symbol("boolean"))) {

i2671 = true;
} else {

i2671 = false;

}
i2672 = i2671;

}
    return i2672;

}
}
