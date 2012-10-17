package shen.gen;



import com.mentics.shen.*;

public class Union {

public static final Symbol SYMBOL = RuntimeContext.symbol("union");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v863, final Object v864) throws Exception {
return defined(v863, v864);
}};
public static Object defined(final Object v863, final Object v864) throws Exception {

final Object i1013;
if ((boolean)Lang.equals(Nil.NIL, v863)) {

i1013 = v864;
} else {


final Object i1012;
if ((boolean)(v863 instanceof Cons)) {

final Object f1006 = ElementQ.LAMBDA.apply(((Cons)v863).head, v864);

final Object i1009;
if ((boolean)f1006) {

final Object f1007 = Union.LAMBDA.apply(((Cons)v863).tail, v864);

i1009 = f1007;
} else {



final Object f1008 = Union.LAMBDA.apply(((Cons)v863).tail, v864);


i1009 = new Cons(((Cons)v863).head, f1008);

}
i1012 = i1009;
} else {

final Object i1011;
if ((boolean)true) {
final Object f1010 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("union"));

i1011 = f1010;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1012 = i1011;

}
i1013 = i1012;

}
    return i1013;

}
}
