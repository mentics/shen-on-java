package shen.gen;



import com.mentics.shen.*;

public class ShenCompile_prolog_procedure {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-compile_prolog_procedure");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1249) throws Exception {
return defined(v1249);
}};
public static Object defined(final Object v1249) throws Exception {
final Object f3021 = ShenProcedure_name.LAMBDA.apply(v1249);

final Object f3020 = f3021;
final Object f3023 = ShenClausesToShen.LAMBDA.apply(f3020, v1249);

final Object shen3022 = f3023;



    return shen3022;

}
}
