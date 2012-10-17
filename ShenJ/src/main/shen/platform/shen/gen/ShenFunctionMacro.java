package shen.gen;



import com.mentics.shen.*;

public class ShenFunctionMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-function-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v562) throws Exception {
return defined(v562);
}};
public static Object defined(final Object v562) throws Exception {


final Object i4712;
if ((boolean)(v562 instanceof Cons)) {


final Object i4710;
if ((boolean)Lang.equals(RuntimeContext.symbol("function"), ((Cons)v562).head)) {



final Object i4708;
if ((boolean)(((Cons)v562).tail instanceof Cons)) {



final Object i4707;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v562).tail).tail)) {

i4707 = true;
} else {

i4707 = false;

}
i4708 = i4707;
} else {

i4708 = false;

}
final Object i4709;
if ((boolean)i4708) {

i4709 = true;
} else {

i4709 = false;

}
i4710 = i4709;
} else {

i4710 = false;

}
final Object i4711;
if ((boolean)i4710) {

i4711 = true;
} else {

i4711 = false;

}
i4712 = i4711;
} else {

i4712 = false;

}
final Object i4716;
if ((boolean)i4712) {




final Object f4713 = Arity.LAMBDA.apply(((Cons)((Cons)v562).tail).head);
final Object f4714 = ShenFunctionAbstraction.LAMBDA.apply(((Cons)((Cons)v562).tail).head, f4713);

i4716 = f4714;
} else {

final Object i4715;
if ((boolean)true) {

i4715 = v562;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4716 = i4715;

}
    return i4716;

}
}
