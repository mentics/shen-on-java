package shen.gen;



import com.mentics.shen.*;

public class ShenHead_abstraction {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-head_abstraction");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1206) throws Exception {
return defined(v1206);
}};
public static Object defined(final Object v1206) throws Exception {


final Object i2813;
if ((boolean)(v1206 instanceof Cons)) {



final Object i2811;
if ((boolean)(((Cons)v1206).tail instanceof Cons)) {



final Object i2809;
if ((boolean)Lang.equals(RuntimeContext.symbol(":-"), ((Cons)((Cons)v1206).tail).head)) {




final Object i2807;
if ((boolean)(((Cons)((Cons)v1206).tail).tail instanceof Cons)) {




final Object i2805;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1206).tail).tail).tail)) {

final Object f2803 = ShenComplexity_head.LAMBDA.apply(((Cons)v1206).head);




final Object i2804;
if ((boolean)(((Number)(f2803)).doubleValue() < ((Number)(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*maxcomplexity*")))).doubleValue())) {

i2804 = true;
} else {

i2804 = false;

}
i2805 = i2804;
} else {

i2805 = false;

}
final Object i2806;
if ((boolean)i2805) {

i2806 = true;
} else {

i2806 = false;

}
i2807 = i2806;
} else {

i2807 = false;

}
final Object i2808;
if ((boolean)i2807) {

i2808 = true;
} else {

i2808 = false;

}
i2809 = i2808;
} else {

i2809 = false;

}
final Object i2810;
if ((boolean)i2809) {

i2810 = true;
} else {

i2810 = false;

}
i2811 = i2810;
} else {

i2811 = false;

}
final Object i2812;
if ((boolean)i2811) {

i2812 = true;
} else {

i2812 = false;

}
i2813 = i2812;
} else {

i2813 = false;

}
final Object i2837;
if ((boolean)i2813) {



i2837 = new Cons(v1206, Nil.NIL);
} else {


final Object i2823;
if ((boolean)(v1206 instanceof Cons)) {



final Object i2821;
if ((boolean)(((Cons)v1206).head instanceof Cons)) {



final Object i2819;
if ((boolean)(((Cons)v1206).tail instanceof Cons)) {



final Object i2817;
if ((boolean)Lang.equals(RuntimeContext.symbol(":-"), ((Cons)((Cons)v1206).tail).head)) {




final Object i2815;
if ((boolean)(((Cons)((Cons)v1206).tail).tail instanceof Cons)) {




final Object i2814;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1206).tail).tail).tail)) {

i2814 = true;
} else {

i2814 = false;

}
i2815 = i2814;
} else {

i2815 = false;

}
final Object i2816;
if ((boolean)i2815) {

i2816 = true;
} else {

i2816 = false;

}
i2817 = i2816;
} else {

i2817 = false;

}
final Object i2818;
if ((boolean)i2817) {

i2818 = true;
} else {

i2818 = false;

}
i2819 = i2818;
} else {

i2819 = false;

}
final Object i2820;
if ((boolean)i2819) {

i2820 = true;
} else {

i2820 = false;

}
i2821 = i2820;
} else {

i2821 = false;

}
final Object i2822;
if ((boolean)i2821) {

i2822 = true;
} else {

i2822 = false;

}
i2823 = i2822;
} else {

i2823 = false;

}
final Object i2836;
if ((boolean)i2823) {
final Lambda l2826 = new Lambda1() {
  public Object apply(final Object y) throws Exception {
    final Object f2825 = Gensym.LAMBDA.apply(RuntimeContext.symbol("V"));

    return f2825;
  }
};

final Object f2827 = Map.LAMBDA.apply(l2826, ((Cons)((Cons)v1206).head).tail);

final Object terms2824 = f2827;


final Object f2829 = ShenRemove_modes.LAMBDA.apply(((Cons)((Cons)v1206).head).tail);
final Object f2830 = ShenRcons_form.LAMBDA.apply(f2829);

final Object xTerms2828 = f2830;

final Object f2832 = ShenCons_form.LAMBDA.apply(terms2824);






final Object literal2831 = new Cons(RuntimeContext.symbol("unify"), new Cons(f2832, new Cons(xTerms2828, Nil.NIL)));
















final Object clause2833 = new Cons(new Cons(((Cons)((Cons)v1206).head).head, terms2824), new Cons(RuntimeContext.symbol(":-"), new Cons(new Cons(literal2831, ((Cons)((Cons)((Cons)v1206).tail).tail).head), Nil.NIL)));







i2836 = new Cons(clause2833, Nil.NIL);
} else {

final Object i2835;
if ((boolean)true) {
final Object f2834 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-head_abstraction"));

i2835 = f2834;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2836 = i2835;

}
i2837 = i2836;

}
    return i2837;

}
}
