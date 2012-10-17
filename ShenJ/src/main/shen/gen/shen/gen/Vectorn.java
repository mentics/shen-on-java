package shen.gen;



import com.mentics.shen.*;

public class Vectorn {

public static final Symbol SYMBOL = RuntimeContext.symbol("vectorn");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v845) throws Exception {
return defined(v845);
}};
public static Object defined(final Object v845) throws Exception {

final Object i850;
if ((boolean)Lang.equals(0, v845)) {
final Object f846 = Vector.LAMBDA.apply(0);

i850 = f846;
} else {

final Object i849;
if ((boolean)true) {


final Object f847 = Vectorn.LAMBDA.apply(Primitives.minus.apply(v845, 1));
final Object f848 = Atv.LAMBDA.apply(v845, f847);

i849 = f848;
} else {

throw new SimpleError((String)"True condition not found.");


}
i850 = i849;

}
    return i850;

}
}
