package shen.gen;



import com.mentics.shen.*;

public class ShenChwild {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-chwild");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1332) throws Exception {
return defined(v1332);
}};
public static Object defined(final Object v1332) throws Exception {

final Object i3702;
if ((boolean)Lang.equals(v1332, RuntimeContext.symbol("_"))) {





i3702 = new Cons(RuntimeContext.symbol("shen-newpv"), new Cons(RuntimeContext.symbol("ProcessN"), Nil.NIL));
} else {


final Object i3701;
if ((boolean)(v1332 instanceof Cons)) {
final Lambda l3698 = new Lambda1() {
  public Object apply(final Object v1333) throws Exception {
    final Object f3697 = ShenChwild.LAMBDA.apply(v1333);

    return f3697;
  }
};final Object f3699 = Map.LAMBDA.apply(l3698, v1332);

i3701 = f3699;
} else {

final Object i3700;
if ((boolean)true) {

i3700 = v1332;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3701 = i3700;

}
i3702 = i3701;

}
    return i3702;

}
}
