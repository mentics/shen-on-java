package shen.gen;



import com.mentics.shen.*;

public class IntegerQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("integer?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v909) throws Exception {
return defined(v909);
}};
public static Object defined(final Object v909) throws Exception {


final Object i1065;
if ((boolean)(v909 instanceof Number)) {
final Object f1061 = ShenAbs.LAMBDA.apply(v909);

final Object abs1060 = f1061;
final Object f1062 = ShenMagless.LAMBDA.apply(abs1060, 1);
final Object f1063 = ShenIntegerTestQ.LAMBDA.apply(abs1060, f1062);


final Object i1064;
if ((boolean)f1063) {

i1064 = true;
} else {

i1064 = false;

}
i1065 = i1064;
} else {

i1065 = false;

}
    return i1065;

}
}
