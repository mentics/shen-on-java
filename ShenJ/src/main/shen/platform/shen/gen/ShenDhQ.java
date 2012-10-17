package shen.gen;



import com.mentics.shen.*;

public class ShenDhQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-dh?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1570) throws Exception {
return defined(v1570);
}};
public static Object defined(final Object v1570) throws Exception {

final Object i6201;
if ((boolean)Lang.equals("=", v1570)) {

i6201 = true;
} else {

final Object i6200;
if ((boolean)true) {



final Object i6199;
if ((boolean)Lang.equals(((String)v1570).substring(((Number)0).intValue(), ((Number)0).intValue()+1), "=")) {

final Object f6197 = ShenDhQ.LAMBDA.apply(((String)v1570).substring(1));

final Object i6198;
if ((boolean)f6197) {

i6198 = true;
} else {

i6198 = false;

}
i6199 = i6198;
} else {

i6199 = false;

}
i6200 = i6199;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6201 = i6200;

}
    return i6201;

}
}
