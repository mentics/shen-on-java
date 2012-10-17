package shen.gen;



import com.mentics.shen.*;

public class ShenProcedure_name {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-procedure_name");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1262) throws Exception {
return defined(v1262);
}};
public static Object defined(final Object v1262) throws Exception {


final Object i3027;
if ((boolean)(v1262 instanceof Cons)) {



final Object i3025;
if ((boolean)(((Cons)v1262).head instanceof Cons)) {




final Object i3024;
if ((boolean)(((Cons)((Cons)v1262).head).head instanceof Cons)) {

i3024 = true;
} else {

i3024 = false;

}
i3025 = i3024;
} else {

i3025 = false;

}
final Object i3026;
if ((boolean)i3025) {

i3026 = true;
} else {

i3026 = false;

}
i3027 = i3026;
} else {

i3027 = false;

}
final Object i3030;
if ((boolean)i3027) {




i3030 = ((Cons)((Cons)((Cons)v1262).head).head).head;
} else {

final Object i3029;
if ((boolean)true) {
final Object f3028 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-procedure_name"));

i3029 = f3028;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3030 = i3029;

}
    return i3030;

}
}
