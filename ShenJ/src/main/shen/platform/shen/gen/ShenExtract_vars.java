package shen.gen;



import com.mentics.shen.*;

public class ShenExtract_vars {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-extract_vars");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v422) throws Exception {
return defined(v422);
}};
public static Object defined(final Object v422) throws Exception {
final Object f1917 = VariableQ.LAMBDA.apply(v422);

final Object i1923;
if ((boolean)f1917) {



i1923 = new Cons(v422, Nil.NIL);
} else {


final Object i1922;
if ((boolean)(v422 instanceof Cons)) {

final Object f1918 = ShenExtract_vars.LAMBDA.apply(((Cons)v422).head);

final Object f1919 = ShenExtract_vars.LAMBDA.apply(((Cons)v422).tail);
final Object f1920 = Union.LAMBDA.apply(f1918, f1919);

i1922 = f1920;
} else {

final Object i1921;
if ((boolean)true) {

i1921 = Nil.NIL;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1922 = i1921;

}
i1923 = i1922;

}
    return i1923;

}
}
