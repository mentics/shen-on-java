package shen.gen;



import com.mentics.shen.*;

public class ShenReadError {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-read-error");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v973) throws Exception {
return defined(v973);
}};
public static Object defined(final Object v973) throws Exception {
final Object f4759 = ShenCompress50.LAMBDA.apply(50, v973);
final Object f4760 = Atp.LAMBDA.apply(f4759, Nil.NIL);
final Object f4761 = Interror.LAMBDA.apply("read error here:~%~% ~A~%", f4760);

    return f4761;

}
}
