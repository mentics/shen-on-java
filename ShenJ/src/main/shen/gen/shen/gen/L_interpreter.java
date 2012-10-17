package shen.gen;



import com.mentics.shen.*;

public class L_interpreter {

public static final Symbol SYMBOL = RuntimeContext.symbol("l_interpreter");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v70) throws Exception {
return defined(v70);
}};
public static Object defined(final Object v70) throws Exception {
final Object f71 = InputPlus.LAMBDA.apply(RuntimeContext.symbol(":"), RuntimeContext.symbol("l_formula"));
final Object f72 = Normal_form.LAMBDA.apply(f71);
final Object f73 = Atp.LAMBDA.apply(f72, Nil.NIL);
final Object f74 = Intoutput.LAMBDA.apply("~%L interpreter ~%~%~%~%l-interp --> ~A~%", f73);
final Object f75 = Read_eval_print_loop.LAMBDA.apply(f74);

    return f75;

}
}
