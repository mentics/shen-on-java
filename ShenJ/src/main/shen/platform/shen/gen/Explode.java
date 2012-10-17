package shen.gen;



import com.mentics.shen.*;

public class Explode {

public static final Symbol SYMBOL = RuntimeContext.symbol("explode");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v704) throws Exception {
return defined(v704);
}};
public static Object defined(final Object v704) throws Exception {


final Object i725;
if ((boolean)(v704 instanceof String)) {
final Object f721 = ShenExplodeString.LAMBDA.apply(v704);

i725 = f721;
} else {
final Object f722 = Atp.LAMBDA.apply(v704, Nil.NIL);
final Object f723 = IntmakeString.LAMBDA.apply("~A", f722);
final Object f724 = Explode.LAMBDA.apply(f723);

i725 = f724;

}
    return i725;

}
}
