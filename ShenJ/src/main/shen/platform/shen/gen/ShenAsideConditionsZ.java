package shen.gen;



import com.mentics.shen.*;

public class ShenAsideConditionsZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<side-conditions>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1552) throws Exception {
return defined(v1552);
}};
public static Object defined(final Object v1552) throws Exception {
final Object f5860 = ShenAsideConditionZ.LAMBDA.apply(v1552);

final Object parse_AsideConditionZ5859 = f5860;


final Object i5868;
if ((boolean)!((boolean)Lang.equals(null, parse_AsideConditionZ5859))) {
final Object f5862 = ShenAsideConditionsZ.LAMBDA.apply(parse_AsideConditionZ5859);

final Object parse_AsideConditionsZ5861 = f5862;


final Object i5867;
if ((boolean)!((boolean)Lang.equals(null, parse_AsideConditionsZ5861))) {
final Object f5863 = Fst.LAMBDA.apply(parse_AsideConditionsZ5861);
final Object f5864 = Snd.LAMBDA.apply(parse_AsideConditionZ5859);

final Object f5865 = Snd.LAMBDA.apply(parse_AsideConditionsZ5861);

final Object f5866 = ShenReassemble.LAMBDA.apply(f5863, new Cons(f5864, f5865));

i5867 = f5866;
} else {

i5867 = null;

}

i5868 = i5867;
} else {

i5868 = null;

}

final Object result5858 = i5868;

final Object i5876;
if ((boolean)Lang.equals(result5858, null)) {
final Object f5871 = AeZ.LAMBDA.apply(v1552);

final Object parse_AeZ5870 = f5871;


final Object i5874;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ5870))) {
final Object f5872 = Fst.LAMBDA.apply(parse_AeZ5870);
final Object f5873 = ShenReassemble.LAMBDA.apply(f5872, Nil.NIL);

i5874 = f5873;
} else {

i5874 = null;

}

final Object result5869 = i5874;

final Object i5875;
if ((boolean)Lang.equals(result5869, null)) {

i5875 = null;
} else {

i5875 = result5869;

}

i5876 = i5875;
} else {

i5876 = result5858;

}

    return i5876;

}
}
