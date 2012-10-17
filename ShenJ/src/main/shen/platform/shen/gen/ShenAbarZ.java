package shen.gen;



import com.mentics.shen.*;

public class ShenAbarZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<bar>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v985) throws Exception {
return defined(v985);
}};
public static Object defined(final Object v985) throws Exception {
final Object f4989 = Fst.LAMBDA.apply(v985);


final Object i4997;
if ((boolean)(f4989 instanceof Cons)) {
final Object f4990 = Fst.LAMBDA.apply(v985);

final Object f4991 = Snd.LAMBDA.apply(v985);
final Object f4992 = ShenReassemble.LAMBDA.apply(((Cons)f4990).tail, f4991);
final Object f4993 = Fst.LAMBDA.apply(f4992);
final Object f4994 = Fst.LAMBDA.apply(v985);


final Object i4995;
if ((boolean)Lang.equals(((Cons)f4994).head, 124)) {

i4995 = RuntimeContext.symbol("shen-skip");
} else {

i4995 = null;

}final Object f4996 = ShenReassemble.LAMBDA.apply(f4993, i4995);

i4997 = f4996;
} else {

i4997 = null;

}
final Object result4988 = i4997;

final Object i4998;
if ((boolean)Lang.equals(result4988, null)) {

i4998 = null;
} else {

i4998 = result4988;

}

    return i4998;

}
}
