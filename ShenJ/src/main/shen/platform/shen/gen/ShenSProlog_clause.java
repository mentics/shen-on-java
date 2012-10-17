package shen.gen;



import com.mentics.shen.*;

public class ShenSProlog_clause {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-s-prolog_clause");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1204) throws Exception {
return defined(v1204);
}};
public static Object defined(final Object v1204) throws Exception {


final Object i2796;
if ((boolean)(v1204 instanceof Cons)) {



final Object i2794;
if ((boolean)(((Cons)v1204).tail instanceof Cons)) {



final Object i2792;
if ((boolean)Lang.equals(RuntimeContext.symbol(":-"), ((Cons)((Cons)v1204).tail).head)) {




final Object i2790;
if ((boolean)(((Cons)((Cons)v1204).tail).tail instanceof Cons)) {




final Object i2789;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1204).tail).tail).tail)) {

i2789 = true;
} else {

i2789 = false;

}
i2790 = i2789;
} else {

i2790 = false;

}
final Object i2791;
if ((boolean)i2790) {

i2791 = true;
} else {

i2791 = false;

}
i2792 = i2791;
} else {

i2792 = false;

}
final Object i2793;
if ((boolean)i2792) {

i2793 = true;
} else {

i2793 = false;

}
i2794 = i2793;
} else {

i2794 = false;

}
final Object i2795;
if ((boolean)i2794) {

i2795 = true;
} else {

i2795 = false;

}
i2796 = i2795;
} else {

i2796 = false;

}
final Object i2802;
if ((boolean)i2796) {



final Lambda l2798 = new Lambda1() {
  public Object apply(final Object v1205) throws Exception {
    final Object f2797 = ShenSProlog_literal.LAMBDA.apply(v1205);

    return f2797;
  }
};


final Object f2799 = Map.LAMBDA.apply(l2798, ((Cons)((Cons)((Cons)v1204).tail).tail).head);





i2802 = new Cons(((Cons)v1204).head, new Cons(RuntimeContext.symbol(":-"), new Cons(f2799, Nil.NIL)));
} else {

final Object i2801;
if ((boolean)true) {
final Object f2800 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-s-prolog_clause"));

i2801 = f2800;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2802 = i2801;

}
    return i2802;

}
}
