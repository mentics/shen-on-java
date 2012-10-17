package shen.gen;



import com.mentics.shen.*;

public class ShenAminusZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<minus>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v990) throws Exception {
return defined(v990);
}};
public static Object defined(final Object v990) throws Exception {
final Object f5044 = Fst.LAMBDA.apply(v990);


final Object i5052;
if ((boolean)(f5044 instanceof Cons)) {
final Object f5045 = Fst.LAMBDA.apply(v990);

final Object f5046 = Snd.LAMBDA.apply(v990);
final Object f5047 = ShenReassemble.LAMBDA.apply(((Cons)f5045).tail, f5046);
final Object f5048 = Fst.LAMBDA.apply(f5047);
final Object f5049 = Fst.LAMBDA.apply(v990);


final Object i5050;
if ((boolean)Lang.equals(((Cons)f5049).head, 45)) {

i5050 = RuntimeContext.symbol("shen-skip");
} else {

i5050 = null;

}final Object f5051 = ShenReassemble.LAMBDA.apply(f5048, i5050);

i5052 = f5051;
} else {

i5052 = null;

}
final Object result5043 = i5052;

final Object i5053;
if ((boolean)Lang.equals(result5043, null)) {

i5053 = null;
} else {

i5053 = result5043;

}

    return i5053;

}
}
