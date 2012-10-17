package shen.gen;



import com.mentics.shen.*;

public class ShenCurry {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-curry");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v763) throws Exception {
return defined(v763);
}};
public static Object defined(final Object v763) throws Exception {


final Object i20;
if ((boolean)(v763 instanceof Cons)) {

final Object f18 = ShenSpecialQ.LAMBDA.apply(((Cons)v763).head);

final Object i19;
if ((boolean)f18) {

i19 = true;
} else {

i19 = false;

}
i20 = i19;
} else {

i20 = false;

}
final Object i44;
if ((boolean)i20) {


final Lambda l22 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f21 = ShenCurry.LAMBDA.apply(x);

    return f21;
  }
};
final Object f23 = Map.LAMBDA.apply(l22, ((Cons)v763).tail);


i44 = new Cons(((Cons)v763).head, f23);
} else {


final Object i28;
if ((boolean)(v763 instanceof Cons)) {



final Object i26;
if ((boolean)(((Cons)v763).tail instanceof Cons)) {

final Object f24 = ShenExtraspecialQ.LAMBDA.apply(((Cons)v763).head);

final Object i25;
if ((boolean)f24) {

i25 = true;
} else {

i25 = false;

}
i26 = i25;
} else {

i26 = false;

}
final Object i27;
if ((boolean)i26) {

i27 = true;
} else {

i27 = false;

}
i28 = i27;
} else {

i28 = false;

}
final Object i43;
if ((boolean)i28) {

i43 = v763;
} else {


final Object i32;
if ((boolean)(v763 instanceof Cons)) {



final Object i30;
if ((boolean)(((Cons)v763).tail instanceof Cons)) {




final Object i29;
if ((boolean)(((Cons)((Cons)v763).tail).tail instanceof Cons)) {

i29 = true;
} else {

i29 = false;

}
i30 = i29;
} else {

i30 = false;

}
final Object i31;
if ((boolean)i30) {

i31 = true;
} else {

i31 = false;

}
i32 = i31;
} else {

i32 = false;

}
final Object i42;
if ((boolean)i32) {











final Object f33 = ShenCurry.LAMBDA.apply(new Cons(new Cons(((Cons)v763).head, new Cons(((Cons)((Cons)v763).tail).head, Nil.NIL)), ((Cons)((Cons)v763).tail).tail));

i42 = f33;
} else {


final Object i37;
if ((boolean)(v763 instanceof Cons)) {



final Object i35;
if ((boolean)(((Cons)v763).tail instanceof Cons)) {



final Object i34;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v763).tail).tail)) {

i34 = true;
} else {

i34 = false;

}
i35 = i34;
} else {

i35 = false;

}
final Object i36;
if ((boolean)i35) {

i36 = true;
} else {

i36 = false;

}
i37 = i36;
} else {

i37 = false;

}
final Object i41;
if ((boolean)i37) {

final Object f38 = ShenCurry.LAMBDA.apply(((Cons)v763).head);



final Object f39 = ShenCurry.LAMBDA.apply(((Cons)((Cons)v763).tail).head);




i41 = new Cons(f38, new Cons(f39, Nil.NIL));
} else {

final Object i40;
if ((boolean)true) {

i40 = v763;
} else {

throw new SimpleError((String)"True condition not found.");


}
i41 = i40;

}
i42 = i41;

}
i43 = i42;

}
i44 = i43;

}
    return i44;

}
}
