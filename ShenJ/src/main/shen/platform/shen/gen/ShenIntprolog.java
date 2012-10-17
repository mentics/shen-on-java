package shen.gen;



import com.mentics.shen.*;

public class ShenIntprolog {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-intprolog");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1519) throws Exception {
return defined(v1519);
}};
public static Object defined(final Object v1519) throws Exception {


final Object i3874;
if ((boolean)(v1519 instanceof Cons)) {



final Object i3873;
if ((boolean)(((Cons)v1519).head instanceof Cons)) {

i3873 = true;
} else {

i3873 = false;

}
i3874 = i3873;
} else {

i3874 = false;

}
final Object i3881;
if ((boolean)i3874) {
final Object f3876 = ShenStartNewPrologProcess.LAMBDA.apply();

final Object processN3875 = f3876;









final Object f3877 = ShenInsertPrologVariables.LAMBDA.apply(new Cons(((Cons)((Cons)v1519).head).tail, new Cons(((Cons)v1519).tail, Nil.NIL)), processN3875);
final Object f3878 = ShenIntprologHelp.LAMBDA.apply(((Cons)((Cons)v1519).head).head, f3877, processN3875);


i3881 = f3878;
} else {

final Object i3880;
if ((boolean)true) {
final Object f3879 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-intprolog"));

i3880 = f3879;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3881 = i3880;

}
    return i3881;

}
}
