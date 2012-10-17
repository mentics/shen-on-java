package shen.gen;



import com.mentics.shen.*;

public class Ahvector {

public static final Symbol SYMBOL = RuntimeContext.symbol("<-vector");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v722, final Object v723) throws Exception {
return defined(v722, v723);
}};
public static Object defined(final Object v722, final Object v723) throws Exception {

final Object i754;
if ((boolean)Lang.equals(v723, 0)) {
final Object f750 = Interror.LAMBDA.apply("cannot access 0th element of a vector~%", Nil.NIL);

i754 = f750;
} else {



final Object vectorElement751 = ((Object[])v722)[((Number)v723).intValue()];

final Object i753;
if ((boolean)Lang.equals(vectorElement751, null)) {
final Object f752 = Interror.LAMBDA.apply("vector element not found~%", Nil.NIL);

i753 = f752;
} else {

i753 = vectorElement751;

}

i754 = i753;

}
    return i754;

}
}
