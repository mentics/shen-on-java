package shen.gen;



import com.mentics.shen.*;

public class ShenCslHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-csl-help");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1610, final Object v1611, final Object v1612, final Object v1613) throws Exception {
return defined(v1610, v1611, v1612, v1613);
}};
public static Object defined(final Object v1610, final Object v1611, final Object v1612, final Object v1613) throws Exception {

final Object i6327;
if ((boolean)Lang.equals(Nil.NIL, v1610)) {

final Object i6326;
if ((boolean)Lang.equals(Nil.NIL, v1611)) {

i6326 = true;
} else {

i6326 = false;

}
i6327 = i6326;
} else {

i6327 = false;

}
final Object i6335;
if ((boolean)i6327) {









i6335 = new Cons(new Cons(RuntimeContext.symbol("bind"), new Cons(RuntimeContext.symbol("ContextOut_1957"), new Cons(v1612, Nil.NIL))), Nil.NIL);
} else {


final Object i6329;
if ((boolean)(v1610 instanceof Cons)) {


final Object i6328;
if ((boolean)(v1611 instanceof Cons)) {

i6328 = true;
} else {

i6328 = false;

}
i6329 = i6328;
} else {

i6329 = false;

}
final Object i6334;
if ((boolean)i6329) {











final Object f6330 = Gensym.LAMBDA.apply(RuntimeContext.symbol("Context"));
final Object f6331 = ShenCslHelp.LAMBDA.apply(((Cons)v1610).tail, ((Cons)v1611).tail, v1613, f6330);


i6334 = new Cons(new Cons(((Cons)v1610).head, new Cons(v1612, new Cons(v1613, ((Cons)v1611).head))), f6331);
} else {

final Object i6333;
if ((boolean)true) {
final Object f6332 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-csl-help"));

i6333 = f6332;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6334 = i6333;

}
i6335 = i6334;

}
    return i6335;

}
}
