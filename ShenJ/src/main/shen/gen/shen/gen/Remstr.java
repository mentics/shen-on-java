package shen.gen;



import com.mentics.shen.*;

public class Remstr {

public static final Symbol SYMBOL = RuntimeContext.symbol("remstr");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v816) throws Exception {
return defined(v816);
}};
public static Object defined(final Object v816) throws Exception {

final Object i832;
if ((boolean)Lang.equals("", v816)) {

i832 = 0;
} else {
final Object f817 = ShenPlusstringQ.LAMBDA.apply(v816);

final Object i824;
if ((boolean)f817) {



final Object i822;
if ((boolean)Lang.equals("e", ((String)v816).substring(((Number)0).intValue(), ((Number)0).intValue()+1))) {

final Object f818 = ShenPlusstringQ.LAMBDA.apply(((String)v816).substring(1));

final Object i820;
if ((boolean)f818) {




final Object i819;
if ((boolean)Lang.equals("r", ((String)((String)v816).substring(1)).substring(((Number)0).intValue(), ((Number)0).intValue()+1))) {

i819 = true;
} else {

i819 = false;

}
i820 = i819;
} else {

i820 = false;

}
final Object i821;
if ((boolean)i820) {

i821 = true;
} else {

i821 = false;

}
i822 = i821;
} else {

i822 = false;

}
final Object i823;
if ((boolean)i822) {

i823 = true;
} else {

i823 = false;

}
i824 = i823;
} else {

i824 = false;

}
final Object i831;
if ((boolean)i824) {



final Object f825 = Remstr.LAMBDA.apply(((String)((String)v816).substring(1)).substring(1));


i831 = Primitives.plus.apply(1, f825);
} else {
final Object f826 = ShenPlusstringQ.LAMBDA.apply(v816);

final Object i830;
if ((boolean)f826) {

final Object f827 = Remstr.LAMBDA.apply(((String)v816).substring(1));

i830 = f827;
} else {

final Object i829;
if ((boolean)true) {
final Object f828 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("remstr"));

i829 = f828;
} else {

throw new SimpleError((String)"True condition not found.");


}
i830 = i829;

}
i831 = i830;

}
i832 = i831;

}
    return i832;

}
}
