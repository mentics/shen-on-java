package shen.gen;



import com.mentics.shen.*;

public class ShenAguardZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<guard>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v409) throws Exception {
return defined(v409);
}};
public static Object defined(final Object v409) throws Exception {
final Object f1866 = Fst.LAMBDA.apply(v409);


final Object i1873;
if ((boolean)(f1866 instanceof Cons)) {
final Object f1867 = Fst.LAMBDA.apply(v409);

final Object f1868 = Snd.LAMBDA.apply(v409);
final Object f1869 = ShenReassemble.LAMBDA.apply(((Cons)f1867).tail, f1868);
final Object f1870 = Fst.LAMBDA.apply(f1869);
final Object f1871 = Fst.LAMBDA.apply(v409);

final Object f1872 = ShenReassemble.LAMBDA.apply(f1870, ((Cons)f1871).head);

i1873 = f1872;
} else {

i1873 = null;

}
final Object result1865 = i1873;

final Object i1874;
if ((boolean)Lang.equals(result1865, null)) {

i1874 = null;
} else {

i1874 = result1865;

}

    return i1874;

}
}
