package shen.gen;



import com.mentics.shen.*;

public class ShenLegitimateTermQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-legitimate-term?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1189) throws Exception {
return defined(v1189);
}};
public static Object defined(final Object v1189) throws Exception {


final Object i2650;
if ((boolean)(v1189 instanceof Cons)) {


final Object i2648;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v1189).head)) {



final Object i2646;
if ((boolean)(((Cons)v1189).tail instanceof Cons)) {




final Object i2644;
if ((boolean)(((Cons)((Cons)v1189).tail).tail instanceof Cons)) {




final Object i2643;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1189).tail).tail).tail)) {

i2643 = true;
} else {

i2643 = false;

}
i2644 = i2643;
} else {

i2644 = false;

}
final Object i2645;
if ((boolean)i2644) {

i2645 = true;
} else {

i2645 = false;

}
i2646 = i2645;
} else {

i2646 = false;

}
final Object i2647;
if ((boolean)i2646) {

i2647 = true;
} else {

i2647 = false;

}
i2648 = i2647;
} else {

i2648 = false;

}
final Object i2649;
if ((boolean)i2648) {

i2649 = true;
} else {

i2649 = false;

}
i2650 = i2649;
} else {

i2650 = false;

}
final Object i2681;
if ((boolean)i2650) {


final Object f2651 = ShenLegitimateTermQ.LAMBDA.apply(((Cons)((Cons)v1189).tail).head);

final Object i2654;
if ((boolean)f2651) {



final Object f2652 = ShenLegitimateTermQ.LAMBDA.apply(((Cons)((Cons)((Cons)v1189).tail).tail).head);

final Object i2653;
if ((boolean)f2652) {

i2653 = true;
} else {

i2653 = false;

}
i2654 = i2653;
} else {

i2654 = false;

}
i2681 = i2654;
} else {


final Object i2664;
if ((boolean)(v1189 instanceof Cons)) {


final Object i2662;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1189).head)) {



final Object i2660;
if ((boolean)(((Cons)v1189).tail instanceof Cons)) {




final Object i2658;
if ((boolean)(((Cons)((Cons)v1189).tail).tail instanceof Cons)) {




final Object i2656;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), ((Cons)((Cons)((Cons)v1189).tail).tail).head)) {




final Object i2655;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1189).tail).tail).tail)) {

i2655 = true;
} else {

i2655 = false;

}
i2656 = i2655;
} else {

i2656 = false;

}
final Object i2657;
if ((boolean)i2656) {

i2657 = true;
} else {

i2657 = false;

}
i2658 = i2657;
} else {

i2658 = false;

}
final Object i2659;
if ((boolean)i2658) {

i2659 = true;
} else {

i2659 = false;

}
i2660 = i2659;
} else {

i2660 = false;

}
final Object i2661;
if ((boolean)i2660) {

i2661 = true;
} else {

i2661 = false;

}
i2662 = i2661;
} else {

i2662 = false;

}
final Object i2663;
if ((boolean)i2662) {

i2663 = true;
} else {

i2663 = false;

}
i2664 = i2663;
} else {

i2664 = false;

}
final Object i2680;
if ((boolean)i2664) {


final Object f2665 = ShenLegitimateTermQ.LAMBDA.apply(((Cons)((Cons)v1189).tail).head);

i2680 = f2665;
} else {


final Object i2675;
if ((boolean)(v1189 instanceof Cons)) {


final Object i2673;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1189).head)) {



final Object i2671;
if ((boolean)(((Cons)v1189).tail instanceof Cons)) {




final Object i2669;
if ((boolean)(((Cons)((Cons)v1189).tail).tail instanceof Cons)) {




final Object i2667;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), ((Cons)((Cons)((Cons)v1189).tail).tail).head)) {




final Object i2666;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1189).tail).tail).tail)) {

i2666 = true;
} else {

i2666 = false;

}
i2667 = i2666;
} else {

i2667 = false;

}
final Object i2668;
if ((boolean)i2667) {

i2668 = true;
} else {

i2668 = false;

}
i2669 = i2668;
} else {

i2669 = false;

}
final Object i2670;
if ((boolean)i2669) {

i2670 = true;
} else {

i2670 = false;

}
i2671 = i2670;
} else {

i2671 = false;

}
final Object i2672;
if ((boolean)i2671) {

i2672 = true;
} else {

i2672 = false;

}
i2673 = i2672;
} else {

i2673 = false;

}
final Object i2674;
if ((boolean)i2673) {

i2674 = true;
} else {

i2674 = false;

}
i2675 = i2674;
} else {

i2675 = false;

}
final Object i2679;
if ((boolean)i2675) {


final Object f2676 = ShenLegitimateTermQ.LAMBDA.apply(((Cons)((Cons)v1189).tail).head);

i2679 = f2676;
} else {


final Object i2678;
if ((boolean)(v1189 instanceof Cons)) {

i2678 = false;
} else {

final Object i2677;
if ((boolean)true) {

i2677 = true;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2678 = i2677;

}
i2679 = i2678;

}
i2680 = i2679;

}
i2681 = i2680;

}
    return i2681;

}
}
