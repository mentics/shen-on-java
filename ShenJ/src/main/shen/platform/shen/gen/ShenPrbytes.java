package shen.gen;



import com.mentics.shen.*;

public class ShenPrbytes {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-prbytes");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v582) throws Exception {
return defined(v582);
}};
public static Object defined(final Object v582) throws Exception {
final Lambda l6551 = new Lambda1() {
  public Object apply(final Object _byte) throws Exception {
    

final Object f6550 = Stinput.LAMBDA.apply(0);

((java.io.OutputStream)f6550).write(((String)new String(Character.toChars(((Number) (_byte)).intValue()))).getBytes());
    return new String(Character.toChars(((Number) (_byte)).intValue()));
  }
};final Object f6552 = Map.LAMBDA.apply(l6551, v582);
final Object f6553 = Nl.LAMBDA.apply(1);
final Object f6554 = Do.LAMBDA.apply(f6552, f6553);

    return f6554;

}
}
