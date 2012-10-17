package shen.gen;



import com.mentics.shen.*;

public class Intersection {

public static final Symbol SYMBOL = RuntimeContext.symbol("intersection");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v858, final Object v859) throws Exception {
return defined(v858, v859);
}};
public static Object defined(final Object v858, final Object v859) throws Exception {

final Object i999;
if ((boolean)Lang.equals(Nil.NIL, v858)) {

i999 = Nil.NIL;
} else {


final Object i998;
if ((boolean)(v858 instanceof Cons)) {

final Object f992 = ElementQ.LAMBDA.apply(((Cons)v858).head, v859);

final Object i995;
if ((boolean)f992) {



final Object f993 = Intersection.LAMBDA.apply(((Cons)v858).tail, v859);


i995 = new Cons(((Cons)v858).head, f993);
} else {

final Object f994 = Intersection.LAMBDA.apply(((Cons)v858).tail, v859);

i995 = f994;

}
i998 = i995;
} else {

final Object i997;
if ((boolean)true) {
final Object f996 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("intersection"));

i997 = f996;
} else {

throw new SimpleError((String)"True condition not found.");


}
i998 = i997;

}
i999 = i998;

}
    return i999;

}
}
