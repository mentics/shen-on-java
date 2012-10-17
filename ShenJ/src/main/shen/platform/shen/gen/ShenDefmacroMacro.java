package shen.gen;



import com.mentics.shen.*;

public class ShenDefmacroMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-defmacro-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v542) throws Exception {
return defined(v542);
}};
public static Object defined(final Object v542) throws Exception {


final Object i4353;
if ((boolean)(v542 instanceof Cons)) {


final Object i4351;
if ((boolean)Lang.equals(RuntimeContext.symbol("defmacro"), ((Cons)v542).head)) {



final Object i4350;
if ((boolean)(((Cons)v542).tail instanceof Cons)) {

i4350 = true;
} else {

i4350 = false;

}
i4351 = i4350;
} else {

i4351 = false;

}
final Object i4352;
if ((boolean)i4351) {

i4352 = true;
} else {

i4352 = false;

}
i4353 = i4352;
} else {

i4353 = false;

}
final Object i4359;
if ((boolean)i4353) {












final Object f4355 = Append.LAMBDA.apply(((Cons)((Cons)v542).tail).tail, new Cons(RuntimeContext.symbol("X"), new Cons(RuntimeContext.symbol("->"), new Cons(RuntimeContext.symbol("X"), Nil.NIL))));



final Object macro4354 = new Cons(RuntimeContext.symbol("define"), new Cons(((Cons)((Cons)v542).tail).head, f4355));

























final Object declare4356 = new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("set"), new Cons(RuntimeContext.symbol("*macros*"), new Cons(new Cons(RuntimeContext.symbol("adjoin"), new Cons(((Cons)((Cons)v542).tail).head, new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(RuntimeContext.symbol("*macros*"), Nil.NIL)), Nil.NIL))), Nil.NIL))), new Cons(RuntimeContext.symbol("macro"), Nil.NIL)));











final Object package4357 = new Cons(RuntimeContext.symbol("package"), new Cons(RuntimeContext.symbol("null"), new Cons(Nil.NIL, new Cons(declare4356, new Cons(macro4354, Nil.NIL)))));




i4359 = package4357;
} else {

final Object i4358;
if ((boolean)true) {

i4358 = v542;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4359 = i4358;

}
    return i4359;

}
}
