package shen.gen;



import com.mentics.shen.*;

public class ShenShQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-sh?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1568) throws Exception {
return defined(v1568);
}};
public static Object defined(final Object v1568) throws Exception {

final Object i6192;
if ((boolean)Lang.equals("_", v1568)) {

i6192 = true;
} else {

final Object i6191;
if ((boolean)true) {



final Object i6190;
if ((boolean)Lang.equals(((String)v1568).substring(((Number)0).intValue(), ((Number)0).intValue()+1), "_")) {

final Object f6188 = ShenShQ.LAMBDA.apply(((String)v1568).substring(1));

final Object i6189;
if ((boolean)f6188) {

i6189 = true;
} else {

i6189 = false;

}
i6190 = i6189;
} else {

i6190 = false;

}
i6191 = i6190;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6192 = i6191;

}
    return i6192;

}
}
