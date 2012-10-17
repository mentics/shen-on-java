package shen.gen;



import com.mentics.shen.*;

public class HandleUnreachableAssignment {

public static final Symbol SYMBOL = RuntimeContext.symbol("handle-unreachable-assignment");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v7285, final Object v7286) throws Exception {
return defined(v7285, v7286);
}};
public static Object defined(final Object v7285, final Object v7286) throws Exception {
final Object f8937 = Second.LAMBDA.apply(v7286);

final Object second8936 = f8937;
final Object f8938 = Third.LAMBDA.apply(v7286);

final Object i8942;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), f8938)) {

i8942 = "";
} else {
final Object f8939 = Atp.LAMBDA.apply(second8936, Nil.NIL);
final Object f8940 = Atp.LAMBDA.apply(v7285, f8939);
final Object f8941 = IntmakeString.LAMBDA.apply("~A = ~A;~%", f8940);

i8942 = f8941;

}

    return i8942;

}
}
