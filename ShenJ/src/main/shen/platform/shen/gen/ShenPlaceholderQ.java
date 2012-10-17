package shen.gen;



import com.mentics.shen.*;

public class ShenPlaceholderQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-placeholder?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v823) throws Exception {
return defined(v823);
}};
public static Object defined(final Object v823) throws Exception {
final Object f2562 = SymbolQ.LAMBDA.apply(v823);

final Object i2565;
if ((boolean)f2562) {

final Object f2563 = ShenPlaceholderHelpQ.LAMBDA.apply(String.valueOf(v823));

final Object i2564;
if ((boolean)f2563) {

i2564 = true;
} else {

i2564 = false;

}
i2565 = i2564;
} else {

i2565 = false;

}
    return i2565;

}
}
