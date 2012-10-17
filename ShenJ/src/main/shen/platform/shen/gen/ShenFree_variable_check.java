package shen.gen;



import com.mentics.shen.*;

public class ShenFree_variable_check {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-free_variable_check");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v420, final Object v421) throws Exception {
return defined(v420, v421);
}};
public static Object defined(final Object v420, final Object v421) throws Exception {


final Object i1908;
if ((boolean)(v421 instanceof Cons)) {



final Object i1906;
if ((boolean)(((Cons)v421).tail instanceof Cons)) {



final Object i1905;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v421).tail).tail)) {

i1905 = true;
} else {

i1905 = false;

}
i1906 = i1905;
} else {

i1906 = false;

}
final Object i1907;
if ((boolean)i1906) {

i1907 = true;
} else {

i1907 = false;

}
i1908 = i1907;
} else {

i1908 = false;

}
final Object i1916;
if ((boolean)i1908) {

final Object f1910 = ShenExtract_vars.LAMBDA.apply(((Cons)v421).head);

final Object bound1909 = f1910;


final Object f1912 = ShenExtract_free_vars.LAMBDA.apply(bound1909, ((Cons)((Cons)v421).tail).head);

final Object free1911 = f1912;
final Object f1913 = ShenFree_variable_warnings.LAMBDA.apply(v420, free1911);



i1916 = f1913;
} else {

final Object i1915;
if ((boolean)true) {
final Object f1914 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-free_variable_check"));

i1915 = f1914;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1916 = i1915;

}
    return i1916;

}
}
