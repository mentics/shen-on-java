package shen.gen;



import com.mentics.shen.*;

public class ShenShenToKl {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-shen->kl");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v380, final Object v381) throws Exception {
return defined(v380, v381);
}};
public static Object defined(final Object v380, final Object v381) throws Exception {
final Lambda l1256 = new Lambda1() {
  public Object apply(final Object v382) throws Exception {
    final Object f1255 = ShenAdefineZ.LAMBDA.apply(v382);

    return f1255;
  }
};

final Lambda l1258 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f1257 = ShenShenSyntaxError.LAMBDA.apply(v380, x);

    return f1257;
  }
};final Object f1259 = Compile.LAMBDA.apply(l1256, new Cons(v380, v381), l1258);

    return f1259;

}
}
