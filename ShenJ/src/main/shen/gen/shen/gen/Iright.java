package shen.gen;



import com.mentics.shen.*;

public class Iright {

public static final Symbol SYMBOL = RuntimeContext.symbol("iright");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v695, final Object v696, final Object v697, final Object v698, final Object v699) throws Exception {
return defined(v695, v696, v697, v698, v699);
}};
public static Object defined(final Object v695, final Object v696, final Object v697, final Object v698, final Object v699) throws Exception {
final Object f702 = ShenLazyderef.LAMBDA.apply(v697, v698);

final Object v482701 = f702;


final Object i745;
if ((boolean)(v482701 instanceof Cons)) {


final Object l703 = ((Cons)v482701).head;

final Object f705 = ShenLazyderef.LAMBDA.apply(((Cons)v482701).tail, v698);

final Object v483704 = f705;


final Object i727;
if ((boolean)(v483704 instanceof Cons)) {


final Object r706 = ((Cons)v483704).head;
final Object f707 = ShenIncinfs.LAMBDA.apply();
final Lambda l709 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f708 = UnifyBang.LAMBDA.apply(l703, v695, v698, v699);

    return f708;
  }
};final Object f710 = UnifyBang.LAMBDA.apply(r706, v696, v698, l709);
final Object f711 = Do.LAMBDA.apply(f707, f710);


i727 = f711;
} else {
final Object f712 = ShenPvarQ.LAMBDA.apply(v483704);

final Object i726;
if ((boolean)f712) {
final Object f714 = ShenNewpv.LAMBDA.apply(v698);

final Object r713 = f714;

final Object f715 = ShenNewpv.LAMBDA.apply(v698);

final Object f716 = ShenBindv.LAMBDA.apply(v483704, new Cons(r713, f715), v698);
final Object f718 = ShenIncinfs.LAMBDA.apply();
final Lambda l720 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f719 = UnifyBang.LAMBDA.apply(l703, v695, v698, v699);

    return f719;
  }
};final Object f721 = UnifyBang.LAMBDA.apply(r713, v696, v698, l720);
final Object f722 = Do.LAMBDA.apply(f718, f721);

final Object result717 = f722;
final Object f723 = ShenUnbindv.LAMBDA.apply(v483704, v698);
final Object f724 = Do.LAMBDA.apply(f723, result717);

final Object f725 = Do.LAMBDA.apply(f716, f724);


i726 = f725;
} else {

i726 = false;

}
i727 = i726;

}


i745 = i727;
} else {
final Object f728 = ShenPvarQ.LAMBDA.apply(v482701);

final Object i744;
if ((boolean)f728) {
final Object f730 = ShenNewpv.LAMBDA.apply(v698);

final Object l729 = f730;
final Object f732 = ShenNewpv.LAMBDA.apply(v698);

final Object r731 = f732;


final Object f733 = ShenNewpv.LAMBDA.apply(v698);


final Object f734 = ShenBindv.LAMBDA.apply(v482701, new Cons(l729, new Cons(r731, f733)), v698);
final Object f736 = ShenIncinfs.LAMBDA.apply();
final Lambda l738 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f737 = UnifyBang.LAMBDA.apply(l729, v695, v698, v699);

    return f737;
  }
};final Object f739 = UnifyBang.LAMBDA.apply(r731, v696, v698, l738);
final Object f740 = Do.LAMBDA.apply(f736, f739);

final Object result735 = f740;
final Object f741 = ShenUnbindv.LAMBDA.apply(v482701, v698);
final Object f742 = Do.LAMBDA.apply(f741, result735);

final Object f743 = Do.LAMBDA.apply(f734, f742);



i744 = f743;
} else {

i744 = false;

}
i745 = i744;

}

final Object case700 = i745;

final Object i766;
if ((boolean)Lang.equals(case700, false)) {
final Object f747 = ShenLazyderef.LAMBDA.apply(v697, v698);

final Object v484746 = f747;


final Object i765;
if ((boolean)(v484746 instanceof Cons)) {


final Object rest748 = ((Cons)v484746).tail;
final Object f749 = ShenIncinfs.LAMBDA.apply();
final Object f750 = Iright.LAMBDA.apply(v695, v696, rest748, v698, v699);
final Object f751 = Do.LAMBDA.apply(f749, f750);


i765 = f751;
} else {
final Object f752 = ShenPvarQ.LAMBDA.apply(v484746);

final Object i764;
if ((boolean)f752) {
final Object f754 = ShenNewpv.LAMBDA.apply(v698);

final Object rest753 = f754;
final Object f755 = ShenNewpv.LAMBDA.apply(v698);


final Object f756 = ShenBindv.LAMBDA.apply(v484746, new Cons(f755, rest753), v698);
final Object f758 = ShenIncinfs.LAMBDA.apply();
final Object f759 = Iright.LAMBDA.apply(v695, v696, rest753, v698, v699);
final Object f760 = Do.LAMBDA.apply(f758, f759);

final Object result757 = f760;
final Object f761 = ShenUnbindv.LAMBDA.apply(v484746, v698);
final Object f762 = Do.LAMBDA.apply(f761, result757);

final Object f763 = Do.LAMBDA.apply(f756, f762);


i764 = f763;
} else {

i764 = false;

}
i765 = i764;

}

i766 = i765;
} else {

i766 = case700;

}

    return i766;

}
}
