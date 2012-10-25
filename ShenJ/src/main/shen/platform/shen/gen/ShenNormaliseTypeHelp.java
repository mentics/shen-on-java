package shen.gen;



import com.mentics.shen.*;

public class ShenNormaliseTypeHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-normalise-type-help");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1685) throws Exception {
return defined(v1685);
}};
public static Object defined(final Object v1685) throws Exception {


final Object i40;
if ((boolean)(v1685 instanceof Cons)) {
final Lambda l35 = new Lambda1() {
  public Object apply(final Object v1686) throws Exception {
    final Object f34 = ShenNormaliseTypeHelp.LAMBDA.apply(v1686);

    return f34;
  }
};final Object f36 = Map.LAMBDA.apply(l35, v1685);
final Object f37 = ShenNormaliseX.LAMBDA.apply(f36);

i40 = f37;
} else {

final Object i39;
if ((boolean)true) {
final Object f38 = ShenNormaliseX.LAMBDA.apply(v1685);

i39 = f38;
} else {

throw new SimpleError((String)"True condition not found.");


}
i40 = i39;

}
    return i40;

}
}
