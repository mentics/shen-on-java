package shen.gen;



import com.mentics.shen.*;

public class HandleUnreachableReturn {

public static final Symbol SYMBOL = RuntimeContext.symbol("handle-unreachable-return");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7284) throws Exception {
return defined(v7284);
}};
public static Object defined(final Object v7284) throws Exception {
final Object f8931 = Third.LAMBDA.apply(v7284);

final Object i8935;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), f8931)) {

i8935 = "";
} else {
final Object f8932 = Second.LAMBDA.apply(v7284);
final Object f8933 = Atp.LAMBDA.apply(f8932, Nil.NIL);
final Object f8934 = IntmakeString.LAMBDA.apply("    return ~A;~%", f8933);

i8935 = f8934;

}
    return i8935;

}
}
