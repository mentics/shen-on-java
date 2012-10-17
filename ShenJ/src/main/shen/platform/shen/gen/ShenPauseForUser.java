package shen.gen;



import com.mentics.shen.*;

public class ShenPauseForUser {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-pause-for-user");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v812) throws Exception {
return defined(v812);
}};
public static Object defined(final Object v812) throws Exception {
final Object f2352 = ShenReadChar.LAMBDA.apply();

final Object i2351 = f2352;

final Object i2355;
if ((boolean)Lang.equals(i2351, "a")) {
final Object f2353 = Interror.LAMBDA.apply("input aborted~%", Nil.NIL);

i2355 = f2353;
} else {
final Object f2354 = Nl.LAMBDA.apply(1);

i2355 = f2354;

}

    return i2355;

}
}
