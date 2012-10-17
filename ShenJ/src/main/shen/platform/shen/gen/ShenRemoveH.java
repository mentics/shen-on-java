package shen.gen;



import com.mentics.shen.*;

public class ShenRemoveH {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-remove-h");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1302, final Object v1303, final Object v1304) throws Exception {
return defined(v1302, v1303, v1304);
}};
public static Object defined(final Object v1302, final Object v1303, final Object v1304) throws Exception {

final Object i3183;
if ((boolean)Lang.equals(Nil.NIL, v1303)) {
final Object f3174 = Reverse.LAMBDA.apply(v1304);

i3183 = f3174;
} else {


final Object i3176;
if ((boolean)(v1303 instanceof Cons)) {


final Object i3175;
if ((boolean)Lang.equals(((Cons)v1303).head, v1302)) {

i3175 = true;
} else {

i3175 = false;

}
i3176 = i3175;
} else {

i3176 = false;

}
final Object i3182;
if ((boolean)i3176) {


final Object f3177 = ShenRemoveH.LAMBDA.apply(((Cons)v1303).head, ((Cons)v1303).tail, v1304);

i3182 = f3177;
} else {


final Object i3181;
if ((boolean)(v1303 instanceof Cons)) {




final Object f3178 = ShenRemoveH.LAMBDA.apply(v1302, ((Cons)v1303).tail, new Cons(((Cons)v1303).head, v1304));

i3181 = f3178;
} else {

final Object i3180;
if ((boolean)true) {
final Object f3179 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-remove-h"));

i3180 = f3179;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3181 = i3180;

}
i3182 = i3181;

}
i3183 = i3182;

}
    return i3183;

}
}
