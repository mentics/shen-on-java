package shen.gen;



import com.mentics.shen.*;

public class ShenAsemicolonZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<semicolon>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v986) throws Exception {
return defined(v986);
}};
public static Object defined(final Object v986) throws Exception {
final Object f5000 = Fst.LAMBDA.apply(v986);


final Object i5008;
if ((boolean)(f5000 instanceof Cons)) {
final Object f5001 = Fst.LAMBDA.apply(v986);

final Object f5002 = Snd.LAMBDA.apply(v986);
final Object f5003 = ShenReassemble.LAMBDA.apply(((Cons)f5001).tail, f5002);
final Object f5004 = Fst.LAMBDA.apply(f5003);
final Object f5005 = Fst.LAMBDA.apply(v986);


final Object i5006;
if ((boolean)Lang.equals(((Cons)f5005).head, 59)) {

i5006 = RuntimeContext.symbol("shen-skip");
} else {

i5006 = null;

}final Object f5007 = ShenReassemble.LAMBDA.apply(f5004, i5006);

i5008 = f5007;
} else {

i5008 = null;

}
final Object result4999 = i5008;

final Object i5009;
if ((boolean)Lang.equals(result4999, null)) {

i5009 = null;
} else {

i5009 = result4999;

}

    return i5009;

}
}
