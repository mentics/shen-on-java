package shen.gen;



import com.mentics.shen.*;

public class ShenNestDisjunct {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-nest-disjunct");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1276) throws Exception {
return defined(v1276);
}};
public static Object defined(final Object v1276) throws Exception {


final Object i3061;
if ((boolean)(v1276 instanceof Cons)) {


final Object i3060;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1276).tail)) {

i3060 = true;
} else {

i3060 = false;

}
i3061 = i3060;
} else {

i3061 = false;

}
final Object i3067;
if ((boolean)i3061) {


i3067 = ((Cons)v1276).head;
} else {


final Object i3066;
if ((boolean)(v1276 instanceof Cons)) {


final Object f3062 = ShenNestDisjunct.LAMBDA.apply(((Cons)v1276).tail);
final Object f3063 = ShenLispOr.LAMBDA.apply(((Cons)v1276).head, f3062);

i3066 = f3063;
} else {

final Object i3065;
if ((boolean)true) {
final Object f3064 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-nest-disjunct"));

i3065 = f3064;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3066 = i3065;

}
i3067 = i3066;

}
    return i3067;

}
}
