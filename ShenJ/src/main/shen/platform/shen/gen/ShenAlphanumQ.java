package shen.gen;



import com.mentics.shen.*;

public class ShenAlphanumQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-alphanum?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v730) throws Exception {
return defined(v730);
}};
public static Object defined(final Object v730) throws Exception {
final Object f787 = ShenAlphaQ.LAMBDA.apply(v730);

final Object i790;
if ((boolean)f787) {

i790 = true;
} else {
final Object f788 = ShenDigitQ.LAMBDA.apply(v730);

final Object i789;
if ((boolean)f788) {

i789 = true;
} else {

i789 = false;

}
i790 = i789;

}
    return i790;

}
}
