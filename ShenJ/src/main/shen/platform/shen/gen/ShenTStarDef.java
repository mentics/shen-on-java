package shen.gen;



import com.mentics.shen.*;

public class ShenTStarDef {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-t*-def");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v836, final Object v837, final Object v838, final Object v839, final Object v840) throws Exception {
return defined(v836, v837, v838, v839, v840);
}};
public static Object defined(final Object v836, final Object v837, final Object v838, final Object v839, final Object v840) throws Exception {
final Object f2611 = ShenCatchpoint.LAMBDA.apply();

final Object throwcontrol2610 = f2611;
final Object f2613 = ShenLazyderef.LAMBDA.apply(v836, v839);

final Object v5212612 = f2613;


final Object i2675;
if ((boolean)(v5212612 instanceof Cons)) {

final Object f2615 = ShenLazyderef.LAMBDA.apply(((Cons)v5212612).head, v839);

final Object v5222614 = f2615;

final Object i2674;
if ((boolean)Lang.equals(RuntimeContext.symbol("define"), v5222614)) {

final Object f2617 = ShenLazyderef.LAMBDA.apply(((Cons)v5212612).tail, v839);

final Object v5232616 = f2617;


final Object i2673;
if ((boolean)(v5232616 instanceof Cons)) {


final Object f2618 = ((Cons)v5232616).head;


final Object x2619 = ((Cons)v5232616).tail;
final Object f2621 = ShenNewpv.LAMBDA.apply(v839);

final Object error2620 = f2621;
final Object f2623 = ShenNewpv.LAMBDA.apply(v839);

final Object sigPlusRules2622 = f2623;
final Object f2625 = ShenNewpv.LAMBDA.apply(v839);

final Object vars2624 = f2625;
final Object f2627 = ShenNewpv.LAMBDA.apply(v839);

final Object rules2626 = f2627;
final Object f2629 = ShenNewpv.LAMBDA.apply(v839);

final Object sigTOxDOTOxDO2628 = f2629;
final Object f2631 = ShenNewpv.LAMBDA.apply(v839);

final Object declare2630 = f2631;
final Object f2633 = ShenNewpv.LAMBDA.apply(v839);

final Object sig2632 = f2633;
final Object f2634 = ShenIncinfs.LAMBDA.apply();
final Lambda l2636 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f2635 = ShenAsigPlusrulesZ.LAMBDA.apply(x);

    return f2635;
  }
};final Object f2637 = ShenLazyderef.LAMBDA.apply(x2619, v839);
final Object f2638 = Compile.LAMBDA.apply(l2636, f2637, Nil.NIL);
final Lambda l2670 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2639 = ShenLazyderef.LAMBDA.apply(sigPlusRules2622, v839);

final Object i2642;
if ((boolean)Lang.equals(f2639, null)) {
final Object f2640 = ShenLazyderef.LAMBDA.apply(f2618, v839);
final Object f2641 = ShenErrordef.LAMBDA.apply(f2640);

i2642 = f2641;
} else {

i2642 = RuntimeContext.symbol("shen-skip");

}final Lambda l2668 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2643 = ShenLazyderef.LAMBDA.apply(sigPlusRules2622, v839);

final Lambda l2666 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2644 = ShenLazyderef.LAMBDA.apply(sigPlusRules2622, v839);

final Lambda l2664 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2645 = ShenLazyderef.LAMBDA.apply(sig2632, v839);
final Object f2646 = ShenExtract_vars.LAMBDA.apply(f2645);
final Lambda l2662 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2647 = ShenLazyderef.LAMBDA.apply(sig2632, v839);
final Object f2648 = ShenLazyderef.LAMBDA.apply(vars2624, v839);
final Object f2649 = ShenPlaceholders.LAMBDA.apply(f2647, f2648);
final Lambda l2660 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2658 = new Lambda0() {
  public Object apply() throws Exception {
    







final Lambda l2656 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2650 = ShenLazyderef.LAMBDA.apply(f2618, v839);
final Object f2651 = ShenLazyderef.LAMBDA.apply(sig2632, v839);
final Object f2652 = Declare.LAMBDA.apply(f2650, f2651);
final Lambda l2654 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2653 = UnifyBang.LAMBDA.apply(v837, sig2632, v839, v840);

    return f2653;
  }
};final Object f2655 = Bind.LAMBDA.apply(declare2630, f2652, v839, l2654);

    return f2655;
  }
};final Object f2657 = ShenTStarRules.LAMBDA.apply(rules2626, sigTOxDOTOxDO2628, 1, f2618, new Cons(new Cons(f2618, new Cons(RuntimeContext.symbol(":"), new Cons(sigTOxDOTOxDO2628, Nil.NIL))), v838), v839, l2656);

    return f2657;
  }
};final Object f2659 = Cut.LAMBDA.apply(throwcontrol2610, v839, l2658);

    return f2659;
  }
};final Object f2661 = Bind.LAMBDA.apply(sigTOxDOTOxDO2628, f2649, v839, l2660);

    return f2661;
  }
};final Object f2663 = Bind.LAMBDA.apply(vars2624, f2646, v839, l2662);

    return f2663;
  }
};final Object f2665 = Bind.LAMBDA.apply(rules2626, ((Cons)f2644).tail, v839, l2664);

    return f2665;
  }
};final Object f2667 = Bind.LAMBDA.apply(sig2632, ((Cons)f2643).head, v839, l2666);

    return f2667;
  }
};final Object f2669 = Bind.LAMBDA.apply(error2620, i2642, v839, l2668);

    return f2669;
  }
};final Object f2671 = Bind.LAMBDA.apply(sigPlusRules2622, f2638, v839, l2670);
final Object f2672 = Do.LAMBDA.apply(f2634, f2671);










i2673 = f2672;
} else {

i2673 = false;

}

i2674 = i2673;
} else {

i2674 = false;

}

i2675 = i2674;
} else {

i2675 = false;

}
final Object f2676 = ShenCutpoint.LAMBDA.apply(throwcontrol2610, i2675);


    return f2676;

}
}
