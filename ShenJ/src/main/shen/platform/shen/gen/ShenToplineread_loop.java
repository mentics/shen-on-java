package shen.gen;



import com.mentics.shen.*;

public class ShenToplineread_loop {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-toplineread_loop");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v586, final Object v587) throws Exception {
return defined(v586, v587);
}};
public static Object defined(final Object v586, final Object v587) throws Exception {
final Object f6557 = ShenHat.LAMBDA.apply();

final Object i6579;
if ((boolean)Lang.equals(v586, f6557)) {
final Object f6558 = Interror.LAMBDA.apply("line read aborted", Nil.NIL);

i6579 = f6558;
} else {
final Object f6559 = ShenNewline.LAMBDA.apply();

final Object f6560 = ShenCarriageReturn.LAMBDA.apply();



final Object f6561 = ElementQ.LAMBDA.apply(v586, new Cons(f6559, new Cons(f6560, Nil.NIL)));

final Object i6578;
if ((boolean)f6561) {
final Lambda l6564 = new Lambda1() {
  public Object apply(final Object v588) throws Exception {
    final Object f6563 = ShenAst_inputZ.LAMBDA.apply(v588);

    return f6563;
  }
};final Object f6565 = Compile.LAMBDA.apply(l6564, v587, Nil.NIL);

final Object line6562 = f6565;

final Object i6568;
if ((boolean)Lang.equals(line6562, null)) {

i6568 = true;
} else {
final Object f6566 = EmptyQ.LAMBDA.apply(line6562);

final Object i6567;
if ((boolean)f6566) {

i6567 = true;
} else {

i6567 = false;

}
i6568 = i6567;

}
final Object i6573;
if ((boolean)i6568) {
final Object f6569 = Stinput.LAMBDA.apply(0);



final Object f6570 = Append.LAMBDA.apply(v587, new Cons(v586, Nil.NIL));
final Object f6571 = ShenToplineread_loop.LAMBDA.apply(((java.io.InputStream)f6569).read(), f6570);

i6573 = f6571;
} else {
final Object f6572 = Atp.LAMBDA.apply(line6562, v587);

i6573 = f6572;

}

i6578 = i6573;
} else {

final Object i6577;
if ((boolean)true) {
final Object f6574 = Stinput.LAMBDA.apply(0);



final Object f6575 = Append.LAMBDA.apply(v587, new Cons(v586, Nil.NIL));
final Object f6576 = ShenToplineread_loop.LAMBDA.apply(((java.io.InputStream)f6574).read(), f6575);

i6577 = f6576;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6578 = i6577;

}
i6579 = i6578;

}
    return i6579;

}
}
