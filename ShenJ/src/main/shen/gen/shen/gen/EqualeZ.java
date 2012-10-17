package shen.gen;



import com.mentics.shen.*;

public class EqualeZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("==>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v88) throws Exception {
return defined(v88);
}};
public static Object defined(final Object v88) throws Exception {


final Object i96;
if ((boolean)(v88 instanceof Cons)) {


final Object i94;
if ((boolean)Lang.equals(RuntimeContext.symbol("="), ((Cons)v88).head)) {



final Object i92;
if ((boolean)(((Cons)v88).tail instanceof Cons)) {




final Object i90;
if ((boolean)(((Cons)((Cons)v88).tail).tail instanceof Cons)) {




final Object i89;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v88).tail).tail).tail)) {

i89 = true;
} else {

i89 = false;

}
i90 = i89;
} else {

i90 = false;

}
final Object i91;
if ((boolean)i90) {

i91 = true;
} else {

i91 = false;

}
i92 = i91;
} else {

i92 = false;

}
final Object i93;
if ((boolean)i92) {

i93 = true;
} else {

i93 = false;

}
i94 = i93;
} else {

i94 = false;

}
final Object i95;
if ((boolean)i94) {

i95 = true;
} else {

i95 = false;

}
i96 = i95;
} else {

i96 = false;

}
final Object i209;
if ((boolean)i96) {


final Object f98 = Normal_form.LAMBDA.apply(((Cons)((Cons)v88).tail).head);

final Object xStar97 = f98;



final Object f100 = Normal_form.LAMBDA.apply(((Cons)((Cons)((Cons)v88).tail).tail).head);

final Object yStar99 = f100;
final Object f101 = Eval_errorQ.LAMBDA.apply(xStar97);

final Object i104;
if ((boolean)f101) {

i104 = true;
} else {
final Object f102 = Eval_errorQ.LAMBDA.apply(yStar99);

final Object i103;
if ((boolean)f102) {

i103 = true;
} else {

i103 = false;

}
i104 = i103;

}
final Object i106;
if ((boolean)i104) {

i106 = "error!";
} else {

final Object i105;
if ((boolean)Lang.equals(xStar97, yStar99)) {

i105 = true;
} else {

i105 = false;

}
i106 = i105;

}


i209 = i106;
} else {


final Object i120;
if ((boolean)(v88 instanceof Cons)) {



final Object i118;
if ((boolean)(((Cons)v88).head instanceof Cons)) {



final Object i116;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)((Cons)v88).head).head)) {




final Object i114;
if ((boolean)(((Cons)((Cons)v88).head).tail instanceof Cons)) {





final Object i112;
if ((boolean)(((Cons)((Cons)((Cons)v88).head).tail).tail instanceof Cons)) {





final Object i110;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v88).head).tail).tail).tail)) {



final Object i108;
if ((boolean)(((Cons)v88).tail instanceof Cons)) {



final Object i107;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v88).tail).tail)) {

i107 = true;
} else {

i107 = false;

}
i108 = i107;
} else {

i108 = false;

}
final Object i109;
if ((boolean)i108) {

i109 = true;
} else {

i109 = false;

}
i110 = i109;
} else {

i110 = false;

}
final Object i111;
if ((boolean)i110) {

i111 = true;
} else {

i111 = false;

}
i112 = i111;
} else {

i112 = false;

}
final Object i113;
if ((boolean)i112) {

i113 = true;
} else {

i113 = false;

}
i114 = i113;
} else {

i114 = false;

}
final Object i115;
if ((boolean)i114) {

i115 = true;
} else {

i115 = false;

}
i116 = i115;
} else {

i116 = false;

}
final Object i117;
if ((boolean)i116) {

i117 = true;
} else {

i117 = false;

}
i118 = i117;
} else {

i118 = false;

}
final Object i119;
if ((boolean)i118) {

i119 = true;
} else {

i119 = false;

}
i120 = i119;
} else {

i120 = false;

}
final Object i208;
if ((boolean)i120) {





final Object f122 = Normal_form.LAMBDA.apply(((Cons)((Cons)v88).tail).head);
final Object f123 = Match.LAMBDA.apply(((Cons)((Cons)((Cons)v88).head).tail).head, f122);

final Object match121 = f123;
final Object f124 = No_matchQ.LAMBDA.apply(match121);

final Object i126;
if ((boolean)f124) {

i126 = "no match";
} else {




final Object f125 = Sub.LAMBDA.apply(match121, ((Cons)((Cons)((Cons)((Cons)v88).head).tail).tail).head);

i126 = f125;

}

i208 = i126;
} else {


final Object i136;
if ((boolean)(v88 instanceof Cons)) {


final Object i134;
if ((boolean)Lang.equals(RuntimeContext.symbol("if"), ((Cons)v88).head)) {



final Object i132;
if ((boolean)(((Cons)v88).tail instanceof Cons)) {




final Object i130;
if ((boolean)(((Cons)((Cons)v88).tail).tail instanceof Cons)) {





final Object i128;
if ((boolean)(((Cons)((Cons)((Cons)v88).tail).tail).tail instanceof Cons)) {





final Object i127;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v88).tail).tail).tail).tail)) {

i127 = true;
} else {

i127 = false;

}
i128 = i127;
} else {

i128 = false;

}
final Object i129;
if ((boolean)i128) {

i129 = true;
} else {

i129 = false;

}
i130 = i129;
} else {

i130 = false;

}
final Object i131;
if ((boolean)i130) {

i131 = true;
} else {

i131 = false;

}
i132 = i131;
} else {

i132 = false;

}
final Object i133;
if ((boolean)i132) {

i133 = true;
} else {

i133 = false;

}
i134 = i133;
} else {

i134 = false;

}
final Object i135;
if ((boolean)i134) {

i135 = true;
} else {

i135 = false;

}
i136 = i135;
} else {

i136 = false;

}
final Object i207;
if ((boolean)i136) {


final Object f138 = Normal_form.LAMBDA.apply(((Cons)((Cons)v88).tail).head);

final Object xStar137 = f138;

final Object i140;
if ((boolean)Lang.equals(xStar137, true)) {




i140 = ((Cons)((Cons)((Cons)v88).tail).tail).head;
} else {

final Object i139;
if ((boolean)Lang.equals(xStar137, false)) {





i139 = ((Cons)((Cons)((Cons)((Cons)v88).tail).tail).tail).head;
} else {

i139 = "error!";

}
i140 = i139;

}

i207 = i140;
} else {


final Object i150;
if ((boolean)(v88 instanceof Cons)) {


final Object i148;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)v88).head)) {



final Object i146;
if ((boolean)(((Cons)v88).tail instanceof Cons)) {




final Object i144;
if ((boolean)(((Cons)((Cons)v88).tail).tail instanceof Cons)) {





final Object i142;
if ((boolean)(((Cons)((Cons)((Cons)v88).tail).tail).tail instanceof Cons)) {





final Object i141;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v88).tail).tail).tail).tail)) {

i141 = true;
} else {

i141 = false;

}
i142 = i141;
} else {

i142 = false;

}
final Object i143;
if ((boolean)i142) {

i143 = true;
} else {

i143 = false;

}
i144 = i143;
} else {

i144 = false;

}
final Object i145;
if ((boolean)i144) {

i145 = true;
} else {

i145 = false;

}
i146 = i145;
} else {

i146 = false;

}
final Object i147;
if ((boolean)i146) {

i147 = true;
} else {

i147 = false;

}
i148 = i147;
} else {

i148 = false;

}
final Object i149;
if ((boolean)i148) {

i149 = true;
} else {

i149 = false;

}
i150 = i149;
} else {

i150 = false;

}
final Object i206;
if ((boolean)i150) {

















i206 = new Cons(new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)((Cons)v88).tail).head, ((Cons)((Cons)((Cons)v88).tail).tail).tail)), new Cons(((Cons)((Cons)((Cons)v88).tail).tail).head, Nil.NIL));
} else {


final Object i158;
if ((boolean)(v88 instanceof Cons)) {


final Object i156;
if ((boolean)Lang.equals(RuntimeContext.symbol("@p"), ((Cons)v88).head)) {



final Object i154;
if ((boolean)(((Cons)v88).tail instanceof Cons)) {




final Object i152;
if ((boolean)(((Cons)((Cons)v88).tail).tail instanceof Cons)) {




final Object i151;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v88).tail).tail).tail)) {

i151 = true;
} else {

i151 = false;

}
i152 = i151;
} else {

i152 = false;

}
final Object i153;
if ((boolean)i152) {

i153 = true;
} else {

i153 = false;

}
i154 = i153;
} else {

i154 = false;

}
final Object i155;
if ((boolean)i154) {

i155 = true;
} else {

i155 = false;

}
i156 = i155;
} else {

i156 = false;

}
final Object i157;
if ((boolean)i156) {

i157 = true;
} else {

i157 = false;

}
i158 = i157;
} else {

i158 = false;

}
final Object i205;
if ((boolean)i158) {


final Object f160 = Normal_form.LAMBDA.apply(((Cons)((Cons)v88).tail).head);

final Object xStar159 = f160;



final Object f162 = Normal_form.LAMBDA.apply(((Cons)((Cons)((Cons)v88).tail).tail).head);

final Object yStar161 = f162;
final Object f163 = Eval_errorQ.LAMBDA.apply(xStar159);

final Object i166;
if ((boolean)f163) {

i166 = true;
} else {
final Object f164 = Eval_errorQ.LAMBDA.apply(yStar161);

final Object i165;
if ((boolean)f164) {

i165 = true;
} else {

i165 = false;

}
i166 = i165;

}
final Object i167;
if ((boolean)i166) {

i167 = "error!";
} else {







i167 = new Cons(RuntimeContext.symbol("@p"), new Cons(xStar159, new Cons(yStar161, Nil.NIL)));

}


i205 = i167;
} else {


final Object i175;
if ((boolean)(v88 instanceof Cons)) {


final Object i173;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v88).head)) {



final Object i171;
if ((boolean)(((Cons)v88).tail instanceof Cons)) {




final Object i169;
if ((boolean)(((Cons)((Cons)v88).tail).tail instanceof Cons)) {




final Object i168;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v88).tail).tail).tail)) {

i168 = true;
} else {

i168 = false;

}
i169 = i168;
} else {

i169 = false;

}
final Object i170;
if ((boolean)i169) {

i170 = true;
} else {

i170 = false;

}
i171 = i170;
} else {

i171 = false;

}
final Object i172;
if ((boolean)i171) {

i172 = true;
} else {

i172 = false;

}
i173 = i172;
} else {

i173 = false;

}
final Object i174;
if ((boolean)i173) {

i174 = true;
} else {

i174 = false;

}
i175 = i174;
} else {

i175 = false;

}
final Object i204;
if ((boolean)i175) {


final Object f177 = Normal_form.LAMBDA.apply(((Cons)((Cons)v88).tail).head);

final Object xStar176 = f177;



final Object f179 = Normal_form.LAMBDA.apply(((Cons)((Cons)((Cons)v88).tail).tail).head);

final Object yStar178 = f179;
final Object f180 = Eval_errorQ.LAMBDA.apply(xStar176);

final Object i183;
if ((boolean)f180) {

i183 = true;
} else {
final Object f181 = Eval_errorQ.LAMBDA.apply(yStar178);

final Object i182;
if ((boolean)f181) {

i182 = true;
} else {

i182 = false;

}
i183 = i182;

}
final Object i184;
if ((boolean)i183) {

i184 = "error!";
} else {







i184 = new Cons(RuntimeContext.symbol("cons"), new Cons(xStar176, new Cons(yStar178, Nil.NIL)));

}


i204 = i184;
} else {


final Object i190;
if ((boolean)(v88 instanceof Cons)) {


final Object i188;
if ((boolean)Lang.equals(RuntimeContext.symbol("++"), ((Cons)v88).head)) {



final Object i186;
if ((boolean)(((Cons)v88).tail instanceof Cons)) {



final Object i185;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v88).tail).tail)) {

i185 = true;
} else {

i185 = false;

}
i186 = i185;
} else {

i186 = false;

}
final Object i187;
if ((boolean)i186) {

i187 = true;
} else {

i187 = false;

}
i188 = i187;
} else {

i188 = false;

}
final Object i189;
if ((boolean)i188) {

i189 = true;
} else {

i189 = false;

}
i190 = i189;
} else {

i190 = false;

}
final Object i203;
if ((boolean)i190) {


final Object f191 = Normal_form.LAMBDA.apply(((Cons)((Cons)v88).tail).head);
final Object f192 = Successor.LAMBDA.apply(f191);

i203 = f192;
} else {


final Object i198;
if ((boolean)(v88 instanceof Cons)) {


final Object i196;
if ((boolean)Lang.equals(RuntimeContext.symbol("--"), ((Cons)v88).head)) {



final Object i194;
if ((boolean)(((Cons)v88).tail instanceof Cons)) {



final Object i193;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v88).tail).tail)) {

i193 = true;
} else {

i193 = false;

}
i194 = i193;
} else {

i194 = false;

}
final Object i195;
if ((boolean)i194) {

i195 = true;
} else {

i195 = false;

}
i196 = i195;
} else {

i196 = false;

}
final Object i197;
if ((boolean)i196) {

i197 = true;
} else {

i197 = false;

}
i198 = i197;
} else {

i198 = false;

}
final Object i202;
if ((boolean)i198) {


final Object f199 = Normal_form.LAMBDA.apply(((Cons)((Cons)v88).tail).head);
final Object f200 = Predecessor.LAMBDA.apply(f199);

i202 = f200;
} else {

final Object i201;
if ((boolean)true) {

i201 = v88;
} else {

throw new SimpleError((String)"True condition not found.");


}
i202 = i201;

}
i203 = i202;

}
i204 = i203;

}
i205 = i204;

}
i206 = i205;

}
i207 = i206;

}
i208 = i207;

}
i209 = i208;

}
    return i209;

}
}
