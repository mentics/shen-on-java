package shen.gen;



import com.mentics.shen.*;

public class ShenCompile_to_lambdaPlus {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-compile_to_lambda+");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v416, final Object v417) throws Exception {
return defined(v416, v417);
}};
public static Object defined(final Object v416, final Object v417) throws Exception {
final Object f1885 = ShenAritycheck.LAMBDA.apply(v416, v417);

final Object arity1884 = f1885;
final Lambda l1888 = new Lambda1() {
  public Object apply(final Object rule) throws Exception {
    final Object f1887 = ShenFree_variable_check.LAMBDA.apply(v416, rule);

    return f1887;
  }
};final Object f1889 = Map.LAMBDA.apply(l1888, v417);

final Object free1886 = f1889;
final Object f1891 = ShenParameters.LAMBDA.apply(arity1884);

final Object variables1890 = f1891;
final Lambda l1894 = new Lambda1() {
  public Object apply(final Object v418) throws Exception {
    final Object f1893 = ShenLinearise.LAMBDA.apply(v418);

    return f1893;
  }
};final Object f1895 = ShenStripProtect.LAMBDA.apply(v417);
final Object f1896 = Map.LAMBDA.apply(l1894, f1895);

final Object linear1892 = f1896;
final Lambda l1899 = new Lambda1() {
  public Object apply(final Object v419) throws Exception {
    final Object f1898 = ShenAbstract_rule.LAMBDA.apply(v419);

    return f1898;
  }
};final Object f1900 = Map.LAMBDA.apply(l1899, linear1892);

final Object abstractions1897 = f1900;
final Lambda l1903 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f1902 = ShenApplication_build.LAMBDA.apply(variables1890, x);

    return f1902;
  }
};final Object f1904 = Map.LAMBDA.apply(l1903, abstractions1897);

final Object applications1901 = f1904;











    return new Cons(variables1890, new Cons(applications1901, Nil.NIL));

}
}
