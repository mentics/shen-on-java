package shen.gen;



import com.mentics.shen.*;

public class ShenArrbZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<rrb>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v992) throws Exception {
return defined(v992);
}};
public static Object defined(final Object v992) throws Exception {
final Object f5066 = Fst.LAMBDA.apply(v992);


final Object i5074;
if ((boolean)(f5066 instanceof Cons)) {
final Object f5067 = Fst.LAMBDA.apply(v992);

final Object f5068 = Snd.LAMBDA.apply(v992);
final Object f5069 = ShenReassemble.LAMBDA.apply(((Cons)f5067).tail, f5068);
final Object f5070 = Fst.LAMBDA.apply(f5069);
final Object f5071 = Fst.LAMBDA.apply(v992);


final Object i5072;
if ((boolean)Lang.equals(((Cons)f5071).head, 41)) {

i5072 = RuntimeContext.symbol("shen-skip");
} else {

i5072 = null;

}final Object f5073 = ShenReassemble.LAMBDA.apply(f5070, i5072);

i5074 = f5073;
} else {

i5074 = null;

}
final Object result5065 = i5074;

final Object i5075;
if ((boolean)Lang.equals(result5065, null)) {

i5075 = null;
} else {

i5075 = result5065;

}

    return i5075;

}
}
