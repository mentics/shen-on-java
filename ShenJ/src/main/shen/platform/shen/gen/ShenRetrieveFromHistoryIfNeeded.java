package shen.gen;



import com.mentics.shen.*;

public class ShenRetrieveFromHistoryIfNeeded {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-retrieve-from-history-if-needed");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v580, final Object v581) throws Exception {
return defined(v580, v581);
}};
public static Object defined(final Object v580, final Object v581) throws Exception {
final Object f6474 = TupleQ.LAMBDA.apply(v580);

final Object i6493;
if ((boolean)f6474) {
final Object f6475 = Snd.LAMBDA.apply(v580);


final Object i6491;
if ((boolean)(f6475 instanceof Cons)) {
final Object f6476 = Snd.LAMBDA.apply(v580);



final Object i6489;
if ((boolean)(((Cons)f6476).tail instanceof Cons)) {
final Object f6477 = Snd.LAMBDA.apply(v580);



final Object i6487;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)f6477).tail).tail)) {


final Object i6485;
if ((boolean)(v581 instanceof Cons)) {
final Object f6478 = Snd.LAMBDA.apply(v580);

final Object f6479 = ShenExclamation.LAMBDA.apply();

final Object i6483;
if ((boolean)Lang.equals(((Cons)f6478).head, f6479)) {
final Object f6480 = Snd.LAMBDA.apply(v580);


final Object f6481 = ShenExclamation.LAMBDA.apply();

final Object i6482;
if ((boolean)Lang.equals(((Cons)((Cons)f6480).tail).head, f6481)) {

i6482 = true;
} else {

i6482 = false;

}
i6483 = i6482;
} else {

i6483 = false;

}
final Object i6484;
if ((boolean)i6483) {

i6484 = true;
} else {

i6484 = false;

}
i6485 = i6484;
} else {

i6485 = false;

}
final Object i6486;
if ((boolean)i6485) {

i6486 = true;
} else {

i6486 = false;

}
i6487 = i6486;
} else {

i6487 = false;

}
final Object i6488;
if ((boolean)i6487) {

i6488 = true;
} else {

i6488 = false;

}
i6489 = i6488;
} else {

i6489 = false;

}
final Object i6490;
if ((boolean)i6489) {

i6490 = true;
} else {

i6490 = false;

}
i6491 = i6490;
} else {

i6491 = false;

}
final Object i6492;
if ((boolean)i6491) {

i6492 = true;
} else {

i6492 = false;

}
i6493 = i6492;
} else {

i6493 = false;

}
final Object i6549;
if ((boolean)i6493) {

final Object f6495 = Snd.LAMBDA.apply(((Cons)v581).head);
final Object f6496 = ShenPrbytes.LAMBDA.apply(f6495);

final Object pastPrint6494 = f6496;



i6549 = ((Cons)v581).head;
} else {
final Object f6497 = TupleQ.LAMBDA.apply(v580);

final Object i6504;
if ((boolean)f6497) {
final Object f6498 = Snd.LAMBDA.apply(v580);


final Object i6502;
if ((boolean)(f6498 instanceof Cons)) {
final Object f6499 = Snd.LAMBDA.apply(v580);

final Object f6500 = ShenExclamation.LAMBDA.apply();

final Object i6501;
if ((boolean)Lang.equals(((Cons)f6499).head, f6500)) {

i6501 = true;
} else {

i6501 = false;

}
i6502 = i6501;
} else {

i6502 = false;

}
final Object i6503;
if ((boolean)i6502) {

i6503 = true;
} else {

i6503 = false;

}
i6504 = i6503;
} else {

i6504 = false;

}
final Object i6548;
if ((boolean)i6504) {
final Object f6506 = Snd.LAMBDA.apply(v580);

final Object f6507 = ShenMakeKey.LAMBDA.apply(((Cons)f6506).tail, v581);

final Object keyQ6505 = f6507;
final Object f6509 = ShenFindPastInputs.LAMBDA.apply(keyQ6505, v581);
final Object f6510 = Head.LAMBDA.apply(f6509);

final Object find6508 = f6510;
final Object f6512 = Snd.LAMBDA.apply(find6508);
final Object f6513 = ShenPrbytes.LAMBDA.apply(f6512);

final Object pastPrint6511 = f6513;




i6548 = find6508;
} else {
final Object f6514 = TupleQ.LAMBDA.apply(v580);

final Object i6524;
if ((boolean)f6514) {
final Object f6515 = Snd.LAMBDA.apply(v580);


final Object i6522;
if ((boolean)(f6515 instanceof Cons)) {
final Object f6516 = Snd.LAMBDA.apply(v580);


final Object i6520;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)f6516).tail)) {
final Object f6517 = Snd.LAMBDA.apply(v580);

final Object f6518 = ShenPercent.LAMBDA.apply();

final Object i6519;
if ((boolean)Lang.equals(((Cons)f6517).head, f6518)) {

i6519 = true;
} else {

i6519 = false;

}
i6520 = i6519;
} else {

i6520 = false;

}
final Object i6521;
if ((boolean)i6520) {

i6521 = true;
} else {

i6521 = false;

}
i6522 = i6521;
} else {

i6522 = false;

}
final Object i6523;
if ((boolean)i6522) {

i6523 = true;
} else {

i6523 = false;

}
i6524 = i6523;
} else {

i6524 = false;

}
final Object i6547;
if ((boolean)i6524) {
final Lambda l6525 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    
    return true;
  }
};final Object f6526 = Reverse.LAMBDA.apply(v581);
final Object f6527 = ShenPrintPastInputs.LAMBDA.apply(l6525, f6526, 0);
final Object f6528 = Abort.LAMBDA.apply();
final Object f6529 = Do.LAMBDA.apply(f6527, f6528);

i6547 = f6529;
} else {
final Object f6530 = TupleQ.LAMBDA.apply(v580);

final Object i6537;
if ((boolean)f6530) {
final Object f6531 = Snd.LAMBDA.apply(v580);


final Object i6535;
if ((boolean)(f6531 instanceof Cons)) {
final Object f6532 = Snd.LAMBDA.apply(v580);

final Object f6533 = ShenPercent.LAMBDA.apply();

final Object i6534;
if ((boolean)Lang.equals(((Cons)f6532).head, f6533)) {

i6534 = true;
} else {

i6534 = false;

}
i6535 = i6534;
} else {

i6535 = false;

}
final Object i6536;
if ((boolean)i6535) {

i6536 = true;
} else {

i6536 = false;

}
i6537 = i6536;
} else {

i6537 = false;

}
final Object i6546;
if ((boolean)i6537) {
final Object f6539 = Snd.LAMBDA.apply(v580);

final Object f6540 = ShenMakeKey.LAMBDA.apply(((Cons)f6539).tail, v581);

final Object keyQ6538 = f6540;
final Object f6542 = Reverse.LAMBDA.apply(v581);
final Object f6543 = ShenPrintPastInputs.LAMBDA.apply(keyQ6538, f6542, 0);

final Object pastprint6541 = f6543;
final Object f6544 = Abort.LAMBDA.apply();



i6546 = f6544;
} else {

final Object i6545;
if ((boolean)true) {

i6545 = v580;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6546 = i6545;

}
i6547 = i6546;

}
i6548 = i6547;

}
i6549 = i6548;

}
    return i6549;

}
}
