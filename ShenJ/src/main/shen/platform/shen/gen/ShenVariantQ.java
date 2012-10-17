package shen.gen;



import com.mentics.shen.*;

public class ShenVariantQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-variant?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1698, final Object v1699) throws Exception {
return defined(v1698, v1699);
}};
public static Object defined(final Object v1698, final Object v1699) throws Exception {

final Object i4540;
if ((boolean)Lang.equals(v1699, v1698)) {

i4540 = true;
} else {


final Object i4514;
if ((boolean)(v1698 instanceof Cons)) {


final Object i4512;
if ((boolean)(v1699 instanceof Cons)) {



final Object i4511;
if ((boolean)Lang.equals(((Cons)v1699).head, ((Cons)v1698).head)) {

i4511 = true;
} else {

i4511 = false;

}
i4512 = i4511;
} else {

i4512 = false;

}
final Object i4513;
if ((boolean)i4512) {

i4513 = true;
} else {

i4513 = false;

}
i4514 = i4513;
} else {

i4514 = false;

}
final Object i4539;
if ((boolean)i4514) {


final Object f4515 = ShenVariantQ.LAMBDA.apply(((Cons)v1698).tail, ((Cons)v1699).tail);

i4539 = f4515;
} else {


final Object i4523;
if ((boolean)(v1698 instanceof Cons)) {


final Object i4521;
if ((boolean)(v1699 instanceof Cons)) {

final Object f4516 = ShenPvarQ.LAMBDA.apply(((Cons)v1698).head);

final Object i4519;
if ((boolean)f4516) {

final Object f4517 = VariableQ.LAMBDA.apply(((Cons)v1699).head);

final Object i4518;
if ((boolean)f4517) {

i4518 = true;
} else {

i4518 = false;

}
i4519 = i4518;
} else {

i4519 = false;

}
final Object i4520;
if ((boolean)i4519) {

i4520 = true;
} else {

i4520 = false;

}
i4521 = i4520;
} else {

i4521 = false;

}
final Object i4522;
if ((boolean)i4521) {

i4522 = true;
} else {

i4522 = false;

}
i4523 = i4522;
} else {

i4523 = false;

}
final Object i4538;
if ((boolean)i4523) {


final Object f4524 = Subst.LAMBDA.apply(RuntimeContext.symbol("shen-a"), ((Cons)v1698).head, ((Cons)v1698).tail);


final Object f4525 = Subst.LAMBDA.apply(RuntimeContext.symbol("shen-a"), ((Cons)v1699).head, ((Cons)v1699).tail);
final Object f4526 = ShenVariantQ.LAMBDA.apply(f4524, f4525);

i4538 = f4526;
} else {


final Object i4532;
if ((boolean)(v1698 instanceof Cons)) {



final Object i4530;
if ((boolean)(((Cons)v1698).head instanceof Cons)) {


final Object i4528;
if ((boolean)(v1699 instanceof Cons)) {



final Object i4527;
if ((boolean)(((Cons)v1699).head instanceof Cons)) {

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
final Object i4531;
if ((boolean)i4530) {

i4531 = true;
} else {

i4531 = false;

}
i4532 = i4531;
} else {

i4532 = false;

}
final Object i4537;
if ((boolean)i4532) {


final Object f4533 = Append.LAMBDA.apply(((Cons)v1698).head, ((Cons)v1698).tail);


final Object f4534 = Append.LAMBDA.apply(((Cons)v1699).head, ((Cons)v1699).tail);
final Object f4535 = ShenVariantQ.LAMBDA.apply(f4533, f4534);

i4537 = f4535;
} else {

final Object i4536;
if ((boolean)true) {

i4536 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4537 = i4536;

}
i4538 = i4537;

}
i4539 = i4538;

}
i4540 = i4539;

}
    return i4540;

}
}
