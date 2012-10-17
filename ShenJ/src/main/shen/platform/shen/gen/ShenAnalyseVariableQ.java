package shen.gen;



import com.mentics.shen.*;

public class ShenAnalyseVariableQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-analyse-variable?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v733) throws Exception {
return defined(v733);
}};
public static Object defined(final Object v733) throws Exception {


final Object i811;
if ((boolean)(v733 instanceof Cons)) {

final Object f805 = ShenUppercaseQ.LAMBDA.apply(((Cons)v733).head);

final Object i808;
if ((boolean)f805) {

final Object f806 = ShenAlphanumsQ.LAMBDA.apply(((Cons)v733).tail);

final Object i807;
if ((boolean)f806) {

i807 = true;
} else {

i807 = false;

}
i808 = i807;
} else {

i808 = false;

}
i811 = i808;
} else {

final Object i810;
if ((boolean)true) {
final Object f809 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-analyse-variable?"));

i810 = f809;
} else {

throw new SimpleError((String)"True condition not found.");


}
i811 = i810;

}
    return i811;

}
}
