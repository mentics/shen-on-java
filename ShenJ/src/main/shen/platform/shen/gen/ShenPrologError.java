package shen.gen;



import com.mentics.shen.*;

public class ShenPrologError {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-prolog-error");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1169, final Object v1170) throws Exception {
return defined(v1169, v1170);
}};
public static Object defined(final Object v1169, final Object v1170) throws Exception {
final Object f2520 = ShenNext50.LAMBDA.apply(50, v1170);
final Object f2521 = Atp.LAMBDA.apply(f2520, Nil.NIL);
final Object f2522 = Atp.LAMBDA.apply(v1169, f2521);
final Object f2523 = Interror.LAMBDA.apply("prolog syntax error in ~A here:~%~% ~A~%", f2522);

    return f2523;

}
}
