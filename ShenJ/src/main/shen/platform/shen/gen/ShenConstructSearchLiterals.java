package shen.gen;



import com.mentics.shen.*;

public class ShenConstructSearchLiterals {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-construct-search-literals");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1604, final Object v1605, final Object v1606, final Object v1607) throws Exception {
return defined(v1604, v1605, v1606, v1607);
}};
public static Object defined(final Object v1604, final Object v1605, final Object v1606, final Object v1607) throws Exception {

final Object i6322;
if ((boolean)Lang.equals(Nil.NIL, v1604)) {

final Object i6321;
if ((boolean)Lang.equals(Nil.NIL, v1605)) {

i6321 = true;
} else {

i6321 = false;

}
i6322 = i6321;
} else {

i6322 = false;

}
final Object i6325;
if ((boolean)i6322) {

i6325 = Nil.NIL;
} else {

final Object i6324;
if ((boolean)true) {
final Object f6323 = ShenCslHelp.LAMBDA.apply(v1604, v1605, v1606, v1607);

i6324 = f6323;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6325 = i6324;

}
    return i6325;

}
}
