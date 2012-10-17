package shen.gen;



import com.mentics.shen.*;

public class ShenLoop {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-loop");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f6431 = ShenInitialise_environment.LAMBDA.apply();
final Object f6432 = ShenPrompt.LAMBDA.apply();
Object t6435;
try {
final Object f6433 = ShenReadEvaluatePrint.LAMBDA.apply();

t6435 = f6433;
} catch (Throwable t) {
final Lambda l6434 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    



((java.io.OutputStream)RuntimeContext.globalProperties.get(RuntimeContext.symbol("*stoutput*"))).write(((String)Lang.errorToString(e)).getBytes());
    return Lang.errorToString(e);
  }
};
t6435 = l6434.apply(t);
}
final Object t6436 = t6435;
final Object f6437 = ShenLoop.LAMBDA.apply();
final Object f6438 = Do.LAMBDA.apply(t6436, f6437);
final Object f6439 = Do.LAMBDA.apply(f6432, f6438);
final Object f6440 = Do.LAMBDA.apply(f6431, f6439);

    return f6440;

}
}
