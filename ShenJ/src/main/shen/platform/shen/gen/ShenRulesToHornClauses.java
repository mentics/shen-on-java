package shen.gen;



import com.mentics.shen.*;

public class ShenRulesToHornClauses {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-rules->horn-clauses");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1580, final Object v1581) throws Exception {
return defined(v1580, v1581);
}};
public static Object defined(final Object v1580, final Object v1581) throws Exception {

final Object i6235;
if ((boolean)Lang.equals(Nil.NIL, v1581)) {

i6235 = Nil.NIL;
} else {


final Object i6217;
if ((boolean)(v1581 instanceof Cons)) {

final Object f6212 = TupleQ.LAMBDA.apply(((Cons)v1581).head);

final Object i6215;
if ((boolean)f6212) {

final Object f6213 = Fst.LAMBDA.apply(((Cons)v1581).head);

final Object i6214;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-single"), f6213)) {

i6214 = true;
} else {

i6214 = false;

}
i6215 = i6214;
} else {

i6215 = false;

}
final Object i6216;
if ((boolean)i6215) {

i6216 = true;
} else {

i6216 = false;

}
i6217 = i6216;
} else {

i6217 = false;

}
final Object i6234;
if ((boolean)i6217) {

final Object f6218 = Snd.LAMBDA.apply(((Cons)v1581).head);
final Object f6219 = ShenRuleToHornClause.LAMBDA.apply(v1580, f6218);


final Object f6220 = ShenRulesToHornClauses.LAMBDA.apply(v1580, ((Cons)v1581).tail);


i6234 = new Cons(f6219, f6220);
} else {


final Object i6226;
if ((boolean)(v1581 instanceof Cons)) {

final Object f6221 = TupleQ.LAMBDA.apply(((Cons)v1581).head);

final Object i6224;
if ((boolean)f6221) {

final Object f6222 = Fst.LAMBDA.apply(((Cons)v1581).head);

final Object i6223;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-double"), f6222)) {

i6223 = true;
} else {

i6223 = false;

}
i6224 = i6223;
} else {

i6224 = false;

}
final Object i6225;
if ((boolean)i6224) {

i6225 = true;
} else {

i6225 = false;

}
i6226 = i6225;
} else {

i6226 = false;

}
final Object i6233;
if ((boolean)i6226) {

final Object f6227 = Snd.LAMBDA.apply(((Cons)v1581).head);
final Object f6228 = ShenDoubleToSingles.LAMBDA.apply(f6227);

final Object f6229 = Append.LAMBDA.apply(f6228, ((Cons)v1581).tail);
final Object f6230 = ShenRulesToHornClauses.LAMBDA.apply(v1580, f6229);

i6233 = f6230;
} else {

final Object i6232;
if ((boolean)true) {
final Object f6231 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-rules->horn-clauses"));

i6232 = f6231;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6233 = i6232;

}
i6234 = i6233;

}
i6235 = i6234;

}
    return i6235;

}
}
