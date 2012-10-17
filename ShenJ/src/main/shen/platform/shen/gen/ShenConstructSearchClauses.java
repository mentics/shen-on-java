package shen.gen;



import com.mentics.shen.*;

public class ShenConstructSearchClauses {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-construct-search-clauses");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1614, final Object v1615, final Object v1616) throws Exception {
return defined(v1614, v1615, v1616);
}};
public static Object defined(final Object v1614, final Object v1615, final Object v1616) throws Exception {

final Object i6339;
if ((boolean)Lang.equals(Nil.NIL, v1614)) {

final Object i6337;
if ((boolean)Lang.equals(Nil.NIL, v1615)) {

final Object i6336;
if ((boolean)Lang.equals(Nil.NIL, v1616)) {

i6336 = true;
} else {

i6336 = false;

}
i6337 = i6336;
} else {

i6337 = false;

}
final Object i6338;
if ((boolean)i6337) {

i6338 = true;
} else {

i6338 = false;

}
i6339 = i6338;
} else {

i6339 = false;

}
final Object i6350;
if ((boolean)i6339) {

i6350 = RuntimeContext.symbol("shen-skip");
} else {


final Object i6343;
if ((boolean)(v1614 instanceof Cons)) {


final Object i6341;
if ((boolean)(v1615 instanceof Cons)) {


final Object i6340;
if ((boolean)(v1616 instanceof Cons)) {

i6340 = true;
} else {

i6340 = false;

}
i6341 = i6340;
} else {

i6341 = false;

}
final Object i6342;
if ((boolean)i6341) {

i6342 = true;
} else {

i6342 = false;

}
i6343 = i6342;
} else {

i6343 = false;

}
final Object i6349;
if ((boolean)i6343) {



final Object f6344 = ShenConstructSearchClause.LAMBDA.apply(((Cons)v1614).head, ((Cons)v1615).head, ((Cons)v1616).head);



final Object f6345 = ShenConstructSearchClauses.LAMBDA.apply(((Cons)v1614).tail, ((Cons)v1615).tail, ((Cons)v1616).tail);
final Object f6346 = Do.LAMBDA.apply(f6344, f6345);

i6349 = f6346;
} else {

final Object i6348;
if ((boolean)true) {
final Object f6347 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-construct-search-clauses"));

i6348 = f6347;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6349 = i6348;

}
i6350 = i6349;

}
    return i6350;

}
}
