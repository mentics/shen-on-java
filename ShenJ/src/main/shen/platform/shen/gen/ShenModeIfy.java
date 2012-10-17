package shen.gen;



import com.mentics.shen.*;

public class ShenModeIfy {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-mode-ify");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1595) throws Exception {
return defined(v1595);
}};
public static Object defined(final Object v1595) throws Exception {


final Object i6297;
if ((boolean)(v1595 instanceof Cons)) {



final Object i6295;
if ((boolean)(((Cons)v1595).tail instanceof Cons)) {



final Object i6293;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), ((Cons)((Cons)v1595).tail).head)) {




final Object i6291;
if ((boolean)(((Cons)((Cons)v1595).tail).tail instanceof Cons)) {




final Object i6290;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1595).tail).tail).tail)) {

i6290 = true;
} else {

i6290 = false;

}
i6291 = i6290;
} else {

i6291 = false;

}
final Object i6292;
if ((boolean)i6291) {

i6292 = true;
} else {

i6292 = false;

}
i6293 = i6292;
} else {

i6293 = false;

}
final Object i6294;
if ((boolean)i6293) {

i6294 = true;
} else {

i6294 = false;

}
i6295 = i6294;
} else {

i6295 = false;

}
final Object i6296;
if ((boolean)i6295) {

i6296 = true;
} else {

i6296 = false;

}
i6297 = i6296;
} else {

i6297 = false;

}
final Object i6299;
if ((boolean)i6297) {























i6299 = new Cons(RuntimeContext.symbol("mode"), new Cons(new Cons(((Cons)v1595).head, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("mode"), new Cons(((Cons)((Cons)((Cons)v1595).tail).tail).head, new Cons(RuntimeContext.symbol("+"), Nil.NIL))), Nil.NIL))), new Cons(RuntimeContext.symbol("-"), Nil.NIL)));
} else {

final Object i6298;
if ((boolean)true) {

i6298 = v1595;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6299 = i6298;

}
    return i6299;

}
}
