package shen.gen;



import com.mentics.shen.*;

public class ShenReadEvaluatePrint {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-read-evaluate-print");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f6465 = ShenToplineread.LAMBDA.apply();

final Object lineread6464 = f6465;


final Object history6466 = RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*history*"));
final Object f6468 = ShenRetrieveFromHistoryIfNeeded.LAMBDA.apply(lineread6464, history6466);

final Object newLineread6467 = f6468;
final Object f6470 = ShenUpdate_history.LAMBDA.apply(newLineread6467, history6466);

final Object newHistory6469 = f6470;
final Object f6472 = Fst.LAMBDA.apply(newLineread6467);

final Object parsed6471 = f6472;
final Object f6473 = ShenToplevel.LAMBDA.apply(parsed6471);






    return f6473;

}
}
