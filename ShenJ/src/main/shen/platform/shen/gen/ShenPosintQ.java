package shen.gen;



import com.mentics.shen.*;

public class ShenPosintQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-posint?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v724) throws Exception {
return defined(v724);
}};
public static Object defined(final Object v724) throws Exception {
final Object f755 = IntegerQ.LAMBDA.apply(v724);

final Object i757;
if ((boolean)f755) {



final Object i756;
if ((boolean)(((Number)(v724)).doubleValue() >= ((Number)(0)).doubleValue())) {

i756 = true;
} else {

i756 = false;

}
i757 = i756;
} else {

i757 = false;

}
    return i757;

}
}
