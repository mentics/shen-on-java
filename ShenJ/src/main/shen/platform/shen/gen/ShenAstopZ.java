package shen.gen;



import com.mentics.shen.*;

public class ShenAstopZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<stop>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1030) throws Exception {
return defined(v1030);
}};
public static Object defined(final Object v1030) throws Exception {
final Object f5495 = Fst.LAMBDA.apply(v1030);


final Object i5503;
if ((boolean)(f5495 instanceof Cons)) {
final Object f5496 = Fst.LAMBDA.apply(v1030);

final Object f5497 = Snd.LAMBDA.apply(v1030);
final Object f5498 = ShenReassemble.LAMBDA.apply(((Cons)f5496).tail, f5497);
final Object f5499 = Fst.LAMBDA.apply(f5498);
final Object f5500 = Fst.LAMBDA.apply(v1030);


final Object i5501;
if ((boolean)Lang.equals(((Cons)f5500).head, 46)) {

i5501 = RuntimeContext.symbol("shen-skip");
} else {

i5501 = null;

}final Object f5502 = ShenReassemble.LAMBDA.apply(f5499, i5501);

i5503 = f5502;
} else {

i5503 = null;

}
final Object result5494 = i5503;

final Object i5504;
if ((boolean)Lang.equals(result5494, null)) {

i5504 = null;
} else {

i5504 = result5494;

}

    return i5504;

}
}
