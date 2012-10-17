package shen.gen;



import com.mentics.shen.*;

public class ShenFormRule {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-form-rule");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v862, final Object v863, final Object v864, final Object v865) throws Exception {
return defined(v862, v863, v864, v865);
}};
public static Object defined(final Object v862, final Object v863, final Object v864, final Object v865) throws Exception {

final Object i2770;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-forward"), v863)) {


final Object i2749;
if ((boolean)Lang.equals(v865, RuntimeContext.symbol("shen-skip"))) {

i2749 = v864;
} else {







i2749 = new Cons(RuntimeContext.symbol("where"), new Cons(v865, new Cons(v864, Nil.NIL)));

}



i2770 = new Cons(v862, new Cons(i2749, Nil.NIL));
} else {

final Object i2763;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-backward"), v863)) {


final Object i2761;
if ((boolean)(v864 instanceof Cons)) {



final Object i2759;
if ((boolean)(((Cons)v864).head instanceof Cons)) {



final Object i2757;
if ((boolean)Lang.equals(RuntimeContext.symbol("fail-if"), ((Cons)((Cons)v864).head).head)) {




final Object i2755;
if ((boolean)(((Cons)((Cons)v864).head).tail instanceof Cons)) {




final Object i2753;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v864).head).tail).tail)) {



final Object i2751;
if ((boolean)(((Cons)v864).tail instanceof Cons)) {



final Object i2750;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v864).tail).tail)) {

i2750 = true;
} else {

i2750 = false;

}
i2751 = i2750;
} else {

i2751 = false;

}
final Object i2752;
if ((boolean)i2751) {

i2752 = true;
} else {

i2752 = false;

}
i2753 = i2752;
} else {

i2753 = false;

}
final Object i2754;
if ((boolean)i2753) {

i2754 = true;
} else {

i2754 = false;

}
i2755 = i2754;
} else {

i2755 = false;

}
final Object i2756;
if ((boolean)i2755) {

i2756 = true;
} else {

i2756 = false;

}
i2757 = i2756;
} else {

i2757 = false;

}
final Object i2758;
if ((boolean)i2757) {

i2758 = true;
} else {

i2758 = false;

}
i2759 = i2758;
} else {

i2759 = false;

}
final Object i2760;
if ((boolean)i2759) {

i2760 = true;
} else {

i2760 = false;

}
i2761 = i2760;
} else {

i2761 = false;

}
final Object i2762;
if ((boolean)i2761) {

i2762 = true;
} else {

i2762 = false;

}
i2763 = i2762;
} else {

i2763 = false;

}
final Object i2769;
if ((boolean)i2763) {


final Object i2764;
if ((boolean)Lang.equals(v865, RuntimeContext.symbol("shen-skip"))) {
















i2764 = new Cons(RuntimeContext.symbol("where"), new Cons(new Cons(RuntimeContext.symbol("not"), new Cons(new Cons(((Cons)((Cons)((Cons)v864).head).tail).head, ((Cons)v864).tail), Nil.NIL)), ((Cons)v864).tail));
} else {
























i2764 = new Cons(RuntimeContext.symbol("where"), new Cons(new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(v865, Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("not"), new Cons(new Cons(((Cons)((Cons)((Cons)v864).head).tail).head, ((Cons)v864).tail), Nil.NIL)), Nil.NIL)), ((Cons)v864).tail));

}



i2769 = new Cons(v862, new Cons(i2764, Nil.NIL));
} else {

final Object i2768;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-backward"), v863)) {


final Object i2765;
if ((boolean)Lang.equals(v865, RuntimeContext.symbol("shen-skip"))) {





















i2765 = new Cons(RuntimeContext.symbol("where"), new Cons(new Cons(RuntimeContext.symbol("not"), new Cons(new Cons(new Cons(RuntimeContext.symbol("=="), new Cons(v864, Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("fail"), Nil.NIL), Nil.NIL)), Nil.NIL)), new Cons(v864, Nil.NIL)));
} else {





























i2765 = new Cons(RuntimeContext.symbol("where"), new Cons(new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(v865, Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("not"), new Cons(new Cons(new Cons(RuntimeContext.symbol("=="), new Cons(v864, Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("fail"), Nil.NIL), Nil.NIL)), Nil.NIL)), Nil.NIL)), new Cons(v864, Nil.NIL)));

}



i2768 = new Cons(v862, new Cons(i2765, Nil.NIL));
} else {

final Object i2767;
if ((boolean)true) {
final Object f2766 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("shen-form-rule"));

i2767 = f2766;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2768 = i2767;

}
i2769 = i2768;

}
i2770 = i2769;

}
    return i2770;

}
}
