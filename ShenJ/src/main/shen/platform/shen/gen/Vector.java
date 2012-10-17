package shen.gen;



import com.mentics.shen.*;

public class Vector {

public static final Symbol SYMBOL = RuntimeContext.symbol("vector");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v712) throws Exception {
return defined(v712);
}};
public static Object defined(final Object v712) throws Exception {



final Object[] a735 = new Object[((Number)Primitives.plus.apply(v712, 1)).intValue()];

final Object vector734 = a735;



((Object[])vector734)[((Number)0).intValue()] = v712;
final Object zeroStamp736 = vector734;

final Object i739;
if ((boolean)Lang.equals(v712, 0)) {

i739 = zeroStamp736;
} else {
final Object f738 = ShenFillvector.LAMBDA.apply(zeroStamp736, 1, v712, null);

i739 = f738;

}
final Object standard737 = i739;




    return standard737;

}
}
