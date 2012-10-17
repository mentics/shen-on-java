package shen.gen;



import com.mentics.shen.*;

public class CombineTypes {

public static final Symbol SYMBOL = RuntimeContext.symbol("combine-types");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v7282, final Object v7283) throws Exception {
return defined(v7282, v7283);
}};
public static Object defined(final Object v7282, final Object v7283) throws Exception {

final Object i8930;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), v7282)) {

i8930 = v7283;
} else {

final Object i8929;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), v7283)) {

i8929 = v7282;
} else {

final Object i8928;
if ((boolean)true) {


final Object i8927;
if ((boolean)!((boolean)Lang.equals(RuntimeContext.symbol("object"), v7282))) {

i8927 = v7282;
} else {

i8927 = v7283;

}
i8928 = i8927;
} else {

throw new SimpleError((String)"True condition not found.");


}
i8929 = i8928;

}
i8930 = i8929;

}
    return i8930;

}
}
