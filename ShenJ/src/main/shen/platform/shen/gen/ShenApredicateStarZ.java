package shen.gen;



import com.mentics.shen.*;

public class ShenApredicateStarZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<predicate*>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1180) throws Exception {
return defined(v1180);
}};
public static Object defined(final Object v1180) throws Exception {
final Object f2554 = Fst.LAMBDA.apply(v1180);


final Object i2561;
if ((boolean)(f2554 instanceof Cons)) {
final Object f2555 = Fst.LAMBDA.apply(v1180);

final Object f2556 = Snd.LAMBDA.apply(v1180);
final Object f2557 = ShenReassemble.LAMBDA.apply(((Cons)f2555).tail, f2556);
final Object f2558 = Fst.LAMBDA.apply(f2557);
final Object f2559 = Fst.LAMBDA.apply(v1180);

final Object f2560 = ShenReassemble.LAMBDA.apply(f2558, ((Cons)f2559).head);

i2561 = f2560;
} else {

i2561 = null;

}
final Object result2553 = i2561;

final Object i2562;
if ((boolean)Lang.equals(result2553, null)) {

i2562 = null;
} else {

i2562 = result2553;

}

    return i2562;

}
}
