package shen.gen;



import com.mentics.shen.*;

public class ShenDigitsToIntegers {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-digits->integers");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1008) throws Exception {
return defined(v1008);
}};
public static Object defined(final Object v1008) throws Exception {


final Object i5144;
if ((boolean)(v1008 instanceof Cons)) {


final Object i5143;
if ((boolean)Lang.equals("0", ((Cons)v1008).head)) {

i5143 = true;
} else {

i5143 = false;

}
i5144 = i5143;
} else {

i5144 = false;

}
final Object i5183;
if ((boolean)i5144) {


final Object f5145 = ShenDigitsToIntegers.LAMBDA.apply(((Cons)v1008).tail);


i5183 = new Cons(0, f5145);
} else {


final Object i5147;
if ((boolean)(v1008 instanceof Cons)) {


final Object i5146;
if ((boolean)Lang.equals("1", ((Cons)v1008).head)) {

i5146 = true;
} else {

i5146 = false;

}
i5147 = i5146;
} else {

i5147 = false;

}
final Object i5182;
if ((boolean)i5147) {


final Object f5148 = ShenDigitsToIntegers.LAMBDA.apply(((Cons)v1008).tail);


i5182 = new Cons(1, f5148);
} else {


final Object i5150;
if ((boolean)(v1008 instanceof Cons)) {


final Object i5149;
if ((boolean)Lang.equals("2", ((Cons)v1008).head)) {

i5149 = true;
} else {

i5149 = false;

}
i5150 = i5149;
} else {

i5150 = false;

}
final Object i5181;
if ((boolean)i5150) {


final Object f5151 = ShenDigitsToIntegers.LAMBDA.apply(((Cons)v1008).tail);


i5181 = new Cons(2, f5151);
} else {


final Object i5153;
if ((boolean)(v1008 instanceof Cons)) {


final Object i5152;
if ((boolean)Lang.equals("3", ((Cons)v1008).head)) {

i5152 = true;
} else {

i5152 = false;

}
i5153 = i5152;
} else {

i5153 = false;

}
final Object i5180;
if ((boolean)i5153) {


final Object f5154 = ShenDigitsToIntegers.LAMBDA.apply(((Cons)v1008).tail);


i5180 = new Cons(3, f5154);
} else {


final Object i5156;
if ((boolean)(v1008 instanceof Cons)) {


final Object i5155;
if ((boolean)Lang.equals("4", ((Cons)v1008).head)) {

i5155 = true;
} else {

i5155 = false;

}
i5156 = i5155;
} else {

i5156 = false;

}
final Object i5179;
if ((boolean)i5156) {


final Object f5157 = ShenDigitsToIntegers.LAMBDA.apply(((Cons)v1008).tail);


i5179 = new Cons(4, f5157);
} else {


final Object i5159;
if ((boolean)(v1008 instanceof Cons)) {


final Object i5158;
if ((boolean)Lang.equals("5", ((Cons)v1008).head)) {

i5158 = true;
} else {

i5158 = false;

}
i5159 = i5158;
} else {

i5159 = false;

}
final Object i5178;
if ((boolean)i5159) {


final Object f5160 = ShenDigitsToIntegers.LAMBDA.apply(((Cons)v1008).tail);


i5178 = new Cons(5, f5160);
} else {


final Object i5162;
if ((boolean)(v1008 instanceof Cons)) {


final Object i5161;
if ((boolean)Lang.equals("6", ((Cons)v1008).head)) {

i5161 = true;
} else {

i5161 = false;

}
i5162 = i5161;
} else {

i5162 = false;

}
final Object i5177;
if ((boolean)i5162) {


final Object f5163 = ShenDigitsToIntegers.LAMBDA.apply(((Cons)v1008).tail);


i5177 = new Cons(6, f5163);
} else {


final Object i5165;
if ((boolean)(v1008 instanceof Cons)) {


final Object i5164;
if ((boolean)Lang.equals("7", ((Cons)v1008).head)) {

i5164 = true;
} else {

i5164 = false;

}
i5165 = i5164;
} else {

i5165 = false;

}
final Object i5176;
if ((boolean)i5165) {


final Object f5166 = ShenDigitsToIntegers.LAMBDA.apply(((Cons)v1008).tail);


i5176 = new Cons(7, f5166);
} else {


final Object i5168;
if ((boolean)(v1008 instanceof Cons)) {


final Object i5167;
if ((boolean)Lang.equals("8", ((Cons)v1008).head)) {

i5167 = true;
} else {

i5167 = false;

}
i5168 = i5167;
} else {

i5168 = false;

}
final Object i5175;
if ((boolean)i5168) {


final Object f5169 = ShenDigitsToIntegers.LAMBDA.apply(((Cons)v1008).tail);


i5175 = new Cons(8, f5169);
} else {


final Object i5171;
if ((boolean)(v1008 instanceof Cons)) {


final Object i5170;
if ((boolean)Lang.equals("9", ((Cons)v1008).head)) {

i5170 = true;
} else {

i5170 = false;

}
i5171 = i5170;
} else {

i5171 = false;

}
final Object i5174;
if ((boolean)i5171) {


final Object f5172 = ShenDigitsToIntegers.LAMBDA.apply(((Cons)v1008).tail);


i5174 = new Cons(9, f5172);
} else {

final Object i5173;
if ((boolean)true) {

i5173 = Nil.NIL;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5174 = i5173;

}
i5175 = i5174;

}
i5176 = i5175;

}
i5177 = i5176;

}
i5178 = i5177;

}
i5179 = i5178;

}
i5180 = i5179;

}
i5181 = i5180;

}
i5182 = i5181;

}
i5183 = i5182;

}
    return i5183;

}
}
