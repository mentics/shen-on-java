package shen.gen;



import com.mentics.shen.*;

public class ShenLengthH {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-length-h");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v888, final Object v889) throws Exception {
return defined(v888, v889);
}};
public static Object defined(final Object v888, final Object v889) throws Exception {

final Object i1047;
if ((boolean)Lang.equals(Nil.NIL, v888)) {

i1047 = v889;
} else {

final Object i1046;
if ((boolean)true) {



final Object f1045 = ShenLengthH.LAMBDA.apply(((Cons)v888).tail, Primitives.plus.apply(v889, 1));

i1046 = f1045;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1047 = i1046;

}
    return i1047;

}
}
