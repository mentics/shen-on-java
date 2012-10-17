package shen.gen;



import com.mentics.shen.*;

public class ShenAcolonZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<colon>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v987) throws Exception {
return defined(v987);
}};
public static Object defined(final Object v987) throws Exception {
final Object f5011 = Fst.LAMBDA.apply(v987);


final Object i5019;
if ((boolean)(f5011 instanceof Cons)) {
final Object f5012 = Fst.LAMBDA.apply(v987);

final Object f5013 = Snd.LAMBDA.apply(v987);
final Object f5014 = ShenReassemble.LAMBDA.apply(((Cons)f5012).tail, f5013);
final Object f5015 = Fst.LAMBDA.apply(f5014);
final Object f5016 = Fst.LAMBDA.apply(v987);


final Object i5017;
if ((boolean)Lang.equals(((Cons)f5016).head, 58)) {

i5017 = RuntimeContext.symbol("shen-skip");
} else {

i5017 = null;

}final Object f5018 = ShenReassemble.LAMBDA.apply(f5015, i5017);

i5019 = f5018;
} else {

i5019 = null;

}
final Object result5010 = i5019;

final Object i5020;
if ((boolean)Lang.equals(result5010, null)) {

i5020 = null;
} else {

i5020 = result5010;

}

    return i5020;

}
}
