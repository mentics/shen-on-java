package shen.gen;



import com.mentics.shen.*;

public class ShenReverse_help {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-reverse_help");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v861, final Object v862) throws Exception {
return defined(v861, v862);
}};
public static Object defined(final Object v861, final Object v862) throws Exception {

final Object i1005;
if ((boolean)Lang.equals(Nil.NIL, v861)) {

i1005 = v862;
} else {


final Object i1004;
if ((boolean)(v861 instanceof Cons)) {




final Object f1001 = ShenReverse_help.LAMBDA.apply(((Cons)v861).tail, new Cons(((Cons)v861).head, v862));

i1004 = f1001;
} else {

final Object i1003;
if ((boolean)true) {
final Object f1002 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-reverse_help"));

i1003 = f1002;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1004 = i1003;

}
i1005 = i1004;

}
    return i1005;

}
}
