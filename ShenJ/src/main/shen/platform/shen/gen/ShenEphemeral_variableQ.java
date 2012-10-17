package shen.gen;



import com.mentics.shen.*;

public class ShenEphemeral_variableQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-ephemeral_variable?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1320, final Object v1321) throws Exception {
return defined(v1320, v1321);
}};
public static Object defined(final Object v1320, final Object v1321) throws Exception {
final Object f3430 = VariableQ.LAMBDA.apply(v1320);

final Object i3433;
if ((boolean)f3430) {
final Object f3431 = VariableQ.LAMBDA.apply(v1321);

final Object i3432;
if ((boolean)f3431) {

i3432 = true;
} else {

i3432 = false;

}
i3433 = i3432;
} else {

i3433 = false;

}
    return i3433;

}
}
