package shen.gen;



import com.mentics.shen.*;

public class ShenPrologAritycheck {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-prolog-aritycheck");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1281, final Object v1282) throws Exception {
return defined(v1281, v1282);
}};
public static Object defined(final Object v1281, final Object v1282) throws Exception {


final Object i3069;
if ((boolean)(v1282 instanceof Cons)) {


final Object i3068;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1282).tail)) {

i3068 = true;
} else {

i3068 = false;

}
i3069 = i3068;
} else {

i3069 = false;

}
final Object i3082;
if ((boolean)i3069) {

final Object f3070 = Length.LAMBDA.apply(((Cons)v1282).head);



i3082 = Primitives.minus.apply(f3070, 1);
} else {


final Object i3072;
if ((boolean)(v1282 instanceof Cons)) {



final Object i3071;
if ((boolean)(((Cons)v1282).tail instanceof Cons)) {

i3071 = true;
} else {

i3071 = false;

}
i3072 = i3071;
} else {

i3072 = false;

}
final Object i3081;
if ((boolean)i3072) {

final Object f3073 = Length.LAMBDA.apply(((Cons)v1282).head);


final Object f3074 = Length.LAMBDA.apply(((Cons)((Cons)v1282).tail).head);

final Object i3078;
if ((boolean)Lang.equals(f3073, f3074)) {

final Object f3075 = ShenPrologAritycheck.LAMBDA.apply(v1281, ((Cons)v1282).tail);

i3078 = f3075;
} else {


final Object f3076 = Atp.LAMBDA.apply(new Cons(v1281, Nil.NIL), Nil.NIL);
final Object f3077 = Interror.LAMBDA.apply("arity error in prolog procedure ~A~%", f3076);

i3078 = f3077;

}
i3081 = i3078;
} else {

final Object i3080;
if ((boolean)true) {
final Object f3079 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-prolog-aritycheck"));

i3080 = f3079;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3081 = i3080;

}
i3082 = i3081;

}
    return i3082;

}
}
