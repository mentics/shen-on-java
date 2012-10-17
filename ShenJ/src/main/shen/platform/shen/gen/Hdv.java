package shen.gen;



import com.mentics.shen.*;

public class Hdv {

public static final Symbol SYMBOL = RuntimeContext.symbol("hdv");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v756) throws Exception {
return defined(v756);
}};
public static Object defined(final Object v756) throws Exception {
Object t851;
try {
final Object f847 = Ahvector.LAMBDA.apply(v756, 1);

t851 = f847;
} catch (Throwable t) {
final Lambda l850 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    final Object f848 = Atp.LAMBDA.apply(v756, Nil.NIL);
final Object f849 = Interror.LAMBDA.apply("hdv needs a non-empty vector as an argument; not ~S~%", f848);

    return f849;
  }
};
t851 = l850.apply(t);
}
final Object t852 = t851;

    return t852;

}
}
