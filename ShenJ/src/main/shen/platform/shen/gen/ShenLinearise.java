package shen.gen;



import com.mentics.shen.*;

public class ShenLinearise {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-linearise");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v441) throws Exception {
return defined(v441);
}};
public static Object defined(final Object v441) throws Exception {


final Object i1992;
if ((boolean)(v441 instanceof Cons)) {



final Object i1990;
if ((boolean)(((Cons)v441).tail instanceof Cons)) {



final Object i1989;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v441).tail).tail)) {

i1989 = true;
} else {

i1989 = false;

}
i1990 = i1989;
} else {

i1990 = false;

}
final Object i1991;
if ((boolean)i1990) {

i1991 = true;
} else {

i1991 = false;

}
i1992 = i1991;
} else {

i1992 = false;

}
final Object i1997;
if ((boolean)i1992) {

final Object f1993 = ShenFlatten.LAMBDA.apply(((Cons)v441).head);



final Object f1994 = ShenLinearise_help.LAMBDA.apply(f1993, ((Cons)v441).head, ((Cons)((Cons)v441).tail).head);

i1997 = f1994;
} else {

final Object i1996;
if ((boolean)true) {
final Object f1995 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-linearise"));

i1996 = f1995;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1997 = i1996;

}
    return i1997;

}
}
