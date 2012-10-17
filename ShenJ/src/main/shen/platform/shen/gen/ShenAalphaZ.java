package shen.gen;



import com.mentics.shen.*;

public class ShenAalphaZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<alpha>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1018) throws Exception {
return defined(v1018);
}};
public static Object defined(final Object v1018) throws Exception {
final Object f5265 = Fst.LAMBDA.apply(v1018);


final Object i5275;
if ((boolean)(f5265 instanceof Cons)) {
final Object f5266 = Fst.LAMBDA.apply(v1018);

final Object f5267 = Snd.LAMBDA.apply(v1018);
final Object f5268 = ShenReassemble.LAMBDA.apply(((Cons)f5266).tail, f5267);
final Object f5269 = Fst.LAMBDA.apply(f5268);
final Object f5271 = Fst.LAMBDA.apply(v1018);

final Object f5272 = ShenSymbolByteToString.LAMBDA.apply(((Cons)f5271).head);

final Object s5270 = f5272;

final Object i5273;
if ((boolean)Lang.equals(s5270, null)) {

i5273 = null;
} else {

i5273 = s5270;

}
final Object f5274 = ShenReassemble.LAMBDA.apply(f5269, i5273);

i5275 = f5274;
} else {

i5275 = null;

}
final Object result5264 = i5275;

final Object i5276;
if ((boolean)Lang.equals(result5264, null)) {

i5276 = null;
} else {

i5276 = result5264;

}

    return i5276;

}
}
