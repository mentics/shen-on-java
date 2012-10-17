package shen.gen;



import com.mentics.shen.*;

public class ShenExpt {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-expt");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1046, final Object v1047) throws Exception {
return defined(v1046, v1047);
}};
public static Object defined(final Object v1046, final Object v1047) throws Exception {

final Object i5590;
if ((boolean)Lang.equals(0, v1047)) {

i5590 = 1;
} else {



final Object i5589;
if ((boolean)(((Number)(v1047)).doubleValue() > ((Number)(0)).doubleValue())) {



final Object f5586 = ShenExpt.LAMBDA.apply(v1046, Primitives.minus.apply(v1047, 1));


i5589 = Primitives.multiply.apply(v1046, f5586);
} else {

final Object i5588;
if ((boolean)true) {



final Object f5587 = ShenExpt.LAMBDA.apply(v1046, Primitives.plus.apply(v1047, 1));




i5588 = Primitives.multiply.apply(1, Primitives.divide.apply(f5587, v1046));
} else {

throw new SimpleError((String)"True condition not found.");


}
i5589 = i5588;

}
i5590 = i5589;

}
    return i5590;

}
}
