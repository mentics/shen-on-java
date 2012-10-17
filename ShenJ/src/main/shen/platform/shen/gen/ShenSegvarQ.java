package shen.gen;



import com.mentics.shen.*;

public class ShenSegvarQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-segvar?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v346) throws Exception {
return defined(v346);
}};
public static Object defined(final Object v346) throws Exception {
final Object f4109 = SymbolQ.LAMBDA.apply(v346);

final Object i4112;
if ((boolean)f4109) {
final Object f4110 = Explode.LAMBDA.apply(v346);


final Object i4111;
if ((boolean)Lang.equals(((Cons)f4110).head, "?")) {

i4111 = true;
} else {

i4111 = false;

}
i4112 = i4111;
} else {

i4112 = false;

}
    return i4112;

}
}
