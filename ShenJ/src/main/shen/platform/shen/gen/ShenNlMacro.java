package shen.gen;



import com.mentics.shen.*;

public class ShenNlMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-nl-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v549) throws Exception {
return defined(v549);
}};
public static Object defined(final Object v549) throws Exception {


final Object i4548;
if ((boolean)(v549 instanceof Cons)) {


final Object i4546;
if ((boolean)Lang.equals(RuntimeContext.symbol("nl"), ((Cons)v549).head)) {


final Object i4545;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v549).tail)) {

i4545 = true;
} else {

i4545 = false;

}
i4546 = i4545;
} else {

i4546 = false;

}
final Object i4547;
if ((boolean)i4546) {

i4547 = true;
} else {

i4547 = false;

}
i4548 = i4547;
} else {

i4548 = false;

}
final Object i4550;
if ((boolean)i4548) {





i4550 = new Cons(RuntimeContext.symbol("nl"), new Cons(1, Nil.NIL));
} else {

final Object i4549;
if ((boolean)true) {

i4549 = v549;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4550 = i4549;

}
    return i4550;

}
}
