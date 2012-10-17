package shen.gen;



import com.mentics.shen.*;

public class Hash {

public static final Symbol SYMBOL = RuntimeContext.symbol("hash");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v829, final Object v830) throws Exception {
return defined(v829, v830);
}};
public static Object defined(final Object v829, final Object v830) throws Exception {
final Lambda l954 = new Lambda1() {
  public Object apply(final Object v831) throws Exception {
    

    return Integer.valueOf(((String) v831).charAt(0));
  }
};final Object f955 = Explode.LAMBDA.apply(v829);
final Object f956 = Map.LAMBDA.apply(l954, f955);
final Object f957 = Sum.LAMBDA.apply(f956);
final Object f958 = ShenMod.LAMBDA.apply(f957, v830);

final Object hash953 = f958;

final Object i959;
if ((boolean)Lang.equals(0, hash953)) {

i959 = 1;
} else {

i959 = hash953;

}

    return i959;

}
}
