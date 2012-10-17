package shen.gen;



import com.mentics.shen.*;

public class ShenAcolonsymbolZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<colonsymbol>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1563) throws Exception {
return defined(v1563);
}};
public static Object defined(final Object v1563) throws Exception {
final Object f6138 = Fst.LAMBDA.apply(v1563);


final Object i6147;
if ((boolean)(f6138 instanceof Cons)) {
final Object f6139 = Fst.LAMBDA.apply(v1563);

final Object f6140 = Snd.LAMBDA.apply(v1563);
final Object f6141 = ShenReassemble.LAMBDA.apply(((Cons)f6139).tail, f6140);
final Object f6142 = Fst.LAMBDA.apply(f6141);
final Object f6143 = Fst.LAMBDA.apply(v1563);


final Object i6145;
if ((boolean)Lang.equals(((Cons)f6143).head, RuntimeContext.symbol(";"))) {
final Object f6144 = Fst.LAMBDA.apply(v1563);


i6145 = ((Cons)f6144).head;
} else {

i6145 = null;

}final Object f6146 = ShenReassemble.LAMBDA.apply(f6142, i6145);

i6147 = f6146;
} else {

i6147 = null;

}
final Object result6137 = i6147;

final Object i6148;
if ((boolean)Lang.equals(result6137, null)) {

i6148 = null;
} else {

i6148 = result6137;

}

    return i6148;

}
}
