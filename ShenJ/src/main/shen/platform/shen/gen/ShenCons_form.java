package shen.gen;



import com.mentics.shen.*;

public class ShenCons_form {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-cons_form");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1063) throws Exception {
return defined(v1063);
}};
public static Object defined(final Object v1063) throws Exception {

final Object i5729;
if ((boolean)Lang.equals(Nil.NIL, v1063)) {

i5729 = Nil.NIL;
} else {


final Object i5723;
if ((boolean)(v1063 instanceof Cons)) {



final Object i5721;
if ((boolean)(((Cons)v1063).tail instanceof Cons)) {



final Object i5719;
if ((boolean)Lang.equals(RuntimeContext.symbol("bar!"), ((Cons)((Cons)v1063).tail).head)) {




final Object i5717;
if ((boolean)(((Cons)((Cons)v1063).tail).tail instanceof Cons)) {




final Object i5716;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1063).tail).tail).tail)) {

i5716 = true;
} else {

i5716 = false;

}
i5717 = i5716;
} else {

i5717 = false;

}
final Object i5718;
if ((boolean)i5717) {

i5718 = true;
} else {

i5718 = false;

}
i5719 = i5718;
} else {

i5719 = false;

}
final Object i5720;
if ((boolean)i5719) {

i5720 = true;
} else {

i5720 = false;

}
i5721 = i5720;
} else {

i5721 = false;

}
final Object i5722;
if ((boolean)i5721) {

i5722 = true;
} else {

i5722 = false;

}
i5723 = i5722;
} else {

i5723 = false;

}
final Object i5728;
if ((boolean)i5723) {








i5728 = new Cons(RuntimeContext.symbol("cons"), new Cons(((Cons)v1063).head, ((Cons)((Cons)v1063).tail).tail));
} else {


final Object i5727;
if ((boolean)(v1063 instanceof Cons)) {




final Object f5724 = ShenCons_form.LAMBDA.apply(((Cons)v1063).tail);





i5727 = new Cons(RuntimeContext.symbol("cons"), new Cons(((Cons)v1063).head, new Cons(f5724, Nil.NIL)));
} else {

final Object i5726;
if ((boolean)true) {
final Object f5725 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-cons_form"));

i5726 = f5725;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5727 = i5726;

}
i5728 = i5727;

}
i5729 = i5728;

}
    return i5729;

}
}
