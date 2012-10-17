package shen.gen;



import com.mentics.shen.*;

public class ShenFirst_n {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-first_n");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v310, final Object v311) throws Exception {
return defined(v310, v311);
}};
public static Object defined(final Object v310, final Object v311) throws Exception {

final Object i3976;
if ((boolean)Lang.equals(0, v310)) {

i3976 = Nil.NIL;
} else {

final Object i3975;
if ((boolean)Lang.equals(Nil.NIL, v311)) {

i3975 = Nil.NIL;
} else {


final Object i3974;
if ((boolean)(v311 instanceof Cons)) {





final Object f3971 = ShenFirst_n.LAMBDA.apply(Primitives.minus.apply(v310, 1), ((Cons)v311).tail);


i3974 = new Cons(((Cons)v311).head, f3971);
} else {

final Object i3973;
if ((boolean)true) {
final Object f3972 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-first_n"));

i3973 = f3972;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3974 = i3973;

}
i3975 = i3974;

}
i3976 = i3975;

}
    return i3976;

}
}
