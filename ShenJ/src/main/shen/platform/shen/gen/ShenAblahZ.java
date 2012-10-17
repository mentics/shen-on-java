package shen.gen;



import com.mentics.shen.*;

public class ShenAblahZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<blah>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1053) throws Exception {
return defined(v1053);
}};
public static Object defined(final Object v1053) throws Exception {
final Object f5665 = Fst.LAMBDA.apply(v1053);


final Object i5674;
if ((boolean)(f5665 instanceof Cons)) {
final Object f5666 = Fst.LAMBDA.apply(v1053);

final Object f5667 = Snd.LAMBDA.apply(v1053);
final Object f5668 = ShenReassemble.LAMBDA.apply(((Cons)f5666).tail, f5667);
final Object f5669 = Fst.LAMBDA.apply(f5668);
final Object f5670 = Fst.LAMBDA.apply(v1053);
final Object f5671 = ShenEndOfCommentQ.LAMBDA.apply(f5670);

final Object i5672;
if ((boolean)f5671) {

i5672 = null;
} else {

i5672 = RuntimeContext.symbol("shen-skip");

}final Object f5673 = ShenReassemble.LAMBDA.apply(f5669, i5672);

i5674 = f5673;
} else {

i5674 = null;

}
final Object result5664 = i5674;

final Object i5675;
if ((boolean)Lang.equals(result5664, null)) {

i5675 = null;
} else {

i5675 = result5664;

}

    return i5675;

}
}
