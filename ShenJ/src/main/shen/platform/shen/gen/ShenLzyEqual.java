package shen.gen;



import com.mentics.shen.*;

public class ShenLzyEqual {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-lzy=");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1406, final Object v1407, final Object v1408, final Object v1409) throws Exception {
return defined(v1406, v1407, v1408, v1409);
}};
public static Object defined(final Object v1406, final Object v1407, final Object v1408, final Object v1409) throws Exception {

final Object i3779;
if ((boolean)Lang.equals(v1407, v1406)) {
final Object f3761 = Thaw.LAMBDA.apply(v1409);

i3779 = f3761;
} else {
final Object f3762 = ShenPvarQ.LAMBDA.apply(v1406);

final Object i3778;
if ((boolean)f3762) {
final Object f3763 = Bind.LAMBDA.apply(v1406, v1407, v1408, v1409);

i3778 = f3763;
} else {
final Object f3764 = ShenPvarQ.LAMBDA.apply(v1407);

final Object i3777;
if ((boolean)f3764) {
final Object f3765 = Bind.LAMBDA.apply(v1407, v1406, v1408, v1409);

i3777 = f3765;
} else {


final Object i3767;
if ((boolean)(v1406 instanceof Cons)) {


final Object i3766;
if ((boolean)(v1407 instanceof Cons)) {

i3766 = true;
} else {

i3766 = false;

}
i3767 = i3766;
} else {

i3767 = false;

}
final Object i3776;
if ((boolean)i3767) {

final Object f3768 = ShenLazyderef.LAMBDA.apply(((Cons)v1406).head, v1408);

final Object f3769 = ShenLazyderef.LAMBDA.apply(((Cons)v1407).head, v1408);
final Lambda l3773 = new Lambda0() {
  public Object apply() throws Exception {
    
final Object f3770 = ShenLazyderef.LAMBDA.apply(((Cons)v1406).tail, v1408);

final Object f3771 = ShenLazyderef.LAMBDA.apply(((Cons)v1407).tail, v1408);
final Object f3772 = ShenLzyEqual.LAMBDA.apply(f3770, f3771, v1408, v1409);

    return f3772;
  }
};final Object f3774 = ShenLzyEqual.LAMBDA.apply(f3768, f3769, v1408, l3773);

i3776 = f3774;
} else {

final Object i3775;
if ((boolean)true) {

i3775 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3776 = i3775;

}
i3777 = i3776;

}
i3778 = i3777;

}
i3779 = i3778;

}
    return i3779;

}
}
