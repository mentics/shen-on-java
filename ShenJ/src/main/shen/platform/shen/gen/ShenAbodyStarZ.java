package shen.gen;



import com.mentics.shen.*;

public class ShenAbodyStarZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<body*>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1191) throws Exception {
return defined(v1191);
}};
public static Object defined(final Object v1191) throws Exception {
final Object f2706 = ShenAliteralStarZ.LAMBDA.apply(v1191);

final Object parse_AliteralStarZ2705 = f2706;


final Object i2714;
if ((boolean)!((boolean)Lang.equals(null, parse_AliteralStarZ2705))) {
final Object f2708 = ShenAbodyStarZ.LAMBDA.apply(parse_AliteralStarZ2705);

final Object parse_AbodyStarZ2707 = f2708;


final Object i2713;
if ((boolean)!((boolean)Lang.equals(null, parse_AbodyStarZ2707))) {
final Object f2709 = Fst.LAMBDA.apply(parse_AbodyStarZ2707);
final Object f2710 = Snd.LAMBDA.apply(parse_AliteralStarZ2705);

final Object f2711 = Snd.LAMBDA.apply(parse_AbodyStarZ2707);

final Object f2712 = ShenReassemble.LAMBDA.apply(f2709, new Cons(f2710, f2711));

i2713 = f2712;
} else {

i2713 = null;

}

i2714 = i2713;
} else {

i2714 = null;

}

final Object result2704 = i2714;

final Object i2723;
if ((boolean)Lang.equals(result2704, null)) {
final Object f2717 = AeZ.LAMBDA.apply(v1191);

final Object parse_AeZ2716 = f2717;


final Object i2721;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ2716))) {
final Object f2718 = Fst.LAMBDA.apply(parse_AeZ2716);
final Object f2719 = Snd.LAMBDA.apply(parse_AeZ2716);
final Object f2720 = ShenReassemble.LAMBDA.apply(f2718, f2719);

i2721 = f2720;
} else {

i2721 = null;

}

final Object result2715 = i2721;

final Object i2722;
if ((boolean)Lang.equals(result2715, null)) {

i2722 = null;
} else {

i2722 = result2715;

}

i2723 = i2722;
} else {

i2723 = result2704;

}

    return i2723;

}
}
