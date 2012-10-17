package shen.gen;



import com.mentics.shen.*;

public class LetterQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("letter?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6867) throws Exception {
return defined(v6867);
}};
public static Object defined(final Object v6867) throws Exception {
final Object f6890 = UstringLowercaseQ.LAMBDA.apply(v6867);

final Object i6893;
if ((boolean)f6890) {

i6893 = true;
} else {
final Object f6891 = UstringUppercaseQ.LAMBDA.apply(v6867);

final Object i6892;
if ((boolean)f6891) {

i6892 = true;
} else {

i6892 = false;

}
i6893 = i6892;

}
    return i6893;

}
}
