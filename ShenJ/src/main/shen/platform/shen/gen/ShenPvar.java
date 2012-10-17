package shen.gen;



import com.mentics.shen.*;

public class ShenPvar {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-pvar");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1478) throws Exception {
return defined(v1478);
}};
public static Object defined(final Object v1478) throws Exception {


final Object f3847 = Atp.LAMBDA.apply(((Object[])v1478)[((Number)1).intValue()], Nil.NIL);
final Object f3848 = IntmakeString.LAMBDA.apply("Var~A", f3847);

    return f3848;

}
}
