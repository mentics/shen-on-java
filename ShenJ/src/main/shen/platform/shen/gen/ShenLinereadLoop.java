package shen.gen;



import com.mentics.shen.*;

public class ShenLinereadLoop {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-lineread-loop");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v967, final Object v968) throws Exception {
return defined(v967, v968);
}};
public static Object defined(final Object v967, final Object v968) throws Exception {
final Object f4730 = ShenHat.LAMBDA.apply();

final Object i4751;
if ((boolean)Lang.equals(v967, f4730)) {
final Object f4731 = Interror.LAMBDA.apply("line read aborted", Nil.NIL);

i4751 = f4731;
} else {
final Object f4732 = ShenNewline.LAMBDA.apply();

final Object f4733 = ShenCarriageReturn.LAMBDA.apply();



final Object f4734 = ElementQ.LAMBDA.apply(v967, new Cons(f4732, new Cons(f4733, Nil.NIL)));

final Object i4750;
if ((boolean)f4734) {
final Lambda l4737 = new Lambda1() {
  public Object apply(final Object v969) throws Exception {
    final Object f4736 = ShenAst_inputZ.LAMBDA.apply(v969);

    return f4736;
  }
};final Object f4738 = Compile.LAMBDA.apply(l4737, v968, Nil.NIL);

final Object line4735 = f4738;

final Object i4741;
if ((boolean)Lang.equals(line4735, null)) {

i4741 = true;
} else {
final Object f4739 = EmptyQ.LAMBDA.apply(line4735);

final Object i4740;
if ((boolean)f4739) {

i4740 = true;
} else {

i4740 = false;

}
i4741 = i4740;

}
final Object i4745;
if ((boolean)i4741) {
final Object f4742 = Stinput.LAMBDA.apply(0);



final Object f4743 = Append.LAMBDA.apply(v968, new Cons(v967, Nil.NIL));
final Object f4744 = ShenLinereadLoop.LAMBDA.apply(((java.io.InputStream)f4742).read(), f4743);

i4745 = f4744;
} else {

i4745 = line4735;

}

i4750 = i4745;
} else {

final Object i4749;
if ((boolean)true) {
final Object f4746 = Stinput.LAMBDA.apply(0);



final Object f4747 = Append.LAMBDA.apply(v968, new Cons(v967, Nil.NIL));
final Object f4748 = ShenLinereadLoop.LAMBDA.apply(((java.io.InputStream)f4746).read(), f4747);

i4749 = f4748;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4750 = i4749;

}
i4751 = i4750;

}
    return i4751;

}
}
