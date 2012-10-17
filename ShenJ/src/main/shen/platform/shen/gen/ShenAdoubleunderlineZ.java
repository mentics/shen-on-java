package shen.gen;



import com.mentics.shen.*;

public class ShenAdoubleunderlineZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<doubleunderline>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1565) throws Exception {
return defined(v1565);
}};
public static Object defined(final Object v1565) throws Exception {
final Object f6159 = Fst.LAMBDA.apply(v1565);


final Object i6169;
if ((boolean)(f6159 instanceof Cons)) {
final Object f6160 = Fst.LAMBDA.apply(v1565);

final Object f6161 = Snd.LAMBDA.apply(v1565);
final Object f6162 = ShenReassemble.LAMBDA.apply(((Cons)f6160).tail, f6161);
final Object f6163 = Fst.LAMBDA.apply(f6162);
final Object f6164 = Fst.LAMBDA.apply(v1565);

final Object f6165 = ShenDoubleunderlineQ.LAMBDA.apply(((Cons)f6164).head);

final Object i6167;
if ((boolean)f6165) {
final Object f6166 = Fst.LAMBDA.apply(v1565);


i6167 = ((Cons)f6166).head;
} else {

i6167 = null;

}final Object f6168 = ShenReassemble.LAMBDA.apply(f6163, i6167);

i6169 = f6168;
} else {

i6169 = null;

}
final Object result6158 = i6169;

final Object i6170;
if ((boolean)Lang.equals(result6158, null)) {

i6170 = null;
} else {

i6170 = result6158;

}

    return i6170;

}
}
