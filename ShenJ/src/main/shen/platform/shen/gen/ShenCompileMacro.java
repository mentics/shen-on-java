package shen.gen;



import com.mentics.shen.*;

public class ShenCompileMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-compile-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v534) throws Exception {
return defined(v534);
}};
public static Object defined(final Object v534) throws Exception {


final Object i4310;
if ((boolean)(v534 instanceof Cons)) {


final Object i4308;
if ((boolean)Lang.equals(RuntimeContext.symbol("compile"), ((Cons)v534).head)) {



final Object i4306;
if ((boolean)(((Cons)v534).tail instanceof Cons)) {




final Object i4304;
if ((boolean)(((Cons)((Cons)v534).tail).tail instanceof Cons)) {




final Object i4303;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v534).tail).tail).tail)) {

i4303 = true;
} else {

i4303 = false;

}
i4304 = i4303;
} else {

i4304 = false;

}
final Object i4305;
if ((boolean)i4304) {

i4305 = true;
} else {

i4305 = false;

}
i4306 = i4305;
} else {

i4306 = false;

}
final Object i4307;
if ((boolean)i4306) {

i4307 = true;
} else {

i4307 = false;

}
i4308 = i4307;
} else {

i4308 = false;

}
final Object i4309;
if ((boolean)i4308) {

i4309 = true;
} else {

i4309 = false;

}
i4310 = i4309;
} else {

i4310 = false;

}
final Object i4312;
if ((boolean)i4310) {














i4312 = new Cons(RuntimeContext.symbol("compile"), new Cons(((Cons)((Cons)v534).tail).head, new Cons(((Cons)((Cons)((Cons)v534).tail).tail).head, new Cons(Nil.NIL, Nil.NIL))));
} else {

final Object i4311;
if ((boolean)true) {

i4311 = v534;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4312 = i4311;

}
    return i4312;

}
}
