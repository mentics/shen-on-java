package shen.gen;



import com.mentics.shen.*;

public class LogicToJava {

public static final Symbol SYMBOL = RuntimeContext.symbol("logic-to-java");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7280) throws Exception {
return defined(v7280);
}};
public static Object defined(final Object v7280) throws Exception {

final Object i8920;
if ((boolean)Lang.equals(RuntimeContext.symbol("and"), v7280)) {

i8920 = "&&";
} else {

final Object i8919;
if ((boolean)Lang.equals(RuntimeContext.symbol("or"), v7280)) {

i8919 = "||";
} else {

final Object i8918;
if ((boolean)true) {
final Object f8917 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("logic-to-java"));

i8918 = f8917;
} else {

throw new SimpleError((String)"True condition not found.");


}
i8919 = i8918;

}
i8920 = i8919;

}
    return i8920;

}
}
