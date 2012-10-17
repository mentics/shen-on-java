package shen.gen;



import com.mentics.shen.*;

public class ShenShowP {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-show-p");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v803) throws Exception {
return defined(v803);
}};
public static Object defined(final Object v803) throws Exception {


final Object i2331;
if ((boolean)(v803 instanceof Cons)) {



final Object i2329;
if ((boolean)(((Cons)v803).tail instanceof Cons)) {



final Object i2327;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), ((Cons)((Cons)v803).tail).head)) {




final Object i2325;
if ((boolean)(((Cons)((Cons)v803).tail).tail instanceof Cons)) {




final Object i2324;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v803).tail).tail).tail)) {

i2324 = true;
} else {

i2324 = false;

}
i2325 = i2324;
} else {

i2325 = false;

}
final Object i2326;
if ((boolean)i2325) {

i2326 = true;
} else {

i2326 = false;

}
i2327 = i2326;
} else {

i2327 = false;

}
final Object i2328;
if ((boolean)i2327) {

i2328 = true;
} else {

i2328 = false;

}
i2329 = i2328;
} else {

i2329 = false;

}
final Object i2330;
if ((boolean)i2329) {

i2330 = true;
} else {

i2330 = false;

}
i2331 = i2330;
} else {

i2331 = false;

}
final Object i2338;
if ((boolean)i2331) {




final Object f2332 = Atp.LAMBDA.apply(((Cons)((Cons)((Cons)v803).tail).tail).head, Nil.NIL);
final Object f2333 = Atp.LAMBDA.apply(((Cons)v803).head, f2332);
final Object f2334 = Intoutput.LAMBDA.apply("~R : ~R", f2333);

i2338 = f2334;
} else {

final Object i2337;
if ((boolean)true) {
final Object f2335 = Atp.LAMBDA.apply(v803, Nil.NIL);
final Object f2336 = Intoutput.LAMBDA.apply("~R", f2335);

i2337 = f2336;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2338 = i2337;

}
    return i2338;

}
}
