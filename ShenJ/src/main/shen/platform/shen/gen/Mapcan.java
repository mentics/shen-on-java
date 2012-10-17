package shen.gen;



import com.mentics.shen.*;

public class Mapcan {

public static final Symbol SYMBOL = RuntimeContext.symbol("mapcan");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v920, final Object v921) throws Exception {
return defined(v920, v921);
}};
public static Object defined(final Object v920, final Object v921) throws Exception {

final Object i1083;
if ((boolean)Lang.equals(Nil.NIL, v921)) {

i1083 = Nil.NIL;
} else {


final Object i1082;
if ((boolean)(v921 instanceof Cons)) {

final Object f1077 = RuntimeContext.dispatch(v920).apply(((Cons)v921).head);

final Object f1078 = Mapcan.LAMBDA.apply(v920, ((Cons)v921).tail);
final Object f1079 = Append.LAMBDA.apply(f1077, f1078);

i1082 = f1079;
} else {

final Object i1081;
if ((boolean)true) {
final Object f1080 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("mapcan"));

i1081 = f1080;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1082 = i1081;

}
i1083 = i1082;

}
    return i1083;

}
}
