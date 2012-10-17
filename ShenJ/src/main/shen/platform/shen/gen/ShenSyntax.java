package shen.gen;



import com.mentics.shen.*;

public class ShenSyntax {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-syntax");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v318, final Object v319, final Object v320) throws Exception {
return defined(v318, v319, v320);
}};
public static Object defined(final Object v318, final Object v319, final Object v320) throws Exception {

final Object i4068;
if ((boolean)Lang.equals(Nil.NIL, v318)) {






final Object f4046 = ShenSemantics.LAMBDA.apply(v320);





i4068 = new Cons(RuntimeContext.symbol("shen-reassemble"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(v319, Nil.NIL)), new Cons(f4046, Nil.NIL)));
} else {


final Object i4067;
if ((boolean)(v318 instanceof Cons)) {

final Object f4047 = ShenGrammar_symbolQ.LAMBDA.apply(((Cons)v318).head);

final Object i4064;
if ((boolean)f4047) {
final Object f4048 = ShenRecursive_descent.LAMBDA.apply(v318, v319, v320);

i4064 = f4048;
} else {

final Object f4049 = ShenSegvarQ.LAMBDA.apply(((Cons)v318).head);

final Object i4063;
if ((boolean)f4049) {
final Object f4050 = ShenSegmentMatch.LAMBDA.apply(v318, v319, v320);

i4063 = f4050;
} else {

final Object f4051 = ShenTerminalQ.LAMBDA.apply(((Cons)v318).head);

final Object i4062;
if ((boolean)f4051) {
final Object f4052 = ShenCheck_stream.LAMBDA.apply(v318, v319, v320);

i4062 = f4052;
} else {

final Object f4053 = ShenJump_streamQ.LAMBDA.apply(((Cons)v318).head);

final Object i4061;
if ((boolean)f4053) {
final Object f4054 = ShenJump_stream.LAMBDA.apply(v318, v319, v320);

i4061 = f4054;
} else {

final Object f4055 = ShenList_streamQ.LAMBDA.apply(((Cons)v318).head);

final Object i4060;
if ((boolean)f4055) {

final Object f4056 = ShenDecons.LAMBDA.apply(((Cons)v318).head);

final Object f4057 = ShenList_stream.LAMBDA.apply(f4056, ((Cons)v318).tail, v319, v320);

i4060 = f4057;
} else {

final Object f4058 = Atp.LAMBDA.apply(((Cons)v318).head, Nil.NIL);
final Object f4059 = Interror.LAMBDA.apply("~A is not legal syntax~%", f4058);

i4060 = f4059;

}
i4061 = i4060;

}
i4062 = i4061;

}
i4063 = i4062;

}
i4064 = i4063;

}
i4067 = i4064;
} else {

final Object i4066;
if ((boolean)true) {
final Object f4065 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-syntax"));

i4066 = f4065;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4067 = i4066;

}
i4068 = i4067;

}
    return i4068;

}
}
