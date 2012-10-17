package shen.gen;



import com.mentics.shen.*;

public class ShenAendStarZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<end*>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1193) throws Exception {
return defined(v1193);
}};
public static Object defined(final Object v1193) throws Exception {
final Object f2749 = Fst.LAMBDA.apply(v1193);


final Object i2757;
if ((boolean)(f2749 instanceof Cons)) {
final Object f2750 = Fst.LAMBDA.apply(v1193);

final Object f2751 = Snd.LAMBDA.apply(v1193);
final Object f2752 = ShenReassemble.LAMBDA.apply(((Cons)f2750).tail, f2751);
final Object f2753 = Fst.LAMBDA.apply(f2752);
final Object f2754 = Fst.LAMBDA.apply(v1193);


final Object i2755;
if ((boolean)Lang.equals(((Cons)f2754).head, RuntimeContext.symbol(";"))) {

i2755 = RuntimeContext.symbol("shen-skip");
} else {

i2755 = null;

}final Object f2756 = ShenReassemble.LAMBDA.apply(f2753, i2755);

i2757 = f2756;
} else {

i2757 = null;

}
final Object result2748 = i2757;

final Object i2758;
if ((boolean)Lang.equals(result2748, null)) {

i2758 = null;
} else {

i2758 = result2748;

}

    return i2758;

}
}
