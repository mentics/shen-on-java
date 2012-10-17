package shen.gen;



import com.mentics.shen.*;

public class ShenAclauseStarZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<clause*>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1182) throws Exception {
return defined(v1182);
}};
public static Object defined(final Object v1182) throws Exception {
final Object f2585 = ShenAheadStarZ.LAMBDA.apply(v1182);

final Object parse_AheadStarZ2584 = f2585;


final Object i2604;
if ((boolean)!((boolean)Lang.equals(null, parse_AheadStarZ2584))) {
final Object f2586 = Fst.LAMBDA.apply(parse_AheadStarZ2584);


final Object i2589;
if ((boolean)(f2586 instanceof Cons)) {
final Object f2587 = Fst.LAMBDA.apply(parse_AheadStarZ2584);


final Object i2588;
if ((boolean)Lang.equals(RuntimeContext.symbol("<--"), ((Cons)f2587).head)) {

i2588 = true;
} else {

i2588 = false;

}
i2589 = i2588;
} else {

i2589 = false;

}
final Object i2603;
if ((boolean)i2589) {
final Object f2591 = Fst.LAMBDA.apply(parse_AheadStarZ2584);

final Object f2592 = Snd.LAMBDA.apply(parse_AheadStarZ2584);
final Object f2593 = ShenReassemble.LAMBDA.apply(((Cons)f2591).tail, f2592);
final Object f2594 = ShenAbodyStarZ.LAMBDA.apply(f2593);

final Object parse_AbodyStarZ2590 = f2594;


final Object i2602;
if ((boolean)!((boolean)Lang.equals(null, parse_AbodyStarZ2590))) {
final Object f2596 = ShenAendStarZ.LAMBDA.apply(parse_AbodyStarZ2590);

final Object parse_AendStarZ2595 = f2596;


final Object i2601;
if ((boolean)!((boolean)Lang.equals(null, parse_AendStarZ2595))) {
final Object f2597 = Fst.LAMBDA.apply(parse_AendStarZ2595);
final Object f2598 = Snd.LAMBDA.apply(parse_AheadStarZ2584);

final Object f2599 = Snd.LAMBDA.apply(parse_AbodyStarZ2590);



final Object f2600 = ShenReassemble.LAMBDA.apply(f2597, new Cons(f2598, new Cons(f2599, Nil.NIL)));

i2601 = f2600;
} else {

i2601 = null;

}

i2602 = i2601;
} else {

i2602 = null;

}

i2603 = i2602;
} else {

i2603 = null;

}
i2604 = i2603;
} else {

i2604 = null;

}

final Object result2583 = i2604;

final Object i2605;
if ((boolean)Lang.equals(result2583, null)) {

i2605 = null;
} else {

i2605 = result2583;

}

    return i2605;

}
}
