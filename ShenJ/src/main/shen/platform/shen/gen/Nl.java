package shen.gen;



import com.mentics.shen.*;

public class Nl {

public static final Symbol SYMBOL = RuntimeContext.symbol("nl");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v779) throws Exception {
return defined(v779);
}};
public static Object defined(final Object v779) throws Exception {

final Object i885;
if ((boolean)Lang.equals(0, v779)) {

i885 = 0;
} else {

final Object i884;
if ((boolean)true) {
final Object f881 = Intoutput.LAMBDA.apply("~%", Nil.NIL);


final Object f882 = Nl.LAMBDA.apply(Primitives.minus.apply(v779, 1));
final Object f883 = Do.LAMBDA.apply(f881, f882);

i884 = f883;
} else {

throw new SimpleError((String)"True condition not found.");


}
i885 = i884;

}
    return i885;

}
}
