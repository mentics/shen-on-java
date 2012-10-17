package shen.gen;



import com.mentics.shen.*;

public class ShenCompileError {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-compile-error");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v687, final Object v688) throws Exception {
return defined(v687, v688);
}};
public static Object defined(final Object v687, final Object v688) throws Exception {

final Object i706;
if ((boolean)Lang.equals(Nil.NIL, v688)) {

i706 = null;
} else {
final Object f697 = TupleQ.LAMBDA.apply(v687);

final Object i700;
if ((boolean)f697) {
final Object f698 = Fst.LAMBDA.apply(v687);


final Object i699;
if ((boolean)(f698 instanceof Cons)) {

i699 = true;
} else {

i699 = false;

}
i700 = i699;
} else {

i700 = false;

}
final Object i705;
if ((boolean)i700) {
final Object f701 = Fst.LAMBDA.apply(v687);
final Object f702 = RuntimeContext.dispatch(v688).apply(f701);

i705 = f702;
} else {

final Object i704;
if ((boolean)true) {
final Object f703 = Interror.LAMBDA.apply("syntax error~%", Nil.NIL);

i704 = f703;
} else {

throw new SimpleError((String)"True condition not found.");


}
i705 = i704;

}
i706 = i705;

}
    return i706;

}
}
