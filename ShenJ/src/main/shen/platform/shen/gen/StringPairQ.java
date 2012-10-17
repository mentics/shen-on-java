package shen.gen;



import com.mentics.shen.*;

public class StringPairQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("string-pair?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6943) throws Exception {
return defined(v6943);
}};
public static Object defined(final Object v6943) throws Exception {
final Object f7173 = TupleQ.LAMBDA.apply(v6943);

final Object i7179;
if ((boolean)f7173) {
final Object f7174 = Fst.LAMBDA.apply(v6943);


final Object i7177;
if ((boolean)(f7174 instanceof String)) {
final Object f7175 = Snd.LAMBDA.apply(v6943);


final Object i7176;
if ((boolean)(f7175 instanceof String)) {

i7176 = true;
} else {

i7176 = false;

}
i7177 = i7176;
} else {

i7177 = false;

}
i7179 = i7177;
} else {

final Object i7178;
if ((boolean)true) {

i7178 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7179 = i7178;

}
    return i7179;

}
}
