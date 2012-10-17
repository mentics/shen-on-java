package shen.gen;



import com.mentics.shen.*;

public class ShenAsemicolonSymbolZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<semicolon-symbol>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1558) throws Exception {
return defined(v1558);
}};
public static Object defined(final Object v1558) throws Exception {
final Object f5984 = Fst.LAMBDA.apply(v1558);


final Object i5992;
if ((boolean)(f5984 instanceof Cons)) {
final Object f5985 = Fst.LAMBDA.apply(v1558);

final Object f5986 = Snd.LAMBDA.apply(v1558);
final Object f5987 = ShenReassemble.LAMBDA.apply(((Cons)f5985).tail, f5986);
final Object f5988 = Fst.LAMBDA.apply(f5987);
final Object f5989 = Fst.LAMBDA.apply(v1558);


final Object i5990;
if ((boolean)Lang.equals(((Cons)f5989).head, RuntimeContext.symbol(";"))) {

i5990 = RuntimeContext.symbol("shen-skip");
} else {

i5990 = null;

}final Object f5991 = ShenReassemble.LAMBDA.apply(f5988, i5990);

i5992 = f5991;
} else {

i5992 = null;

}
final Object result5983 = i5992;

final Object i5993;
if ((boolean)Lang.equals(result5983, null)) {

i5993 = null;
} else {

i5993 = result5983;

}

    return i5993;

}
}
