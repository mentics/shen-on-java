package shen.gen;



import com.mentics.shen.*;

public class ShenInsertPredicate {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-insert-predicate");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1178, final Object v1179) throws Exception {
return defined(v1178, v1179);
}};
public static Object defined(final Object v1178, final Object v1179) throws Exception {


final Object i2549;
if ((boolean)(v1179 instanceof Cons)) {



final Object i2547;
if ((boolean)(((Cons)v1179).tail instanceof Cons)) {



final Object i2546;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1179).tail).tail)) {

i2546 = true;
} else {

i2546 = false;

}
i2547 = i2546;
} else {

i2547 = false;

}
final Object i2548;
if ((boolean)i2547) {

i2548 = true;
} else {

i2548 = false;

}
i2549 = i2548;
} else {

i2549 = false;

}
final Object i2552;
if ((boolean)i2549) {









i2552 = new Cons(new Cons(v1178, ((Cons)v1179).head), new Cons(RuntimeContext.symbol(":-"), ((Cons)v1179).tail));
} else {

final Object i2551;
if ((boolean)true) {
final Object f2550 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-insert-predicate"));

i2551 = f2550;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2552 = i2551;

}
    return i2552;

}
}
