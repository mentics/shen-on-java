package shen.gen;



import com.mentics.shen.*;

public class ShenAheadStarZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<head*>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1183) throws Exception {
return defined(v1183);
}};
public static Object defined(final Object v1183) throws Exception {
final Object f2608 = ShenAtermStarZ.LAMBDA.apply(v1183);

final Object parse_AtermStarZ2607 = f2608;


final Object i2616;
if ((boolean)!((boolean)Lang.equals(null, parse_AtermStarZ2607))) {
final Object f2610 = ShenAheadStarZ.LAMBDA.apply(parse_AtermStarZ2607);

final Object parse_AheadStarZ2609 = f2610;


final Object i2615;
if ((boolean)!((boolean)Lang.equals(null, parse_AheadStarZ2609))) {
final Object f2611 = Fst.LAMBDA.apply(parse_AheadStarZ2609);
final Object f2612 = Snd.LAMBDA.apply(parse_AtermStarZ2607);

final Object f2613 = Snd.LAMBDA.apply(parse_AheadStarZ2609);

final Object f2614 = ShenReassemble.LAMBDA.apply(f2611, new Cons(f2612, f2613));

i2615 = f2614;
} else {

i2615 = null;

}

i2616 = i2615;
} else {

i2616 = null;

}

final Object result2606 = i2616;

final Object i2625;
if ((boolean)Lang.equals(result2606, null)) {
final Object f2619 = AeZ.LAMBDA.apply(v1183);

final Object parse_AeZ2618 = f2619;


final Object i2623;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ2618))) {
final Object f2620 = Fst.LAMBDA.apply(parse_AeZ2618);
final Object f2621 = Snd.LAMBDA.apply(parse_AeZ2618);
final Object f2622 = ShenReassemble.LAMBDA.apply(f2620, f2621);

i2623 = f2622;
} else {

i2623 = null;

}

final Object result2617 = i2623;

final Object i2624;
if ((boolean)Lang.equals(result2617, null)) {

i2624 = null;
} else {

i2624 = result2617;

}

i2625 = i2624;
} else {

i2625 = result2606;

}

    return i2625;

}
}
