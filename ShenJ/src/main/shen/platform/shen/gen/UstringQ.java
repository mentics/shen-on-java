package shen.gen;



import com.mentics.shen.*;

public class UstringQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("ustring?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6865) throws Exception {
return defined(v6865);
}};
public static Object defined(final Object v6865) throws Exception {
final Object f6884 = ShenPlusstringQ.LAMBDA.apply(v6865);

final Object i6886;
if ((boolean)f6884) {


final Object i6885;
if ((boolean)Lang.equals("", ((String)v6865).substring(1))) {

i6885 = true;
} else {

i6885 = false;

}
i6886 = i6885;
} else {

i6886 = false;

}
final Object i6888;
if ((boolean)i6886) {

i6888 = true;
} else {

final Object i6887;
if ((boolean)true) {

i6887 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6888 = i6887;

}
    return i6888;

}
}
