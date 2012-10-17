package shen.gen;



import com.mentics.shen.*;

public class StringJoinIterator {

public static final Symbol SYMBOL = RuntimeContext.symbol("string-join-iterator");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v6969, final Object v6970, final Object v6971) throws Exception {
return defined(v6969, v6970, v6971);
}};
public static Object defined(final Object v6969, final Object v6970, final Object v6971) throws Exception {

final Object i7231;
if ((boolean)Lang.equals(Nil.NIL, v6970)) {

i7231 = v6971;
} else {


final Object i7222;
if ((boolean)(v6970 instanceof Cons)) {


final Object i7221;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v6970).tail)) {

i7221 = true;
} else {

i7221 = false;

}
i7222 = i7221;
} else {

i7222 = false;

}
final Object i7230;
if ((boolean)i7222) {

final Object f7223 = Ats.LAMBDA.apply(v6971, ((Cons)v6970).head);

i7230 = f7223;
} else {


final Object i7229;
if ((boolean)(v6970 instanceof Cons)) {


final Object f7224 = Ats.LAMBDA.apply(((Cons)v6970).head, v6969);
final Object f7225 = Ats.LAMBDA.apply(v6971, f7224);
final Object f7226 = StringJoinIterator.LAMBDA.apply(v6969, ((Cons)v6970).tail, f7225);

i7229 = f7226;
} else {

final Object i7228;
if ((boolean)true) {
final Object f7227 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("string-join-iterator"));

i7228 = f7227;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7229 = i7228;

}
i7230 = i7229;

}
i7231 = i7230;

}
    return i7231;

}
}
