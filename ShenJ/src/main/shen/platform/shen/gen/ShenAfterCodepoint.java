package shen.gen;



import com.mentics.shen.*;

public class ShenAfterCodepoint {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-after-codepoint");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1002) throws Exception {
return defined(v1002);
}};
public static Object defined(final Object v1002) throws Exception {

final Object i5139;
if ((boolean)Lang.equals(Nil.NIL, v1002)) {

i5139 = Nil.NIL;
} else {


final Object i5133;
if ((boolean)(v1002 instanceof Cons)) {


final Object i5132;
if ((boolean)Lang.equals(";", ((Cons)v1002).head)) {

i5132 = true;
} else {

i5132 = false;

}
i5133 = i5132;
} else {

i5133 = false;

}
final Object i5138;
if ((boolean)i5133) {


i5138 = ((Cons)v1002).tail;
} else {


final Object i5137;
if ((boolean)(v1002 instanceof Cons)) {

final Object f5134 = ShenAfterCodepoint.LAMBDA.apply(((Cons)v1002).tail);

i5137 = f5134;
} else {

final Object i5136;
if ((boolean)true) {
final Object f5135 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-after-codepoint"));

i5136 = f5135;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5137 = i5136;

}
i5138 = i5137;

}
i5139 = i5138;

}
    return i5139;

}
}
