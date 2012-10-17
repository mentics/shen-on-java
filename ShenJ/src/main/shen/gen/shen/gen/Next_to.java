package shen.gen;



import com.mentics.shen.*;

public class Next_to {

public static final Symbol SYMBOL = RuntimeContext.symbol("next_to");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v682, final Object v683, final Object v684, final Object v685, final Object v686) throws Exception {
return defined(v682, v683, v684, v685, v686);
}};
public static Object defined(final Object v682, final Object v683, final Object v684, final Object v685, final Object v686) throws Exception {
final Object f688 = ShenIncinfs.LAMBDA.apply();
final Object f689 = Iright.LAMBDA.apply(v682, v683, v684, v685, v686);
final Object f690 = Do.LAMBDA.apply(f688, f689);

final Object case687 = f690;

final Object i694;
if ((boolean)Lang.equals(case687, false)) {
final Object f691 = ShenIncinfs.LAMBDA.apply();
final Object f692 = Iright.LAMBDA.apply(v683, v682, v684, v685, v686);
final Object f693 = Do.LAMBDA.apply(f691, f692);

i694 = f693;
} else {

i694 = case687;

}

    return i694;

}
}
