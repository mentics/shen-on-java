package shen.gen;



import com.mentics.shen.*;

public class ShenErrordef {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-errordef");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v876) throws Exception {
return defined(v876);
}};
public static Object defined(final Object v876) throws Exception {
final Object f2818 = Atp.LAMBDA.apply(v876, Nil.NIL);
final Object f2819 = Interror.LAMBDA.apply("syntax error in ~A~%", f2818);

    return f2819;

}
}
