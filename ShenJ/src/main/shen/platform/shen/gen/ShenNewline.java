package shen.gen;



import com.mentics.shen.*;

public class ShenNewline {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-newline");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {

    return 10;

}
}
