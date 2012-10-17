package shen.gen;



import com.mentics.shen.*;

public class ShenFindPastInputs {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-find-past-inputs");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v595, final Object v596) throws Exception {
return defined(v595, v596);
}};
public static Object defined(final Object v595, final Object v596) throws Exception {
final Object f6593 = ShenFind.LAMBDA.apply(v595, v596);

final Object f6592 = f6593;
final Object f6594 = EmptyQ.LAMBDA.apply(f6592);

final Object i6596;
if ((boolean)f6594) {
final Object f6595 = Interror.LAMBDA.apply("input not found~%", Nil.NIL);

i6596 = f6595;
} else {

i6596 = f6592;

}

    return i6596;

}
}
