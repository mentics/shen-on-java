package shen.gen;



import com.mentics.shen.*;

public class ShenAsingleunderlineZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<singleunderline>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1566) throws Exception {
return defined(v1566);
}};
public static Object defined(final Object v1566) throws Exception {
final Object f6172 = Fst.LAMBDA.apply(v1566);


final Object i6182;
if ((boolean)(f6172 instanceof Cons)) {
final Object f6173 = Fst.LAMBDA.apply(v1566);

final Object f6174 = Snd.LAMBDA.apply(v1566);
final Object f6175 = ShenReassemble.LAMBDA.apply(((Cons)f6173).tail, f6174);
final Object f6176 = Fst.LAMBDA.apply(f6175);
final Object f6177 = Fst.LAMBDA.apply(v1566);

final Object f6178 = ShenSingleunderlineQ.LAMBDA.apply(((Cons)f6177).head);

final Object i6180;
if ((boolean)f6178) {
final Object f6179 = Fst.LAMBDA.apply(v1566);


i6180 = ((Cons)f6179).head;
} else {

i6180 = null;

}final Object f6181 = ShenReassemble.LAMBDA.apply(f6176, i6180);

i6182 = f6181;
} else {

i6182 = null;

}
final Object result6171 = i6182;

final Object i6183;
if ((boolean)Lang.equals(result6171, null)) {

i6183 = null;
} else {

i6183 = result6171;

}

    return i6183;

}
}
