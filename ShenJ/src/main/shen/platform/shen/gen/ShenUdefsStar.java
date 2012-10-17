package shen.gen;



import com.mentics.shen.*;

public class ShenUdefsStar {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-udefs*");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v773, final Object v774, final Object v775, final Object v776, final Object v777) throws Exception {
return defined(v773, v774, v775, v776, v777);
}};
public static Object defined(final Object v773, final Object v774, final Object v775, final Object v776, final Object v777) throws Exception {
final Object f109 = ShenLazyderef.LAMBDA.apply(v775, v776);

final Object v749108 = f109;


final Object i114;
if ((boolean)(v749108 instanceof Cons)) {


final Object d110 = ((Cons)v749108).head;
final Object f111 = ShenIncinfs.LAMBDA.apply();






final Object f112 = Call.LAMBDA.apply(new Cons(d110, new Cons(v773, new Cons(v774, Nil.NIL))), v776, v777);
final Object f113 = Do.LAMBDA.apply(f111, f112);


i114 = f113;
} else {

i114 = false;

}

final Object case107 = i114;

final Object i122;
if ((boolean)Lang.equals(case107, false)) {
final Object f116 = ShenLazyderef.LAMBDA.apply(v775, v776);

final Object v750115 = f116;


final Object i121;
if ((boolean)(v750115 instanceof Cons)) {


final Object ds117 = ((Cons)v750115).tail;
final Object f118 = ShenIncinfs.LAMBDA.apply();
final Object f119 = ShenUdefsStar.LAMBDA.apply(v773, v774, ds117, v776, v777);
final Object f120 = Do.LAMBDA.apply(f118, f119);


i121 = f120;
} else {

i121 = false;

}

i122 = i121;
} else {

i122 = case107;

}

    return i122;

}
}
