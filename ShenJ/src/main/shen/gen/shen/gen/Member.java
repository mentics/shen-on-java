package shen.gen;



import com.mentics.shen.*;

public class Member {

public static final Symbol SYMBOL = RuntimeContext.symbol("member");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v636, final Object v637, final Object v638, final Object v639) throws Exception {
return defined(v636, v637, v638, v639);
}};
public static Object defined(final Object v636, final Object v637, final Object v638, final Object v639) throws Exception {
final Object f642 = ShenLazyderef.LAMBDA.apply(v637, v638);

final Object v491641 = f642;


final Object i660;
if ((boolean)(v491641 instanceof Cons)) {


final Object x643 = ((Cons)v491641).head;
final Object f644 = ShenIncinfs.LAMBDA.apply();
final Object f645 = UnifyBang.LAMBDA.apply(x643, v636, v638, v639);
final Object f646 = Do.LAMBDA.apply(f644, f645);


i660 = f646;
} else {
final Object f647 = ShenPvarQ.LAMBDA.apply(v491641);

final Object i659;
if ((boolean)f647) {
final Object f649 = ShenNewpv.LAMBDA.apply(v638);

final Object x648 = f649;

final Object f650 = ShenNewpv.LAMBDA.apply(v638);

final Object f651 = ShenBindv.LAMBDA.apply(v491641, new Cons(x648, f650), v638);
final Object f653 = ShenIncinfs.LAMBDA.apply();
final Object f654 = UnifyBang.LAMBDA.apply(x648, v636, v638, v639);
final Object f655 = Do.LAMBDA.apply(f653, f654);

final Object result652 = f655;
final Object f656 = ShenUnbindv.LAMBDA.apply(v491641, v638);
final Object f657 = Do.LAMBDA.apply(f656, result652);

final Object f658 = Do.LAMBDA.apply(f651, f657);


i659 = f658;
} else {

i659 = false;

}
i660 = i659;

}

final Object case640 = i660;

final Object i681;
if ((boolean)Lang.equals(case640, false)) {
final Object f662 = ShenLazyderef.LAMBDA.apply(v637, v638);

final Object v492661 = f662;


final Object i680;
if ((boolean)(v492661 instanceof Cons)) {


final Object z663 = ((Cons)v492661).tail;
final Object f664 = ShenIncinfs.LAMBDA.apply();
final Object f665 = Member.LAMBDA.apply(v636, z663, v638, v639);
final Object f666 = Do.LAMBDA.apply(f664, f665);


i680 = f666;
} else {
final Object f667 = ShenPvarQ.LAMBDA.apply(v492661);

final Object i679;
if ((boolean)f667) {
final Object f669 = ShenNewpv.LAMBDA.apply(v638);

final Object z668 = f669;
final Object f670 = ShenNewpv.LAMBDA.apply(v638);


final Object f671 = ShenBindv.LAMBDA.apply(v492661, new Cons(f670, z668), v638);
final Object f673 = ShenIncinfs.LAMBDA.apply();
final Object f674 = Member.LAMBDA.apply(v636, z668, v638, v639);
final Object f675 = Do.LAMBDA.apply(f673, f674);

final Object result672 = f675;
final Object f676 = ShenUnbindv.LAMBDA.apply(v492661, v638);
final Object f677 = Do.LAMBDA.apply(f676, result672);

final Object f678 = Do.LAMBDA.apply(f671, f677);


i679 = f678;
} else {

i679 = false;

}
i680 = i679;

}

i681 = i680;
} else {

i681 = case640;

}

    return i681;

}
}
