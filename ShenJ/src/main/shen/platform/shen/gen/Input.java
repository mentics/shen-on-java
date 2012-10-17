package shen.gen;



import com.mentics.shen.*;

public class Input {

public static final Symbol SYMBOL = RuntimeContext.symbol("input");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f1104 = Read.LAMBDA.apply();
final Object f1105 = Eval.LAMBDA.apply(f1104);

    return f1105;

}
}
