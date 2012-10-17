package shen.gen;



import com.mentics.shen.*;

public class ShenAEZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<E>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1027) throws Exception {
return defined(v1027);
}};
public static Object defined(final Object v1027) throws Exception {
final Object f5449 = Fst.LAMBDA.apply(v1027);


final Object i5452;
if ((boolean)(f5449 instanceof Cons)) {
final Object f5450 = Fst.LAMBDA.apply(v1027);


final Object i5451;
if ((boolean)Lang.equals(101, ((Cons)f5450).head)) {

i5451 = true;
} else {

i5451 = false;

}
i5452 = i5451;
} else {

i5452 = false;

}
final Object i5458;
if ((boolean)i5452) {
final Object f5453 = Fst.LAMBDA.apply(v1027);

final Object f5454 = Snd.LAMBDA.apply(v1027);
final Object f5455 = ShenReassemble.LAMBDA.apply(((Cons)f5453).tail, f5454);
final Object f5456 = Fst.LAMBDA.apply(f5455);


final Object f5457 = ShenReassemble.LAMBDA.apply(f5456, new Cons(101, Nil.NIL));

i5458 = f5457;
} else {

i5458 = null;

}
final Object result5448 = i5458;

final Object i5459;
if ((boolean)Lang.equals(result5448, null)) {

i5459 = null;
} else {

i5459 = result5448;

}

    return i5459;

}
}
