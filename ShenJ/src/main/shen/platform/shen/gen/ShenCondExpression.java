package shen.gen;



import com.mentics.shen.*;

public class ShenCondExpression {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-cond-expression");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v511, final Object v512, final Object v513) throws Exception {
return defined(v511, v512, v513);
}};
public static Object defined(final Object v511, final Object v512, final Object v513) throws Exception {
final Object f2359 = ShenErrCondition.LAMBDA.apply(v511);

final Object err2358 = f2359;
final Object f2361 = ShenCaseForm.LAMBDA.apply(v513, err2358);

final Object cases2360 = f2361;
final Object f2363 = ShenEncodeChoices.LAMBDA.apply(cases2360, v511);

final Object encodeChoices2362 = f2363;
final Object f2364 = ShenCondForm.LAMBDA.apply(encodeChoices2362);




    return f2364;

}
}
