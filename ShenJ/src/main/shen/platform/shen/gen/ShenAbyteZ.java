package shen.gen;



import com.mentics.shen.*;

public class ShenAbyteZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<byte>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1023) throws Exception {
return defined(v1023);
}};
public static Object defined(final Object v1023) throws Exception {
final Object f5322 = Fst.LAMBDA.apply(v1023);


final Object i5329;
if ((boolean)(f5322 instanceof Cons)) {
final Object f5323 = Fst.LAMBDA.apply(v1023);

final Object f5324 = Snd.LAMBDA.apply(v1023);
final Object f5325 = ShenReassemble.LAMBDA.apply(((Cons)f5323).tail, f5324);
final Object f5326 = Fst.LAMBDA.apply(f5325);
final Object f5327 = Fst.LAMBDA.apply(v1023);


final Object f5328 = ShenReassemble.LAMBDA.apply(f5326, new String(Character.toChars(((Number) (((Cons)f5327).head)).intValue())));

i5329 = f5328;
} else {

i5329 = null;

}
final Object result5321 = i5329;

final Object i5330;
if ((boolean)Lang.equals(result5321, null)) {

i5330 = null;
} else {

i5330 = result5321;

}

    return i5330;

}
}
