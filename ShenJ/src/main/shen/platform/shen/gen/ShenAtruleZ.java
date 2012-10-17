package shen.gen;



import com.mentics.shen.*;

public class ShenAtruleZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<trule>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v861) throws Exception {
return defined(v861);
}};
public static Object defined(final Object v861) throws Exception {
final Object f2719 = ShenApatternsZ.LAMBDA.apply(v861);

final Object parse_ApatternsZ2718 = f2719;


final Object i2747;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternsZ2718))) {
final Object f2721 = ShenAarrowZ.LAMBDA.apply(parse_ApatternsZ2718);

final Object parse_AarrowZ2720 = f2721;


final Object i2746;
if ((boolean)!((boolean)Lang.equals(null, parse_AarrowZ2720))) {
final Object f2723 = ShenAactionZ.LAMBDA.apply(parse_AarrowZ2720);

final Object parse_AactionZ2722 = f2723;


final Object i2745;
if ((boolean)!((boolean)Lang.equals(null, parse_AactionZ2722))) {
final Object f2725 = ShenAguardQZ.LAMBDA.apply(parse_AactionZ2722);

final Object parse_AguardQZ2724 = f2725;


final Object i2744;
if ((boolean)!((boolean)Lang.equals(null, parse_AguardQZ2724))) {
final Object f2726 = Fst.LAMBDA.apply(parse_AguardQZ2724);
final Object f2728 = Snd.LAMBDA.apply(parse_ApatternsZ2718);
final Object f2729 = ShenExtract_vars.LAMBDA.apply(f2728);

final Object vars2727 = f2729;
final Object f2731 = Snd.LAMBDA.apply(parse_ApatternsZ2718);
final Object f2732 = ShenPlaceholders.LAMBDA.apply(f2731, vars2727);

final Object patterns2730 = f2732;
final Object f2734 = Snd.LAMBDA.apply(parse_AactionZ2722);
final Object f2735 = ShenCurry.LAMBDA.apply(f2734);
final Object f2736 = ShenPlaceholders.LAMBDA.apply(f2735, vars2727);

final Object action2733 = f2736;
final Object f2738 = Snd.LAMBDA.apply(parse_AguardQZ2724);
final Object f2739 = ShenCurry.LAMBDA.apply(f2738);
final Object f2740 = ShenPlaceholders.LAMBDA.apply(f2739, vars2727);

final Object guard2737 = f2740;
final Object f2741 = Snd.LAMBDA.apply(parse_AarrowZ2720);
final Object f2742 = ShenFormRule.LAMBDA.apply(patterns2730, f2741, action2733, guard2737);




final Object f2743 = ShenReassemble.LAMBDA.apply(f2726, f2742);

i2744 = f2743;
} else {

i2744 = null;

}

i2745 = i2744;
} else {

i2745 = null;

}

i2746 = i2745;
} else {

i2746 = null;

}

i2747 = i2746;
} else {

i2747 = null;

}

final Object result2717 = i2747;

final Object i2748;
if ((boolean)Lang.equals(result2717, null)) {

i2748 = null;
} else {

i2748 = result2717;

}

    return i2748;

}
}
