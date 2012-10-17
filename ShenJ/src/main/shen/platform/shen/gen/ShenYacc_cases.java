package shen.gen;



import com.mentics.shen.*;

public class ShenYacc_cases {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-yacc_cases");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v305) throws Exception {
return defined(v305);
}};
public static Object defined(final Object v305) throws Exception {
final Lambda l3968 = new Lambda1() {
  public Object apply(final Object _case) throws Exception {
    






    return new Cons(RuntimeContext.symbol("Stream"), new Cons(RuntimeContext.symbol("<-"), new Cons(_case, Nil.NIL)));
  }
};final Object f3969 = Mapcan.LAMBDA.apply(l3968, v305);








final Object f3970 = Append.LAMBDA.apply(f3969, new Cons(RuntimeContext.symbol("_"), new Cons(RuntimeContext.symbol("->"), new Cons(new Cons(RuntimeContext.symbol("fail"), Nil.NIL), Nil.NIL))));

    return f3970;

}
}
