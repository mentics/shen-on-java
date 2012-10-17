package shen.gen;



import com.mentics.shen.*;

public class UstringDowncase {

public static final Symbol SYMBOL = RuntimeContext.symbol("ustring-downcase");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6875) throws Exception {
return defined(v6875);
}};
public static Object defined(final Object v6875) throws Exception {
final Object f6902 = UstringUppercaseQ.LAMBDA.apply(v6875);

final Object i6904;
if ((boolean)f6902) {





i6904 = new String(Character.toChars(((Number) (Primitives.plus.apply(Integer.valueOf(((String) v6875).charAt(0)), 32))).intValue()));
} else {

final Object i6903;
if ((boolean)true) {

i6903 = v6875;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6904 = i6903;

}
    return i6904;

}
}
