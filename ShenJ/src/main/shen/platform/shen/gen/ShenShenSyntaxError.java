package shen.gen;



import com.mentics.shen.*;

public class ShenShenSyntaxError {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-shen-syntax-error");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v383, final Object v384) throws Exception {
return defined(v383, v384);
}};
public static Object defined(final Object v383, final Object v384) throws Exception {
final Object f1260 = ShenNext50.LAMBDA.apply(50, v384);
final Object f1261 = Atp.LAMBDA.apply(f1260, Nil.NIL);
final Object f1262 = Atp.LAMBDA.apply(v383, f1261);
final Object f1263 = Interror.LAMBDA.apply("syntax error in ~A here:~%~% ~A~%", f1262);

    return f1263;

}
}
