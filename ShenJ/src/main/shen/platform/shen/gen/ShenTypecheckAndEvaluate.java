package shen.gen;



import com.mentics.shen.*;

public class ShenTypecheckAndEvaluate {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-typecheck-and-evaluate");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v635, final Object v636) throws Exception {
return defined(v635, v636);
}};
public static Object defined(final Object v635, final Object v636) throws Exception {
final Object f6711 = ShenTypecheck.LAMBDA.apply(v635, v636);

final Object typecheck6710 = f6711;

final Object i6720;
if ((boolean)Lang.equals(typecheck6710, false)) {
final Object f6712 = Interror.LAMBDA.apply("type error~%", Nil.NIL);

i6720 = f6712;
} else {
final Object f6714 = ShenEvalWithoutMacros.LAMBDA.apply(v635);

final Object eval6713 = f6714;
final Object f6716 = ShenPrettyType.LAMBDA.apply(typecheck6710);

final Object type6715 = f6716;
final Object f6717 = Atp.LAMBDA.apply(type6715, Nil.NIL);
final Object f6718 = Atp.LAMBDA.apply(eval6713, f6717);
final Object f6719 = Intoutput.LAMBDA.apply("~S : ~R", f6718);



i6720 = f6719;

}

    return i6720;

}
}
