package shen.gen;



import com.mentics.shen.*;

public class BooleanQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("boolean?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v778) throws Exception {
return defined(v778);
}};
public static Object defined(final Object v778) throws Exception {

final Object i880;
if ((boolean)Lang.equals(true, v778)) {

i880 = true;
} else {

final Object i879;
if ((boolean)Lang.equals(false, v778)) {

i879 = true;
} else {

final Object i878;
if ((boolean)true) {

i878 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i879 = i878;

}
i880 = i879;

}
    return i880;

}
}
