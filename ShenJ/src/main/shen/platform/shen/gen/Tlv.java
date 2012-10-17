package shen.gen;



import com.mentics.shen.*;

public class Tlv {

public static final Symbol SYMBOL = RuntimeContext.symbol("tlv");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v757) throws Exception {
return defined(v757);
}};
public static Object defined(final Object v757) throws Exception {
final Object f854 = Limit.LAMBDA.apply(v757);

final Object limit853 = f854;

final Object i862;
if ((boolean)Lang.equals(limit853, 0)) {
final Object f855 = Interror.LAMBDA.apply("cannot take the tail of the empty vector~%", Nil.NIL);

i862 = f855;
} else {

final Object i861;
if ((boolean)Lang.equals(limit853, 1)) {
final Object f856 = Vector.LAMBDA.apply(0);

i861 = f856;
} else {


final Object f858 = Vector.LAMBDA.apply(Primitives.minus.apply(limit853, 1));

final Object newVector857 = f858;


final Object f859 = Vector.LAMBDA.apply(Primitives.minus.apply(limit853, 1));
final Object f860 = ShenTlvHelp.LAMBDA.apply(v757, 2, limit853, f859);


i861 = f860;

}
i862 = i861;

}

    return i862;

}
}
