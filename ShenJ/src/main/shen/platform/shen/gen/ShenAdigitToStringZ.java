package shen.gen;



import com.mentics.shen.*;

public class ShenAdigitToStringZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<digit->string>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1012) throws Exception {
return defined(v1012);
}};
public static Object defined(final Object v1012) throws Exception {
final Object f5241 = Fst.LAMBDA.apply(v1012);


final Object i5251;
if ((boolean)(f5241 instanceof Cons)) {
final Object f5242 = Fst.LAMBDA.apply(v1012);

final Object f5243 = Snd.LAMBDA.apply(v1012);
final Object f5244 = ShenReassemble.LAMBDA.apply(((Cons)f5242).tail, f5243);
final Object f5245 = Fst.LAMBDA.apply(f5244);
final Object f5246 = Fst.LAMBDA.apply(v1012);

final Object f5247 = ShenDigitByteQ.LAMBDA.apply(((Cons)f5246).head);

final Object i5249;
if ((boolean)f5247) {
final Object f5248 = Fst.LAMBDA.apply(v1012);



i5249 = new String(Character.toChars(((Number) (((Cons)f5248).head)).intValue()));
} else {

i5249 = null;

}final Object f5250 = ShenReassemble.LAMBDA.apply(f5245, i5249);

i5251 = f5250;
} else {

i5251 = null;

}
final Object result5240 = i5251;

final Object i5252;
if ((boolean)Lang.equals(result5240, null)) {

i5252 = null;
} else {

i5252 = result5240;

}

    return i5252;

}
}
