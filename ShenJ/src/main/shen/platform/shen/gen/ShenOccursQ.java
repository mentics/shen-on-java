package shen.gen;



import com.mentics.shen.*;

public class ShenOccursQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-occurs?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1450, final Object v1451) throws Exception {
return defined(v1450, v1451);
}};
public static Object defined(final Object v1450, final Object v1451) throws Exception {

final Object i3832;
if ((boolean)Lang.equals(v1451, v1450)) {

i3832 = true;
} else {


final Object i3831;
if ((boolean)(v1451 instanceof Cons)) {

final Object f3826 = ShenOccursQ.LAMBDA.apply(v1450, ((Cons)v1451).head);

final Object i3829;
if ((boolean)f3826) {

i3829 = true;
} else {

final Object f3827 = ShenOccursQ.LAMBDA.apply(v1450, ((Cons)v1451).tail);

final Object i3828;
if ((boolean)f3827) {

i3828 = true;
} else {

i3828 = false;

}
i3829 = i3828;

}
i3831 = i3829;
} else {

final Object i3830;
if ((boolean)true) {

i3830 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3831 = i3830;

}
i3832 = i3831;

}
    return i3832;

}
}
