package shen.gen;



import com.mentics.shen.*;

public class LogicToJava {

public static final Symbol SYMBOL = RuntimeContext.symbol("logic-to-java");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2820) throws Exception {
return defined(v2820);
}};
public static Object defined(final Object v2820) throws Exception {

final Object i2824;
if ((boolean)Lang.equals(RuntimeContext.symbol("and"), v2820)) {

i2824 = "&&";
} else {

final Object i2823;
if ((boolean)Lang.equals(RuntimeContext.symbol("or"), v2820)) {

i2823 = "||";
} else {

final Object i2822;
if ((boolean)true) {
final Object f2821 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("logic-to-java"));

i2822 = f2821;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2823 = i2822;

}
i2824 = i2823;

}
    return i2824;

}
}
