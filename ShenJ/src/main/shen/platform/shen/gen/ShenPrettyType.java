package shen.gen;



import com.mentics.shen.*;

public class ShenPrettyType {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-pretty-type");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v637) throws Exception {
return defined(v637);
}};
public static Object defined(final Object v637) throws Exception {

final Object f6721 = ShenExtractPvars.LAMBDA.apply(v637);
final Object f6722 = ShenMult_subst.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*alphabet*")), f6721, v637);

    return f6722;

}
}
