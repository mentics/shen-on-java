package shen.gen;



import com.mentics.shen.*;

public class ShenAarrowZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<arrow>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v875) throws Exception {
return defined(v875);
}};
public static Object defined(final Object v875) throws Exception {
final Object f2795 = Fst.LAMBDA.apply(v875);


final Object i2798;
if ((boolean)(f2795 instanceof Cons)) {
final Object f2796 = Fst.LAMBDA.apply(v875);


final Object i2797;
if ((boolean)Lang.equals(RuntimeContext.symbol("->"), ((Cons)f2796).head)) {

i2797 = true;
} else {

i2797 = false;

}
i2798 = i2797;
} else {

i2798 = false;

}
final Object i2804;
if ((boolean)i2798) {
final Object f2799 = Fst.LAMBDA.apply(v875);

final Object f2800 = Snd.LAMBDA.apply(v875);
final Object f2801 = ShenReassemble.LAMBDA.apply(((Cons)f2799).tail, f2800);
final Object f2802 = Fst.LAMBDA.apply(f2801);
final Object f2803 = ShenReassemble.LAMBDA.apply(f2802, RuntimeContext.symbol("shen-forward"));

i2804 = f2803;
} else {

i2804 = null;

}
final Object result2794 = i2804;

final Object i2817;
if ((boolean)Lang.equals(result2794, null)) {
final Object f2806 = Fst.LAMBDA.apply(v875);


final Object i2809;
if ((boolean)(f2806 instanceof Cons)) {
final Object f2807 = Fst.LAMBDA.apply(v875);


final Object i2808;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-"), ((Cons)f2807).head)) {

i2808 = true;
} else {

i2808 = false;

}
i2809 = i2808;
} else {

i2809 = false;

}
final Object i2815;
if ((boolean)i2809) {
final Object f2810 = Fst.LAMBDA.apply(v875);

final Object f2811 = Snd.LAMBDA.apply(v875);
final Object f2812 = ShenReassemble.LAMBDA.apply(((Cons)f2810).tail, f2811);
final Object f2813 = Fst.LAMBDA.apply(f2812);
final Object f2814 = ShenReassemble.LAMBDA.apply(f2813, RuntimeContext.symbol("shen-backward"));

i2815 = f2814;
} else {

i2815 = null;

}
final Object result2805 = i2815;

final Object i2816;
if ((boolean)Lang.equals(result2805, null)) {

i2816 = null;
} else {

i2816 = result2805;

}

i2817 = i2816;
} else {

i2817 = result2794;

}

    return i2817;

}
}
