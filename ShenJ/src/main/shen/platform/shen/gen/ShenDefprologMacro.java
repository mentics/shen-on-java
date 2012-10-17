package shen.gen;



import com.mentics.shen.*;

public class ShenDefprologMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-defprolog-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v536) throws Exception {
return defined(v536);
}};
public static Object defined(final Object v536) throws Exception {


final Object i4321;
if ((boolean)(v536 instanceof Cons)) {


final Object i4319;
if ((boolean)Lang.equals(RuntimeContext.symbol("defprolog"), ((Cons)v536).head)) {



final Object i4318;
if ((boolean)(((Cons)v536).tail instanceof Cons)) {

i4318 = true;
} else {

i4318 = false;

}
i4319 = i4318;
} else {

i4319 = false;

}
final Object i4320;
if ((boolean)i4319) {

i4320 = true;
} else {

i4320 = false;

}
i4321 = i4320;
} else {

i4321 = false;

}
final Object i4328;
if ((boolean)i4321) {
final Lambda l4323 = new Lambda1() {
  public Object apply(final Object v537) throws Exception {
    final Object f4322 = ShenAdefprologZ.LAMBDA.apply(v537);

    return f4322;
  }
};
final Lambda l4325 = new Lambda1() {
  public Object apply(final Object y) throws Exception {
    

final Object f4324 = ShenPrologError.LAMBDA.apply(((Cons)((Cons)v536).tail).head, y);

    return f4324;
  }
};final Object f4326 = Compile.LAMBDA.apply(l4323, ((Cons)v536).tail, l4325);

i4328 = f4326;
} else {

final Object i4327;
if ((boolean)true) {

i4327 = v536;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4328 = i4327;

}
    return i4328;

}
}
