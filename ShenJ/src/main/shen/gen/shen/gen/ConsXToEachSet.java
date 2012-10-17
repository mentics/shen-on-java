package shen.gen;



import com.mentics.shen.*;

public class ConsXToEachSet {

public static final Symbol SYMBOL = RuntimeContext.symbol("cons-X-to-each-set");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v791, final Object v792) throws Exception {
return defined(v791, v792);
}};
public static Object defined(final Object v791, final Object v792) throws Exception {

final Object i797;
if ((boolean)Lang.equals(Nil.NIL, v792)) {

i797 = Nil.NIL;
} else {


final Object i796;
if ((boolean)(v792 instanceof Cons)) {





final Object f793 = ConsXToEachSet.LAMBDA.apply(v791, ((Cons)v792).tail);


i796 = new Cons(new Cons(v791, ((Cons)v792).head), f793);
} else {

final Object i795;
if ((boolean)true) {
final Object f794 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("cons-X-to-each-set"));

i795 = f794;
} else {

throw new SimpleError((String)"True condition not found.");


}
i796 = i795;

}
i797 = i796;

}
    return i797;

}
}
