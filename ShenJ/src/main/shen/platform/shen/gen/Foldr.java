package shen.gen;



import com.mentics.shen.*;

public class Foldr {

public static final Symbol SYMBOL = RuntimeContext.symbol("foldr");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v6959, final Object v6960, final Object v6961) throws Exception {
return defined(v6959, v6960, v6961);
}};
public static Object defined(final Object v6959, final Object v6960, final Object v6961) throws Exception {

final Object i7216;
if ((boolean)Lang.equals(Nil.NIL, v6961)) {

i7216 = v6960;
} else {


final Object i7215;
if ((boolean)(v6961 instanceof Cons)) {


final Object f7211 = Foldr.LAMBDA.apply(v6959, v6960, ((Cons)v6961).tail);
final Object f7212 = RuntimeContext.dispatch(v6959).apply(((Cons)v6961).head, f7211);

i7215 = f7212;
} else {

final Object i7214;
if ((boolean)true) {
final Object f7213 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("foldr"));

i7214 = f7213;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7215 = i7214;

}
i7216 = i7215;

}
    return i7216;

}
}
