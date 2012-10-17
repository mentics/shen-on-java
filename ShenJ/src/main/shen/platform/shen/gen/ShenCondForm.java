package shen.gen;



import com.mentics.shen.*;

public class ShenCondForm {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-cond-form");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v516) throws Exception {
return defined(v516);
}};
public static Object defined(final Object v516) throws Exception {


final Object i2372;
if ((boolean)(v516 instanceof Cons)) {



final Object i2370;
if ((boolean)(((Cons)v516).head instanceof Cons)) {



final Object i2368;
if ((boolean)Lang.equals(true, ((Cons)((Cons)v516).head).head)) {




final Object i2366;
if ((boolean)(((Cons)((Cons)v516).head).tail instanceof Cons)) {




final Object i2365;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v516).head).tail).tail)) {

i2365 = true;
} else {

i2365 = false;

}
i2366 = i2365;
} else {

i2366 = false;

}
final Object i2367;
if ((boolean)i2366) {

i2367 = true;
} else {

i2367 = false;

}
i2368 = i2367;
} else {

i2368 = false;

}
final Object i2369;
if ((boolean)i2368) {

i2369 = true;
} else {

i2369 = false;

}
i2370 = i2369;
} else {

i2370 = false;

}
final Object i2371;
if ((boolean)i2370) {

i2371 = true;
} else {

i2371 = false;

}
i2372 = i2371;
} else {

i2372 = false;

}
final Object i2374;
if ((boolean)i2372) {




i2374 = ((Cons)((Cons)((Cons)v516).head).tail).head;
} else {

final Object i2373;
if ((boolean)true) {



i2373 = new Cons(RuntimeContext.symbol("cond"), v516);
} else {

throw new SimpleError((String)"True condition not found.");


}
i2374 = i2373;

}
    return i2374;

}
}
