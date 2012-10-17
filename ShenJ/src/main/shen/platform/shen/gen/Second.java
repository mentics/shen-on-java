package shen.gen;



import com.mentics.shen.*;

public class Second {

public static final Symbol SYMBOL = RuntimeContext.symbol("second");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6924) throws Exception {
return defined(v6924);
}};
public static Object defined(final Object v6924) throws Exception {
final Object f7109 = TupleQ.LAMBDA.apply(v6924);

final Object i7113;
if ((boolean)f7109) {
final Object f7110 = Snd.LAMBDA.apply(v6924);
final Object f7111 = TupleQ.LAMBDA.apply(f7110);

final Object i7112;
if ((boolean)f7111) {

i7112 = true;
} else {

i7112 = false;

}
i7113 = i7112;
} else {

i7113 = false;

}
final Object i7121;
if ((boolean)i7113) {
final Object f7114 = Snd.LAMBDA.apply(v6924);
final Object f7115 = Fst.LAMBDA.apply(f7114);

i7121 = f7115;
} else {
final Object f7116 = TupleQ.LAMBDA.apply(v6924);

final Object i7120;
if ((boolean)f7116) {
final Object f7117 = Snd.LAMBDA.apply(v6924);

i7120 = f7117;
} else {

final Object i7119;
if ((boolean)true) {
final Object f7118 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("second"));

i7119 = f7118;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7120 = i7119;

}
i7121 = i7120;

}
    return i7121;

}
}
