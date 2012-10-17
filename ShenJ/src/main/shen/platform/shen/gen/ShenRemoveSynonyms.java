package shen.gen;



import com.mentics.shen.*;

public class ShenRemoveSynonyms {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-remove-synonyms");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1662) throws Exception {
return defined(v1662);
}};
public static Object defined(final Object v1662) throws Exception {


final Object i4233;
if ((boolean)(v1662 instanceof Cons)) {


final Object i4232;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-synonyms-help"), ((Cons)v1662).head)) {

i4232 = true;
} else {

i4232 = false;

}
i4233 = i4232;
} else {

i4233 = false;

}
final Object i4237;
if ((boolean)i4233) {
final Object f4234 = Eval.LAMBDA.apply(v1662);
final Object f4235 = Do.LAMBDA.apply(f4234, Nil.NIL);

i4237 = f4235;
} else {

final Object i4236;
if ((boolean)true) {



i4236 = new Cons(v1662, Nil.NIL);
} else {

throw new SimpleError((String)"True condition not found.");


}
i4237 = i4236;

}
    return i4237;

}
}
