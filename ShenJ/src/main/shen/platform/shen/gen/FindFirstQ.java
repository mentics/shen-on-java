package shen.gen;



import com.mentics.shen.*;

public class FindFirstQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("find-first?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v7248, final Object v7249) throws Exception {
return defined(v7248, v7249);
}};
public static Object defined(final Object v7248, final Object v7249) throws Exception {

final Object i8435;
if ((boolean)Lang.equals(Nil.NIL, v7249)) {

i8435 = false;
} else {


final Object i8426;
if ((boolean)(v7249 instanceof Cons)) {

final Object f8424 = TupleQ.LAMBDA.apply(((Cons)v7249).head);

final Object i8425;
if ((boolean)f8424) {

i8425 = true;
} else {

i8425 = false;

}
i8426 = i8425;
} else {

i8426 = false;

}
final Object i8434;
if ((boolean)i8426) {

final Object f8427 = Fst.LAMBDA.apply(((Cons)v7249).head);

final Object i8429;
if ((boolean)Lang.equals(v7248, f8427)) {

i8429 = true;
} else {

final Object f8428 = FindFirstQ.LAMBDA.apply(v7248, ((Cons)v7249).tail);

i8429 = f8428;

}
i8434 = i8429;
} else {

final Object i8433;
if ((boolean)true) {
final Object f8430 = Atp.LAMBDA.apply(v7249, Nil.NIL);
final Object f8431 = Atp.LAMBDA.apply(v7248, f8430);
final Object f8432 = IntmakeString.LAMBDA.apply("find-first: X: ~A~%Y: ~A", f8431);

throw new SimpleError((String)f8432);

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i8435 = i8434;

}
    return i8435;

}
}
