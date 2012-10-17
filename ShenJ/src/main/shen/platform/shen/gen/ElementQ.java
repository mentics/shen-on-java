package shen.gen;



import com.mentics.shen.*;

public class ElementQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("element?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v794, final Object v795) throws Exception {
return defined(v794, v795);
}};
public static Object defined(final Object v794, final Object v795) throws Exception {

final Object i901;
if ((boolean)Lang.equals(Nil.NIL, v795)) {

i901 = false;
} else {


final Object i895;
if ((boolean)(v795 instanceof Cons)) {


final Object i894;
if ((boolean)Lang.equals(((Cons)v795).head, v794)) {

i894 = true;
} else {

i894 = false;

}
i895 = i894;
} else {

i895 = false;

}
final Object i900;
if ((boolean)i895) {

i900 = true;
} else {


final Object i899;
if ((boolean)(v795 instanceof Cons)) {

final Object f896 = ElementQ.LAMBDA.apply(v794, ((Cons)v795).tail);

i899 = f896;
} else {

final Object i898;
if ((boolean)true) {
final Object f897 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("element?"));

i898 = f897;
} else {

throw new SimpleError((String)"True condition not found.");


}
i899 = i898;

}
i900 = i899;

}
i901 = i900;

}
    return i901;

}
}
