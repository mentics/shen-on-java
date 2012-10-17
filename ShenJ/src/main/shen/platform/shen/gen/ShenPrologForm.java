package shen.gen;



import com.mentics.shen.*;

public class ShenPrologForm {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-prolog-form");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v538) throws Exception {
return defined(v538);
}};
public static Object defined(final Object v538) throws Exception {
final Lambda l4330 = new Lambda1() {
  public Object apply(final Object v539) throws Exception {
    final Object f4329 = ShenCons_form.LAMBDA.apply(v539);

    return f4329;
  }
};final Object f4331 = Map.LAMBDA.apply(l4330, v538);
final Object f4332 = ShenCons_form.LAMBDA.apply(f4331);

    return f4332;

}
}
