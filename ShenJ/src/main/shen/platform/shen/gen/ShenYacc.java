package shen.gen;



import com.mentics.shen.*;

public class ShenYacc {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-yacc");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v293) throws Exception {
return defined(v293);
}};
public static Object defined(final Object v293) throws Exception {


final Object i3944;
if ((boolean)(v293 instanceof Cons)) {


final Object i3942;
if ((boolean)Lang.equals(RuntimeContext.symbol("defcc"), ((Cons)v293).head)) {



final Object i3941;
if ((boolean)(((Cons)v293).tail instanceof Cons)) {

i3941 = true;
} else {

i3941 = false;

}
i3942 = i3941;
} else {

i3942 = false;

}
final Object i3943;
if ((boolean)i3942) {

i3943 = true;
} else {

i3943 = false;

}
i3944 = i3943;
} else {

i3944 = false;

}
final Object i3949;
if ((boolean)i3944) {






final Object f3945 = ShenExtractSegvars.LAMBDA.apply(((Cons)((Cons)v293).tail).tail);
final Object f3946 = ShenYaccToShen.LAMBDA.apply(((Cons)((Cons)v293).tail).head, ((Cons)((Cons)v293).tail).tail, f3945);

i3949 = f3946;
} else {

final Object i3948;
if ((boolean)true) {
final Object f3947 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-yacc"));

i3948 = f3947;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3949 = i3948;

}
    return i3949;

}
}
