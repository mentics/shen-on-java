package shen.gen;



import com.mentics.shen.*;

public class ReadFile {

public static final Symbol SYMBOL = RuntimeContext.symbol("read-file");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v970) throws Exception {
return defined(v970);
}};
public static Object defined(final Object v970) throws Exception {
final Object f4753 = ReadFileAsBytelist.LAMBDA.apply(v970);

final Object bytelist4752 = f4753;
final Lambda l4755 = new Lambda1() {
  public Object apply(final Object v971) throws Exception {
    final Object f4754 = ShenAst_inputZ.LAMBDA.apply(v971);

    return f4754;
  }
};final Lambda l4757 = new Lambda1() {
  public Object apply(final Object v972) throws Exception {
    final Object f4756 = ShenReadError.LAMBDA.apply(v972);

    return f4756;
  }
};final Object f4758 = Compile.LAMBDA.apply(l4755, bytelist4752, l4757);


    return f4758;

}
}
