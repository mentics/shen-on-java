package shen.gen;



import com.mentics.shen.*;

public class ShenAsigPlusrulesZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<sig+rules>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v845) throws Exception {
return defined(v845);
}};
public static Object defined(final Object v845) throws Exception {
final Object f2679 = ShenAsignatureZ.LAMBDA.apply(v845);

final Object parse_AsignatureZ2678 = f2679;


final Object i2687;
if ((boolean)!((boolean)Lang.equals(null, parse_AsignatureZ2678))) {
final Object f2681 = ShenAtrulesZ.LAMBDA.apply(parse_AsignatureZ2678);

final Object parse_AtrulesZ2680 = f2681;


final Object i2686;
if ((boolean)!((boolean)Lang.equals(null, parse_AtrulesZ2680))) {
final Object f2682 = Fst.LAMBDA.apply(parse_AtrulesZ2680);
final Object f2683 = Snd.LAMBDA.apply(parse_AsignatureZ2678);

final Object f2684 = Snd.LAMBDA.apply(parse_AtrulesZ2680);

final Object f2685 = ShenReassemble.LAMBDA.apply(f2682, new Cons(f2683, f2684));

i2686 = f2685;
} else {

i2686 = null;

}

i2687 = i2686;
} else {

i2687 = null;

}

final Object result2677 = i2687;

final Object i2688;
if ((boolean)Lang.equals(result2677, null)) {

i2688 = null;
} else {

i2688 = result2677;

}

    return i2688;

}
}
