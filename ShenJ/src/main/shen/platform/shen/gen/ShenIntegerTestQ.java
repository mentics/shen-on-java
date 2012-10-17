package shen.gen;



import com.mentics.shen.*;

public class ShenIntegerTestQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-integer-test?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v916, final Object v917) throws Exception {
return defined(v916, v917);
}};
public static Object defined(final Object v916, final Object v917) throws Exception {

final Object i1076;
if ((boolean)Lang.equals(0, v916)) {

i1076 = true;
} else {



final Object i1075;
if ((boolean)(((Number)(1)).doubleValue() > ((Number)(v916)).doubleValue())) {

i1075 = false;
} else {

final Object i1074;
if ((boolean)true) {



final Object absN1070 = Primitives.minus.apply(v916, v917);



final Object i1073;
if ((boolean)(((Number)(0)).doubleValue() > ((Number)(absN1070)).doubleValue())) {
final Object f1071 = IntegerQ.LAMBDA.apply(v916);

i1073 = f1071;
} else {
final Object f1072 = ShenIntegerTestQ.LAMBDA.apply(absN1070, v917);

i1073 = f1072;

}

i1074 = i1073;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1075 = i1074;

}
i1076 = i1075;

}
    return i1076;

}
}
