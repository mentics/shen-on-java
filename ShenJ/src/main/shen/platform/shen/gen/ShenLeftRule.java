package shen.gen;



import com.mentics.shen.*;

public class ShenLeftRule {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-left-rule");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1584) throws Exception {
return defined(v1584);
}};
public static Object defined(final Object v1584) throws Exception {


final Object i6250;
if ((boolean)(v1584 instanceof Cons)) {



final Object i6248;
if ((boolean)(((Cons)v1584).tail instanceof Cons)) {




final Object i6246;
if ((boolean)(((Cons)((Cons)v1584).tail).tail instanceof Cons)) {



final Object f6239 = TupleQ.LAMBDA.apply(((Cons)((Cons)((Cons)v1584).tail).tail).head);

final Object i6244;
if ((boolean)f6239) {



final Object f6240 = Fst.LAMBDA.apply(((Cons)((Cons)((Cons)v1584).tail).tail).head);

final Object i6242;
if ((boolean)Lang.equals(Nil.NIL, f6240)) {




final Object i6241;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1584).tail).tail).tail)) {

i6241 = true;
} else {

i6241 = false;

}
i6242 = i6241;
} else {

i6242 = false;

}
final Object i6243;
if ((boolean)i6242) {

i6243 = true;
} else {

i6243 = false;

}
i6244 = i6243;
} else {

i6244 = false;

}
final Object i6245;
if ((boolean)i6244) {

i6245 = true;
} else {

i6245 = false;

}
i6246 = i6245;
} else {

i6246 = false;

}
final Object i6247;
if ((boolean)i6246) {

i6247 = true;
} else {

i6247 = false;

}
i6248 = i6247;
} else {

i6248 = false;

}
final Object i6249;
if ((boolean)i6248) {

i6249 = true;
} else {

i6249 = false;

}
i6250 = i6249;
} else {

i6250 = false;

}
final Object i6264;
if ((boolean)i6250) {
final Object f6252 = Gensym.LAMBDA.apply(RuntimeContext.symbol("Qv"));

final Object q6251 = f6252;



final Object f6254 = Snd.LAMBDA.apply(((Cons)((Cons)((Cons)v1584).tail).tail).head);


final Object f6255 = Atp.LAMBDA.apply(new Cons(f6254, Nil.NIL), q6251);

final Object newConclusion6253 = f6255;
final Lambda l6258 = new Lambda1() {
  public Object apply(final Object v1585) throws Exception {
    final Object f6257 = ShenRightToLeft.LAMBDA.apply(v1585);

    return f6257;
  }
};

final Object f6259 = Map.LAMBDA.apply(l6258, ((Cons)((Cons)v1584).tail).head);
final Object f6260 = Atp.LAMBDA.apply(f6259, q6251);



final Object newPremises6256 = new Cons(f6260, Nil.NIL);







final Object f6261 = Atp.LAMBDA.apply(RuntimeContext.symbol("shen-single"), new Cons(((Cons)v1584).head, new Cons(newPremises6256, new Cons(newConclusion6253, Nil.NIL))));




i6264 = f6261;
} else {

final Object i6263;
if ((boolean)true) {
final Object f6262 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-left-rule"));

i6263 = f6262;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6264 = i6263;

}
    return i6264;

}
}
