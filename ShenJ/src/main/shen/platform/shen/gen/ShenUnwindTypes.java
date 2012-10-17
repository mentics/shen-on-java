package shen.gen;



import com.mentics.shen.*;

public class ShenUnwindTypes {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-unwind-types");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1675, final Object v1676) throws Exception {
return defined(v1675, v1676);
}};
public static Object defined(final Object v1675, final Object v1676) throws Exception {

final Object i4267;
if ((boolean)Lang.equals(Nil.NIL, v1676)) {


throw new SimpleError((String)Lang.errorToString(v1675));

} else {


final Object i4260;
if ((boolean)(v1676 instanceof Cons)) {



final Object i4259;
if ((boolean)(((Cons)v1676).head instanceof Cons)) {

i4259 = true;
} else {

i4259 = false;

}
i4260 = i4259;
} else {

i4260 = false;

}
final Object i4266;
if ((boolean)i4260) {


final Object f4261 = ShenRemtype.LAMBDA.apply(((Cons)((Cons)v1676).head).head);

final Object f4262 = ShenUnwindTypes.LAMBDA.apply(v1675, ((Cons)v1676).tail);
final Object f4263 = Do.LAMBDA.apply(f4261, f4262);

i4266 = f4263;
} else {

final Object i4265;
if ((boolean)true) {
final Object f4264 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-unwind-types"));

i4265 = f4264;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4266 = i4265;

}
i4267 = i4266;

}
    return i4267;

}
}
