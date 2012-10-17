package shen.gen;



import com.mentics.shen.*;

public class AbrZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("<br>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v926) throws Exception {
return defined(v926);
}};
public static Object defined(final Object v926) throws Exception {
final Object f928 = Fst.LAMBDA.apply(v926);


final Object i931;
if ((boolean)(f928 instanceof Cons)) {
final Object f929 = Fst.LAMBDA.apply(v926);


final Object i930;
if ((boolean)Lang.equals(40, ((Cons)f929).head)) {

i930 = true;
} else {

i930 = false;

}
i931 = i930;
} else {

i931 = false;

}
final Object i951;
if ((boolean)i931) {
final Object f933 = Fst.LAMBDA.apply(v926);

final Object f934 = Snd.LAMBDA.apply(v926);
final Object f935 = ShenReassemble.LAMBDA.apply(((Cons)f933).tail, f934);
final Object f936 = AbrZ.LAMBDA.apply(f935);

final Object parse_AbrZ932 = f936;


final Object i950;
if ((boolean)!((boolean)Lang.equals(null, parse_AbrZ932))) {
final Object f937 = Fst.LAMBDA.apply(parse_AbrZ932);


final Object i940;
if ((boolean)(f937 instanceof Cons)) {
final Object f938 = Fst.LAMBDA.apply(parse_AbrZ932);


final Object i939;
if ((boolean)Lang.equals(41, ((Cons)f938).head)) {

i939 = true;
} else {

i939 = false;

}
i940 = i939;
} else {

i940 = false;

}
final Object i949;
if ((boolean)i940) {
final Object f942 = Fst.LAMBDA.apply(parse_AbrZ932);

final Object f943 = Snd.LAMBDA.apply(parse_AbrZ932);
final Object f944 = ShenReassemble.LAMBDA.apply(((Cons)f942).tail, f943);
final Object f945 = AbrTOxDOZ.LAMBDA.apply(f944);

final Object parse_AbrTOxDOZ941 = f945;


final Object i948;
if ((boolean)!((boolean)Lang.equals(null, parse_AbrTOxDOZ941))) {
final Object f946 = Fst.LAMBDA.apply(parse_AbrTOxDOZ941);
final Object f947 = ShenReassemble.LAMBDA.apply(f946, RuntimeContext.symbol("ok"));

i948 = f947;
} else {

i948 = null;

}

i949 = i948;
} else {

i949 = null;

}
i950 = i949;
} else {

i950 = null;

}

i951 = i950;
} else {

i951 = null;

}
final Object result927 = i951;

final Object i969;
if ((boolean)Lang.equals(result927, null)) {
final Object f954 = AitemZ.LAMBDA.apply(v926);

final Object parse_AitemZ953 = f954;


final Object i960;
if ((boolean)!((boolean)Lang.equals(null, parse_AitemZ953))) {
final Object f956 = AbrZ.LAMBDA.apply(parse_AitemZ953);

final Object parse_AbrZ955 = f956;


final Object i959;
if ((boolean)!((boolean)Lang.equals(null, parse_AbrZ955))) {
final Object f957 = Fst.LAMBDA.apply(parse_AbrZ955);
final Object f958 = ShenReassemble.LAMBDA.apply(f957, RuntimeContext.symbol("ok"));

i959 = f958;
} else {

i959 = null;

}

i960 = i959;
} else {

i960 = null;

}

final Object result952 = i960;

final Object i968;
if ((boolean)Lang.equals(result952, null)) {
final Object f963 = AeZ.LAMBDA.apply(v926);

final Object parse_AeZ962 = f963;


final Object i966;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ962))) {
final Object f964 = Fst.LAMBDA.apply(parse_AeZ962);
final Object f965 = ShenReassemble.LAMBDA.apply(f964, RuntimeContext.symbol("ok"));

i966 = f965;
} else {

i966 = null;

}

final Object result961 = i966;

final Object i967;
if ((boolean)Lang.equals(result961, null)) {

i967 = null;
} else {

i967 = result961;

}

i968 = i967;
} else {

i968 = result952;

}

i969 = i968;
} else {

i969 = result927;

}

    return i969;

}
}
