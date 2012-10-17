package shen.gen;



import com.mentics.shen.*;

public class ShenParameters {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-parameters");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v483) throws Exception {
return defined(v483);
}};
public static Object defined(final Object v483) throws Exception {

final Object i2107;
if ((boolean)Lang.equals(0, v483)) {

i2107 = Nil.NIL;
} else {

final Object i2106;
if ((boolean)true) {
final Object f2104 = Gensym.LAMBDA.apply(RuntimeContext.symbol("V"));



final Object f2105 = ShenParameters.LAMBDA.apply(Primitives.minus.apply(v483, 1));


i2106 = new Cons(f2104, f2105);
} else {

throw new SimpleError((String)"True condition not found.");


}
i2107 = i2106;

}
    return i2107;

}
}
