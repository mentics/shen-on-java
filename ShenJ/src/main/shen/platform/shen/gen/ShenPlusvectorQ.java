package shen.gen;



import com.mentics.shen.*;

public class ShenPlusvectorQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-+vector?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v711) throws Exception {
return defined(v711);
}};
public static Object defined(final Object v711) throws Exception {


final Object i733;
if ((boolean)(v711 instanceof Object[])) {





final Object i732;
if ((boolean)(((Number)(((Object[])v711)[((Number)0).intValue()])).doubleValue() > ((Number)(0)).doubleValue())) {

i732 = true;
} else {

i732 = false;

}
i733 = i732;
} else {

i733 = false;

}
    return i733;

}
}
