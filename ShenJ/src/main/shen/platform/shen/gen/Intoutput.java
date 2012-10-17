package shen.gen;



import com.mentics.shen.*;

public class Intoutput {

public static final Symbol SYMBOL = RuntimeContext.symbol("intoutput");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1085, final Object v1086) throws Exception {
return defined(v1085, v1086);
}};
public static Object defined(final Object v1085, final Object v1086) throws Exception {
final Object f1144 = ShenExplodeString.LAMBDA.apply(v1085);
final Object f1145 = ShenMsH.LAMBDA.apply(f1144, v1086);

final Object f1146 = ShenStoutput.LAMBDA.apply(0);

((java.io.OutputStream)f1146).write(((String)f1145).getBytes());
    return f1145;

}
}
