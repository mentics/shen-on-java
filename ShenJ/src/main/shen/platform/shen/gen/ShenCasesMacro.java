package shen.gen;



import com.mentics.shen.*;

public class ShenCasesMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-cases-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v557) throws Exception {
return defined(v557);
}};
public static Object defined(final Object v557) throws Exception {


final Object i4613;
if ((boolean)(v557 instanceof Cons)) {


final Object i4611;
if ((boolean)Lang.equals(RuntimeContext.symbol("cases"), ((Cons)v557).head)) {



final Object i4609;
if ((boolean)(((Cons)v557).tail instanceof Cons)) {



final Object i4607;
if ((boolean)Lang.equals(true, ((Cons)((Cons)v557).tail).head)) {




final Object i4606;
if ((boolean)(((Cons)((Cons)v557).tail).tail instanceof Cons)) {

i4606 = true;
} else {

i4606 = false;

}
i4607 = i4606;
} else {

i4607 = false;

}
final Object i4608;
if ((boolean)i4607) {

i4608 = true;
} else {

i4608 = false;

}
i4609 = i4608;
} else {

i4609 = false;

}
final Object i4610;
if ((boolean)i4609) {

i4610 = true;
} else {

i4610 = false;

}
i4611 = i4610;
} else {

i4611 = false;

}
final Object i4612;
if ((boolean)i4611) {

i4612 = true;
} else {

i4612 = false;

}
i4613 = i4612;
} else {

i4613 = false;

}
final Object i4641;
if ((boolean)i4613) {




i4641 = ((Cons)((Cons)((Cons)v557).tail).tail).head;
} else {


final Object i4621;
if ((boolean)(v557 instanceof Cons)) {


final Object i4619;
if ((boolean)Lang.equals(RuntimeContext.symbol("cases"), ((Cons)v557).head)) {



final Object i4617;
if ((boolean)(((Cons)v557).tail instanceof Cons)) {




final Object i4615;
if ((boolean)(((Cons)((Cons)v557).tail).tail instanceof Cons)) {




final Object i4614;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v557).tail).tail).tail)) {

i4614 = true;
} else {

i4614 = false;

}
i4615 = i4614;
} else {

i4615 = false;

}
final Object i4616;
if ((boolean)i4615) {

i4616 = true;
} else {

i4616 = false;

}
i4617 = i4616;
} else {

i4617 = false;

}
final Object i4618;
if ((boolean)i4617) {

i4618 = true;
} else {

i4618 = false;

}
i4619 = i4618;
} else {

i4619 = false;

}
final Object i4620;
if ((boolean)i4619) {

i4620 = true;
} else {

i4620 = false;

}
i4621 = i4620;
} else {

i4621 = false;

}
final Object i4640;
if ((boolean)i4621) {












final Object f4622 = ShenISlashoMacro.LAMBDA.apply(new Cons(RuntimeContext.symbol("error"), new Cons("error: cases exhausted~%", Nil.NIL)));






i4640 = new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)v557).tail).head, new Cons(((Cons)((Cons)((Cons)v557).tail).tail).head, new Cons(f4622, Nil.NIL))));
} else {


final Object i4628;
if ((boolean)(v557 instanceof Cons)) {


final Object i4626;
if ((boolean)Lang.equals(RuntimeContext.symbol("cases"), ((Cons)v557).head)) {



final Object i4624;
if ((boolean)(((Cons)v557).tail instanceof Cons)) {




final Object i4623;
if ((boolean)(((Cons)((Cons)v557).tail).tail instanceof Cons)) {

i4623 = true;
} else {

i4623 = false;

}
i4624 = i4623;
} else {

i4624 = false;

}
final Object i4625;
if ((boolean)i4624) {

i4625 = true;
} else {

i4625 = false;

}
i4626 = i4625;
} else {

i4626 = false;

}
final Object i4627;
if ((boolean)i4626) {

i4627 = true;
} else {

i4627 = false;

}
i4628 = i4627;
} else {

i4628 = false;

}
final Object i4639;
if ((boolean)i4628) {













final Object f4629 = ShenCasesMacro.LAMBDA.apply(new Cons(RuntimeContext.symbol("cases"), ((Cons)((Cons)((Cons)v557).tail).tail).tail));






i4639 = new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)v557).tail).head, new Cons(((Cons)((Cons)((Cons)v557).tail).tail).head, new Cons(f4629, Nil.NIL))));
} else {


final Object i4635;
if ((boolean)(v557 instanceof Cons)) {


final Object i4633;
if ((boolean)Lang.equals(RuntimeContext.symbol("cases"), ((Cons)v557).head)) {



final Object i4631;
if ((boolean)(((Cons)v557).tail instanceof Cons)) {



final Object i4630;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v557).tail).tail)) {

i4630 = true;
} else {

i4630 = false;

}
i4631 = i4630;
} else {

i4631 = false;

}
final Object i4632;
if ((boolean)i4631) {

i4632 = true;
} else {

i4632 = false;

}
i4633 = i4632;
} else {

i4633 = false;

}
final Object i4634;
if ((boolean)i4633) {

i4634 = true;
} else {

i4634 = false;

}
i4635 = i4634;
} else {

i4635 = false;

}
final Object i4638;
if ((boolean)i4635) {
final Object f4636 = Interror.LAMBDA.apply("error: odd number of case elements~%", Nil.NIL);

i4638 = f4636;
} else {

final Object i4637;
if ((boolean)true) {

i4637 = v557;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4638 = i4637;

}
i4639 = i4638;

}
i4640 = i4639;

}
i4641 = i4640;

}
    return i4641;

}
}
