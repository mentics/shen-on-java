package shen.gen;



import com.mentics.shen.*;

public class Cut {

public static final Symbol SYMBOL = RuntimeContext.symbol("cut");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1194, final Object v1195, final Object v1196) throws Exception {
return defined(v1194, v1195, v1196);
}};
public static Object defined(final Object v1194, final Object v1195, final Object v1196) throws Exception {
final Object f2760 = Thaw.LAMBDA.apply(v1196);

final Object result2759 = f2760;

final Object i2761;
if ((boolean)Lang.equals(result2759, false)) {

i2761 = v1194;
} else {

i2761 = result2759;

}

    return i2761;

}
}
