package shen.gen;



import com.mentics.shen.*;

public class ShenAlcurlyZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<lcurly>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v983) throws Exception {
return defined(v983);
}};
public static Object defined(final Object v983) throws Exception {
final Object f4967 = Fst.LAMBDA.apply(v983);


final Object i4975;
if ((boolean)(f4967 instanceof Cons)) {
final Object f4968 = Fst.LAMBDA.apply(v983);

final Object f4969 = Snd.LAMBDA.apply(v983);
final Object f4970 = ShenReassemble.LAMBDA.apply(((Cons)f4968).tail, f4969);
final Object f4971 = Fst.LAMBDA.apply(f4970);
final Object f4972 = Fst.LAMBDA.apply(v983);


final Object i4973;
if ((boolean)Lang.equals(((Cons)f4972).head, 123)) {

i4973 = RuntimeContext.symbol("shen-skip");
} else {

i4973 = null;

}final Object f4974 = ShenReassemble.LAMBDA.apply(f4971, i4973);

i4975 = f4974;
} else {

i4975 = null;

}
final Object result4966 = i4975;

final Object i4976;
if ((boolean)Lang.equals(result4966, null)) {

i4976 = null;
} else {

i4976 = result4966;

}

    return i4976;

}
}
