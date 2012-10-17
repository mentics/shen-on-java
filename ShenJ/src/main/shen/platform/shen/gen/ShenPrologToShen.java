package shen.gen;



import com.mentics.shen.*;

public class ShenPrologToShen {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-prolog->shen");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1200) throws Exception {
return defined(v1200);
}};
public static Object defined(final Object v1200) throws Exception {
final Lambda l2780 = new Lambda1() {
  public Object apply(final Object v1201) throws Exception {
    final Object f2779 = ShenCompile_prolog_procedure.LAMBDA.apply(v1201);

    return f2779;
  }
};final Lambda l2782 = new Lambda1() {
  public Object apply(final Object v1202) throws Exception {
    final Object f2781 = ShenSProlog_clause.LAMBDA.apply(v1202);

    return f2781;
  }
};final Lambda l2784 = new Lambda1() {
  public Object apply(final Object v1203) throws Exception {
    final Object f2783 = ShenHead_abstraction.LAMBDA.apply(v1203);

    return f2783;
  }
};final Object f2785 = Mapcan.LAMBDA.apply(l2784, v1200);
final Object f2786 = Map.LAMBDA.apply(l2782, f2785);
final Object f2787 = ShenGroup_clauses.LAMBDA.apply(f2786);
final Object f2788 = Map.LAMBDA.apply(l2780, f2787);

    return f2788;

}
}
