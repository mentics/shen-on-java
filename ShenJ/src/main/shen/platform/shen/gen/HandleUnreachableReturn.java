package shen.gen;



import com.mentics.shen.*;

public class HandleUnreachableReturn {

public static final Symbol SYMBOL = RuntimeContext.symbol("handle-unreachable-return");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2838) throws Exception {
return defined(v2838);
}};
public static Object defined(final Object v2838) throws Exception {
final Object f2839 = Third.LAMBDA.apply(v2838);

final Object i2843;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), f2839)) {

i2843 = "";
} else {
final Object f2840 = Second.LAMBDA.apply(v2838);
final Object f2841 = Atp.LAMBDA.apply(f2840, Nil.NIL);
final Object f2842 = IntmakeString.LAMBDA.apply("    return ~A;~%", f2841);

i2843 = f2842;

}
    return i2843;

}
}
