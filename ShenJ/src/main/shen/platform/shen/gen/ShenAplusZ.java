package shen.gen;



import com.mentics.shen.*;

public class ShenAplusZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<plus>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1029) throws Exception {
return defined(v1029);
}};
public static Object defined(final Object v1029) throws Exception {
final Object f5484 = Fst.LAMBDA.apply(v1029);


final Object i5492;
if ((boolean)(f5484 instanceof Cons)) {
final Object f5485 = Fst.LAMBDA.apply(v1029);

final Object f5486 = Snd.LAMBDA.apply(v1029);
final Object f5487 = ShenReassemble.LAMBDA.apply(((Cons)f5485).tail, f5486);
final Object f5488 = Fst.LAMBDA.apply(f5487);
final Object f5489 = Fst.LAMBDA.apply(v1029);


final Object i5490;
if ((boolean)Lang.equals(((Cons)f5489).head, 43)) {

i5490 = RuntimeContext.symbol("shen-skip");
} else {

i5490 = null;

}final Object f5491 = ShenReassemble.LAMBDA.apply(f5488, i5490);

i5492 = f5491;
} else {

i5492 = null;

}
final Object result5483 = i5492;

final Object i5493;
if ((boolean)Lang.equals(result5483, null)) {

i5493 = null;
} else {

i5493 = result5483;

}

    return i5493;

}
}
