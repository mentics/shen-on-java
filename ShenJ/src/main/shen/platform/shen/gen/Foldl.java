package shen.gen;



import com.mentics.shen.*;

public class Foldl {

public static final Symbol SYMBOL = RuntimeContext.symbol("foldl");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v6956, final Object v6957, final Object v6958) throws Exception {
return defined(v6956, v6957, v6958);
}};
public static Object defined(final Object v6956, final Object v6957, final Object v6958) throws Exception {

final Object i7210;
if ((boolean)Lang.equals(Nil.NIL, v6958)) {

i7210 = v6957;
} else {


final Object i7209;
if ((boolean)(v6958 instanceof Cons)) {

final Object f7205 = RuntimeContext.dispatch(v6956).apply(v6957, ((Cons)v6958).head);

final Object f7206 = Foldl.LAMBDA.apply(v6956, f7205, ((Cons)v6958).tail);

i7209 = f7206;
} else {

final Object i7208;
if ((boolean)true) {
final Object f7207 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("foldl"));

i7208 = f7207;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7209 = i7208;

}
i7210 = i7209;

}
    return i7210;

}
}
