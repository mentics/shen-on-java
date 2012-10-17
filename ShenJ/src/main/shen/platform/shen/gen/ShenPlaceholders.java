package shen.gen;



import com.mentics.shen.*;

public class ShenPlaceholders {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-placeholders");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v850, final Object v851) throws Exception {
return defined(v850, v851);
}};
public static Object defined(final Object v850, final Object v851) throws Exception {


final Object i2696;
if ((boolean)(v850 instanceof Cons)) {
final Lambda l2690 = new Lambda1() {
  public Object apply(final Object z) throws Exception {
    final Object f2689 = ShenPlaceholders.LAMBDA.apply(z, v851);

    return f2689;
  }
};final Object f2691 = Map.LAMBDA.apply(l2690, v850);

i2696 = f2691;
} else {
final Object f2692 = ElementQ.LAMBDA.apply(v850, v851);

final Object i2695;
if ((boolean)f2692) {
final Object f2693 = Concat.LAMBDA.apply(RuntimeContext.symbol("&&"), v850);

i2695 = f2693;
} else {

final Object i2694;
if ((boolean)true) {

i2694 = v850;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2695 = i2694;

}
i2696 = i2695;

}
    return i2696;

}
}
