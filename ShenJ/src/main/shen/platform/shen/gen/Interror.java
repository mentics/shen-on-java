package shen.gen;



import com.mentics.shen.*;

public class Interror {

public static final Symbol SYMBOL = RuntimeContext.symbol("interror");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1087, final Object v1088) throws Exception {
return defined(v1087, v1088);
}};
public static Object defined(final Object v1087, final Object v1088) throws Exception {
final Object f1147 = ShenExplodeString.LAMBDA.apply(v1087);
final Object f1148 = ShenMsH.LAMBDA.apply(f1147, v1088);

throw new SimpleError((String)f1148);


}
}
