package shen.gen;



import com.mentics.shen.*;

public class ShenRuleToHornClause {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-rule->horn-clause");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1591, final Object v1592) throws Exception {
return defined(v1591, v1592);
}};
public static Object defined(final Object v1591, final Object v1592) throws Exception {


final Object i6281;
if ((boolean)(v1592 instanceof Cons)) {



final Object i6279;
if ((boolean)(((Cons)v1592).tail instanceof Cons)) {




final Object i6277;
if ((boolean)(((Cons)((Cons)v1592).tail).tail instanceof Cons)) {



final Object f6273 = TupleQ.LAMBDA.apply(((Cons)((Cons)((Cons)v1592).tail).tail).head);

final Object i6275;
if ((boolean)f6273) {




final Object i6274;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1592).tail).tail).tail)) {

i6274 = true;
} else {

i6274 = false;

}
i6275 = i6274;
} else {

i6275 = false;

}
final Object i6276;
if ((boolean)i6275) {

i6276 = true;
} else {

i6276 = false;

}
i6277 = i6276;
} else {

i6277 = false;

}
final Object i6278;
if ((boolean)i6277) {

i6278 = true;
} else {

i6278 = false;

}
i6279 = i6278;
} else {

i6279 = false;

}
final Object i6280;
if ((boolean)i6279) {

i6280 = true;
} else {

i6280 = false;

}
i6281 = i6280;
} else {

i6281 = false;

}
final Object i6288;
if ((boolean)i6281) {



final Object f6282 = Snd.LAMBDA.apply(((Cons)((Cons)((Cons)v1592).tail).tail).head);
final Object f6283 = ShenRuleToHornClauseHead.LAMBDA.apply(v1591, f6282);








final Object f6284 = Fst.LAMBDA.apply(((Cons)((Cons)((Cons)v1592).tail).tail).head);
final Object f6285 = ShenRuleToHornClauseBody.LAMBDA.apply(((Cons)v1592).head, ((Cons)((Cons)v1592).tail).head, f6284);





i6288 = new Cons(f6283, new Cons(RuntimeContext.symbol(":-"), new Cons(f6285, Nil.NIL)));
} else {

final Object i6287;
if ((boolean)true) {
final Object f6286 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-rule->horn-clause"));

i6287 = f6286;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6288 = i6287;

}
    return i6288;

}
}
