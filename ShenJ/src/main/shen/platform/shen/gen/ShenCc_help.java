package shen.gen;



import com.mentics.shen.*;

public class ShenCc_help {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-cc_help");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1306, final Object v1307) throws Exception {
return defined(v1306, v1307);
}};
public static Object defined(final Object v1306, final Object v1307) throws Exception {

final Object i3185;
if ((boolean)Lang.equals(Nil.NIL, v1306)) {

final Object i3184;
if ((boolean)Lang.equals(Nil.NIL, v1307)) {

i3184 = true;
} else {

i3184 = false;

}
i3185 = i3184;
} else {

i3185 = false;

}
final Object i3189;
if ((boolean)i3185) {







i3189 = new Cons(RuntimeContext.symbol("shen-pop"), new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-stack"), Nil.NIL)));
} else {

final Object i3188;
if ((boolean)Lang.equals(Nil.NIL, v1307)) {























i3188 = new Cons(RuntimeContext.symbol("shen-rename"), new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-variables"), new Cons(RuntimeContext.symbol("in"), new Cons(v1306, new Cons(RuntimeContext.symbol("and"), new Cons(RuntimeContext.symbol("shen-then"), new Cons(new Cons(RuntimeContext.symbol("shen-pop"), new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-stack"), Nil.NIL))), Nil.NIL))))))));
} else {

final Object i3187;
if ((boolean)Lang.equals(Nil.NIL, v1306)) {









i3187 = new Cons(RuntimeContext.symbol("call"), new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-continuation"), new Cons(v1307, Nil.NIL))));
} else {

final Object i3186;
if ((boolean)true) {

























i3186 = new Cons(RuntimeContext.symbol("shen-rename"), new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-variables"), new Cons(RuntimeContext.symbol("in"), new Cons(v1306, new Cons(RuntimeContext.symbol("and"), new Cons(RuntimeContext.symbol("shen-then"), new Cons(new Cons(RuntimeContext.symbol("call"), new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-continuation"), new Cons(v1307, Nil.NIL)))), Nil.NIL))))))));
} else {

throw new SimpleError((String)"True condition not found.");


}
i3187 = i3186;

}
i3188 = i3187;

}
i3189 = i3188;

}
    return i3189;

}
}
