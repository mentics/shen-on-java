package shen.gen;



import com.mentics.shen.*;

public class ShenProcInputPlus {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-proc-input+");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v655) throws Exception {
return defined(v655);
}};
public static Object defined(final Object v655) throws Exception {


final Object i629;
if ((boolean)(v655 instanceof Cons)) {


final Object i627;
if ((boolean)Lang.equals(RuntimeContext.symbol("input+"), ((Cons)v655).head)) {



final Object i625;
if ((boolean)(((Cons)v655).tail instanceof Cons)) {




final Object i623;
if ((boolean)(((Cons)((Cons)v655).tail).tail instanceof Cons)) {




final Object i622;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v655).tail).tail).tail)) {

i622 = true;
} else {

i622 = false;

}
i623 = i622;
} else {

i623 = false;

}
final Object i624;
if ((boolean)i623) {

i624 = true;
} else {

i624 = false;

}
i625 = i624;
} else {

i625 = false;

}
final Object i626;
if ((boolean)i625) {

i626 = true;
} else {

i626 = false;

}
i627 = i626;
} else {

i627 = false;

}
final Object i628;
if ((boolean)i627) {

i628 = true;
} else {

i628 = false;

}
i629 = i628;
} else {

i629 = false;

}
final Object i636;
if ((boolean)i629) {







final Object f630 = ShenRcons_form.LAMBDA.apply(((Cons)((Cons)((Cons)v655).tail).tail).head);





i636 = new Cons(RuntimeContext.symbol("input+"), new Cons(((Cons)((Cons)v655).tail).head, new Cons(f630, Nil.NIL)));
} else {


final Object i635;
if ((boolean)(v655 instanceof Cons)) {
final Lambda l632 = new Lambda1() {
  public Object apply(final Object v656) throws Exception {
    final Object f631 = ShenProcInputPlus.LAMBDA.apply(v656);

    return f631;
  }
};final Object f633 = Map.LAMBDA.apply(l632, v655);

i635 = f633;
} else {

final Object i634;
if ((boolean)true) {

i634 = v655;
} else {

throw new SimpleError((String)"True condition not found.");


}
i635 = i634;

}
i636 = i635;

}
    return i636;

}
}
