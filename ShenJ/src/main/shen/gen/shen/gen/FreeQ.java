package shen.gen;



import com.mentics.shen.*;

public class FreeQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("free?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v434, final Object v435) throws Exception {
return defined(v434, v435);
}};
public static Object defined(final Object v434, final Object v435) throws Exception {

final Object i464;
if ((boolean)Lang.equals(v435, v434)) {

i464 = false;
} else {


final Object i444;
if ((boolean)(v435 instanceof Cons)) {


final Object i442;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v435).head)) {



final Object i440;
if ((boolean)(((Cons)v435).tail instanceof Cons)) {




final Object i438;
if ((boolean)(((Cons)((Cons)v435).tail).tail instanceof Cons)) {




final Object i437;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v435).tail).tail).tail)) {

i437 = true;
} else {

i437 = false;

}
i438 = i437;
} else {

i438 = false;

}
final Object i439;
if ((boolean)i438) {

i439 = true;
} else {

i439 = false;

}
i440 = i439;
} else {

i440 = false;

}
final Object i441;
if ((boolean)i440) {

i441 = true;
} else {

i441 = false;

}
i442 = i441;
} else {

i442 = false;

}
final Object i443;
if ((boolean)i442) {

i443 = true;
} else {

i443 = false;

}
i444 = i443;
} else {

i444 = false;

}
final Object i463;
if ((boolean)i444) {


final Object f445 = FreeQ.LAMBDA.apply(v434, ((Cons)((Cons)v435).tail).head);

final Object i448;
if ((boolean)f445) {



final Object f446 = FreeQ.LAMBDA.apply(v434, ((Cons)((Cons)((Cons)v435).tail).tail).head);

final Object i447;
if ((boolean)f446) {

i447 = true;
} else {

i447 = false;

}
i448 = i447;
} else {

i448 = false;

}
i463 = i448;
} else {


final Object i456;
if ((boolean)(v435 instanceof Cons)) {


final Object i454;
if ((boolean)Lang.equals(RuntimeContext.symbol("@p"), ((Cons)v435).head)) {



final Object i452;
if ((boolean)(((Cons)v435).tail instanceof Cons)) {




final Object i450;
if ((boolean)(((Cons)((Cons)v435).tail).tail instanceof Cons)) {




final Object i449;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v435).tail).tail).tail)) {

i449 = true;
} else {

i449 = false;

}
i450 = i449;
} else {

i450 = false;

}
final Object i451;
if ((boolean)i450) {

i451 = true;
} else {

i451 = false;

}
i452 = i451;
} else {

i452 = false;

}
final Object i453;
if ((boolean)i452) {

i453 = true;
} else {

i453 = false;

}
i454 = i453;
} else {

i454 = false;

}
final Object i455;
if ((boolean)i454) {

i455 = true;
} else {

i455 = false;

}
i456 = i455;
} else {

i456 = false;

}
final Object i462;
if ((boolean)i456) {


final Object f457 = FreeQ.LAMBDA.apply(v434, ((Cons)((Cons)v435).tail).head);

final Object i460;
if ((boolean)f457) {



final Object f458 = FreeQ.LAMBDA.apply(v434, ((Cons)((Cons)((Cons)v435).tail).tail).head);

final Object i459;
if ((boolean)f458) {

i459 = true;
} else {

i459 = false;

}
i460 = i459;
} else {

i460 = false;

}
i462 = i460;
} else {

final Object i461;
if ((boolean)true) {

i461 = true;
} else {

throw new SimpleError((String)"True condition not found.");


}
i462 = i461;

}
i463 = i462;

}
i464 = i463;

}
    return i464;

}
}
