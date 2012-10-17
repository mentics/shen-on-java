package shen.gen;



import com.mentics.shen.*;

public class ShenAstrcZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<strc>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1024) throws Exception {
return defined(v1024);
}};
public static Object defined(final Object v1024) throws Exception {
final Object f5332 = Fst.LAMBDA.apply(v1024);


final Object i5341;
if ((boolean)(f5332 instanceof Cons)) {
final Object f5333 = Fst.LAMBDA.apply(v1024);

final Object f5334 = Snd.LAMBDA.apply(v1024);
final Object f5335 = ShenReassemble.LAMBDA.apply(((Cons)f5333).tail, f5334);
final Object f5336 = Fst.LAMBDA.apply(f5335);
final Object f5337 = Fst.LAMBDA.apply(v1024);


final Object i5339;
if ((boolean)Lang.equals(((Cons)f5337).head, 34)) {

i5339 = null;
} else {
final Object f5338 = Fst.LAMBDA.apply(v1024);



i5339 = new String(Character.toChars(((Number) (((Cons)f5338).head)).intValue()));

}final Object f5340 = ShenReassemble.LAMBDA.apply(f5336, i5339);

i5341 = f5340;
} else {

i5341 = null;

}
final Object result5331 = i5341;

final Object i5342;
if ((boolean)Lang.equals(result5331, null)) {

i5342 = null;
} else {

i5342 = result5331;

}

    return i5342;

}
}
