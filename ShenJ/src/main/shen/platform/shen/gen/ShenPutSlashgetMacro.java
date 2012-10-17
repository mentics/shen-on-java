package shen.gen;



import com.mentics.shen.*;

public class ShenPutSlashgetMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-put/get-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v561) throws Exception {
return defined(v561);
}};
public static Object defined(final Object v561) throws Exception {


final Object i4695;
if ((boolean)(v561 instanceof Cons)) {


final Object i4693;
if ((boolean)Lang.equals(RuntimeContext.symbol("put"), ((Cons)v561).head)) {



final Object i4691;
if ((boolean)(((Cons)v561).tail instanceof Cons)) {




final Object i4689;
if ((boolean)(((Cons)((Cons)v561).tail).tail instanceof Cons)) {





final Object i4687;
if ((boolean)(((Cons)((Cons)((Cons)v561).tail).tail).tail instanceof Cons)) {





final Object i4686;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v561).tail).tail).tail).tail)) {

i4686 = true;
} else {

i4686 = false;

}
i4687 = i4686;
} else {

i4687 = false;

}
final Object i4688;
if ((boolean)i4687) {

i4688 = true;
} else {

i4688 = false;

}
i4689 = i4688;
} else {

i4689 = false;

}
final Object i4690;
if ((boolean)i4689) {

i4690 = true;
} else {

i4690 = false;

}
i4691 = i4690;
} else {

i4691 = false;

}
final Object i4692;
if ((boolean)i4691) {

i4692 = true;
} else {

i4692 = false;

}
i4693 = i4692;
} else {

i4693 = false;

}
final Object i4694;
if ((boolean)i4693) {

i4694 = true;
} else {

i4694 = false;

}
i4695 = i4694;
} else {

i4695 = false;

}
final Object i4706;
if ((boolean)i4695) {
























i4706 = new Cons(RuntimeContext.symbol("put"), new Cons(((Cons)((Cons)v561).tail).head, new Cons(((Cons)((Cons)((Cons)v561).tail).tail).head, new Cons(((Cons)((Cons)((Cons)((Cons)v561).tail).tail).tail).head, new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(RuntimeContext.symbol("shen-*property-vector*"), Nil.NIL)), Nil.NIL)))));
} else {


final Object i4703;
if ((boolean)(v561 instanceof Cons)) {


final Object i4701;
if ((boolean)Lang.equals(RuntimeContext.symbol("get"), ((Cons)v561).head)) {



final Object i4699;
if ((boolean)(((Cons)v561).tail instanceof Cons)) {




final Object i4697;
if ((boolean)(((Cons)((Cons)v561).tail).tail instanceof Cons)) {




final Object i4696;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v561).tail).tail).tail)) {

i4696 = true;
} else {

i4696 = false;

}
i4697 = i4696;
} else {

i4697 = false;

}
final Object i4698;
if ((boolean)i4697) {

i4698 = true;
} else {

i4698 = false;

}
i4699 = i4698;
} else {

i4699 = false;

}
final Object i4700;
if ((boolean)i4699) {

i4700 = true;
} else {

i4700 = false;

}
i4701 = i4700;
} else {

i4701 = false;

}
final Object i4702;
if ((boolean)i4701) {

i4702 = true;
} else {

i4702 = false;

}
i4703 = i4702;
} else {

i4703 = false;

}
final Object i4705;
if ((boolean)i4703) {


















i4705 = new Cons(RuntimeContext.symbol("get"), new Cons(((Cons)((Cons)v561).tail).head, new Cons(((Cons)((Cons)((Cons)v561).tail).tail).head, new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(RuntimeContext.symbol("shen-*property-vector*"), Nil.NIL)), Nil.NIL))));
} else {

final Object i4704;
if ((boolean)true) {

i4704 = v561;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4705 = i4704;

}
i4706 = i4705;

}
    return i4706;

}
}
