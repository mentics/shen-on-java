package shen.gen;



import com.mentics.shen.*;

public class ShenAsideConditionZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<side-condition>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1553) throws Exception {
return defined(v1553);
}};
public static Object defined(final Object v1553) throws Exception {
final Object f5878 = Fst.LAMBDA.apply(v1553);


final Object i5881;
if ((boolean)(f5878 instanceof Cons)) {
final Object f5879 = Fst.LAMBDA.apply(v1553);


final Object i5880;
if ((boolean)Lang.equals(RuntimeContext.symbol("if"), ((Cons)f5879).head)) {

i5880 = true;
} else {

i5880 = false;

}
i5881 = i5880;
} else {

i5881 = false;

}
final Object i5891;
if ((boolean)i5881) {
final Object f5883 = Fst.LAMBDA.apply(v1553);

final Object f5884 = Snd.LAMBDA.apply(v1553);
final Object f5885 = ShenReassemble.LAMBDA.apply(((Cons)f5883).tail, f5884);
final Object f5886 = ShenAexprZ.LAMBDA.apply(f5885);

final Object parse_AexprZ5882 = f5886;


final Object i5890;
if ((boolean)!((boolean)Lang.equals(null, parse_AexprZ5882))) {
final Object f5887 = Fst.LAMBDA.apply(parse_AexprZ5882);

final Object f5888 = Snd.LAMBDA.apply(parse_AexprZ5882);



final Object f5889 = ShenReassemble.LAMBDA.apply(f5887, new Cons(RuntimeContext.symbol("if"), new Cons(f5888, Nil.NIL)));

i5890 = f5889;
} else {

i5890 = null;

}

i5891 = i5890;
} else {

i5891 = null;

}
final Object result5877 = i5891;

final Object i5912;
if ((boolean)Lang.equals(result5877, null)) {
final Object f5893 = Fst.LAMBDA.apply(v1553);


final Object i5896;
if ((boolean)(f5893 instanceof Cons)) {
final Object f5894 = Fst.LAMBDA.apply(v1553);


final Object i5895;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)f5894).head)) {

i5895 = true;
} else {

i5895 = false;

}
i5896 = i5895;
} else {

i5896 = false;

}
final Object i5910;
if ((boolean)i5896) {
final Object f5898 = Fst.LAMBDA.apply(v1553);

final Object f5899 = Snd.LAMBDA.apply(v1553);
final Object f5900 = ShenReassemble.LAMBDA.apply(((Cons)f5898).tail, f5899);
final Object f5901 = ShenAvariableQZ.LAMBDA.apply(f5900);

final Object parse_AvariableQZ5897 = f5901;


final Object i5909;
if ((boolean)!((boolean)Lang.equals(null, parse_AvariableQZ5897))) {
final Object f5903 = ShenAexprZ.LAMBDA.apply(parse_AvariableQZ5897);

final Object parse_AexprZ5902 = f5903;


final Object i5908;
if ((boolean)!((boolean)Lang.equals(null, parse_AexprZ5902))) {
final Object f5904 = Fst.LAMBDA.apply(parse_AexprZ5902);

final Object f5905 = Snd.LAMBDA.apply(parse_AvariableQZ5897);

final Object f5906 = Snd.LAMBDA.apply(parse_AexprZ5902);




final Object f5907 = ShenReassemble.LAMBDA.apply(f5904, new Cons(RuntimeContext.symbol("let"), new Cons(f5905, new Cons(f5906, Nil.NIL))));

i5908 = f5907;
} else {

i5908 = null;

}

i5909 = i5908;
} else {

i5909 = null;

}

i5910 = i5909;
} else {

i5910 = null;

}
final Object result5892 = i5910;

final Object i5911;
if ((boolean)Lang.equals(result5892, null)) {

i5911 = null;
} else {

i5911 = result5892;

}

i5912 = i5911;
} else {

i5912 = result5877;

}

    return i5912;

}
}
