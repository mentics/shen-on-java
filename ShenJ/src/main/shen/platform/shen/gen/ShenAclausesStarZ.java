package shen.gen;



import com.mentics.shen.*;

public class ShenAclausesStarZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<clauses*>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1181) throws Exception {
return defined(v1181);
}};
public static Object defined(final Object v1181) throws Exception {
final Object f2565 = ShenAclauseStarZ.LAMBDA.apply(v1181);

final Object parse_AclauseStarZ2564 = f2565;


final Object i2573;
if ((boolean)!((boolean)Lang.equals(null, parse_AclauseStarZ2564))) {
final Object f2567 = ShenAclausesStarZ.LAMBDA.apply(parse_AclauseStarZ2564);

final Object parse_AclausesStarZ2566 = f2567;


final Object i2572;
if ((boolean)!((boolean)Lang.equals(null, parse_AclausesStarZ2566))) {
final Object f2568 = Fst.LAMBDA.apply(parse_AclausesStarZ2566);
final Object f2569 = Snd.LAMBDA.apply(parse_AclauseStarZ2564);

final Object f2570 = Snd.LAMBDA.apply(parse_AclausesStarZ2566);

final Object f2571 = ShenReassemble.LAMBDA.apply(f2568, new Cons(f2569, f2570));

i2572 = f2571;
} else {

i2572 = null;

}

i2573 = i2572;
} else {

i2573 = null;

}

final Object result2563 = i2573;

final Object i2582;
if ((boolean)Lang.equals(result2563, null)) {
final Object f2576 = AeZ.LAMBDA.apply(v1181);

final Object parse_AeZ2575 = f2576;


final Object i2580;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ2575))) {
final Object f2577 = Fst.LAMBDA.apply(parse_AeZ2575);
final Object f2578 = Snd.LAMBDA.apply(parse_AeZ2575);
final Object f2579 = ShenReassemble.LAMBDA.apply(f2577, f2578);

i2580 = f2579;
} else {

i2580 = null;

}

final Object result2574 = i2580;

final Object i2581;
if ((boolean)Lang.equals(result2574, null)) {

i2581 = null;
} else {

i2581 = result2574;

}

i2582 = i2581;
} else {

i2582 = result2563;

}

    return i2582;

}
}
