package shen.gen;



import com.mentics.shen.*;

public class ShenApattern2Z {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<pattern2>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v407) throws Exception {
return defined(v407);
}};
public static Object defined(final Object v407) throws Exception {
final Object f1849 = ShenApatternZ.LAMBDA.apply(v407);

final Object parse_ApatternZ1848 = f1849;


final Object i1853;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternZ1848))) {
final Object f1850 = Fst.LAMBDA.apply(parse_ApatternZ1848);
final Object f1851 = Snd.LAMBDA.apply(parse_ApatternZ1848);
final Object f1852 = ShenReassemble.LAMBDA.apply(f1850, f1851);

i1853 = f1852;
} else {

i1853 = null;

}

final Object result1847 = i1853;

final Object i1854;
if ((boolean)Lang.equals(result1847, null)) {

i1854 = null;
} else {

i1854 = result1847;

}

    return i1854;

}
}
