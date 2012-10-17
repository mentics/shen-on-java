package shen.gen;



import com.mentics.shen.*;

public class ShenAtsMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-@s-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v547) throws Exception {
return defined(v547);
}};
public static Object defined(final Object v547) throws Exception {


final Object i4519;
if ((boolean)(v547 instanceof Cons)) {


final Object i4517;
if ((boolean)Lang.equals(RuntimeContext.symbol("@s"), ((Cons)v547).head)) {



final Object i4515;
if ((boolean)(((Cons)v547).tail instanceof Cons)) {




final Object i4513;
if ((boolean)(((Cons)((Cons)v547).tail).tail instanceof Cons)) {





final Object i4512;
if ((boolean)(((Cons)((Cons)((Cons)v547).tail).tail).tail instanceof Cons)) {

i4512 = true;
} else {

i4512 = false;

}
i4513 = i4512;
} else {

i4513 = false;

}
final Object i4514;
if ((boolean)i4513) {

i4514 = true;
} else {

i4514 = false;

}
i4515 = i4514;
} else {

i4515 = false;

}
final Object i4516;
if ((boolean)i4515) {

i4516 = true;
} else {

i4516 = false;

}
i4517 = i4516;
} else {

i4517 = false;

}
final Object i4518;
if ((boolean)i4517) {

i4518 = true;
} else {

i4518 = false;

}
i4519 = i4518;
} else {

i4519 = false;

}
final Object i4539;
if ((boolean)i4519) {








final Object f4520 = ShenAtsMacro.LAMBDA.apply(new Cons(RuntimeContext.symbol("@s"), ((Cons)((Cons)v547).tail).tail));





i4539 = new Cons(RuntimeContext.symbol("@s"), new Cons(((Cons)((Cons)v547).tail).head, new Cons(f4520, Nil.NIL)));
} else {


final Object i4530;
if ((boolean)(v547 instanceof Cons)) {


final Object i4528;
if ((boolean)Lang.equals(RuntimeContext.symbol("@s"), ((Cons)v547).head)) {



final Object i4526;
if ((boolean)(((Cons)v547).tail instanceof Cons)) {




final Object i4524;
if ((boolean)(((Cons)((Cons)v547).tail).tail instanceof Cons)) {




final Object i4522;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v547).tail).tail).tail)) {




final Object i4521;
if ((boolean)(((Cons)((Cons)v547).tail).head instanceof String)) {

i4521 = true;
} else {

i4521 = false;

}
i4522 = i4521;
} else {

i4522 = false;

}
final Object i4523;
if ((boolean)i4522) {

i4523 = true;
} else {

i4523 = false;

}
i4524 = i4523;
} else {

i4524 = false;

}
final Object i4525;
if ((boolean)i4524) {

i4525 = true;
} else {

i4525 = false;

}
i4526 = i4525;
} else {

i4526 = false;

}
final Object i4527;
if ((boolean)i4526) {

i4527 = true;
} else {

i4527 = false;

}
i4528 = i4527;
} else {

i4528 = false;

}
final Object i4529;
if ((boolean)i4528) {

i4529 = true;
} else {

i4529 = false;

}
i4530 = i4529;
} else {

i4530 = false;

}
final Object i4538;
if ((boolean)i4530) {


final Object f4532 = Explode.LAMBDA.apply(((Cons)((Cons)v547).tail).head);

final Object e4531 = f4532;
final Object f4533 = Length.LAMBDA.apply(e4531);



final Object i4536;
if ((boolean)(((Number)(f4533)).doubleValue() > ((Number)(1)).doubleValue())) {



final Object f4534 = Append.LAMBDA.apply(e4531, ((Cons)((Cons)v547).tail).tail);

final Object f4535 = ShenAtsMacro.LAMBDA.apply(new Cons(RuntimeContext.symbol("@s"), f4534));

i4536 = f4535;
} else {

i4536 = v547;

}

i4538 = i4536;
} else {

final Object i4537;
if ((boolean)true) {

i4537 = v547;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4538 = i4537;

}
i4539 = i4538;

}
    return i4539;

}
}
