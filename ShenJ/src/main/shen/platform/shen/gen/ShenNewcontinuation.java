package shen.gen;



import com.mentics.shen.*;

public class ShenNewcontinuation {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-newcontinuation");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1369, final Object v1370, final Object v1371) throws Exception {
return defined(v1369, v1370, v1371);
}};
public static Object defined(final Object v1369, final Object v1370, final Object v1371) throws Exception {

final Object i3752;
if ((boolean)Lang.equals(Nil.NIL, v1369)) {

i3752 = v1371;
} else {


final Object i3746;
if ((boolean)(v1369 instanceof Cons)) {



final Object i3745;
if ((boolean)(((Cons)v1369).head instanceof Cons)) {

i3745 = true;
} else {

i3745 = false;

}
i3746 = i3745;
} else {

i3746 = false;

}
final Object i3751;
if ((boolean)i3746) {








final Object f3747 = ShenNewcontinuation.LAMBDA.apply(((Cons)v1369).tail, v1370, v1371);



final Object f3748 = Append.LAMBDA.apply(((Cons)((Cons)v1369).head).tail, new Cons(v1370, new Cons(f3747, Nil.NIL)));





i3751 = new Cons(RuntimeContext.symbol("freeze"), new Cons(new Cons(((Cons)((Cons)v1369).head).head, f3748), Nil.NIL));
} else {

final Object i3750;
if ((boolean)true) {
final Object f3749 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-newcontinuation"));

i3750 = f3749;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3751 = i3750;

}
i3752 = i3751;

}
    return i3752;

}
}
