package shen.gen;



import com.mentics.shen.*;

public class ShenReadCharH {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-read-char-h");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v815, final Object v816) throws Exception {
return defined(v815, v816);
}};
public static Object defined(final Object v815, final Object v816) throws Exception {

final Object i2359;
if ((boolean)Lang.equals(-1.0, v815)) {

final Object i2358;
if ((boolean)Lang.equals(0, v816)) {

i2358 = true;
} else {

i2358 = false;

}
i2359 = i2358;
} else {

i2359 = false;

}
final Object i2374;
if ((boolean)i2359) {
final Object f2360 = Stinput.LAMBDA.apply(0);

final Object f2361 = ShenReadCharH.LAMBDA.apply(((java.io.InputStream)f2360).read(), 1);

i2374 = f2361;
} else {

final Object i2373;
if ((boolean)Lang.equals(0, v816)) {
final Object f2362 = Stinput.LAMBDA.apply(0);

final Object f2363 = ShenReadCharH.LAMBDA.apply(((java.io.InputStream)f2362).read(), 0);

i2373 = f2363;
} else {

final Object i2365;
if ((boolean)Lang.equals(-1.0, v815)) {

final Object i2364;
if ((boolean)Lang.equals(1, v816)) {

i2364 = true;
} else {

i2364 = false;

}
i2365 = i2364;
} else {

i2365 = false;

}
final Object i2372;
if ((boolean)i2365) {
final Object f2366 = Stinput.LAMBDA.apply(0);

final Object f2367 = ShenReadCharH.LAMBDA.apply(((java.io.InputStream)f2366).read(), 1);

i2372 = f2367;
} else {

final Object i2371;
if ((boolean)Lang.equals(1, v816)) {
final Object f2368 = ShenSymbolByteToString.LAMBDA.apply(v815);

i2371 = f2368;
} else {

final Object i2370;
if ((boolean)true) {
final Object f2369 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("shen-read-char-h"));

i2370 = f2369;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2371 = i2370;

}
i2372 = i2371;

}
i2373 = i2372;

}
i2374 = i2373;

}
    return i2374;

}
}
