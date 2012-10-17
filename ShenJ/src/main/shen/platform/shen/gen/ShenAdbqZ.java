package shen.gen;



import com.mentics.shen.*;

public class ShenAdbqZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<dbq>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1021) throws Exception {
return defined(v1021);
}};
public static Object defined(final Object v1021) throws Exception {
final Object f5292 = Fst.LAMBDA.apply(v1021);


final Object i5300;
if ((boolean)(f5292 instanceof Cons)) {
final Object f5293 = Fst.LAMBDA.apply(v1021);

final Object f5294 = Snd.LAMBDA.apply(v1021);
final Object f5295 = ShenReassemble.LAMBDA.apply(((Cons)f5293).tail, f5294);
final Object f5296 = Fst.LAMBDA.apply(f5295);
final Object f5297 = Fst.LAMBDA.apply(v1021);


final Object i5298;
if ((boolean)Lang.equals(((Cons)f5297).head, 34)) {

i5298 = RuntimeContext.symbol("shen-skip");
} else {

i5298 = null;

}final Object f5299 = ShenReassemble.LAMBDA.apply(f5296, i5298);

i5300 = f5299;
} else {

i5300 = null;

}
final Object result5291 = i5300;

final Object i5301;
if ((boolean)Lang.equals(result5291, null)) {

i5301 = null;
} else {

i5301 = result5291;

}

    return i5301;

}
}
