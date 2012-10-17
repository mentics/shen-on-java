package shen.gen;



import com.mentics.shen.*;

public class ShenControlChars {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-control-chars");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v994) throws Exception {
return defined(v994);
}};
public static Object defined(final Object v994) throws Exception {

final Object i5120;
if ((boolean)Lang.equals(Nil.NIL, v994)) {

i5120 = "";
} else {


final Object i5106;
if ((boolean)(v994 instanceof Cons)) {


final Object i5104;
if ((boolean)Lang.equals("c", ((Cons)v994).head)) {



final Object i5102;
if ((boolean)(((Cons)v994).tail instanceof Cons)) {



final Object i5101;
if ((boolean)Lang.equals("#", ((Cons)((Cons)v994).tail).head)) {

i5101 = true;
} else {

i5101 = false;

}
i5102 = i5101;
} else {

i5102 = false;

}
final Object i5103;
if ((boolean)i5102) {

i5103 = true;
} else {

i5103 = false;

}
i5104 = i5103;
} else {

i5104 = false;

}
final Object i5105;
if ((boolean)i5104) {

i5105 = true;
} else {

i5105 = false;

}
i5106 = i5105;
} else {

i5106 = false;

}
final Object i5119;
if ((boolean)i5106) {


final Object f5108 = ShenCodePoint.LAMBDA.apply(((Cons)((Cons)v994).tail).tail);

final Object codePoint5107 = f5108;


final Object f5110 = ShenAfterCodepoint.LAMBDA.apply(((Cons)((Cons)v994).tail).tail);

final Object afterCodePoint5109 = f5110;
final Object f5111 = ShenDecimalise.LAMBDA.apply(codePoint5107);

final Object f5112 = ShenControlChars.LAMBDA.apply(afterCodePoint5109);
final Object f5113 = Ats.LAMBDA.apply(new String(Character.toChars(((Number) (f5111)).intValue())), f5112);



i5119 = f5113;
} else {


final Object i5118;
if ((boolean)(v994 instanceof Cons)) {


final Object f5114 = ShenControlChars.LAMBDA.apply(((Cons)v994).tail);
final Object f5115 = Ats.LAMBDA.apply(((Cons)v994).head, f5114);

i5118 = f5115;
} else {

final Object i5117;
if ((boolean)true) {
final Object f5116 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-control-chars"));

i5117 = f5116;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5118 = i5117;

}
i5119 = i5118;

}
i5120 = i5119;

}
    return i5120;

}
}
