package shen.gen;



import com.mentics.shen.*;

public class ShenShowAssumptions {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-show-assumptions");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v806, final Object v807) throws Exception {
return defined(v806, v807);
}};
public static Object defined(final Object v806, final Object v807) throws Exception {

final Object i2350;
if ((boolean)Lang.equals(Nil.NIL, v806)) {

i2350 = RuntimeContext.symbol("shen-skip");
} else {


final Object i2349;
if ((boolean)(v806 instanceof Cons)) {
final Object f2339 = Atp.LAMBDA.apply(v807, Nil.NIL);
final Object f2340 = Intoutput.LAMBDA.apply("~A. ", f2339);

final Object f2341 = ShenShowP.LAMBDA.apply(((Cons)v806).head);
final Object f2342 = Nl.LAMBDA.apply(1);



final Object f2343 = ShenShowAssumptions.LAMBDA.apply(((Cons)v806).tail, Primitives.plus.apply(v807, 1));
final Object f2344 = Do.LAMBDA.apply(f2342, f2343);
final Object f2345 = Do.LAMBDA.apply(f2341, f2344);
final Object f2346 = Do.LAMBDA.apply(f2340, f2345);

i2349 = f2346;
} else {

final Object i2348;
if ((boolean)true) {
final Object f2347 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("shen-show-assumptions"));

i2348 = f2347;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2349 = i2348;

}
i2350 = i2349;

}
    return i2350;

}
}
