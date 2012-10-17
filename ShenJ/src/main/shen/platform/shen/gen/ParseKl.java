package shen.gen;



import com.mentics.shen.*;

public class ParseKl {

public static final Symbol SYMBOL = RuntimeContext.symbol("parse-kl");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7234) throws Exception {
return defined(v7234);
}};
public static Object defined(final Object v7234) throws Exception {
final Lambda l7319 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f7315 = ToIntlist.LAMBDA.apply(v7234);
final Object f7316 = Atp.LAMBDA.apply(f7315, Nil.NIL);
final Object f7317 = ShenAst_inputZ.LAMBDA.apply(f7316);
final Object f7318 = Snd.LAMBDA.apply(f7317);

    return f7318;
  }
};final Object f7320 = RunWithoutMacros.LAMBDA.apply(l7319);

    return f7320;

}
}
