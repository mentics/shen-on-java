package shen.gen;



import com.mentics.shen.*;

public class ShenDatatypeMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-datatype-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v540) throws Exception {
return defined(v540);
}};
public static Object defined(final Object v540) throws Exception {


final Object i4336;
if ((boolean)(v540 instanceof Cons)) {


final Object i4334;
if ((boolean)Lang.equals(RuntimeContext.symbol("datatype"), ((Cons)v540).head)) {



final Object i4333;
if ((boolean)(((Cons)v540).tail instanceof Cons)) {

i4333 = true;
} else {

i4333 = false;

}
i4334 = i4333;
} else {

i4334 = false;

}
final Object i4335;
if ((boolean)i4334) {

i4335 = true;
} else {

i4335 = false;

}
i4336 = i4335;
} else {

i4336 = false;

}
final Object i4339;
if ((boolean)i4336) {












final Object f4337 = ShenRcons_form.LAMBDA.apply(((Cons)((Cons)v540).tail).tail);















i4339 = new Cons(RuntimeContext.symbol("shen-process-datatype"), new Cons(((Cons)((Cons)v540).tail).head, new Cons(new Cons(RuntimeContext.symbol("compile"), new Cons(new Cons(RuntimeContext.symbol("function"), new Cons(RuntimeContext.symbol("shen-<datatype-rules>"), Nil.NIL)), new Cons(f4337, new Cons(new Cons(RuntimeContext.symbol("function"), new Cons(RuntimeContext.symbol("shen-datatype-error"), Nil.NIL)), Nil.NIL)))), Nil.NIL)));
} else {

final Object i4338;
if ((boolean)true) {

i4338 = v540;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4339 = i4338;

}
    return i4339;

}
}
