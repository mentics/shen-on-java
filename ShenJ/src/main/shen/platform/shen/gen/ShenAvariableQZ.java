package shen.gen;



import com.mentics.shen.*;

public class ShenAvariableQZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<variable?>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1554) throws Exception {
return defined(v1554);
}};
public static Object defined(final Object v1554) throws Exception {
final Object f5914 = Fst.LAMBDA.apply(v1554);


final Object i5924;
if ((boolean)(f5914 instanceof Cons)) {
final Object f5915 = Fst.LAMBDA.apply(v1554);

final Object f5916 = Snd.LAMBDA.apply(v1554);
final Object f5917 = ShenReassemble.LAMBDA.apply(((Cons)f5915).tail, f5916);
final Object f5918 = Fst.LAMBDA.apply(f5917);
final Object f5919 = Fst.LAMBDA.apply(v1554);

final Object f5920 = VariableQ.LAMBDA.apply(((Cons)f5919).head);


final Object i5922;
if ((boolean)!((boolean)f5920)) {

i5922 = null;
} else {
final Object f5921 = Fst.LAMBDA.apply(v1554);


i5922 = ((Cons)f5921).head;

}final Object f5923 = ShenReassemble.LAMBDA.apply(f5918, i5922);

i5924 = f5923;
} else {

i5924 = null;

}
final Object result5913 = i5924;

final Object i5925;
if ((boolean)Lang.equals(result5913, null)) {

i5925 = null;
} else {

i5925 = result5913;

}

    return i5925;

}
}
