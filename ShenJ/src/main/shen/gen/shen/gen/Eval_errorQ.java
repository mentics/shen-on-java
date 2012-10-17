package shen.gen;



import com.mentics.shen.*;

public class Eval_errorQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("eval_error?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v214) throws Exception {
return defined(v214);
}};
public static Object defined(final Object v214) throws Exception {

final Object i217;
if ((boolean)Lang.equals("error!", v214)) {

i217 = true;
} else {

final Object i216;
if ((boolean)Lang.equals("no match", v214)) {

i216 = true;
} else {

final Object i215;
if ((boolean)true) {

i215 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i216 = i215;

}
i217 = i216;

}
    return i217;

}
}
