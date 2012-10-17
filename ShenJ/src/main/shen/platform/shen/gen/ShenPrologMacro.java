package shen.gen;



import com.mentics.shen.*;

public class ShenPrologMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-prolog-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v535) throws Exception {
return defined(v535);
}};
public static Object defined(final Object v535) throws Exception {


final Object i4314;
if ((boolean)(v535 instanceof Cons)) {


final Object i4313;
if ((boolean)Lang.equals(RuntimeContext.symbol("prolog?"), ((Cons)v535).head)) {

i4313 = true;
} else {

i4313 = false;

}
i4314 = i4313;
} else {

i4314 = false;

}
final Object i4317;
if ((boolean)i4314) {


final Object f4315 = ShenPrologForm.LAMBDA.apply(((Cons)v535).tail);




i4317 = new Cons(RuntimeContext.symbol("shen-intprolog"), new Cons(f4315, Nil.NIL));
} else {

final Object i4316;
if ((boolean)true) {

i4316 = v535;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4317 = i4316;

}
    return i4317;

}
}
