package shen.gen;



import com.mentics.shen.*;

public class ShenRightToLeft {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-right->left");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1590) throws Exception {
return defined(v1590);
}};
public static Object defined(final Object v1590) throws Exception {
final Object f6265 = TupleQ.LAMBDA.apply(v1590);

final Object i6268;
if ((boolean)f6265) {
final Object f6266 = Fst.LAMBDA.apply(v1590);

final Object i6267;
if ((boolean)Lang.equals(Nil.NIL, f6266)) {

i6267 = true;
} else {

i6267 = false;

}
i6268 = i6267;
} else {

i6268 = false;

}
final Object i6272;
if ((boolean)i6268) {
final Object f6269 = Snd.LAMBDA.apply(v1590);

i6272 = f6269;
} else {

final Object i6271;
if ((boolean)true) {
final Object f6270 = Interror.LAMBDA.apply("syntax error with ==========~%", Nil.NIL);

i6271 = f6270;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6272 = i6271;

}
    return i6272;

}
}
