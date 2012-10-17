package shen.gen;



import com.mentics.shen.*;

public class ShenGroup_clauses {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-group_clauses");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1226) throws Exception {
return defined(v1226);
}};
public static Object defined(final Object v1226) throws Exception {

final Object i3002;
if ((boolean)Lang.equals(Nil.NIL, v1226)) {

i3002 = Nil.NIL;
} else {


final Object i3001;
if ((boolean)(v1226 instanceof Cons)) {
final Lambda l2994 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    
final Object f2993 = ShenSame_predicateQ.LAMBDA.apply(((Cons)v1226).head, x);

    return f2993;
  }
};final Object f2995 = ShenCollect.LAMBDA.apply(l2994, v1226);

final Object group2992 = f2995;
final Object f2997 = Difference.LAMBDA.apply(v1226, group2992);

final Object rest2996 = f2997;

final Object f2998 = ShenGroup_clauses.LAMBDA.apply(rest2996);




i3001 = new Cons(group2992, f2998);
} else {

final Object i3000;
if ((boolean)true) {
final Object f2999 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-group_clauses"));

i3000 = f2999;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3001 = i3000;

}
i3002 = i3001;

}
    return i3002;

}
}
