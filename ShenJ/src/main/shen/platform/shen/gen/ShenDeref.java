package shen.gen;



import com.mentics.shen.*;

public class ShenDeref {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-deref");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1411, final Object v1412) throws Exception {
return defined(v1411, v1412);
}};
public static Object defined(final Object v1411, final Object v1412) throws Exception {


final Object i3789;
if ((boolean)(v1411 instanceof Cons)) {

final Object f3780 = ShenDeref.LAMBDA.apply(((Cons)v1411).head, v1412);


final Object f3781 = ShenDeref.LAMBDA.apply(((Cons)v1411).tail, v1412);


i3789 = new Cons(f3780, f3781);
} else {

final Object i3788;
if ((boolean)true) {
final Object f3782 = ShenPvarQ.LAMBDA.apply(v1411);

final Object i3787;
if ((boolean)f3782) {
final Object f3784 = ShenValvector.LAMBDA.apply(v1411, v1412);

final Object value3783 = f3784;

final Object i3786;
if ((boolean)Lang.equals(value3783, RuntimeContext.symbol("shen--null-"))) {

i3786 = v1411;
} else {
final Object f3785 = ShenDeref.LAMBDA.apply(value3783, v1412);

i3786 = f3785;

}

i3787 = i3786;
} else {

i3787 = v1411;

}
i3788 = i3787;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3789 = i3788;

}
    return i3789;

}
}
