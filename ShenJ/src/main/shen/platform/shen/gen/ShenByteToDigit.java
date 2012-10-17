package shen.gen;



import com.mentics.shen.*;

public class ShenByteToDigit {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-byte->digit");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1035) throws Exception {
return defined(v1035);
}};
public static Object defined(final Object v1035) throws Exception {

final Object i5573;
if ((boolean)Lang.equals(48, v1035)) {

i5573 = 0;
} else {

final Object i5572;
if ((boolean)Lang.equals(49, v1035)) {

i5572 = 1;
} else {

final Object i5571;
if ((boolean)Lang.equals(50, v1035)) {

i5571 = 2;
} else {

final Object i5570;
if ((boolean)Lang.equals(51, v1035)) {

i5570 = 3;
} else {

final Object i5569;
if ((boolean)Lang.equals(52, v1035)) {

i5569 = 4;
} else {

final Object i5568;
if ((boolean)Lang.equals(53, v1035)) {

i5568 = 5;
} else {

final Object i5567;
if ((boolean)Lang.equals(54, v1035)) {

i5567 = 6;
} else {

final Object i5566;
if ((boolean)Lang.equals(55, v1035)) {

i5566 = 7;
} else {

final Object i5565;
if ((boolean)Lang.equals(56, v1035)) {

i5565 = 8;
} else {

final Object i5564;
if ((boolean)Lang.equals(57, v1035)) {

i5564 = 9;
} else {

final Object i5563;
if ((boolean)true) {
final Object f5562 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-byte->digit"));

i5563 = f5562;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5564 = i5563;

}
i5565 = i5564;

}
i5566 = i5565;

}
i5567 = i5566;

}
i5568 = i5567;

}
i5569 = i5568;

}
i5570 = i5569;

}
i5571 = i5570;

}
i5572 = i5571;

}
i5573 = i5572;

}
    return i5573;

}
}
