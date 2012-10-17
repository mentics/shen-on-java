package shen.gen;



import com.mentics.shen.*;

public class ShenSProlog_literal {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-s-prolog_literal");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1222) throws Exception {
return defined(v1222);
}};
public static Object defined(final Object v1222) throws Exception {


final Object i2943;
if ((boolean)(v1222 instanceof Cons)) {


final Object i2941;
if ((boolean)Lang.equals(RuntimeContext.symbol("is"), ((Cons)v1222).head)) {



final Object i2939;
if ((boolean)(((Cons)v1222).tail instanceof Cons)) {




final Object i2937;
if ((boolean)(((Cons)((Cons)v1222).tail).tail instanceof Cons)) {




final Object i2936;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1222).tail).tail).tail)) {

i2936 = true;
} else {

i2936 = false;

}
i2937 = i2936;
} else {

i2937 = false;

}
final Object i2938;
if ((boolean)i2937) {

i2938 = true;
} else {

i2938 = false;

}
i2939 = i2938;
} else {

i2939 = false;

}
final Object i2940;
if ((boolean)i2939) {

i2940 = true;
} else {

i2940 = false;

}
i2941 = i2940;
} else {

i2941 = false;

}
final Object i2942;
if ((boolean)i2941) {

i2942 = true;
} else {

i2942 = false;

}
i2943 = i2942;
} else {

i2943 = false;

}
final Object i2975;
if ((boolean)i2943) {







final Object f2944 = ShenInsert_deref.LAMBDA.apply(((Cons)((Cons)((Cons)v1222).tail).tail).head);





i2975 = new Cons(RuntimeContext.symbol("bind"), new Cons(((Cons)((Cons)v1222).tail).head, new Cons(f2944, Nil.NIL)));
} else {


final Object i2950;
if ((boolean)(v1222 instanceof Cons)) {


final Object i2948;
if ((boolean)Lang.equals(RuntimeContext.symbol("when"), ((Cons)v1222).head)) {



final Object i2946;
if ((boolean)(((Cons)v1222).tail instanceof Cons)) {



final Object i2945;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1222).tail).tail)) {

i2945 = true;
} else {

i2945 = false;

}
i2946 = i2945;
} else {

i2946 = false;

}
final Object i2947;
if ((boolean)i2946) {

i2947 = true;
} else {

i2947 = false;

}
i2948 = i2947;
} else {

i2948 = false;

}
final Object i2949;
if ((boolean)i2948) {

i2949 = true;
} else {

i2949 = false;

}
i2950 = i2949;
} else {

i2950 = false;

}
final Object i2974;
if ((boolean)i2950) {



final Object f2951 = ShenInsert_deref.LAMBDA.apply(((Cons)((Cons)v1222).tail).head);




i2974 = new Cons(RuntimeContext.symbol("fwhen"), new Cons(f2951, Nil.NIL));
} else {


final Object i2959;
if ((boolean)(v1222 instanceof Cons)) {


final Object i2957;
if ((boolean)Lang.equals(RuntimeContext.symbol("bind"), ((Cons)v1222).head)) {



final Object i2955;
if ((boolean)(((Cons)v1222).tail instanceof Cons)) {




final Object i2953;
if ((boolean)(((Cons)((Cons)v1222).tail).tail instanceof Cons)) {




final Object i2952;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1222).tail).tail).tail)) {

i2952 = true;
} else {

i2952 = false;

}
i2953 = i2952;
} else {

i2953 = false;

}
final Object i2954;
if ((boolean)i2953) {

i2954 = true;
} else {

i2954 = false;

}
i2955 = i2954;
} else {

i2955 = false;

}
final Object i2956;
if ((boolean)i2955) {

i2956 = true;
} else {

i2956 = false;

}
i2957 = i2956;
} else {

i2957 = false;

}
final Object i2958;
if ((boolean)i2957) {

i2958 = true;
} else {

i2958 = false;

}
i2959 = i2958;
} else {

i2959 = false;

}
final Object i2973;
if ((boolean)i2959) {







final Object f2960 = ShenInsert_lazyderef.LAMBDA.apply(((Cons)((Cons)((Cons)v1222).tail).tail).head);





i2973 = new Cons(RuntimeContext.symbol("bind"), new Cons(((Cons)((Cons)v1222).tail).head, new Cons(f2960, Nil.NIL)));
} else {


final Object i2966;
if ((boolean)(v1222 instanceof Cons)) {


final Object i2964;
if ((boolean)Lang.equals(RuntimeContext.symbol("fwhen"), ((Cons)v1222).head)) {



final Object i2962;
if ((boolean)(((Cons)v1222).tail instanceof Cons)) {



final Object i2961;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1222).tail).tail)) {

i2961 = true;
} else {

i2961 = false;

}
i2962 = i2961;
} else {

i2962 = false;

}
final Object i2963;
if ((boolean)i2962) {

i2963 = true;
} else {

i2963 = false;

}
i2964 = i2963;
} else {

i2964 = false;

}
final Object i2965;
if ((boolean)i2964) {

i2965 = true;
} else {

i2965 = false;

}
i2966 = i2965;
} else {

i2966 = false;

}
final Object i2972;
if ((boolean)i2966) {



final Object f2967 = ShenInsert_lazyderef.LAMBDA.apply(((Cons)((Cons)v1222).tail).head);




i2972 = new Cons(RuntimeContext.symbol("fwhen"), new Cons(f2967, Nil.NIL));
} else {


final Object i2971;
if ((boolean)(v1222 instanceof Cons)) {

final Object f2968 = ShenM_prolog_to_sProlog_predicate.LAMBDA.apply(((Cons)v1222).head);




i2971 = new Cons(f2968, ((Cons)v1222).tail);
} else {

final Object i2970;
if ((boolean)true) {
final Object f2969 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-s-prolog_literal"));

i2970 = f2969;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2971 = i2970;

}
i2972 = i2971;

}
i2973 = i2972;

}
i2974 = i2973;

}
i2975 = i2974;

}
    return i2975;

}
}
