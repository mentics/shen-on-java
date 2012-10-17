package shen.gen;



import com.mentics.shen.*;

public class Compile {

public static final Symbol SYMBOL = RuntimeContext.symbol("compile");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v672, final Object v673, final Object v674) throws Exception {
return defined(v672, v673, v674);
}};
public static Object defined(final Object v672, final Object v673, final Object v674) throws Exception {
final Object f688 = Atp.LAMBDA.apply(v673, Nil.NIL);
final Object f689 = RuntimeContext.dispatch(v672).apply(f688);

final Object o687 = f689;

final Object i693;
if ((boolean)Lang.equals(null, o687)) {

i693 = true;
} else {
final Object f690 = Fst.LAMBDA.apply(o687);
final Object f691 = EmptyQ.LAMBDA.apply(f690);


final Object i692;
if ((boolean)!((boolean)f691)) {

i692 = true;
} else {

i692 = false;

}
i693 = i692;

}
final Object i696;
if ((boolean)i693) {
final Object f694 = ShenCompileError.LAMBDA.apply(o687, v674);

i696 = f694;
} else {
final Object f695 = Snd.LAMBDA.apply(o687);

i696 = f695;

}

    return i696;

}
}
