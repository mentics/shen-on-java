package shen.gen;



import com.mentics.shen.*;

public class Einsteins_riddle {

public static final Symbol SYMBOL = RuntimeContext.symbol("einsteins_riddle");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v496, final Object v497, final Object v498) throws Exception {
return defined(v496, v497, v498);
}};
public static Object defined(final Object v496, final Object v497, final Object v498) throws Exception {
final Object f500 = ShenNewpv.LAMBDA.apply(v497);

final Object houses499 = f500;
final Object f501 = ShenIncinfs.LAMBDA.apply();
final Object f502 = Einstein.LAMBDA.apply(houses499, v496, v497, v498);
final Object f503 = Do.LAMBDA.apply(f501, f502);


    return f503;

}
}
