package shen.gen;



import com.mentics.shen.*;

public class GetSecond {

public static final Symbol SYMBOL = RuntimeContext.symbol("get-second");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v2297, final Object v2298) throws Exception {
return defined(v2297, v2298);
}};
public static Object defined(final Object v2297, final Object v2298) throws Exception {

final Object i2313;
if ((boolean)Lang.equals(Nil.NIL, v2298)) {
final Object f2299 = Atp.LAMBDA.apply(v2297, Nil.NIL);
final Object f2300 = IntmakeString.LAMBDA.apply("Element not found in get-second for ~A", f2299);

throw new SimpleError((String)f2300);

} else {


final Object i2303;
if ((boolean)(v2298 instanceof Cons)) {

final Object f2301 = TupleQ.LAMBDA.apply(((Cons)v2298).head);

final Object i2302;
if ((boolean)f2301) {

i2302 = true;
} else {

i2302 = false;

}
i2303 = i2302;
} else {

i2303 = false;

}
final Object i2312;
if ((boolean)i2303) {

final Object f2304 = Fst.LAMBDA.apply(((Cons)v2298).head);

final Object i2307;
if ((boolean)Lang.equals(v2297, f2304)) {

final Object f2305 = Snd.LAMBDA.apply(((Cons)v2298).head);

i2307 = f2305;
} else {

final Object f2306 = GetSecond.LAMBDA.apply(v2297, ((Cons)v2298).tail);

i2307 = f2306;

}
i2312 = i2307;
} else {

final Object i2311;
if ((boolean)true) {
final Object f2308 = Atp.LAMBDA.apply(v2298, Nil.NIL);
final Object f2309 = Atp.LAMBDA.apply(v2297, f2308);
final Object f2310 = IntmakeString.LAMBDA.apply("get-second: X: ~A~%Y: ~A", f2309);

throw new SimpleError((String)f2310);

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i2313 = i2312;

}
    return i2313;

}
}
