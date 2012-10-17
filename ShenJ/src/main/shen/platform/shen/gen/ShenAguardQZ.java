package shen.gen;



import com.mentics.shen.*;

public class ShenAguardQZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<guard?>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v870) throws Exception {
return defined(v870);
}};
public static Object defined(final Object v870) throws Exception {
final Object f2772 = Fst.LAMBDA.apply(v870);


final Object i2775;
if ((boolean)(f2772 instanceof Cons)) {
final Object f2773 = Fst.LAMBDA.apply(v870);


final Object i2774;
if ((boolean)Lang.equals(RuntimeContext.symbol("where"), ((Cons)f2773).head)) {

i2774 = true;
} else {

i2774 = false;

}
i2775 = i2774;
} else {

i2775 = false;

}
final Object i2785;
if ((boolean)i2775) {
final Object f2777 = Fst.LAMBDA.apply(v870);

final Object f2778 = Snd.LAMBDA.apply(v870);
final Object f2779 = ShenReassemble.LAMBDA.apply(((Cons)f2777).tail, f2778);
final Object f2780 = ShenAguardZ.LAMBDA.apply(f2779);

final Object parse_AguardZ2776 = f2780;


final Object i2784;
if ((boolean)!((boolean)Lang.equals(null, parse_AguardZ2776))) {
final Object f2781 = Fst.LAMBDA.apply(parse_AguardZ2776);
final Object f2782 = Snd.LAMBDA.apply(parse_AguardZ2776);
final Object f2783 = ShenReassemble.LAMBDA.apply(f2781, f2782);

i2784 = f2783;
} else {

i2784 = null;

}

i2785 = i2784;
} else {

i2785 = null;

}
final Object result2771 = i2785;

final Object i2793;
if ((boolean)Lang.equals(result2771, null)) {
final Object f2788 = AeZ.LAMBDA.apply(v870);

final Object parse_AeZ2787 = f2788;


final Object i2791;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ2787))) {
final Object f2789 = Fst.LAMBDA.apply(parse_AeZ2787);
final Object f2790 = ShenReassemble.LAMBDA.apply(f2789, RuntimeContext.symbol("shen-skip"));

i2791 = f2790;
} else {

i2791 = null;

}

final Object result2786 = i2791;

final Object i2792;
if ((boolean)Lang.equals(result2786, null)) {

i2792 = null;
} else {

i2792 = result2786;

}

i2793 = i2792;
} else {

i2793 = result2771;

}

    return i2793;

}
}
