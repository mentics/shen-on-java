package shen.gen;



import com.mentics.shen.*;

public class ArithmeticToName {

public static final Symbol SYMBOL = RuntimeContext.symbol("arithmetic-to-name");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7281) throws Exception {
return defined(v7281);
}};
public static Object defined(final Object v7281) throws Exception {

final Object i8926;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), v7281)) {

i8926 = "plus";
} else {

final Object i8925;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), v7281)) {

i8925 = "minus";
} else {

final Object i8924;
if ((boolean)Lang.equals(RuntimeContext.symbol("*"), v7281)) {

i8924 = "multiply";
} else {

final Object i8923;
if ((boolean)Lang.equals(RuntimeContext.symbol("/"), v7281)) {

i8923 = "divide";
} else {

final Object i8922;
if ((boolean)true) {
final Object f8921 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("arithmetic-to-name"));

i8922 = f8921;
} else {

throw new SimpleError((String)"True condition not found.");


}
i8923 = i8922;

}
i8924 = i8923;

}
i8925 = i8924;

}
i8926 = i8925;

}
    return i8926;

}
}
