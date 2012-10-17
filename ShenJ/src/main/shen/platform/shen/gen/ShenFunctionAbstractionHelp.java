package shen.gen;



import com.mentics.shen.*;

public class ShenFunctionAbstractionHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-function-abstraction-help");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v565, final Object v566, final Object v567) throws Exception {
return defined(v565, v566, v567);
}};
public static Object defined(final Object v565, final Object v566, final Object v567) throws Exception {

final Object i4726;
if ((boolean)Lang.equals(0, v566)) {



i4726 = new Cons(v565, v567);
} else {

final Object i4725;
if ((boolean)true) {
final Object f4722 = Gensym.LAMBDA.apply(RuntimeContext.symbol("V"));

final Object x4721 = f4722;






final Object f4723 = Append.LAMBDA.apply(v567, new Cons(x4721, Nil.NIL));
final Object f4724 = ShenFunctionAbstractionHelp.LAMBDA.apply(v565, Primitives.minus.apply(v566, 1), f4723);






i4725 = new Cons(RuntimeContext.symbol("/."), new Cons(x4721, new Cons(f4724, Nil.NIL)));
} else {

throw new SimpleError((String)"True condition not found.");


}
i4726 = i4725;

}
    return i4726;

}
}
