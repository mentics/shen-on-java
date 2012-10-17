package shen.gen;



import com.mentics.shen.*;

public class ShenSysError {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-sys-error");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v529) throws Exception {
return defined(v529);
}};
public static Object defined(final Object v529) throws Exception {
final Object f2502 = Atp.LAMBDA.apply(v529, Nil.NIL);
final Object f2503 = Interror.LAMBDA.apply("system function ~A: unexpected argument~%", f2502);

    return f2503;

}
}
