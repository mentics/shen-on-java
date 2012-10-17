package shen.gen;



import com.mentics.shen.*;

public class ShenXmapcan {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-xmapcan");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1115, final Object v1116, final Object v1117) throws Exception {
return defined(v1115, v1116, v1117);
}};
public static Object defined(final Object v1115, final Object v1116, final Object v1117) throws Exception {

final Object i1246;
if ((boolean)Lang.equals(Nil.NIL, v1117)) {

i1246 = Nil.NIL;
} else {

final Object i1245;
if ((boolean)Lang.equals(0, v1115)) {



i1245 = new Cons("... etc", Nil.NIL);
} else {


final Object i1244;
if ((boolean)(v1117 instanceof Cons)) {

final Object f1239 = RuntimeContext.dispatch(v1116).apply(((Cons)v1117).head);



final Object f1240 = ShenXmapcan.LAMBDA.apply(Primitives.minus.apply(v1115, 1), v1116, ((Cons)v1117).tail);
final Object f1241 = Append.LAMBDA.apply(f1239, f1240);

i1244 = f1241;
} else {

final Object i1243;
if ((boolean)true) {

final Object f1242 = RuntimeContext.dispatch(v1116).apply(v1117);


i1243 = new Cons(" |", f1242);
} else {

throw new SimpleError((String)"True condition not found.");


}
i1244 = i1243;

}
i1245 = i1244;

}
i1246 = i1245;

}
    return i1246;

}
}
