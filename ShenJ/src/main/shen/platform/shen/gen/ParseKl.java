package shen.gen;



import com.mentics.shen.*;

public class ParseKl {

public static final Symbol SYMBOL = RuntimeContext.symbol("parse-kl");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1150) throws Exception {
return defined(v1150);
}};
public static Object defined(final Object v1150) throws Exception {
final Lambda l1155 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f1151 = ToIntlist.LAMBDA.apply(v1150);
final Object f1152 = Atp.LAMBDA.apply(f1151, Nil.NIL);
final Object f1153 = ShenAst_inputZ.LAMBDA.apply(f1152);
final Object f1154 = Snd.LAMBDA.apply(f1153);

    return f1154;
  }
};final Object f1156 = RunWithoutMacros.LAMBDA.apply(l1155);

    return f1156;

}
}
