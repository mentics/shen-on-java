package shen.gen;



import com.mentics.shen.*;

public class ShenAah {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-aah");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v478, final Object v479) throws Exception {
return defined(v478, v479);
}};
public static Object defined(final Object v478, final Object v479) throws Exception {
final Object f2080 = Arity.LAMBDA.apply(v478);

final Object arity2079 = f2080;
final Object f2082 = Length.LAMBDA.apply(v479);

final Object len2081 = f2082;



final Object i2084;
if ((boolean)(((Number)(arity2079)).doubleValue() > ((Number)(-1)).doubleValue())) {



final Object i2083;
if ((boolean)(((Number)(len2081)).doubleValue() > ((Number)(arity2079)).doubleValue())) {

i2083 = true;
} else {

i2083 = false;

}
i2084 = i2083;
} else {

i2084 = false;

}
final Object i2090;
if ((boolean)i2084) {



final Object i2085;
if ((boolean)(((Number)(len2081)).doubleValue() > ((Number)(1)).doubleValue())) {

i2085 = "s";
} else {

i2085 = "";

}final Object f2086 = Atp.LAMBDA.apply(i2085, Nil.NIL);
final Object f2087 = Atp.LAMBDA.apply(len2081, f2086);
final Object f2088 = Atp.LAMBDA.apply(v478, f2087);
final Object f2089 = Intoutput.LAMBDA.apply("warning: ~A might not like ~A argument~A.~%", f2088);

i2090 = f2089;
} else {

i2090 = RuntimeContext.symbol("shen-skip");

}


    return i2090;

}
}
