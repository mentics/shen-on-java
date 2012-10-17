package shen.gen;



import com.mentics.shen.*;

public class ShenAactionZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<action>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v408) throws Exception {
return defined(v408);
}};
public static Object defined(final Object v408) throws Exception {
final Object f1856 = Fst.LAMBDA.apply(v408);


final Object i1863;
if ((boolean)(f1856 instanceof Cons)) {
final Object f1857 = Fst.LAMBDA.apply(v408);

final Object f1858 = Snd.LAMBDA.apply(v408);
final Object f1859 = ShenReassemble.LAMBDA.apply(((Cons)f1857).tail, f1858);
final Object f1860 = Fst.LAMBDA.apply(f1859);
final Object f1861 = Fst.LAMBDA.apply(v408);

final Object f1862 = ShenReassemble.LAMBDA.apply(f1860, ((Cons)f1861).head);

i1863 = f1862;
} else {

i1863 = null;

}
final Object result1855 = i1863;

final Object i1864;
if ((boolean)Lang.equals(result1855, null)) {

i1864 = null;
} else {

i1864 = result1855;

}

    return i1864;

}
}
