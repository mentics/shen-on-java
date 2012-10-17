package shen.gen;



import com.mentics.shen.*;

public class ShenReassemble {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-reassemble");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v368, final Object v369) throws Exception {
return defined(v368, v369);
}};
public static Object defined(final Object v368, final Object v369) throws Exception {

final Object i4132;
if ((boolean)Lang.equals(v369, null)) {

i4132 = v369;
} else {

final Object i4131;
if ((boolean)true) {
final Object f4130 = Atp.LAMBDA.apply(v368, v369);

i4131 = f4130;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4132 = i4131;

}
    return i4132;

}
}
