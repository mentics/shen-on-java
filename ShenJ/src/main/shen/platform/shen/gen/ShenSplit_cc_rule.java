package shen.gen;



import com.mentics.shen.*;

public class ShenSplit_cc_rule {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-split_cc_rule");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v314, final Object v315) throws Exception {
return defined(v314, v315);
}};
public static Object defined(final Object v314, final Object v315) throws Exception {


final Object i3998;
if ((boolean)(v314 instanceof Cons)) {


final Object i3996;
if ((boolean)Lang.equals(RuntimeContext.symbol(":="), ((Cons)v314).head)) {



final Object i3994;
if ((boolean)(((Cons)v314).tail instanceof Cons)) {



final Object i3993;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v314).tail).tail)) {

i3993 = true;
} else {

i3993 = false;

}
i3994 = i3993;
} else {

i3994 = false;

}
final Object i3995;
if ((boolean)i3994) {

i3995 = true;
} else {

i3995 = false;

}
i3996 = i3995;
} else {

i3996 = false;

}
final Object i3997;
if ((boolean)i3996) {

i3997 = true;
} else {

i3997 = false;

}
i3998 = i3997;
} else {

i3998 = false;

}
final Object i4023;
if ((boolean)i3998) {
final Object f3999 = Reverse.LAMBDA.apply(v315);




i4023 = new Cons(f3999, ((Cons)v314).tail);
} else {


final Object i4001;
if ((boolean)(v314 instanceof Cons)) {


final Object i4000;
if ((boolean)Lang.equals(RuntimeContext.symbol(":="), ((Cons)v314).head)) {

i4000 = true;
} else {

i4000 = false;

}
i4001 = i4000;
} else {

i4001 = false;

}
final Object i4022;
if ((boolean)i4001) {
final Object f4002 = Reverse.LAMBDA.apply(v315);


final Object f4003 = ShenCons_form.LAMBDA.apply(((Cons)v314).tail);




i4022 = new Cons(f4002, new Cons(f4003, Nil.NIL));
} else {

final Object i4021;
if ((boolean)Lang.equals(Nil.NIL, v314)) {
final Object f4004 = Intoutput.LAMBDA.apply("warning: ", Nil.NIL);
final Lambda l4007 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f4005 = Atp.LAMBDA.apply(x, Nil.NIL);
final Object f4006 = Intoutput.LAMBDA.apply("~A ", f4005);

    return f4006;
  }
};final Object f4008 = Reverse.LAMBDA.apply(v315);
final Object f4009 = Map.LAMBDA.apply(l4007, f4008);
final Object f4010 = Intoutput.LAMBDA.apply("has no semantics.~%", Nil.NIL);

final Object f4011 = Reverse.LAMBDA.apply(v315);
final Object f4012 = ShenDefault_semantics.LAMBDA.apply(f4011);



final Object f4013 = ShenSplit_cc_rule.LAMBDA.apply(new Cons(RuntimeContext.symbol(":="), new Cons(f4012, Nil.NIL)), v315);
final Object f4014 = Do.LAMBDA.apply(f4010, f4013);
final Object f4015 = Do.LAMBDA.apply(f4009, f4014);
final Object f4016 = Do.LAMBDA.apply(f4004, f4015);

i4021 = f4016;
} else {


final Object i4020;
if ((boolean)(v314 instanceof Cons)) {




final Object f4017 = ShenSplit_cc_rule.LAMBDA.apply(((Cons)v314).tail, new Cons(((Cons)v314).head, v315));

i4020 = f4017;
} else {

final Object i4019;
if ((boolean)true) {
final Object f4018 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-split_cc_rule"));

i4019 = f4018;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4020 = i4019;

}
i4021 = i4020;

}
i4022 = i4021;

}
i4023 = i4022;

}
    return i4023;

}
}
