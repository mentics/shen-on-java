package shen.gen;



import com.mentics.shen.*;

public class ShenPvarQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-pvar?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1360) throws Exception {
return defined(v1360);
}};
public static Object defined(final Object v1360) throws Exception {


final Object i3728;
if ((boolean)(v1360 instanceof Object[])) {



final Object i3727;
if ((boolean)Lang.equals(((Object[])v1360)[((Number)0).intValue()], RuntimeContext.symbol("shen-pvar"))) {

i3727 = true;
} else {

i3727 = false;

}
i3728 = i3727;
} else {

i3728 = false;

}
    return i3728;

}
}
