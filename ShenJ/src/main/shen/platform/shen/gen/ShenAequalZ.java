package shen.gen;



import com.mentics.shen.*;

public class ShenAequalZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<equal>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v989) throws Exception {
return defined(v989);
}};
public static Object defined(final Object v989) throws Exception {
final Object f5033 = Fst.LAMBDA.apply(v989);


final Object i5041;
if ((boolean)(f5033 instanceof Cons)) {
final Object f5034 = Fst.LAMBDA.apply(v989);

final Object f5035 = Snd.LAMBDA.apply(v989);
final Object f5036 = ShenReassemble.LAMBDA.apply(((Cons)f5034).tail, f5035);
final Object f5037 = Fst.LAMBDA.apply(f5036);
final Object f5038 = Fst.LAMBDA.apply(v989);


final Object i5039;
if ((boolean)Lang.equals(((Cons)f5038).head, 61)) {

i5039 = RuntimeContext.symbol("shen-skip");
} else {

i5039 = null;

}final Object f5040 = ShenReassemble.LAMBDA.apply(f5037, i5039);

i5041 = f5040;
} else {

i5041 = null;

}
final Object result5032 = i5041;

final Object i5042;
if ((boolean)Lang.equals(result5032, null)) {

i5042 = null;
} else {

i5042 = result5032;

}

    return i5042;

}
}
