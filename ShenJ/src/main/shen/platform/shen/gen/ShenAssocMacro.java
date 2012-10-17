package shen.gen;



import com.mentics.shen.*;

public class ShenAssocMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-assoc-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v552) throws Exception {
return defined(v552);
}};
public static Object defined(final Object v552) throws Exception {


final Object i4569;
if ((boolean)(v552 instanceof Cons)) {



final Object i4567;
if ((boolean)(((Cons)v552).tail instanceof Cons)) {




final Object i4565;
if ((boolean)(((Cons)((Cons)v552).tail).tail instanceof Cons)) {





final Object i4563;
if ((boolean)(((Cons)((Cons)((Cons)v552).tail).tail).tail instanceof Cons)) {

















final Object f4561 = ElementQ.LAMBDA.apply(((Cons)v552).head, new Cons(RuntimeContext.symbol("@p"), new Cons(RuntimeContext.symbol("@v"), new Cons(RuntimeContext.symbol("append"), new Cons(RuntimeContext.symbol("and"), new Cons(RuntimeContext.symbol("or"), new Cons(RuntimeContext.symbol("+"), new Cons(RuntimeContext.symbol("*"), new Cons(RuntimeContext.symbol("do"), Nil.NIL)))))))));

final Object i4562;
if ((boolean)f4561) {

i4562 = true;
} else {

i4562 = false;

}
i4563 = i4562;
} else {

i4563 = false;

}
final Object i4564;
if ((boolean)i4563) {

i4564 = true;
} else {

i4564 = false;

}
i4565 = i4564;
} else {

i4565 = false;

}
final Object i4566;
if ((boolean)i4565) {

i4566 = true;
} else {

i4566 = false;

}
i4567 = i4566;
} else {

i4567 = false;

}
final Object i4568;
if ((boolean)i4567) {

i4568 = true;
} else {

i4568 = false;

}
i4569 = i4568;
} else {

i4569 = false;

}
final Object i4572;
if ((boolean)i4569) {










final Object f4570 = ShenAssocMacro.LAMBDA.apply(new Cons(((Cons)v552).head, ((Cons)((Cons)v552).tail).tail));





i4572 = new Cons(((Cons)v552).head, new Cons(((Cons)((Cons)v552).tail).head, new Cons(f4570, Nil.NIL)));
} else {

final Object i4571;
if ((boolean)true) {

i4571 = v552;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4572 = i4571;

}
    return i4572;

}
}
