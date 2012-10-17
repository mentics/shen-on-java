package shen.gen;



import com.mentics.shen.*;

public class Append {

public static final Symbol SYMBOL = RuntimeContext.symbol("append");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v743, final Object v744) throws Exception {
return defined(v743, v744);
}};
public static Object defined(final Object v743, final Object v744) throws Exception {

final Object i828;
if ((boolean)Lang.equals(Nil.NIL, v743)) {

i828 = v744;
} else {


final Object i827;
if ((boolean)(v743 instanceof Cons)) {



final Object f824 = Append.LAMBDA.apply(((Cons)v743).tail, v744);


i827 = new Cons(((Cons)v743).head, f824);
} else {

final Object i826;
if ((boolean)true) {
final Object f825 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("append"));

i826 = f825;
} else {

throw new SimpleError((String)"True condition not found.");


}
i827 = i826;

}
i828 = i827;

}
    return i828;

}
}
