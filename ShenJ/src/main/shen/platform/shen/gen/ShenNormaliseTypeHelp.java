package shen.gen;



import com.mentics.shen.*;

public class ShenNormaliseTypeHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-normalise-type-help");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1685) throws Exception {
return defined(v1685);
}};
public static Object defined(final Object v1685) throws Exception {


final Object i4498;
if ((boolean)(v1685 instanceof Cons)) {
final Lambda l4493 = new Lambda1() {
  public Object apply(final Object v1686) throws Exception {
    final Object f4492 = ShenNormaliseTypeHelp.LAMBDA.apply(v1686);

    return f4492;
  }
};final Object f4494 = Map.LAMBDA.apply(l4493, v1685);
final Object f4495 = ShenNormaliseX.LAMBDA.apply(f4494);

i4498 = f4495;
} else {

final Object i4497;
if ((boolean)true) {
final Object f4496 = ShenNormaliseX.LAMBDA.apply(v1685);

i4497 = f4496;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4498 = i4497;

}
    return i4498;

}
}
