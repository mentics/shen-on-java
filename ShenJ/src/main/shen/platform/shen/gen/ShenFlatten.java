package shen.gen;



import com.mentics.shen.*;

public class ShenFlatten {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-flatten");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v442) throws Exception {
return defined(v442);
}};
public static Object defined(final Object v442) throws Exception {

final Object i2003;
if ((boolean)Lang.equals(Nil.NIL, v442)) {

i2003 = Nil.NIL;
} else {


final Object i2002;
if ((boolean)(v442 instanceof Cons)) {

final Object f1998 = ShenFlatten.LAMBDA.apply(((Cons)v442).head);

final Object f1999 = ShenFlatten.LAMBDA.apply(((Cons)v442).tail);
final Object f2000 = Append.LAMBDA.apply(f1998, f1999);

i2002 = f2000;
} else {

final Object i2001;
if ((boolean)true) {



i2001 = new Cons(v442, Nil.NIL);
} else {

throw new SimpleError((String)"True condition not found.");


}
i2002 = i2001;

}
i2003 = i2002;

}
    return i2003;

}
}
