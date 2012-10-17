package shen.gen;



import com.mentics.shen.*;

public class ShenAtrulesZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<trules>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v856) throws Exception {
return defined(v856);
}};
public static Object defined(final Object v856) throws Exception {
final Object f2699 = ShenAtruleZ.LAMBDA.apply(v856);

final Object parse_AtruleZ2698 = f2699;


final Object i2707;
if ((boolean)!((boolean)Lang.equals(null, parse_AtruleZ2698))) {
final Object f2701 = ShenAtrulesZ.LAMBDA.apply(parse_AtruleZ2698);

final Object parse_AtrulesZ2700 = f2701;


final Object i2706;
if ((boolean)!((boolean)Lang.equals(null, parse_AtrulesZ2700))) {
final Object f2702 = Fst.LAMBDA.apply(parse_AtrulesZ2700);
final Object f2703 = Snd.LAMBDA.apply(parse_AtruleZ2698);

final Object f2704 = Snd.LAMBDA.apply(parse_AtrulesZ2700);

final Object f2705 = ShenReassemble.LAMBDA.apply(f2702, new Cons(f2703, f2704));

i2706 = f2705;
} else {

i2706 = null;

}

i2707 = i2706;
} else {

i2707 = null;

}

final Object result2697 = i2707;

final Object i2716;
if ((boolean)Lang.equals(result2697, null)) {
final Object f2710 = ShenAtruleZ.LAMBDA.apply(v856);

final Object parse_AtruleZ2709 = f2710;


final Object i2714;
if ((boolean)!((boolean)Lang.equals(null, parse_AtruleZ2709))) {
final Object f2711 = Fst.LAMBDA.apply(parse_AtruleZ2709);
final Object f2712 = Snd.LAMBDA.apply(parse_AtruleZ2709);


final Object f2713 = ShenReassemble.LAMBDA.apply(f2711, new Cons(f2712, Nil.NIL));

i2714 = f2713;
} else {

i2714 = null;

}

final Object result2708 = i2714;

final Object i2715;
if ((boolean)Lang.equals(result2708, null)) {

i2715 = null;
} else {

i2715 = result2708;

}

i2716 = i2715;
} else {

i2716 = result2697;

}

    return i2716;

}
}
