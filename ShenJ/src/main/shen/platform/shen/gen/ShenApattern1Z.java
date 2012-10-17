package shen.gen;



import com.mentics.shen.*;

public class ShenApattern1Z {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<pattern1>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v406) throws Exception {
return defined(v406);
}};
public static Object defined(final Object v406) throws Exception {
final Object f1841 = ShenApatternZ.LAMBDA.apply(v406);

final Object parse_ApatternZ1840 = f1841;


final Object i1845;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternZ1840))) {
final Object f1842 = Fst.LAMBDA.apply(parse_ApatternZ1840);
final Object f1843 = Snd.LAMBDA.apply(parse_ApatternZ1840);
final Object f1844 = ShenReassemble.LAMBDA.apply(f1842, f1843);

i1845 = f1844;
} else {

i1845 = null;

}

final Object result1839 = i1845;

final Object i1846;
if ((boolean)Lang.equals(result1839, null)) {

i1846 = null;
} else {

i1846 = result1839;

}

    return i1846;

}
}
