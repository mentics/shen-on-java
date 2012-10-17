package shen.gen;



import com.mentics.shen.*;

public class No_matchQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("no_match?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v322) throws Exception {
return defined(v322);
}};
public static Object defined(final Object v322) throws Exception {


final Object i333;
if ((boolean)(v322 instanceof Cons)) {

final Object f323 = TupleQ.LAMBDA.apply(((Cons)v322).head);

final Object i331;
if ((boolean)f323) {

final Object f324 = Fst.LAMBDA.apply(((Cons)v322).head);

final Object i329;
if ((boolean)Lang.equals(RuntimeContext.symbol("no"), f324)) {

final Object f325 = Snd.LAMBDA.apply(((Cons)v322).head);

final Object i327;
if ((boolean)Lang.equals(RuntimeContext.symbol("matching"), f325)) {


final Object i326;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v322).tail)) {

i326 = true;
} else {

i326 = false;

}
i327 = i326;
} else {

i327 = false;

}
final Object i328;
if ((boolean)i327) {

i328 = true;
} else {

i328 = false;

}
i329 = i328;
} else {

i329 = false;

}
final Object i330;
if ((boolean)i329) {

i330 = true;
} else {

i330 = false;

}
i331 = i330;
} else {

i331 = false;

}
final Object i332;
if ((boolean)i331) {

i332 = true;
} else {

i332 = false;

}
i333 = i332;
} else {

i333 = false;

}
final Object i335;
if ((boolean)i333) {

i335 = true;
} else {

final Object i334;
if ((boolean)true) {

i334 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i335 = i334;

}
    return i335;

}
}
