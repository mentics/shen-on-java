package shen.gen;



import com.mentics.shen.*;

public class Ats {

public static final Symbol SYMBOL = RuntimeContext.symbol("@s");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v696, final Object v697) throws Exception {
return defined(v696, v697);
}};
public static Object defined(final Object v696, final Object v697) throws Exception {



    return ((String)v696 + (String)v697);

}
}
