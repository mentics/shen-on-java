package shen.gen;



import com.mentics.shen.*;

public class SymbolQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("symbol?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v726) throws Exception {
return defined(v726);
}};
public static Object defined(final Object v726) throws Exception {
final Object f758 = BooleanQ.LAMBDA.apply(v726);

final Object i762;
if ((boolean)f758) {

i762 = true;
} else {


final Object i760;
if ((boolean)(v726 instanceof Number)) {

i760 = true;
} else {


final Object i759;
if ((boolean)(v726 instanceof String)) {

i759 = true;
} else {

i759 = false;

}
i760 = i759;

}
final Object i761;
if ((boolean)i760) {

i761 = true;
} else {

i761 = false;

}
i762 = i761;

}
final Object i770;
if ((boolean)i762) {

i770 = false;
} else {

final Object i769;
if ((boolean)true) {
Object t767;
try {
final Object f764 = Explode.LAMBDA.apply(v726);

final Object explode763 = f764;
final Object f765 = ShenAnalyseSymbolQ.LAMBDA.apply(explode763);


t767 = f765;
} catch (Throwable t) {
final Lambda l766 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return false;
  }
};
t767 = l766.apply(t);
}
final Object t768 = t767;

i769 = t768;
} else {

throw new SimpleError((String)"True condition not found.");


}
i770 = i769;

}
    return i770;

}
}
