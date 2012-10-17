package shen.gen;



import com.mentics.shen.*;

public class ShenLetMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-let-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v553) throws Exception {
return defined(v553);
}};
public static Object defined(final Object v553) throws Exception {


final Object i4582;
if ((boolean)(v553 instanceof Cons)) {


final Object i4580;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)v553).head)) {



final Object i4578;
if ((boolean)(((Cons)v553).tail instanceof Cons)) {




final Object i4576;
if ((boolean)(((Cons)((Cons)v553).tail).tail instanceof Cons)) {





final Object i4574;
if ((boolean)(((Cons)((Cons)((Cons)v553).tail).tail).tail instanceof Cons)) {






final Object i4573;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v553).tail).tail).tail).tail instanceof Cons)) {

i4573 = true;
} else {

i4573 = false;

}
i4574 = i4573;
} else {

i4574 = false;

}
final Object i4575;
if ((boolean)i4574) {

i4575 = true;
} else {

i4575 = false;

}
i4576 = i4575;
} else {

i4576 = false;

}
final Object i4577;
if ((boolean)i4576) {

i4577 = true;
} else {

i4577 = false;

}
i4578 = i4577;
} else {

i4578 = false;

}
final Object i4579;
if ((boolean)i4578) {

i4579 = true;
} else {

i4579 = false;

}
i4580 = i4579;
} else {

i4580 = false;

}
final Object i4581;
if ((boolean)i4580) {

i4581 = true;
} else {

i4581 = false;

}
i4582 = i4581;
} else {

i4582 = false;

}
final Object i4585;
if ((boolean)i4582) {













final Object f4583 = ShenLetMacro.LAMBDA.apply(new Cons(RuntimeContext.symbol("let"), ((Cons)((Cons)((Cons)v553).tail).tail).tail));






i4585 = new Cons(RuntimeContext.symbol("let"), new Cons(((Cons)((Cons)v553).tail).head, new Cons(((Cons)((Cons)((Cons)v553).tail).tail).head, new Cons(f4583, Nil.NIL))));
} else {

final Object i4584;
if ((boolean)true) {

i4584 = v553;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4585 = i4584;

}
    return i4585;

}
}
