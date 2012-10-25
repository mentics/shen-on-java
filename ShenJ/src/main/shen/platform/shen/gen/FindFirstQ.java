package shen.gen;



import com.mentics.shen.*;

public class FindFirstQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("find-first?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v2283, final Object v2284) throws Exception {
return defined(v2283, v2284);
}};
public static Object defined(final Object v2283, final Object v2284) throws Exception {

final Object i2296;
if ((boolean)Lang.equals(Nil.NIL, v2284)) {

i2296 = false;
} else {


final Object i2287;
if ((boolean)(v2284 instanceof Cons)) {

final Object f2285 = TupleQ.LAMBDA.apply(((Cons)v2284).head);

final Object i2286;
if ((boolean)f2285) {

i2286 = true;
} else {

i2286 = false;

}
i2287 = i2286;
} else {

i2287 = false;

}
final Object i2295;
if ((boolean)i2287) {

final Object f2288 = Fst.LAMBDA.apply(((Cons)v2284).head);

final Object i2290;
if ((boolean)Lang.equals(v2283, f2288)) {

i2290 = true;
} else {

final Object f2289 = FindFirstQ.LAMBDA.apply(v2283, ((Cons)v2284).tail);

i2290 = f2289;

}
i2295 = i2290;
} else {

final Object i2294;
if ((boolean)true) {
final Object f2291 = Atp.LAMBDA.apply(v2284, Nil.NIL);
final Object f2292 = Atp.LAMBDA.apply(v2283, f2291);
final Object f2293 = IntmakeString.LAMBDA.apply("find-first: X: ~A~%Y: ~A", f2292);

throw new SimpleError((String)f2293);

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i2296 = i2295;

}
    return i2296;

}
}
