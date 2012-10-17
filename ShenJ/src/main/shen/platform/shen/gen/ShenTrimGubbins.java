package shen.gen;



import com.mentics.shen.*;

public class ShenTrimGubbins {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-trim-gubbins");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v600) throws Exception {
return defined(v600);
}};
public static Object defined(final Object v600) throws Exception {


final Object i6612;
if ((boolean)(v600 instanceof Cons)) {

final Object f6610 = ShenSpace.LAMBDA.apply();

final Object i6611;
if ((boolean)Lang.equals(((Cons)v600).head, f6610)) {

i6611 = true;
} else {

i6611 = false;

}
i6612 = i6611;
} else {

i6612 = false;

}
final Object i6635;
if ((boolean)i6612) {

final Object f6613 = ShenTrimGubbins.LAMBDA.apply(((Cons)v600).tail);

i6635 = f6613;
} else {


final Object i6616;
if ((boolean)(v600 instanceof Cons)) {

final Object f6614 = ShenNewline.LAMBDA.apply();

final Object i6615;
if ((boolean)Lang.equals(((Cons)v600).head, f6614)) {

i6615 = true;
} else {

i6615 = false;

}
i6616 = i6615;
} else {

i6616 = false;

}
final Object i6634;
if ((boolean)i6616) {

final Object f6617 = ShenTrimGubbins.LAMBDA.apply(((Cons)v600).tail);

i6634 = f6617;
} else {


final Object i6620;
if ((boolean)(v600 instanceof Cons)) {

final Object f6618 = ShenCarriageReturn.LAMBDA.apply();

final Object i6619;
if ((boolean)Lang.equals(((Cons)v600).head, f6618)) {

i6619 = true;
} else {

i6619 = false;

}
i6620 = i6619;
} else {

i6620 = false;

}
final Object i6633;
if ((boolean)i6620) {

final Object f6621 = ShenTrimGubbins.LAMBDA.apply(((Cons)v600).tail);

i6633 = f6621;
} else {


final Object i6624;
if ((boolean)(v600 instanceof Cons)) {

final Object f6622 = ShenTab.LAMBDA.apply();

final Object i6623;
if ((boolean)Lang.equals(((Cons)v600).head, f6622)) {

i6623 = true;
} else {

i6623 = false;

}
i6624 = i6623;
} else {

i6624 = false;

}
final Object i6632;
if ((boolean)i6624) {

final Object f6625 = ShenTrimGubbins.LAMBDA.apply(((Cons)v600).tail);

i6632 = f6625;
} else {


final Object i6628;
if ((boolean)(v600 instanceof Cons)) {

final Object f6626 = ShenLeftRound.LAMBDA.apply();

final Object i6627;
if ((boolean)Lang.equals(((Cons)v600).head, f6626)) {

i6627 = true;
} else {

i6627 = false;

}
i6628 = i6627;
} else {

i6628 = false;

}
final Object i6631;
if ((boolean)i6628) {

final Object f6629 = ShenTrimGubbins.LAMBDA.apply(((Cons)v600).tail);

i6631 = f6629;
} else {

final Object i6630;
if ((boolean)true) {

i6630 = v600;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6631 = i6630;

}
i6632 = i6631;

}
i6633 = i6632;

}
i6634 = i6633;

}
i6635 = i6634;

}
    return i6635;

}
}
