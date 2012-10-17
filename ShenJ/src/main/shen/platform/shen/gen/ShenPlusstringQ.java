package shen.gen;



import com.mentics.shen.*;

public class ShenPlusstringQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-+string?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v495) throws Exception {
return defined(v495);
}};
public static Object defined(final Object v495) throws Exception {

final Object i2322;
if ((boolean)Lang.equals("", v495)) {

i2322 = false;
} else {

final Object i2321;
if ((boolean)true) {


i2321 = (v495 instanceof String);
} else {

throw new SimpleError((String)"True condition not found.");


}
i2322 = i2321;

}
    return i2322;

}
}
