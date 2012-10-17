package shen.gen;



import com.mentics.shen.*;

public class ShenChangePointerValue {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-change-pointer-value");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v820, final Object v821, final Object v822, final Object v823) throws Exception {
return defined(v820, v821, v822, v823);
}};
public static Object defined(final Object v820, final Object v821, final Object v822, final Object v823) throws Exception {

final Object i938;
if ((boolean)Lang.equals(Nil.NIL, v823)) {









i938 = new Cons(new Cons(new Cons(v820, new Cons(v821, Nil.NIL)), v822), Nil.NIL);
} else {


final Object i932;
if ((boolean)(v823 instanceof Cons)) {



final Object i930;
if ((boolean)(((Cons)v823).head instanceof Cons)) {




final Object i928;
if ((boolean)(((Cons)((Cons)v823).head).head instanceof Cons)) {





final Object i926;
if ((boolean)(((Cons)((Cons)((Cons)v823).head).head).tail instanceof Cons)) {





final Object i924;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v823).head).head).tail).tail)) {





final Object i922;
if ((boolean)Lang.equals(((Cons)((Cons)((Cons)((Cons)v823).head).head).tail).head, v821)) {




final Object i921;
if ((boolean)Lang.equals(((Cons)((Cons)((Cons)v823).head).head).head, v820)) {

i921 = true;
} else {

i921 = false;

}
i922 = i921;
} else {

i922 = false;

}
final Object i923;
if ((boolean)i922) {

i923 = true;
} else {

i923 = false;

}
i924 = i923;
} else {

i924 = false;

}
final Object i925;
if ((boolean)i924) {

i925 = true;
} else {

i925 = false;

}
i926 = i925;
} else {

i926 = false;

}
final Object i927;
if ((boolean)i926) {

i927 = true;
} else {

i927 = false;

}
i928 = i927;
} else {

i928 = false;

}
final Object i929;
if ((boolean)i928) {

i929 = true;
} else {

i929 = false;

}
i930 = i929;
} else {

i930 = false;

}
final Object i931;
if ((boolean)i930) {

i931 = true;
} else {

i931 = false;

}
i932 = i931;
} else {

i932 = false;

}
final Object i937;
if ((boolean)i932) {








i937 = new Cons(new Cons(((Cons)((Cons)v823).head).head, v822), ((Cons)v823).tail);
} else {


final Object i936;
if ((boolean)(v823 instanceof Cons)) {



final Object f933 = ShenChangePointerValue.LAMBDA.apply(v820, v821, v822, ((Cons)v823).tail);


i936 = new Cons(((Cons)v823).head, f933);
} else {

final Object i935;
if ((boolean)true) {
final Object f934 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-change-pointer-value"));

i935 = f934;
} else {

throw new SimpleError((String)"True condition not found.");


}
i936 = i935;

}
i937 = i936;

}
i938 = i937;

}
    return i938;

}
}
