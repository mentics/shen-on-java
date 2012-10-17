package shen.gen;



import com.mentics.shen.*;

public class ShenAlrbZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<lrb>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v991) throws Exception {
return defined(v991);
}};
public static Object defined(final Object v991) throws Exception {
final Object f5055 = Fst.LAMBDA.apply(v991);


final Object i5063;
if ((boolean)(f5055 instanceof Cons)) {
final Object f5056 = Fst.LAMBDA.apply(v991);

final Object f5057 = Snd.LAMBDA.apply(v991);
final Object f5058 = ShenReassemble.LAMBDA.apply(((Cons)f5056).tail, f5057);
final Object f5059 = Fst.LAMBDA.apply(f5058);
final Object f5060 = Fst.LAMBDA.apply(v991);


final Object i5061;
if ((boolean)Lang.equals(((Cons)f5060).head, 40)) {

i5061 = RuntimeContext.symbol("shen-skip");
} else {

i5061 = null;

}final Object f5062 = ShenReassemble.LAMBDA.apply(f5059, i5061);

i5063 = f5062;
} else {

i5063 = null;

}
final Object result5054 = i5063;

final Object i5064;
if ((boolean)Lang.equals(result5054, null)) {

i5064 = null;
} else {

i5064 = result5054;

}

    return i5064;

}
}
