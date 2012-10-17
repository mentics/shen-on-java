package shen.gen;



import com.mentics.shen.*;

public class NumericTypeQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("numeric-type?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7298) throws Exception {
return defined(v7298);
}};
public static Object defined(final Object v7298) throws Exception {

final Object i8983;
if ((boolean)Lang.equals(RuntimeContext.symbol("number"), v7298)) {

i8983 = true;
} else {

final Object i8982;
if ((boolean)Lang.equals(RuntimeContext.symbol("integer"), v7298)) {

i8982 = true;
} else {

final Object i8981;
if ((boolean)Lang.equals(RuntimeContext.symbol("float"), v7298)) {

i8981 = true;
} else {

final Object i8980;
if ((boolean)true) {

i8980 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i8981 = i8980;

}
i8982 = i8981;

}
i8983 = i8982;

}
    return i8983;

}
}
