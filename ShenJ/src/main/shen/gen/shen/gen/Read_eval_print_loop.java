package shen.gen;



import com.mentics.shen.*;

public class Read_eval_print_loop {

public static final Symbol SYMBOL = RuntimeContext.symbol("read_eval_print_loop");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v80) throws Exception {
return defined(v80);
}};
public static Object defined(final Object v80) throws Exception {
final Object f81 = InputPlus.LAMBDA.apply(RuntimeContext.symbol(":"), RuntimeContext.symbol("l_formula"));
final Object f82 = Normal_form.LAMBDA.apply(f81);
final Object f83 = Atp.LAMBDA.apply(f82, Nil.NIL);
final Object f84 = Intoutput.LAMBDA.apply("l-interp --> ~A~%", f83);
final Object f85 = Read_eval_print_loop.LAMBDA.apply(f84);

    return f85;

}
}
