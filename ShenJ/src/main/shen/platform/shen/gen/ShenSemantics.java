package shen.gen;



import com.mentics.shen.*;

public class ShenSemantics {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-semantics");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v373) throws Exception {
return defined(v373);
}};
public static Object defined(final Object v373) throws Exception {


final Object i4145;
if ((boolean)(v373 instanceof Cons)) {


final Object i4143;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-leave!"), ((Cons)v373).head)) {



final Object i4141;
if ((boolean)(((Cons)v373).tail instanceof Cons)) {



final Object i4140;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v373).tail).tail)) {

i4140 = true;
} else {

i4140 = false;

}
i4141 = i4140;
} else {

i4141 = false;

}
final Object i4142;
if ((boolean)i4141) {

i4142 = true;
} else {

i4142 = false;

}
i4143 = i4142;
} else {

i4143 = false;

}
final Object i4144;
if ((boolean)i4143) {

i4144 = true;
} else {

i4144 = false;

}
i4145 = i4144;
} else {

i4145 = false;

}
final Object i4158;
if ((boolean)i4145) {



i4158 = ((Cons)((Cons)v373).tail).head;
} else {

final Object i4157;
if ((boolean)Lang.equals(Nil.NIL, v373)) {

i4157 = Nil.NIL;
} else {
final Object f4146 = ShenGrammar_symbolQ.LAMBDA.apply(v373);

final Object i4156;
if ((boolean)f4146) {

final Object f4147 = Concat.LAMBDA.apply(RuntimeContext.symbol("Parse_"), v373);




i4156 = new Cons(RuntimeContext.symbol("snd"), new Cons(f4147, Nil.NIL));
} else {

final Object i4155;
if ((boolean)Lang.equals(RuntimeContext.symbol("-o-"), v373)) {





i4155 = new Cons(RuntimeContext.symbol("snd"), new Cons(RuntimeContext.symbol("Stream"), Nil.NIL));
} else {

final Object i4154;
if ((boolean)Lang.equals(RuntimeContext.symbol("-*-"), v373)) {









i4154 = new Cons(RuntimeContext.symbol("hd"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(RuntimeContext.symbol("Stream"), Nil.NIL)), Nil.NIL));
} else {

final Object i4153;
if ((boolean)Lang.equals(RuntimeContext.symbol("-s-"), v373)) {





i4153 = new Cons(RuntimeContext.symbol("fst"), new Cons(RuntimeContext.symbol("Stream"), Nil.NIL));
} else {


final Object i4152;
if ((boolean)(v373 instanceof Cons)) {
final Lambda l4149 = new Lambda1() {
  public Object apply(final Object v374) throws Exception {
    final Object f4148 = ShenSemantics.LAMBDA.apply(v374);

    return f4148;
  }
};final Object f4150 = Map.LAMBDA.apply(l4149, v373);

i4152 = f4150;
} else {

final Object i4151;
if ((boolean)true) {

i4151 = v373;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4152 = i4151;

}
i4153 = i4152;

}
i4154 = i4153;

}
i4155 = i4154;

}
i4156 = i4155;

}
i4157 = i4156;

}
i4158 = i4157;

}
    return i4158;

}
}
