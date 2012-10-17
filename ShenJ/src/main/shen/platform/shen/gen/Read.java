package shen.gen;



import com.mentics.shen.*;

public class Read {

public static final Symbol SYMBOL = RuntimeContext.symbol("read");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f1103 = Lineread.LAMBDA.apply();


    return ((Cons)f1103).head;

}
}
