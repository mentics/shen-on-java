package shen.gen;



import com.mentics.shen.*;

public class ShenExtractPvars {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-extract-pvars");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v642) throws Exception {
return defined(v642);
}};
public static Object defined(final Object v642) throws Exception {
final Object f6723 = ShenPvarQ.LAMBDA.apply(v642);

final Object i6729;
if ((boolean)f6723) {



i6729 = new Cons(v642, Nil.NIL);
} else {


final Object i6728;
if ((boolean)(v642 instanceof Cons)) {

final Object f6724 = ShenExtractPvars.LAMBDA.apply(((Cons)v642).head);

final Object f6725 = ShenExtractPvars.LAMBDA.apply(((Cons)v642).tail);
final Object f6726 = Union.LAMBDA.apply(f6724, f6725);

i6728 = f6726;
} else {

final Object i6727;
if ((boolean)true) {

i6727 = Nil.NIL;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6728 = i6727;

}
i6729 = i6728;

}
    return i6729;

}
}
