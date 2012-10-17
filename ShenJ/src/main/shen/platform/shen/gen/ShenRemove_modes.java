package shen.gen;



import com.mentics.shen.*;

public class ShenRemove_modes {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-remove_modes");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1319) throws Exception {
return defined(v1319);
}};
public static Object defined(final Object v1319) throws Exception {


final Object i3411;
if ((boolean)(v1319 instanceof Cons)) {


final Object i3409;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1319).head)) {



final Object i3407;
if ((boolean)(((Cons)v1319).tail instanceof Cons)) {




final Object i3405;
if ((boolean)(((Cons)((Cons)v1319).tail).tail instanceof Cons)) {




final Object i3403;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), ((Cons)((Cons)((Cons)v1319).tail).tail).head)) {




final Object i3402;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1319).tail).tail).tail)) {

i3402 = true;
} else {

i3402 = false;

}
i3403 = i3402;
} else {

i3403 = false;

}
final Object i3404;
if ((boolean)i3403) {

i3404 = true;
} else {

i3404 = false;

}
i3405 = i3404;
} else {

i3405 = false;

}
final Object i3406;
if ((boolean)i3405) {

i3406 = true;
} else {

i3406 = false;

}
i3407 = i3406;
} else {

i3407 = false;

}
final Object i3408;
if ((boolean)i3407) {

i3408 = true;
} else {

i3408 = false;

}
i3409 = i3408;
} else {

i3409 = false;

}
final Object i3410;
if ((boolean)i3409) {

i3410 = true;
} else {

i3410 = false;

}
i3411 = i3410;
} else {

i3411 = false;

}
final Object i3429;
if ((boolean)i3411) {


final Object f3412 = ShenRemove_modes.LAMBDA.apply(((Cons)((Cons)v1319).tail).head);

i3429 = f3412;
} else {


final Object i3422;
if ((boolean)(v1319 instanceof Cons)) {


final Object i3420;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1319).head)) {



final Object i3418;
if ((boolean)(((Cons)v1319).tail instanceof Cons)) {




final Object i3416;
if ((boolean)(((Cons)((Cons)v1319).tail).tail instanceof Cons)) {




final Object i3414;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), ((Cons)((Cons)((Cons)v1319).tail).tail).head)) {




final Object i3413;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1319).tail).tail).tail)) {

i3413 = true;
} else {

i3413 = false;

}
i3414 = i3413;
} else {

i3414 = false;

}
final Object i3415;
if ((boolean)i3414) {

i3415 = true;
} else {

i3415 = false;

}
i3416 = i3415;
} else {

i3416 = false;

}
final Object i3417;
if ((boolean)i3416) {

i3417 = true;
} else {

i3417 = false;

}
i3418 = i3417;
} else {

i3418 = false;

}
final Object i3419;
if ((boolean)i3418) {

i3419 = true;
} else {

i3419 = false;

}
i3420 = i3419;
} else {

i3420 = false;

}
final Object i3421;
if ((boolean)i3420) {

i3421 = true;
} else {

i3421 = false;

}
i3422 = i3421;
} else {

i3422 = false;

}
final Object i3428;
if ((boolean)i3422) {


final Object f3423 = ShenRemove_modes.LAMBDA.apply(((Cons)((Cons)v1319).tail).head);

i3428 = f3423;
} else {


final Object i3427;
if ((boolean)(v1319 instanceof Cons)) {

final Object f3424 = ShenRemove_modes.LAMBDA.apply(((Cons)v1319).head);


final Object f3425 = ShenRemove_modes.LAMBDA.apply(((Cons)v1319).tail);


i3427 = new Cons(f3424, f3425);
} else {

final Object i3426;
if ((boolean)true) {

i3426 = v1319;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3427 = i3426;

}
i3428 = i3427;

}
i3429 = i3428;

}
    return i3429;

}
}
