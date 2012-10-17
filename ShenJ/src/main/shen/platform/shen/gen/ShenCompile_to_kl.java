package shen.gen;



import com.mentics.shen.*;

public class ShenCompile_to_kl {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-compile_to_kl");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v486, final Object v487) throws Exception {
return defined(v486, v487);
}};
public static Object defined(final Object v486, final Object v487) throws Exception {


final Object i2116;
if ((boolean)(v487 instanceof Cons)) {



final Object i2114;
if ((boolean)(((Cons)v487).tail instanceof Cons)) {



final Object i2113;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v487).tail).tail)) {

i2113 = true;
} else {

i2113 = false;

}
i2114 = i2113;
} else {

i2114 = false;

}
final Object i2115;
if ((boolean)i2114) {

i2115 = true;
} else {

i2115 = false;

}
i2116 = i2115;
} else {

i2116 = false;

}
final Object i2129;
if ((boolean)i2116) {

final Object f2118 = Length.LAMBDA.apply(((Cons)v487).head);
final Object f2119 = ShenStoreArity.LAMBDA.apply(v486, f2118);

final Object arity2117 = f2119;
final Lambda l2122 = new Lambda1() {
  public Object apply(final Object v488) throws Exception {
    final Object f2121 = ShenReduce.LAMBDA.apply(v488);

    return f2121;
  }
};

final Object f2123 = Map.LAMBDA.apply(l2122, ((Cons)((Cons)v487).tail).head);

final Object reduce2120 = f2123;

final Object f2125 = ShenCondExpression.LAMBDA.apply(v486, ((Cons)v487).head, reduce2120);

final Object condExpression2124 = f2125;










final Object kL2126 = new Cons(RuntimeContext.symbol("defun"), new Cons(v486, new Cons(((Cons)v487).head, new Cons(condExpression2124, Nil.NIL))));





i2129 = kL2126;
} else {

final Object i2128;
if ((boolean)true) {
final Object f2127 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-compile_to_kl"));

i2128 = f2127;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2129 = i2128;

}
    return i2129;

}
}
