package shen.gen;



import com.mentics.shen.*;

public class ShenSame_predicateQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-same_predicate?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1247, final Object v1248) throws Exception {
return defined(v1247, v1248);
}};
public static Object defined(final Object v1247, final Object v1248) throws Exception {


final Object i3016;
if ((boolean)(v1247 instanceof Cons)) {



final Object i3014;
if ((boolean)(((Cons)v1247).head instanceof Cons)) {


final Object i3012;
if ((boolean)(v1248 instanceof Cons)) {



final Object i3011;
if ((boolean)(((Cons)v1248).head instanceof Cons)) {

i3011 = true;
} else {

i3011 = false;

}
i3012 = i3011;
} else {

i3012 = false;

}
final Object i3013;
if ((boolean)i3012) {

i3013 = true;
} else {

i3013 = false;

}
i3014 = i3013;
} else {

i3014 = false;

}
final Object i3015;
if ((boolean)i3014) {

i3015 = true;
} else {

i3015 = false;

}
i3016 = i3015;
} else {

i3016 = false;

}
final Object i3019;
if ((boolean)i3016) {





i3019 = Lang.equals(((Cons)((Cons)v1247).head).head, ((Cons)((Cons)v1248).head).head);
} else {

final Object i3018;
if ((boolean)true) {
final Object f3017 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-same_predicate?"));

i3018 = f3017;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3019 = i3018;

}
    return i3019;

}
}
