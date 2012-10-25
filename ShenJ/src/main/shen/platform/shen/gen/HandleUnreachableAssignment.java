package shen.gen;



import com.mentics.shen.*;

public class HandleUnreachableAssignment {

public static final Symbol SYMBOL = RuntimeContext.symbol("handle-unreachable-assignment");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v2844, final Object v2845) throws Exception {
return defined(v2844, v2845);
}};
public static Object defined(final Object v2844, final Object v2845) throws Exception {
final Object f2847 = Second.LAMBDA.apply(v2845);

final Object second2846 = f2847;
final Object f2848 = Third.LAMBDA.apply(v2845);

final Object i2852;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), f2848)) {

i2852 = "";
} else {
final Object f2849 = Atp.LAMBDA.apply(second2846, Nil.NIL);
final Object f2850 = Atp.LAMBDA.apply(v2844, f2849);
final Object f2851 = IntmakeString.LAMBDA.apply("~A = ~A;~%", f2850);

i2852 = f2851;

}

    return i2852;

}
}
