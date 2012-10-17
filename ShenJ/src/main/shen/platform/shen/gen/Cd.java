package shen.gen;



import com.mentics.shen.*;

public class Cd {

public static final Symbol SYMBOL = RuntimeContext.symbol("cd");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v879) throws Exception {
return defined(v879);
}};
public static Object defined(final Object v879) throws Exception {

final Object i1035;
if ((boolean)Lang.equals(v879, "")) {

i1035 = "";
} else {
final Object f1033 = Atp.LAMBDA.apply(v879, Nil.NIL);
final Object f1034 = IntmakeString.LAMBDA.apply("~A/", f1033);

i1035 = f1034;

}

RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("*home-directory*"), i1035);
    return i1035;

}
}
