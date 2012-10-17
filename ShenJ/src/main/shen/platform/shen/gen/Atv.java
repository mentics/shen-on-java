package shen.gen;



import com.mentics.shen.*;

public class Atv {

public static final Symbol SYMBOL = RuntimeContext.symbol("@v");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v745, final Object v746) throws Exception {
return defined(v745, v746);
}};
public static Object defined(final Object v745, final Object v746) throws Exception {
final Object f830 = Limit.LAMBDA.apply(v746);

final Object limit829 = f830;


final Object f832 = Vector.LAMBDA.apply(Primitives.plus.apply(limit829, 1));

final Object newVector831 = f832;
final Object f834 = VectorZ.LAMBDA.apply(newVector831, 1, v745);

final Object xPlusNewVector833 = f834;

final Object i836;
if ((boolean)Lang.equals(limit829, 0)) {

i836 = xPlusNewVector833;
} else {
final Object f835 = ShenAtvHelp.LAMBDA.apply(v746, 1, limit829, xPlusNewVector833);

i836 = f835;

}



    return i836;

}
}
