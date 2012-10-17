package shen.gen;



import com.mentics.shen.*;

public class ShenSucceedsQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-succeeds?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v402) throws Exception {
return defined(v402);
}};
public static Object defined(final Object v402) throws Exception {

final Object i1530;
if ((boolean)Lang.equals(v402, null)) {

i1530 = false;
} else {

final Object i1529;
if ((boolean)true) {

i1529 = true;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1530 = i1529;

}
    return i1530;

}
}
