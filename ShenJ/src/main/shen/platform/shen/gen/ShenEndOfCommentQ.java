package shen.gen;



import com.mentics.shen.*;

public class ShenEndOfCommentQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-end-of-comment?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1060) throws Exception {
return defined(v1060);
}};
public static Object defined(final Object v1060) throws Exception {


final Object i5681;
if ((boolean)(v1060 instanceof Cons)) {


final Object i5679;
if ((boolean)Lang.equals(42, ((Cons)v1060).head)) {



final Object i5677;
if ((boolean)(((Cons)v1060).tail instanceof Cons)) {



final Object i5676;
if ((boolean)Lang.equals(92, ((Cons)((Cons)v1060).tail).head)) {

i5676 = true;
} else {

i5676 = false;

}
i5677 = i5676;
} else {

i5677 = false;

}
final Object i5678;
if ((boolean)i5677) {

i5678 = true;
} else {

i5678 = false;

}
i5679 = i5678;
} else {

i5679 = false;

}
final Object i5680;
if ((boolean)i5679) {

i5680 = true;
} else {

i5680 = false;

}
i5681 = i5680;
} else {

i5681 = false;

}
final Object i5683;
if ((boolean)i5681) {

i5683 = true;
} else {

final Object i5682;
if ((boolean)true) {

i5682 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5683 = i5682;

}
    return i5683;

}
}
