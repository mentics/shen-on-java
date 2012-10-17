package shen.gen;



import com.mentics.shen.*;

public class JavaPrimitiveQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("java-primitive?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7258) throws Exception {
return defined(v7258);
}};
public static Object defined(final Object v7258) throws Exception {


final Object i8787;
if ((boolean)(v7258 instanceof Number)) {

i8787 = true;
} else {
final Object f8785 = BooleanQ.LAMBDA.apply(v7258);

final Object i8786;
if ((boolean)f8785) {

i8786 = true;
} else {

i8786 = false;

}
i8787 = i8786;

}
    return i8787;

}
}
