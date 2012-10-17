package shen.gen;



import com.mentics.shen.*;

public class ShenConstructPremissLiteral {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-construct-premiss-literal");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1635, final Object v1636) throws Exception {
return defined(v1635, v1636);
}};
public static Object defined(final Object v1635, final Object v1636) throws Exception {
final Object f6382 = TupleQ.LAMBDA.apply(v1635);

final Object i6390;
if ((boolean)f6382) {

final Object f6383 = Snd.LAMBDA.apply(v1635);
final Object f6384 = ShenRecursive_cons_form.LAMBDA.apply(f6383);

final Object f6385 = Fst.LAMBDA.apply(v1635);
final Object f6386 = ShenConstructContext.LAMBDA.apply(v1636, f6385);





i6390 = new Cons(RuntimeContext.symbol("shen-t*"), new Cons(f6384, new Cons(f6386, Nil.NIL)));
} else {

final Object i6389;
if ((boolean)Lang.equals(RuntimeContext.symbol("!"), v1635)) {





i6389 = new Cons(RuntimeContext.symbol("cut"), new Cons(RuntimeContext.symbol("Throwcontrol"), Nil.NIL));
} else {

final Object i6388;
if ((boolean)true) {
final Object f6387 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-construct-premiss-literal"));

i6388 = f6387;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6389 = i6388;

}
i6390 = i6389;

}
    return i6390;

}
}
