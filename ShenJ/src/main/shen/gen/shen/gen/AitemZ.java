package shen.gen;



import com.mentics.shen.*;

public class AitemZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("<item>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v986) throws Exception {
return defined(v986);
}};
public static Object defined(final Object v986) throws Exception {
final Object f988 = Fst.LAMBDA.apply(v986);


final Object i997;
if ((boolean)(f988 instanceof Cons)) {
final Object f989 = Fst.LAMBDA.apply(v986);

final Object f990 = Snd.LAMBDA.apply(v986);
final Object f991 = ShenReassemble.LAMBDA.apply(((Cons)f989).tail, f990);
final Object f992 = Fst.LAMBDA.apply(f991);
final Object f993 = Fst.LAMBDA.apply(v986);





final Object f994 = ElementQ.LAMBDA.apply(((Cons)f993).head, new Cons(40, new Cons(41, Nil.NIL)));

final Object i995;
if ((boolean)f994) {

i995 = null;
} else {

i995 = RuntimeContext.symbol("ok");

}final Object f996 = ShenReassemble.LAMBDA.apply(f992, i995);

i997 = f996;
} else {

i997 = null;

}
final Object result987 = i997;

final Object i998;
if ((boolean)Lang.equals(result987, null)) {

i998 = null;
} else {

i998 = result987;

}

    return i998;

}
}
