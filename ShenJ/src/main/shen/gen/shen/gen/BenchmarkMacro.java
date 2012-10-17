package shen.gen;



import com.mentics.shen.*;

public class BenchmarkMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("benchmark-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6) throws Exception {
return defined(v6);
}};
public static Object defined(final Object v6) throws Exception {


final Object i14;
if ((boolean)(v6 instanceof Cons)) {


final Object i12;
if ((boolean)Lang.equals(RuntimeContext.symbol("benchmark"), ((Cons)v6).head)) {



final Object i10;
if ((boolean)(((Cons)v6).tail instanceof Cons)) {




final Object i8;
if ((boolean)(((Cons)((Cons)v6).tail).tail instanceof Cons)) {




final Object i7;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v6).tail).tail).tail)) {

i7 = true;
} else {

i7 = false;

}
i8 = i7;
} else {

i8 = false;

}
final Object i9;
if ((boolean)i8) {

i9 = true;
} else {

i9 = false;

}
i10 = i9;
} else {

i10 = false;

}
final Object i11;
if ((boolean)i10) {

i11 = true;
} else {

i11 = false;

}
i12 = i11;
} else {

i12 = false;

}
final Object i13;
if ((boolean)i12) {

i13 = true;
} else {

i13 = false;

}
i14 = i13;
} else {

i14 = false;

}
final Object i16;
if ((boolean)i14) {





















i16 = new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("nl"), Nil.NIL), new Cons(new Cons(RuntimeContext.symbol("output"), new Cons(((Cons)((Cons)v6).tail).head, Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("time"), ((Cons)((Cons)v6).tail).tail), Nil.NIL))));
} else {

final Object i15;
if ((boolean)true) {

i15 = v6;
} else {

throw new SimpleError((String)"True condition not found.");


}
i16 = i15;

}
    return i16;

}
}
