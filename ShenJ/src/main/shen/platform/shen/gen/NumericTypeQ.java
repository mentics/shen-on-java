package shen.gen;



import com.mentics.shen.*;

public class NumericTypeQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("numeric-type?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2901) throws Exception {
return defined(v2901);
}};
public static Object defined(final Object v2901) throws Exception {

final Object i2905;
if ((boolean)Lang.equals(RuntimeContext.symbol("number"), v2901)) {

i2905 = true;
} else {

final Object i2904;
if ((boolean)Lang.equals(RuntimeContext.symbol("integer"), v2901)) {

i2904 = true;
} else {

final Object i2903;
if ((boolean)Lang.equals(RuntimeContext.symbol("float"), v2901)) {

i2903 = true;
} else {

final Object i2902;
if ((boolean)true) {

i2902 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2903 = i2902;

}
i2904 = i2903;

}
i2905 = i2904;

}
    return i2905;

}
}
