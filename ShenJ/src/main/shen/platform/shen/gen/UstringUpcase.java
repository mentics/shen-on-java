package shen.gen;



import com.mentics.shen.*;

public class UstringUpcase {

public static final Symbol SYMBOL = RuntimeContext.symbol("ustring-upcase");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6874) throws Exception {
return defined(v6874);
}};
public static Object defined(final Object v6874) throws Exception {
final Object f6899 = UstringLowercaseQ.LAMBDA.apply(v6874);

final Object i6901;
if ((boolean)f6899) {





i6901 = new String(Character.toChars(((Number) (Primitives.minus.apply(Integer.valueOf(((String) v6874).charAt(0)), 32))).intValue()));
} else {

final Object i6900;
if ((boolean)true) {

i6900 = v6874;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6901 = i6900;

}
    return i6901;

}
}
