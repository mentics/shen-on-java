package shen.gen;



import com.mentics.shen.*;

public class ArithmeticToName {

public static final Symbol SYMBOL = RuntimeContext.symbol("arithmetic-to-name");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2825) throws Exception {
return defined(v2825);
}};
public static Object defined(final Object v2825) throws Exception {

final Object i2831;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), v2825)) {

i2831 = "plus";
} else {

final Object i2830;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), v2825)) {

i2830 = "minus";
} else {

final Object i2829;
if ((boolean)Lang.equals(RuntimeContext.symbol("*"), v2825)) {

i2829 = "multiply";
} else {

final Object i2828;
if ((boolean)Lang.equals(RuntimeContext.symbol("/"), v2825)) {

i2828 = "divide";
} else {

final Object i2827;
if ((boolean)true) {
final Object f2826 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("arithmetic-to-name"));

i2827 = f2826;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2828 = i2827;

}
i2829 = i2828;

}
i2830 = i2829;

}
i2831 = i2830;

}
    return i2831;

}
}
