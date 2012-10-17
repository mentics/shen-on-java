package shen.gen;



import com.mentics.shen.*;

public class ShenModh {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-modh");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v838, final Object v839) throws Exception {
return defined(v838, v839);
}};
public static Object defined(final Object v838, final Object v839) throws Exception {

final Object i980;
if ((boolean)Lang.equals(0, v838)) {

i980 = 0;
} else {

final Object i979;
if ((boolean)Lang.equals(Nil.NIL, v839)) {

i979 = v838;
} else {


final Object i970;
if ((boolean)(v839 instanceof Cons)) {




final Object i969;
if ((boolean)(((Number)(((Cons)v839).head)).doubleValue() > ((Number)(v838)).doubleValue())) {

i969 = true;
} else {

i969 = false;

}
i970 = i969;
} else {

i970 = false;

}
final Object i978;
if ((boolean)i970) {

final Object f971 = EmptyQ.LAMBDA.apply(((Cons)v839).tail);

final Object i973;
if ((boolean)f971) {

i973 = v838;
} else {

final Object f972 = ShenModh.LAMBDA.apply(v838, ((Cons)v839).tail);

i973 = f972;

}
i978 = i973;
} else {


final Object i977;
if ((boolean)(v839 instanceof Cons)) {



final Object f974 = ShenModh.LAMBDA.apply(Primitives.minus.apply(v838, ((Cons)v839).head), v839);

i977 = f974;
} else {

final Object i976;
if ((boolean)true) {
final Object f975 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-modh"));

i976 = f975;
} else {

throw new SimpleError((String)"True condition not found.");


}
i977 = i976;

}
i978 = i977;

}
i979 = i978;

}
i980 = i979;

}
    return i980;

}
}
