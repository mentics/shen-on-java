package shen.gen;



import com.mentics.shen.*;

public class ShenFree_variable_warnings {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-free_variable_warnings");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v437, final Object v438) throws Exception {
return defined(v437, v438);
}};
public static Object defined(final Object v437, final Object v438) throws Exception {

final Object i1970;
if ((boolean)Lang.equals(Nil.NIL, v438)) {

i1970 = RuntimeContext.symbol("_");
} else {

final Object i1969;
if ((boolean)true) {
final Object f1965 = ShenList_variables.LAMBDA.apply(v438);
final Object f1966 = Atp.LAMBDA.apply(f1965, Nil.NIL);
final Object f1967 = Atp.LAMBDA.apply(v437, f1966);
final Object f1968 = Interror.LAMBDA.apply("error: the following variables are free in ~A: ~A", f1967);

i1969 = f1968;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1970 = i1969;

}
    return i1970;

}
}
