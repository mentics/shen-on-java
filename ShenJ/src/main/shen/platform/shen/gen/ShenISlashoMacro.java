package shen.gen;



import com.mentics.shen.*;

public class ShenISlashoMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-i/o-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v559) throws Exception {
return defined(v559);
}};
public static Object defined(final Object v559) throws Exception {


final Object i4655;
if ((boolean)(v559 instanceof Cons)) {


final Object i4653;
if ((boolean)Lang.equals(RuntimeContext.symbol("output"), ((Cons)v559).head)) {



final Object i4652;
if ((boolean)(((Cons)v559).tail instanceof Cons)) {

i4652 = true;
} else {

i4652 = false;

}
i4653 = i4652;
} else {

i4653 = false;

}
final Object i4654;
if ((boolean)i4653) {

i4654 = true;
} else {

i4654 = false;

}
i4655 = i4654;
} else {

i4655 = false;

}
final Object i4682;
if ((boolean)i4655) {






final Object f4656 = ShenTupleUp.LAMBDA.apply(((Cons)((Cons)v559).tail).tail);





i4682 = new Cons(RuntimeContext.symbol("intoutput"), new Cons(((Cons)((Cons)v559).tail).head, new Cons(f4656, Nil.NIL)));
} else {


final Object i4660;
if ((boolean)(v559 instanceof Cons)) {


final Object i4658;
if ((boolean)Lang.equals(RuntimeContext.symbol("make-string"), ((Cons)v559).head)) {



final Object i4657;
if ((boolean)(((Cons)v559).tail instanceof Cons)) {

i4657 = true;
} else {

i4657 = false;

}
i4658 = i4657;
} else {

i4658 = false;

}
final Object i4659;
if ((boolean)i4658) {

i4659 = true;
} else {

i4659 = false;

}
i4660 = i4659;
} else {

i4660 = false;

}
final Object i4681;
if ((boolean)i4660) {






final Object f4661 = ShenTupleUp.LAMBDA.apply(((Cons)((Cons)v559).tail).tail);





i4681 = new Cons(RuntimeContext.symbol("intmake-string"), new Cons(((Cons)((Cons)v559).tail).head, new Cons(f4661, Nil.NIL)));
} else {


final Object i4665;
if ((boolean)(v559 instanceof Cons)) {


final Object i4663;
if ((boolean)Lang.equals(RuntimeContext.symbol("error"), ((Cons)v559).head)) {



final Object i4662;
if ((boolean)(((Cons)v559).tail instanceof Cons)) {

i4662 = true;
} else {

i4662 = false;

}
i4663 = i4662;
} else {

i4663 = false;

}
final Object i4664;
if ((boolean)i4663) {

i4664 = true;
} else {

i4664 = false;

}
i4665 = i4664;
} else {

i4665 = false;

}
final Object i4680;
if ((boolean)i4665) {






final Object f4666 = ShenTupleUp.LAMBDA.apply(((Cons)((Cons)v559).tail).tail);





i4680 = new Cons(RuntimeContext.symbol("interror"), new Cons(((Cons)((Cons)v559).tail).head, new Cons(f4666, Nil.NIL)));
} else {


final Object i4672;
if ((boolean)(v559 instanceof Cons)) {


final Object i4670;
if ((boolean)Lang.equals(RuntimeContext.symbol("pr"), ((Cons)v559).head)) {



final Object i4668;
if ((boolean)(((Cons)v559).tail instanceof Cons)) {



final Object i4667;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v559).tail).tail)) {

i4667 = true;
} else {

i4667 = false;

}
i4668 = i4667;
} else {

i4668 = false;

}
final Object i4669;
if ((boolean)i4668) {

i4669 = true;
} else {

i4669 = false;

}
i4670 = i4669;
} else {

i4670 = false;

}
final Object i4671;
if ((boolean)i4670) {

i4671 = true;
} else {

i4671 = false;

}
i4672 = i4671;
} else {

i4672 = false;

}
final Object i4679;
if ((boolean)i4672) {













i4679 = new Cons(RuntimeContext.symbol("pr"), new Cons(((Cons)((Cons)v559).tail).head, new Cons(new Cons(RuntimeContext.symbol("shen-stoutput"), new Cons(0, Nil.NIL)), Nil.NIL)));
} else {


final Object i4676;
if ((boolean)(v559 instanceof Cons)) {


final Object i4674;
if ((boolean)Lang.equals(RuntimeContext.symbol("read-byte"), ((Cons)v559).head)) {


final Object i4673;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v559).tail)) {

i4673 = true;
} else {

i4673 = false;

}
i4674 = i4673;
} else {

i4674 = false;

}
final Object i4675;
if ((boolean)i4674) {

i4675 = true;
} else {

i4675 = false;

}
i4676 = i4675;
} else {

i4676 = false;

}
final Object i4678;
if ((boolean)i4676) {









i4678 = new Cons(RuntimeContext.symbol("read-byte"), new Cons(new Cons(RuntimeContext.symbol("stinput"), new Cons(0, Nil.NIL)), Nil.NIL));
} else {

final Object i4677;
if ((boolean)true) {

i4677 = v559;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4678 = i4677;

}
i4679 = i4678;

}
i4680 = i4679;

}
i4681 = i4680;

}
i4682 = i4681;

}
    return i4682;

}
}
