package shen.gen;



import com.mentics.shen.*;

public class ShenCheckByte {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-check-byte");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1144) throws Exception {
return defined(v1144);
}};
public static Object defined(final Object v1144) throws Exception {
final Object f6786 = ShenHat.LAMBDA.apply();

final Object i6789;
if ((boolean)Lang.equals(v1144, f6786)) {
final Object f6787 = Interror.LAMBDA.apply("aborted", Nil.NIL);

i6789 = f6787;
} else {

final Object i6788;
if ((boolean)true) {

i6788 = true;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6789 = i6788;

}
    return i6789;

}
}
