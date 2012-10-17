package shen.gen;



import com.mentics.shen.*;

public class ShenAst_input1Z {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<st_input1>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1048) throws Exception {
return defined(v1048);
}};
public static Object defined(final Object v1048) throws Exception {
final Object f5593 = ShenAst_inputZ.LAMBDA.apply(v1048);

final Object parse_Ast_inputZ5592 = f5593;


final Object i5597;
if ((boolean)!((boolean)Lang.equals(null, parse_Ast_inputZ5592))) {
final Object f5594 = Fst.LAMBDA.apply(parse_Ast_inputZ5592);
final Object f5595 = Snd.LAMBDA.apply(parse_Ast_inputZ5592);
final Object f5596 = ShenReassemble.LAMBDA.apply(f5594, f5595);

i5597 = f5596;
} else {

i5597 = null;

}

final Object result5591 = i5597;

final Object i5598;
if ((boolean)Lang.equals(result5591, null)) {

i5598 = null;
} else {

i5598 = result5591;

}

    return i5598;

}
}
