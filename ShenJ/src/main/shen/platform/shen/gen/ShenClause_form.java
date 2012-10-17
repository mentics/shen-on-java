package shen.gen;



import com.mentics.shen.*;

public class ShenClause_form {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-clause_form");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1284) throws Exception {
return defined(v1284);
}};
public static Object defined(final Object v1284) throws Exception {


final Object i3100;
if ((boolean)(v1284 instanceof Cons)) {



final Object i3098;
if ((boolean)(((Cons)v1284).tail instanceof Cons)) {



final Object i3097;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1284).tail).tail)) {

i3097 = true;
} else {

i3097 = false;

}
i3098 = i3097;
} else {

i3098 = false;

}
final Object i3099;
if ((boolean)i3098) {

i3099 = true;
} else {

i3099 = false;

}
i3100 = i3099;
} else {

i3100 = false;

}
final Object i3105;
if ((boolean)i3100) {

final Object f3101 = ShenExplicit_modes.LAMBDA.apply(((Cons)v1284).head);




final Object f3102 = ShenCf_help.LAMBDA.apply(((Cons)((Cons)v1284).tail).head);





i3105 = new Cons(f3101, new Cons(RuntimeContext.symbol(":-"), new Cons(f3102, Nil.NIL)));
} else {

final Object i3104;
if ((boolean)true) {
final Object f3103 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-clause_form"));

i3104 = f3103;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3105 = i3104;

}
    return i3105;

}
}
