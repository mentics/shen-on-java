package shen.gen;



import com.mentics.shen.*;

public class ShenDatatypeError {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-datatype-error");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1549) throws Exception {
return defined(v1549);
}};
public static Object defined(final Object v1549) throws Exception {
final Object f5796 = ShenNext50.LAMBDA.apply(50, v1549);
final Object f5797 = Atp.LAMBDA.apply(f5796, Nil.NIL);
final Object f5798 = Interror.LAMBDA.apply("datatype syntax error here:~%~% ~A~%", f5797);

    return f5798;

}
}
