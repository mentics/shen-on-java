package shen.gen;



import com.mentics.shen.*;

public class ShenYaccMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-yacc-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v551) throws Exception {
return defined(v551);
}};
public static Object defined(final Object v551) throws Exception {


final Object i4556;
if ((boolean)(v551 instanceof Cons)) {


final Object i4554;
if ((boolean)Lang.equals(RuntimeContext.symbol("defcc"), ((Cons)v551).head)) {



final Object i4553;
if ((boolean)(((Cons)v551).tail instanceof Cons)) {

i4553 = true;
} else {

i4553 = false;

}
i4554 = i4553;
} else {

i4554 = false;

}
final Object i4555;
if ((boolean)i4554) {

i4555 = true;
} else {

i4555 = false;

}
i4556 = i4555;
} else {

i4556 = false;

}
final Object i4560;
if ((boolean)i4556) {






final Object f4557 = ShenExtractSegvars.LAMBDA.apply(((Cons)((Cons)v551).tail).tail);
final Object f4558 = ShenYaccToShen.LAMBDA.apply(((Cons)((Cons)v551).tail).head, ((Cons)((Cons)v551).tail).tail, f4557);

i4560 = f4558;
} else {

final Object i4559;
if ((boolean)true) {

i4559 = v551;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4560 = i4559;

}
    return i4560;

}
}
