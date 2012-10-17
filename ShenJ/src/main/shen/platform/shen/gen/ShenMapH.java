package shen.gen;



import com.mentics.shen.*;

public class ShenMapH {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-map-h");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v884, final Object v885, final Object v886) throws Exception {
return defined(v884, v885, v886);
}};
public static Object defined(final Object v884, final Object v885, final Object v886) throws Exception {

final Object i1043;
if ((boolean)Lang.equals(Nil.NIL, v885)) {
final Object f1037 = Reverse.LAMBDA.apply(v886);

i1043 = f1037;
} else {


final Object i1042;
if ((boolean)(v885 instanceof Cons)) {


final Object f1038 = RuntimeContext.dispatch(v884).apply(((Cons)v885).head);


final Object f1039 = ShenMapH.LAMBDA.apply(v884, ((Cons)v885).tail, new Cons(f1038, v886));

i1042 = f1039;
} else {

final Object i1041;
if ((boolean)true) {
final Object f1040 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-map-h"));

i1041 = f1040;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1042 = i1041;

}
i1043 = i1042;

}
    return i1043;

}
}
