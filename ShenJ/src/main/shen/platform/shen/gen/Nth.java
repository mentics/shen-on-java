package shen.gen;



import com.mentics.shen.*;

public class Nth {

public static final Symbol SYMBOL = RuntimeContext.symbol("nth");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v907, final Object v908) throws Exception {
return defined(v907, v908);
}};
public static Object defined(final Object v907, final Object v908) throws Exception {

final Object i1054;
if ((boolean)Lang.equals(1, v907)) {


final Object i1053;
if ((boolean)(v908 instanceof Cons)) {

i1053 = true;
} else {

i1053 = false;

}
i1054 = i1053;
} else {

i1054 = false;

}
final Object i1059;
if ((boolean)i1054) {


i1059 = ((Cons)v908).head;
} else {


final Object i1058;
if ((boolean)(v908 instanceof Cons)) {



final Object f1055 = Nth.LAMBDA.apply(Primitives.minus.apply(v907, 1), ((Cons)v908).tail);

i1058 = f1055;
} else {

final Object i1057;
if ((boolean)true) {
final Object f1056 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("nth"));

i1057 = f1056;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1058 = i1057;

}
i1059 = i1058;

}
    return i1059;

}
}
