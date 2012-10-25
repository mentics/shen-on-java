package shen.gen;



import com.mentics.shen.*;

public class JavaPrimitiveQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("java-primitive?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2666) throws Exception {
return defined(v2666);
}};
public static Object defined(final Object v2666) throws Exception {


final Object i2669;
if ((boolean)(v2666 instanceof Number)) {

i2669 = true;
} else {
final Object f2667 = BooleanQ.LAMBDA.apply(v2666);

final Object i2668;
if ((boolean)f2667) {

i2668 = true;
} else {

i2668 = false;

}
i2669 = i2668;

}
    return i2669;

}
}
