package shen.gen;



import com.mentics.shen.*;

public class ShenAbsMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-abs-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v554) throws Exception {
return defined(v554);
}};
public static Object defined(final Object v554) throws Exception {


final Object i4593;
if ((boolean)(v554 instanceof Cons)) {


final Object i4591;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)v554).head)) {



final Object i4589;
if ((boolean)(((Cons)v554).tail instanceof Cons)) {




final Object i4587;
if ((boolean)(((Cons)((Cons)v554).tail).tail instanceof Cons)) {





final Object i4586;
if ((boolean)(((Cons)((Cons)((Cons)v554).tail).tail).tail instanceof Cons)) {

i4586 = true;
} else {

i4586 = false;

}
i4587 = i4586;
} else {

i4587 = false;

}
final Object i4588;
if ((boolean)i4587) {

i4588 = true;
} else {

i4588 = false;

}
i4589 = i4588;
} else {

i4589 = false;

}
final Object i4590;
if ((boolean)i4589) {

i4590 = true;
} else {

i4590 = false;

}
i4591 = i4590;
} else {

i4591 = false;

}
final Object i4592;
if ((boolean)i4591) {

i4592 = true;
} else {

i4592 = false;

}
i4593 = i4592;
} else {

i4593 = false;

}
final Object i4605;
if ((boolean)i4593) {








final Object f4594 = ShenAbsMacro.LAMBDA.apply(new Cons(RuntimeContext.symbol("/."), ((Cons)((Cons)v554).tail).tail));





i4605 = new Cons(RuntimeContext.symbol("lambda"), new Cons(((Cons)((Cons)v554).tail).head, new Cons(f4594, Nil.NIL)));
} else {


final Object i4602;
if ((boolean)(v554 instanceof Cons)) {


final Object i4600;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)v554).head)) {



final Object i4598;
if ((boolean)(((Cons)v554).tail instanceof Cons)) {




final Object i4596;
if ((boolean)(((Cons)((Cons)v554).tail).tail instanceof Cons)) {




final Object i4595;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v554).tail).tail).tail)) {

i4595 = true;
} else {

i4595 = false;

}
i4596 = i4595;
} else {

i4596 = false;

}
final Object i4597;
if ((boolean)i4596) {

i4597 = true;
} else {

i4597 = false;

}
i4598 = i4597;
} else {

i4598 = false;

}
final Object i4599;
if ((boolean)i4598) {

i4599 = true;
} else {

i4599 = false;

}
i4600 = i4599;
} else {

i4600 = false;

}
final Object i4601;
if ((boolean)i4600) {

i4601 = true;
} else {

i4601 = false;

}
i4602 = i4601;
} else {

i4602 = false;

}
final Object i4604;
if ((boolean)i4602) {




i4604 = new Cons(RuntimeContext.symbol("lambda"), ((Cons)v554).tail);
} else {

final Object i4603;
if ((boolean)true) {

i4603 = v554;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4604 = i4603;

}
i4605 = i4604;

}
    return i4605;

}
}
