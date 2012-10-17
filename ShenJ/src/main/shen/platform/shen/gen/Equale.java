package shen.gen;



import com.mentics.shen.*;

public class Equale {

public static final Symbol SYMBOL = RuntimeContext.symbol("==");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v938, final Object v939) throws Exception {
return defined(v938, v939);
}};
public static Object defined(final Object v938, final Object v939) throws Exception {

final Object i1102;
if ((boolean)Lang.equals(v939, v938)) {

i1102 = true;
} else {

final Object i1101;
if ((boolean)true) {

i1101 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1102 = i1101;

}
    return i1102;

}
}
