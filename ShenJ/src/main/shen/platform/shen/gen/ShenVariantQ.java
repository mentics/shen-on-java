package shen.gen;



import com.mentics.shen.*;

public class ShenVariantQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-variant?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1698, final Object v1699) throws Exception {
return defined(v1698, v1699);
}};
public static Object defined(final Object v1698, final Object v1699) throws Exception {

final Object i82;
if ((boolean)Lang.equals(v1699, v1698)) {

i82 = true;
} else {


final Object i56;
if ((boolean)(v1698 instanceof Cons)) {


final Object i54;
if ((boolean)(v1699 instanceof Cons)) {



final Object i53;
if ((boolean)Lang.equals(((Cons)v1699).head, ((Cons)v1698).head)) {

i53 = true;
} else {

i53 = false;

}
i54 = i53;
} else {

i54 = false;

}
final Object i55;
if ((boolean)i54) {

i55 = true;
} else {

i55 = false;

}
i56 = i55;
} else {

i56 = false;

}
final Object i81;
if ((boolean)i56) {


final Object f57 = ShenVariantQ.LAMBDA.apply(((Cons)v1698).tail, ((Cons)v1699).tail);

i81 = f57;
} else {


final Object i65;
if ((boolean)(v1698 instanceof Cons)) {


final Object i63;
if ((boolean)(v1699 instanceof Cons)) {

final Object f58 = ShenPvarQ.LAMBDA.apply(((Cons)v1698).head);

final Object i61;
if ((boolean)f58) {

final Object f59 = VariableQ.LAMBDA.apply(((Cons)v1699).head);

final Object i60;
if ((boolean)f59) {

i60 = true;
} else {

i60 = false;

}
i61 = i60;
} else {

i61 = false;

}
final Object i62;
if ((boolean)i61) {

i62 = true;
} else {

i62 = false;

}
i63 = i62;
} else {

i63 = false;

}
final Object i64;
if ((boolean)i63) {

i64 = true;
} else {

i64 = false;

}
i65 = i64;
} else {

i65 = false;

}
final Object i80;
if ((boolean)i65) {


final Object f66 = Subst.LAMBDA.apply(RuntimeContext.symbol("shen-a"), ((Cons)v1698).head, ((Cons)v1698).tail);


final Object f67 = Subst.LAMBDA.apply(RuntimeContext.symbol("shen-a"), ((Cons)v1699).head, ((Cons)v1699).tail);
final Object f68 = ShenVariantQ.LAMBDA.apply(f66, f67);

i80 = f68;
} else {


final Object i74;
if ((boolean)(v1698 instanceof Cons)) {



final Object i72;
if ((boolean)(((Cons)v1698).head instanceof Cons)) {


final Object i70;
if ((boolean)(v1699 instanceof Cons)) {



final Object i69;
if ((boolean)(((Cons)v1699).head instanceof Cons)) {

i69 = true;
} else {

i69 = false;

}
i70 = i69;
} else {

i70 = false;

}
final Object i71;
if ((boolean)i70) {

i71 = true;
} else {

i71 = false;

}
i72 = i71;
} else {

i72 = false;

}
final Object i73;
if ((boolean)i72) {

i73 = true;
} else {

i73 = false;

}
i74 = i73;
} else {

i74 = false;

}
final Object i79;
if ((boolean)i74) {


final Object f75 = Append.LAMBDA.apply(((Cons)v1698).head, ((Cons)v1698).tail);


final Object f76 = Append.LAMBDA.apply(((Cons)v1699).head, ((Cons)v1699).tail);
final Object f77 = ShenVariantQ.LAMBDA.apply(f75, f76);

i79 = f77;
} else {

final Object i78;
if ((boolean)true) {

i78 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i79 = i78;

}
i80 = i79;

}
i81 = i80;

}
i82 = i81;

}
    return i82;

}
}
