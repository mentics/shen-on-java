package shen.gen;



import com.mentics.shen.*;

public class Sub {

public static final Symbol SYMBOL = RuntimeContext.symbol("sub");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v232, final Object v233) throws Exception {
return defined(v232, v233);
}};
public static Object defined(final Object v232, final Object v233) throws Exception {

final Object i244;
if ((boolean)Lang.equals(Nil.NIL, v232)) {

i244 = v233;
} else {


final Object i236;
if ((boolean)(v232 instanceof Cons)) {

final Object f234 = TupleQ.LAMBDA.apply(((Cons)v232).head);

final Object i235;
if ((boolean)f234) {

i235 = true;
} else {

i235 = false;

}
i236 = i235;
} else {

i236 = false;

}
final Object i243;
if ((boolean)i236) {


final Object f237 = Fst.LAMBDA.apply(((Cons)v232).head);

final Object f238 = Snd.LAMBDA.apply(((Cons)v232).head);
final Object f239 = Replace.LAMBDA.apply(f237, f238, v233);
final Object f240 = Sub.LAMBDA.apply(((Cons)v232).tail, f239);

i243 = f240;
} else {

final Object i242;
if ((boolean)true) {
final Object f241 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("sub"));

i242 = f241;
} else {

throw new SimpleError((String)"True condition not found.");


}
i243 = i242;

}
i244 = i243;

}
    return i244;

}
}
