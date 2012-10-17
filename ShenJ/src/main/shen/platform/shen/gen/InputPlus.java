package shen.gen;



import com.mentics.shen.*;

public class InputPlus {

public static final Symbol SYMBOL = RuntimeContext.symbol("input+");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v945, final Object v946) throws Exception {
return defined(v945, v946);
}};
public static Object defined(final Object v945, final Object v946) throws Exception {
final Object f1107 = Read.LAMBDA.apply();

final Object input1106 = f1107;
final Object f1109 = ShenTypecheck.LAMBDA.apply(input1106, v946);

final Object check1108 = f1109;

final Object i1115;
if ((boolean)Lang.equals(false, check1108)) {
final Object f1110 = Atp.LAMBDA.apply(v946, Nil.NIL);
final Object f1111 = Intoutput.LAMBDA.apply("input is not of type ~R: please re-enter ", f1110);
final Object f1112 = InputPlus.LAMBDA.apply(RuntimeContext.symbol(":"), v946);
final Object f1113 = Do.LAMBDA.apply(f1111, f1112);

i1115 = f1113;
} else {
final Object f1114 = Eval.LAMBDA.apply(input1106);

i1115 = f1114;

}


    return i1115;

}
}
