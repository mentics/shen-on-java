package shen.gen;



import com.mentics.shen.*;

public class ShenMod {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-mod");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v832, final Object v833) throws Exception {
return defined(v832, v833);
}};
public static Object defined(final Object v832, final Object v833) throws Exception {


final Object f960 = ShenMultiples.LAMBDA.apply(v832, new Cons(v833, Nil.NIL));
final Object f961 = ShenModh.LAMBDA.apply(v832, f960);

    return f961;

}
}
