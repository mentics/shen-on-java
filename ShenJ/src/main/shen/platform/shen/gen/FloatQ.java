package shen.gen;



import com.mentics.shen.*;

public class FloatQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("float?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6927) throws Exception {
return defined(v6927);
}};
public static Object defined(final Object v6927) throws Exception {


final Object i7161;
if ((boolean)(v6927 instanceof Number)) {
final Object f7159 = IntegerQ.LAMBDA.apply(v6927);


final Object i7160;
if ((boolean)!((boolean)f7159)) {

i7160 = true;
} else {

i7160 = false;

}
i7161 = i7160;
} else {

i7161 = false;

}
    return i7161;

}
}
