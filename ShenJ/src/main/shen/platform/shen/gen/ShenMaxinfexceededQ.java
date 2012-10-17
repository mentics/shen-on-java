package shen.gen;



import com.mentics.shen.*;

public class ShenMaxinfexceededQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-maxinfexceeded?");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f106 = Inferences.LAMBDA.apply(RuntimeContext.symbol("shen-skip"));




    return (((Number)(f106)).doubleValue() > ((Number)(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*maxinferences*")))).doubleValue());

}
}
