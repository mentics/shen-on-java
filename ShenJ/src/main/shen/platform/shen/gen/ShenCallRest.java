package shen.gen;



import com.mentics.shen.*;

public class ShenCallRest {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-call-rest");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1529, final Object v1530) throws Exception {
return defined(v1529, v1530);
}};
public static Object defined(final Object v1529, final Object v1530) throws Exception {

final Object i3916;
if ((boolean)Lang.equals(Nil.NIL, v1529)) {

i3916 = true;
} else {


final Object i3902;
if ((boolean)(v1529 instanceof Cons)) {



final Object i3900;
if ((boolean)(((Cons)v1529).head instanceof Cons)) {




final Object i3899;
if ((boolean)(((Cons)((Cons)v1529).head).tail instanceof Cons)) {

i3899 = true;
} else {

i3899 = false;

}
i3900 = i3899;
} else {

i3900 = false;

}
final Object i3901;
if ((boolean)i3900) {

i3901 = true;
} else {

i3901 = false;

}
i3902 = i3901;
} else {

i3902 = false;

}
final Object i3915;
if ((boolean)i3902) {





final Object f3903 = RuntimeContext.dispatch(((Cons)((Cons)v1529).head).head).apply(((Cons)((Cons)((Cons)v1529).head).tail).head);








final Object f3904 = ShenCallRest.LAMBDA.apply(new Cons(new Cons(f3903, ((Cons)((Cons)((Cons)v1529).head).tail).tail), ((Cons)v1529).tail), v1530);

i3915 = f3904;
} else {


final Object i3908;
if ((boolean)(v1529 instanceof Cons)) {



final Object i3906;
if ((boolean)(((Cons)v1529).head instanceof Cons)) {



final Object i3905;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1529).head).tail)) {

i3905 = true;
} else {

i3905 = false;

}
i3906 = i3905;
} else {

i3906 = false;

}
final Object i3907;
if ((boolean)i3906) {

i3907 = true;
} else {

i3907 = false;

}
i3908 = i3907;
} else {

i3908 = false;

}
final Object i3914;
if ((boolean)i3908) {


final Lambda l3910 = new Lambda0() {
  public Object apply() throws Exception {
    
final Object f3909 = ShenCallRest.LAMBDA.apply(((Cons)v1529).tail, v1530);

    return f3909;
  }
};final Object f3911 = RuntimeContext.dispatch(((Cons)((Cons)v1529).head).head).apply(v1530, l3910);

i3914 = f3911;
} else {

final Object i3913;
if ((boolean)true) {
final Object f3912 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-call-rest"));

i3913 = f3912;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3914 = i3913;

}
i3915 = i3914;

}
i3916 = i3915;

}
    return i3916;

}
}
