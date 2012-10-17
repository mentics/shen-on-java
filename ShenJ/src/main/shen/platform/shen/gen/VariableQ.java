package shen.gen;



import com.mentics.shen.*;

public class VariableQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("variable?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v732) throws Exception {
return defined(v732);
}};
public static Object defined(final Object v732) throws Exception {
final Object f792 = BooleanQ.LAMBDA.apply(v732);

final Object i796;
if ((boolean)f792) {

i796 = true;
} else {


final Object i794;
if ((boolean)(v732 instanceof Number)) {

i794 = true;
} else {


final Object i793;
if ((boolean)(v732 instanceof String)) {

i793 = true;
} else {

i793 = false;

}
i794 = i793;

}
final Object i795;
if ((boolean)i794) {

i795 = true;
} else {

i795 = false;

}
i796 = i795;

}
final Object i804;
if ((boolean)i796) {

i804 = false;
} else {

final Object i803;
if ((boolean)true) {
Object t801;
try {
final Object f798 = Explode.LAMBDA.apply(v732);

final Object explode797 = f798;
final Object f799 = ShenAnalyseVariableQ.LAMBDA.apply(explode797);


t801 = f799;
} catch (Throwable t) {
final Lambda l800 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return false;
  }
};
t801 = l800.apply(t);
}
final Object t802 = t801;

i803 = t802;
} else {

throw new SimpleError((String)"True condition not found.");


}
i804 = i803;

}
    return i804;

}
}
