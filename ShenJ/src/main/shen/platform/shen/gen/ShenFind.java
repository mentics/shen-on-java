package shen.gen;



import com.mentics.shen.*;

public class ShenFind {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-find");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v607, final Object v608) throws Exception {
return defined(v607, v608);
}};
public static Object defined(final Object v607, final Object v608) throws Exception {

final Object i6645;
if ((boolean)Lang.equals(Nil.NIL, v608)) {

i6645 = Nil.NIL;
} else {


final Object i6638;
if ((boolean)(v608 instanceof Cons)) {

final Object f6636 = RuntimeContext.dispatch(v607).apply(((Cons)v608).head);

final Object i6637;
if ((boolean)f6636) {

i6637 = true;
} else {

i6637 = false;

}
i6638 = i6637;
} else {

i6638 = false;

}
final Object i6644;
if ((boolean)i6638) {



final Object f6639 = ShenFind.LAMBDA.apply(v607, ((Cons)v608).tail);


i6644 = new Cons(((Cons)v608).head, f6639);
} else {


final Object i6643;
if ((boolean)(v608 instanceof Cons)) {

final Object f6640 = ShenFind.LAMBDA.apply(v607, ((Cons)v608).tail);

i6643 = f6640;
} else {

final Object i6642;
if ((boolean)true) {
final Object f6641 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-find"));

i6642 = f6641;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6643 = i6642;

}
i6644 = i6643;

}
i6645 = i6644;

}
    return i6645;

}
}
