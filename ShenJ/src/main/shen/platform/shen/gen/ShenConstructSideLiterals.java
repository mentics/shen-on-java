package shen.gen;



import com.mentics.shen.*;

public class ShenConstructSideLiterals {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-construct-side-literals");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1630) throws Exception {
return defined(v1630);
}};
public static Object defined(final Object v1630) throws Exception {

final Object i6381;
if ((boolean)Lang.equals(Nil.NIL, v1630)) {

i6381 = Nil.NIL;
} else {


final Object i6362;
if ((boolean)(v1630 instanceof Cons)) {



final Object i6360;
if ((boolean)(((Cons)v1630).head instanceof Cons)) {



final Object i6358;
if ((boolean)Lang.equals(RuntimeContext.symbol("if"), ((Cons)((Cons)v1630).head).head)) {




final Object i6356;
if ((boolean)(((Cons)((Cons)v1630).head).tail instanceof Cons)) {




final Object i6355;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1630).head).tail).tail)) {

i6355 = true;
} else {

i6355 = false;

}
i6356 = i6355;
} else {

i6356 = false;

}
final Object i6357;
if ((boolean)i6356) {

i6357 = true;
} else {

i6357 = false;

}
i6358 = i6357;
} else {

i6358 = false;

}
final Object i6359;
if ((boolean)i6358) {

i6359 = true;
} else {

i6359 = false;

}
i6360 = i6359;
} else {

i6360 = false;

}
final Object i6361;
if ((boolean)i6360) {

i6361 = true;
} else {

i6361 = false;

}
i6362 = i6361;
} else {

i6362 = false;

}
final Object i6380;
if ((boolean)i6362) {






final Object f6363 = ShenConstructSideLiterals.LAMBDA.apply(((Cons)v1630).tail);


i6380 = new Cons(new Cons(RuntimeContext.symbol("when"), ((Cons)((Cons)v1630).head).tail), f6363);
} else {


final Object i6373;
if ((boolean)(v1630 instanceof Cons)) {



final Object i6371;
if ((boolean)(((Cons)v1630).head instanceof Cons)) {



final Object i6369;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)((Cons)v1630).head).head)) {




final Object i6367;
if ((boolean)(((Cons)((Cons)v1630).head).tail instanceof Cons)) {





final Object i6365;
if ((boolean)(((Cons)((Cons)((Cons)v1630).head).tail).tail instanceof Cons)) {





final Object i6364;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1630).head).tail).tail).tail)) {

i6364 = true;
} else {

i6364 = false;

}
i6365 = i6364;
} else {

i6365 = false;

}
final Object i6366;
if ((boolean)i6365) {

i6366 = true;
} else {

i6366 = false;

}
i6367 = i6366;
} else {

i6367 = false;

}
final Object i6368;
if ((boolean)i6367) {

i6368 = true;
} else {

i6368 = false;

}
i6369 = i6368;
} else {

i6369 = false;

}
final Object i6370;
if ((boolean)i6369) {

i6370 = true;
} else {

i6370 = false;

}
i6371 = i6370;
} else {

i6371 = false;

}
final Object i6372;
if ((boolean)i6371) {

i6372 = true;
} else {

i6372 = false;

}
i6373 = i6372;
} else {

i6373 = false;

}
final Object i6379;
if ((boolean)i6373) {






final Object f6374 = ShenConstructSideLiterals.LAMBDA.apply(((Cons)v1630).tail);


i6379 = new Cons(new Cons(RuntimeContext.symbol("is"), ((Cons)((Cons)v1630).head).tail), f6374);
} else {


final Object i6378;
if ((boolean)(v1630 instanceof Cons)) {

final Object f6375 = ShenConstructSideLiterals.LAMBDA.apply(((Cons)v1630).tail);

i6378 = f6375;
} else {

final Object i6377;
if ((boolean)true) {
final Object f6376 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-construct-side-literals"));

i6377 = f6376;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6378 = i6377;

}
i6379 = i6378;

}
i6380 = i6379;

}
i6381 = i6380;

}
    return i6381;

}
}
