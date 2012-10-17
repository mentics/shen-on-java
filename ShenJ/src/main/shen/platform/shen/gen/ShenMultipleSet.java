package shen.gen;



import com.mentics.shen.*;

public class ShenMultipleSet {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-multiple-set");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v569) throws Exception {
return defined(v569);
}};
public static Object defined(final Object v569) throws Exception {

final Object i6462;
if ((boolean)Lang.equals(Nil.NIL, v569)) {

i6462 = Nil.NIL;
} else {


final Object i6456;
if ((boolean)(v569 instanceof Cons)) {



final Object i6455;
if ((boolean)(((Cons)v569).tail instanceof Cons)) {

i6455 = true;
} else {

i6455 = false;

}
i6456 = i6455;
} else {

i6456 = false;

}
final Object i6461;
if ((boolean)i6456) {





RuntimeContext.globalProperties.put((Symbol)((Cons)v569).head, ((Cons)((Cons)v569).tail).head);

final Object f6457 = ShenMultipleSet.LAMBDA.apply(((Cons)((Cons)v569).tail).tail);
final Object f6458 = Do.LAMBDA.apply(((Cons)((Cons)v569).tail).head, f6457);

i6461 = f6458;
} else {

final Object i6460;
if ((boolean)true) {
final Object f6459 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-multiple-set"));

i6460 = f6459;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6461 = i6460;

}
i6462 = i6461;

}
    return i6462;

}
}
