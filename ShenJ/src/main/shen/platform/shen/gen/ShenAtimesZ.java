package shen.gen;



import com.mentics.shen.*;

public class ShenAtimesZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<times>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1051) throws Exception {
return defined(v1051);
}};
public static Object defined(final Object v1051) throws Exception {
final Object f5627 = Fst.LAMBDA.apply(v1051);


final Object i5635;
if ((boolean)(f5627 instanceof Cons)) {
final Object f5628 = Fst.LAMBDA.apply(v1051);

final Object f5629 = Snd.LAMBDA.apply(v1051);
final Object f5630 = ShenReassemble.LAMBDA.apply(((Cons)f5628).tail, f5629);
final Object f5631 = Fst.LAMBDA.apply(f5630);
final Object f5632 = Fst.LAMBDA.apply(v1051);


final Object i5633;
if ((boolean)Lang.equals(((Cons)f5632).head, 42)) {

i5633 = RuntimeContext.symbol("shen-skip");
} else {

i5633 = null;

}final Object f5634 = ShenReassemble.LAMBDA.apply(f5631, i5633);

i5635 = f5634;
} else {

i5635 = null;

}
final Object result5626 = i5635;

final Object i5636;
if ((boolean)Lang.equals(result5626, null)) {

i5636 = null;
} else {

i5636 = result5626;

}

    return i5636;

}
}
