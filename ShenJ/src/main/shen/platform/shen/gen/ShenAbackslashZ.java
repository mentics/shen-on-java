package shen.gen;



import com.mentics.shen.*;

public class ShenAbackslashZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<backslash>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1025) throws Exception {
return defined(v1025);
}};
public static Object defined(final Object v1025) throws Exception {
final Object f5344 = Fst.LAMBDA.apply(v1025);


final Object i5352;
if ((boolean)(f5344 instanceof Cons)) {
final Object f5345 = Fst.LAMBDA.apply(v1025);

final Object f5346 = Snd.LAMBDA.apply(v1025);
final Object f5347 = ShenReassemble.LAMBDA.apply(((Cons)f5345).tail, f5346);
final Object f5348 = Fst.LAMBDA.apply(f5347);
final Object f5349 = Fst.LAMBDA.apply(v1025);


final Object i5350;
if ((boolean)Lang.equals(((Cons)f5349).head, 92)) {

i5350 = RuntimeContext.symbol("shen-skip");
} else {

i5350 = null;

}final Object f5351 = ShenReassemble.LAMBDA.apply(f5348, i5350);

i5352 = f5351;
} else {

i5352 = null;

}
final Object result5343 = i5352;

final Object i5353;
if ((boolean)Lang.equals(result5343, null)) {

i5353 = null;
} else {

i5353 = result5343;

}

    return i5353;

}
}
