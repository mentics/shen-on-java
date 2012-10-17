package shen.gen;



import com.mentics.shen.*;

public class ShenAdatatypeRuleZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<datatype-rule>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1551) throws Exception {
return defined(v1551);
}};
public static Object defined(final Object v1551) throws Exception {
final Object f5820 = ShenAsideConditionsZ.LAMBDA.apply(v1551);

final Object parse_AsideConditionsZ5819 = f5820;


final Object i5836;
if ((boolean)!((boolean)Lang.equals(null, parse_AsideConditionsZ5819))) {
final Object f5822 = ShenApremisesZ.LAMBDA.apply(parse_AsideConditionsZ5819);

final Object parse_ApremisesZ5821 = f5822;


final Object i5835;
if ((boolean)!((boolean)Lang.equals(null, parse_ApremisesZ5821))) {
final Object f5824 = ShenAsingleunderlineZ.LAMBDA.apply(parse_ApremisesZ5821);

final Object parse_AsingleunderlineZ5823 = f5824;


final Object i5834;
if ((boolean)!((boolean)Lang.equals(null, parse_AsingleunderlineZ5823))) {
final Object f5826 = ShenAconclusionZ.LAMBDA.apply(parse_AsingleunderlineZ5823);

final Object parse_AconclusionZ5825 = f5826;


final Object i5833;
if ((boolean)!((boolean)Lang.equals(null, parse_AconclusionZ5825))) {
final Object f5827 = Fst.LAMBDA.apply(parse_AconclusionZ5825);
final Object f5828 = Snd.LAMBDA.apply(parse_AsideConditionsZ5819);

final Object f5829 = Snd.LAMBDA.apply(parse_ApremisesZ5821);

final Object f5830 = Snd.LAMBDA.apply(parse_AconclusionZ5825);




final Object f5831 = Atp.LAMBDA.apply(RuntimeContext.symbol("shen-single"), new Cons(f5828, new Cons(f5829, new Cons(f5830, Nil.NIL))));
final Object f5832 = ShenReassemble.LAMBDA.apply(f5827, f5831);

i5833 = f5832;
} else {

i5833 = null;

}

i5834 = i5833;
} else {

i5834 = null;

}

i5835 = i5834;
} else {

i5835 = null;

}

i5836 = i5835;
} else {

i5836 = null;

}

final Object result5818 = i5836;

final Object i5857;
if ((boolean)Lang.equals(result5818, null)) {
final Object f5839 = ShenAsideConditionsZ.LAMBDA.apply(v1551);

final Object parse_AsideConditionsZ5838 = f5839;


final Object i5855;
if ((boolean)!((boolean)Lang.equals(null, parse_AsideConditionsZ5838))) {
final Object f5841 = ShenApremisesZ.LAMBDA.apply(parse_AsideConditionsZ5838);

final Object parse_ApremisesZ5840 = f5841;


final Object i5854;
if ((boolean)!((boolean)Lang.equals(null, parse_ApremisesZ5840))) {
final Object f5843 = ShenAdoubleunderlineZ.LAMBDA.apply(parse_ApremisesZ5840);

final Object parse_AdoubleunderlineZ5842 = f5843;


final Object i5853;
if ((boolean)!((boolean)Lang.equals(null, parse_AdoubleunderlineZ5842))) {
final Object f5845 = ShenAconclusionZ.LAMBDA.apply(parse_AdoubleunderlineZ5842);

final Object parse_AconclusionZ5844 = f5845;


final Object i5852;
if ((boolean)!((boolean)Lang.equals(null, parse_AconclusionZ5844))) {
final Object f5846 = Fst.LAMBDA.apply(parse_AconclusionZ5844);
final Object f5847 = Snd.LAMBDA.apply(parse_AsideConditionsZ5838);

final Object f5848 = Snd.LAMBDA.apply(parse_ApremisesZ5840);

final Object f5849 = Snd.LAMBDA.apply(parse_AconclusionZ5844);




final Object f5850 = Atp.LAMBDA.apply(RuntimeContext.symbol("shen-double"), new Cons(f5847, new Cons(f5848, new Cons(f5849, Nil.NIL))));
final Object f5851 = ShenReassemble.LAMBDA.apply(f5846, f5850);

i5852 = f5851;
} else {

i5852 = null;

}

i5853 = i5852;
} else {

i5853 = null;

}

i5854 = i5853;
} else {

i5854 = null;

}

i5855 = i5854;
} else {

i5855 = null;

}

final Object result5837 = i5855;

final Object i5856;
if ((boolean)Lang.equals(result5837, null)) {

i5856 = null;
} else {

i5856 = result5837;

}

i5857 = i5856;
} else {

i5857 = result5818;

}

    return i5857;

}
}
