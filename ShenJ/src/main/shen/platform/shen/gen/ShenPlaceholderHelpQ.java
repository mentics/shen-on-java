package shen.gen;



import com.mentics.shen.*;

public class ShenPlaceholderHelpQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-placeholder-help?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v830) throws Exception {
return defined(v830);
}};
public static Object defined(final Object v830) throws Exception {
final Object f2566 = ShenPlusstringQ.LAMBDA.apply(v830);

final Object i2573;
if ((boolean)f2566) {



final Object i2571;
if ((boolean)Lang.equals("&", ((String)v830).substring(((Number)0).intValue(), ((Number)0).intValue()+1))) {

final Object f2567 = ShenPlusstringQ.LAMBDA.apply(((String)v830).substring(1));

final Object i2569;
if ((boolean)f2567) {




final Object i2568;
if ((boolean)Lang.equals("&", ((String)((String)v830).substring(1)).substring(((Number)0).intValue(), ((Number)0).intValue()+1))) {

i2568 = true;
} else {

i2568 = false;

}
i2569 = i2568;
} else {

i2569 = false;

}
final Object i2570;
if ((boolean)i2569) {

i2570 = true;
} else {

i2570 = false;

}
i2571 = i2570;
} else {

i2571 = false;

}
final Object i2572;
if ((boolean)i2571) {

i2572 = true;
} else {

i2572 = false;

}
i2573 = i2572;
} else {

i2573 = false;

}
final Object i2575;
if ((boolean)i2573) {

i2575 = true;
} else {

final Object i2574;
if ((boolean)true) {

i2574 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2575 = i2574;

}
    return i2575;

}
}
