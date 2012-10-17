package shen.gen;



import com.mentics.shen.*;

public class ShenWalk {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-walk");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v670, final Object v671) throws Exception {
return defined(v670, v671);
}};
public static Object defined(final Object v670, final Object v671) throws Exception {


final Object i686;
if ((boolean)(v671 instanceof Cons)) {
final Lambda l681 = new Lambda1() {
  public Object apply(final Object z) throws Exception {
    final Object f680 = ShenWalk.LAMBDA.apply(v670, z);

    return f680;
  }
};final Object f682 = Map.LAMBDA.apply(l681, v671);
final Object f683 = RuntimeContext.dispatch(v670).apply(f682);

i686 = f683;
} else {

final Object i685;
if ((boolean)true) {
final Object f684 = RuntimeContext.dispatch(v670).apply(v671);

i685 = f684;
} else {

throw new SimpleError((String)"True condition not found.");


}
i686 = i685;

}
    return i686;

}
}
