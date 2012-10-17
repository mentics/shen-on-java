package shen.gen;



import com.mentics.shen.*;

public class ShenMakeKey {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-make-key");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v597, final Object v598) throws Exception {
return defined(v597, v598);
}};
public static Object defined(final Object v597, final Object v598) throws Exception {
final Lambda l6599 = new Lambda1() {
  public Object apply(final Object v599) throws Exception {
    final Object f6598 = ShenAst_inputZ.LAMBDA.apply(v599);

    return f6598;
  }
};final Object f6600 = Compile.LAMBDA.apply(l6599, v597, Nil.NIL);


final Object atom6597 = ((Cons)f6600).head;
final Object f6601 = IntegerQ.LAMBDA.apply(atom6597);

final Object i6609;
if ((boolean)f6601) {
final Lambda l6604 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    

final Object f6602 = Reverse.LAMBDA.apply(v598);
final Object f6603 = Nth.LAMBDA.apply(Primitives.plus.apply(atom6597, 1), f6602);

    return Lang.equals(x, f6603);
  }
};
i6609 = l6604;
} else {
final Lambda l6608 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f6605 = Snd.LAMBDA.apply(x);
final Object f6606 = ShenTrimGubbins.LAMBDA.apply(f6605);
final Object f6607 = ShenPrefixQ.LAMBDA.apply(v597, f6606);

    return f6607;
  }
};
i6609 = l6608;

}

    return i6609;

}
}
