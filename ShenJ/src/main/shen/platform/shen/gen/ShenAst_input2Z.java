package shen.gen;



import com.mentics.shen.*;

public class ShenAst_input2Z {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<st_input2>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1049) throws Exception {
return defined(v1049);
}};
public static Object defined(final Object v1049) throws Exception {
final Object f5601 = ShenAst_inputZ.LAMBDA.apply(v1049);

final Object parse_Ast_inputZ5600 = f5601;


final Object i5605;
if ((boolean)!((boolean)Lang.equals(null, parse_Ast_inputZ5600))) {
final Object f5602 = Fst.LAMBDA.apply(parse_Ast_inputZ5600);
final Object f5603 = Snd.LAMBDA.apply(parse_Ast_inputZ5600);
final Object f5604 = ShenReassemble.LAMBDA.apply(f5602, f5603);

i5605 = f5604;
} else {

i5605 = null;

}

final Object result5599 = i5605;

final Object i5606;
if ((boolean)Lang.equals(result5599, null)) {

i5606 = null;
} else {

i5606 = result5599;

}

    return i5606;

}
}
