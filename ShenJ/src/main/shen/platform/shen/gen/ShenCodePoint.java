package shen.gen;



import com.mentics.shen.*;

public class ShenCodePoint {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-code-point");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v997) throws Exception {
return defined(v997);
}};
public static Object defined(final Object v997) throws Exception {


final Object i5122;
if ((boolean)(v997 instanceof Cons)) {


final Object i5121;
if ((boolean)Lang.equals(";", ((Cons)v997).head)) {

i5121 = true;
} else {

i5121 = false;

}
i5122 = i5121;
} else {

i5122 = false;

}
final Object i5131;
if ((boolean)i5122) {

i5131 = "";
} else {


final Object i5125;
if ((boolean)(v997 instanceof Cons)) {























final Object f5123 = ElementQ.LAMBDA.apply(((Cons)v997).head, new Cons("0", new Cons("1", new Cons("2", new Cons("3", new Cons("4", new Cons("5", new Cons("6", new Cons("7", new Cons("8", new Cons("9", new Cons("0", Nil.NIL))))))))))));

final Object i5124;
if ((boolean)f5123) {

i5124 = true;
} else {

i5124 = false;

}
i5125 = i5124;
} else {

i5125 = false;

}
final Object i5130;
if ((boolean)i5125) {



final Object f5126 = ShenCodePoint.LAMBDA.apply(((Cons)v997).tail);


i5130 = new Cons(((Cons)v997).head, f5126);
} else {

final Object i5129;
if ((boolean)true) {
final Object f5127 = Atp.LAMBDA.apply(v997, Nil.NIL);
final Object f5128 = Interror.LAMBDA.apply("code point parse error ~A~%", f5127);

i5129 = f5128;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5130 = i5129;

}
i5131 = i5130;

}
    return i5131;

}
}
